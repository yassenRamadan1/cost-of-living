package interactor

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReorderCitiesByCheapestBananaPricesInteractorTest {

    private lateinit var fakeData: CostOfLivingDataSource
    private lateinit var newListOfCities: ReorderCitiesByCheapestBananaPricesInteractor

    @BeforeEach
    fun setUp() {
        fakeData.getAllCitiesData().take(5)
        newListOfCities = ReorderCitiesByCheapestBananaPricesInteractor(fakeData)
    }

    @Test
    fun should_ReorderCitiesList_When_AllGivenCitiesAreInTheListAndCapitallized() {
        // given a list of capitalized cities are in the database
        val cities = listOf<String>("Havana", "Jaramana", "Sancti Spiritus", "Madrid", "London")
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(cities.toString())
        // then find the cheapest banana prices cities
        assertEquals(cities, reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AGivenCitiesAreNotInTheListAndCapitalized() {
        // given a list of capitalized cities one or more of them are not in the database
        val cities = listOf<String>("Madrid", "Tokyo", "Alger", "Havana", "Jaramana")
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(cities.toString())
        // then find the cheapest banana prices cities
        assertEquals(cities, reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AllGivenCitiesAreInTheListAndLowercase() {
        // given a list of cities in lowercase all of them are in the database
        val cities = listOf<String>("havana", "jaramana", "sancti Spiritus", "madrid", "london")
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(cities.toString())
        // then find the cheapest banana prices cities
        assertEquals(cities, reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AGivenCitiesAreNotInTheListAndLowercase() {
        // given a list of cities in lowercase one or more of them are in the database
        val cities = listOf<String>("madrid", "tokyo", "alger", "havana", "jaramana")
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(cities.toString())
        // then find the cheapest banana prices cities
        assertEquals(cities, reorderedList)
    }

    @Test
    fun should_RetournEmptyLis_When_AllGivenCitiesAreNotInTheList() {
        // given a list of all of them are not in the database
        val cities = listOf<String>("Annaba", "Batna", "Alger", "djelfa", "Blida")
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(cities.toString())
        // then return an empty list
        assertNull(reorderedList)
    }

}