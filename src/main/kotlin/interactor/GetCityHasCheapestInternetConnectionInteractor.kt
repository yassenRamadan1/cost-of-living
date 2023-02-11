package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {

        return null
    }



    fun getThePercentage(n1: Float, n2: Float): Float? =
        if (isZero(n2))
            null
        else
            n1 / n2

    fun isZero(n: Float): Boolean = n == 0f

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}



