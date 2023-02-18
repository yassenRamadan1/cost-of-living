
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.ReorderCitiesByCheapestBananaPricesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val list: ReorderCitiesByCheapestBananaPricesInteractor = ReorderCitiesByCheapestBananaPricesInteractor(dataSource)
    val cities = listOf<String>("Havana", "Jaramana", "Sancti Spiritus", "Madrid", "London")
//    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
//    println(getCityHasCheapestInternetConnectionInteractor.execute())

    print(list.reorderTheGivenList("Havana", "Jaramana", "Sancti Spiritus", "Madrid", "London"))
}

