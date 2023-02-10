package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    lateinit var getCityHasCheapestInternetConnectionTest: GetCityHasCheapestInternetConnectionInteractor

    @BeforeTest
    fun setup() {
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        getCityHasCheapestInternetConnectionTest = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun should_returnCorrectDivideSummation_when_bothInputsArePositive() {
        //given two positive numbers
        val number1 = 50f
        val number2 = 25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getAverageOfCities(number1, number2)
        //then check result
        assertEquals(2, divideSummation)
    }

    @Test
    fun should_returnCorrectNegativeDivideSummation_when_firstNumberIsNegative() {
        //given first number is negative second number is positive
        val number1 = -50f
        val number2 = 25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getAverageOfCities(number1, number2)
        //then check result
        assertEquals(-2, divideSummation)
    }

    @Test
    fun should_returnCorrectNegativeDivideSummation_when_secondNumberIsNegative() {
        //given first number is positive second number is negative
        val number1 = 50f
        val number2 = -25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getAverageOfCities(number1, number2)
        //then check result
        assertEquals(-2, divideSummation)
    }
}