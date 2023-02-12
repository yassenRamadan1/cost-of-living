import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute().cityName)

}

