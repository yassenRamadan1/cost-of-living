import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.getTheAverageSalaryForEachCityInTheCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    val getTheAverageSalaryForEachCityInTheCountry =getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

println(getTheAverageSalaryForEachCityInTheCountry.execute("Cuba"))
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}



