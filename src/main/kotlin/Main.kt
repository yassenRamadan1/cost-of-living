
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetTheAverageSalaryForEachCityInTheCountryInteractor
import model.CityEntity

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getTheAverageSalaryForEachCityInTheCountry= GetTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)
    println(getTheAverageSalaryForEachCityInTheCountry.execute("egypt"))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}

