package interactor

import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetTopFiveCitiesForFashionInteractorTest {
    private lateinit var  dataSource : CostOfLivingDataSource
    // private lateinit var fakeData

    @Test
    fun should_returnTopFiveCities_whenListOfCitiesNotEmpty() {
        // given list of cities not empty
        var cities: List<CityEntity> = dataSource.getAllCitiesData().filter { it.averageMonthlyNetSalaryAfterTax != null && it.dataQuality }

        // when find the top five cities
        var topFiveCities = GetTopFiveCitiesForFashionInteractorTest().dataSource
            .getAllCitiesData().sortedWith(compareBy({it.clothesPrices.onePairOfJeansLevis50oneOrSimilar},{it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM},{it.clothesPrices.onePairOfNikeRunningShoesMidRange},{it.clothesPrices.onePairOfMenLeatherBusinessShoes}))
            .take(5)
            .map { it.cityName }

        // then check result
        assertEquals(listOf("Accra", "Abuja", "Abu Dhabi", "Aberdeen", "Abidjan"), topFiveCities)

    }
}

