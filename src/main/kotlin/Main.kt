import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getCountriesHaveHighestPricesOfCarbonatedDrinks=GetCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
    println(getCountriesHaveHighestPricesOfCarbonatedDrinks.
    getTheAverageOfCarbonatedDrinksPricesForEachCountry(10))


//    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
//    println(getHighestSalaryAverageCities.execute(limit = 10))
//    printSeparationLine()
//
//    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
//    println(getCityHasCheapestInternetConnectionInteractor.execute())
//
//    val getTheRightApartment = GetTheRightApartment(dataSource)
//    println(getTheRightApartment.getListOfDetailsOfApartment(1000))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}

