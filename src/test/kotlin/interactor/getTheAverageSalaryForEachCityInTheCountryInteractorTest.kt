package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*


import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class getTheAverageSalaryForEachCityInTheCountryInteractorTest {
    lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsLowerCase() {
        //given country name in lower case
        val countryName = "egypt"
        //when find the city name and salary average
        val cityAndSalaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf("Alex", 6000f)).toString(), cityAndSalaryAverage.toString())

    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsUpperCase() {
        //given country name in upper case
        val countryName = "EGYPT"
        //when find the city name and salary average
        val cityAndSalaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf("Alex", 6000f)).toString(), cityAndSalaryAverage.toString())
    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsMixedCase() {
        //given country name in mix case
        val countryName = "Egypt"
        //when  the city name and salary average
        val cityAndSalaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf("Alex", 6000f)).toString(), cityAndSalaryAverage.toString())
    }

    @Test
    fun should_throwAnException_whenCountryNameWasEmpty() {
        //given empty country name
        val countryName = ""
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable: Executable = Executable {
            getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData)
                .execute(countryName)
        }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }

    @Test
    fun should_throwAnException_whenCountryNameWasWrong() {
        //given wrong country name
        val countryName = "test wrong name"
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable: Executable = Executable {
            getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData)
                .execute(countryName)
        }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }
}
