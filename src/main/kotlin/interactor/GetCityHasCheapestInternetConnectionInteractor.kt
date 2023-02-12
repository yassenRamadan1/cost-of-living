package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {

        return null

    }

    fun getTheIndexOfCheapestCityOfInternet(list: List<CityEntity>): Int {
        var index = 0
        var percentage = getThePercentage(
            list[index].servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!,
            list[index].averageMonthlyNetSalaryAfterTax!!
        )

        list.forEachIndexed { i, it ->
            val comparePercentage = getThePercentage(
                it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!,
                it.averageMonthlyNetSalaryAfterTax!!
            )
            if (comparePercentage <= percentage) {
                percentage = comparePercentage

                index = i
            }
        }
        return index
    }

    fun getThePercentage(n1: Float, n2: Float): Float = n1 / n2


}



