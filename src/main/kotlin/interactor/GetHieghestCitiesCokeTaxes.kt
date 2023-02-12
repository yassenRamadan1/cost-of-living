package interactor

import model.CityEntity

class GetHieghestCitiesCokeTaxes(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<Pair<String,Float>> {
        return getListOfPair(limit,dataSource.getAllCitiesData())

    }

     fun getListOfPair(limit: Int, dataSource: List<CityEntity>): List<Pair<String, Float>> {
       return dataSource
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending {it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants}
            .take(limit)
            .map { it.cityName to it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toFloat() }
    }

     fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null && city.dataQuality
    }


}