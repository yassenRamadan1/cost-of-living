package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {
        return null

    }

    fun getTheIndexOfCheapestCityOfInternet(list: List<CityEntity>): Int {
        return 0
    }

    fun getThePercentage(n1: Float, n2: Float): Float = n1 / n2


    private fun excludeNullSalariesAndLowQualityData(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality

}



