package interactor

import model.CityEntity

class GetTheAverageSalaryForEachCityInTheCountryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    //the function will return a List of pairs each pair have city name and salary average for this city
    fun execute(countryName: String): List<Pair<String,Float>> {
        val result: List<Pair<String,Float>> = dataSource.getAllCitiesData()
            .filter { excludeNullSalariesAndLowQualityData(it) && allowCountryNameToBeLowerOrUpperOrMix(it,countryName) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }


        if (result.isNotEmpty()) return result
        throw Exception("country name not found")

    }
    //for filter quality data
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    private fun allowCountryNameToBeLowerOrUpperOrMix(countryNameInData: CityEntity,inputCountryName:String): Boolean {
        return  countryNameInData.country.lowercase() == inputCountryName.lowercase()
    }
}

