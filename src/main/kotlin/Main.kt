import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetTheAverageSalaryForEachCityInTheCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTheAverageSalaryForEachCityInTheCountry =GetTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

    println(getTheAverageSalaryForEachCityInTheCountry.execute("Cuba"))
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}



