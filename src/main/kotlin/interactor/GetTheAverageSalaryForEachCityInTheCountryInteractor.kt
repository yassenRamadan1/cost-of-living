package interactor
import model.CityEntity

class GetTheAverageSalaryForEachCityInTheCountryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(countryName: String): List<Pair<String,Float>> {

        val result :List<Pair<String,Float>>  = dataSource.getAllCitiesData()
            .filter {  excludeNullSalariesAndLowQualityData(it) &&  allowCountryNamesInUppercaseOrLowercaseOrMixed(it,countryName)}
            .map {Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!! ) }

        if (result.isNotEmpty()) return result
        throw Exception("Country name not found")
    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
    private fun allowCountryNamesInUppercaseOrLowercaseOrMixed  (countryNameInData: CityEntity ,inputCountryName: String): Boolean {
        return countryNameInData.country.lowercase() == inputCountryName.lowercase()
    }
}

