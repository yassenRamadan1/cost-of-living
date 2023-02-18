package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReorderCitiesByCheapestBananaPricesInteractorTest {

    private lateinit var fakeData: FakeDataSource
    private lateinit var newListOfCities: ReorderCitiesByCheapestBananaPricesInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        newListOfCities = ReorderCitiesByCheapestBananaPricesInteractor(fakeData)
    }

    @Test
    fun should_ReorderCitiesList_When_AllGivenCitiesAreInTheListAndCapitallized() {
        // given a list of capitalized cities are in the database
        val firstCity = "Madrid"
        val secondCity = "Havana"
        val thirdCity = "London"
        // when Reorder cities
        val reorderedList = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertEquals(listOf("havana", "london", "madrid"), reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AGivenCitiesAreNotInTheListAndCapitalized() {
        // given a list of capitalized cities one or more of them are not in the database
        val firstCity = "Madrid"
        val secondCity = "Havana"
        val thirdCity = "Batna"
        // when Reorder cities
        val reorderedList = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertEquals(listOf("havana", "madrid"), reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AllGivenCitiesAreInTheListAndLowercase() {
        // given a list of cities in lowercase all of them are in the database
        val firstCity = "madrid"
        val secondCity = "havana"
        val thirdCity = "london"
        // when Reorder cities
        val reorderedList = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertEquals(listOf("havana", "london", "madrid"), reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AGivenCitiesAreNotInTheListAndLowercase() {
        // given a list of cities in lowercase one or more of them are in the database
        val firstCity = "madrid"
        val secondCity = "havana"
        val thirdCity = "batna"
        // when Reorder cities
        val reorderedList = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertEquals(listOf("havana", "madrid"), reorderedList)
    }

    @Test
    fun should_RetournEmptyLis_When_AllGivenCitiesAreNotInTheList() {
        // given a list of all of them are not in the database
        val firstCity = "Hammadi"
        val secondCity = "Rouiba"
        val thirdCity = "Batna"
        // when Reorder cities
        val reorderedList = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then return an empty list
        assertEquals(listOf(), reorderedList)
    }

}