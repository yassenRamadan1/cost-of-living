package interactor
import model.CityEntity

class ReorderCitiesByCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun reorderTheGivenList(vararg citiesToLiveIn: String): List<String>{
        return dataSource
            .getAllCitiesData()
            .filter { excludeNullBananaPricesAndLowQualityData(it) }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName.lowercase() }
            .intersect(citiesToLiveIn.map { it.lowercase() }.toSet())
            .toList()

    }

    private fun excludeNullBananaPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null && city.dataQuality
    }


}