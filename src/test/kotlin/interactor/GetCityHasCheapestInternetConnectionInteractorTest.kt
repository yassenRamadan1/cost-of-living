package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {
    private lateinit var getCityHasCheapestInternetConnectionTest: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var csvParser: CsvParser
    private lateinit var dataSource: CostOfLivingDataSource

    @BeforeAll
    fun setup() {
        csvParser = CsvParser()
        dataSource = CsvDataSource(csvParser)
        getCityHasCheapestInternetConnectionTest = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun should_returnCorrectDivideSummation_when_bothInputsArePositive() {
        //given two positive numbers
        val number1 = 50f
        val number2 = 25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(number1, number2)
        //then check result
        assertEquals(2f, divideSummation)
    }

    @Test
    fun should_returnCorrectNegativeDivideSummation_when_firstNumberIsNegative() {
        //given first number is negative second number is positive
        val number1 = -50f
        val number2 = 25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(number1, number2)
        //then check result
        assertEquals(-2f, divideSummation)
    }

    @Test
    fun should_returnCorrectNegativeDivideSummation_when_secondNumberIsNegative() {
        //given first number is positive second number is negative
        val number1 = 50f
        val number2 = -25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(number1, number2)
        //then check result
        assertEquals(-2f, divideSummation)
    }

    @Test
    fun should_returnCorrectPositiveDivideSummation_when_bothInputsAreNegative() {
        //given two negative numbers
        val number1 = -50f
        val number2 = -25f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(number1, number2)
        //then check result
        assertEquals(2f, divideSummation)
    }

    @Test
    fun should_returnNull_when_secondNumberIsZero() {
        //given second number is zero
        val number1 = 50f
        val number2 = 0f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(number1, number2)
        //then check result
        assertNull(divideSummation)
    }

    @Test
    fun should_returnTrue_when_numberIsZero() {
        //given number is zero
        val number = 0f
        //when check the number
        val divideSummation = getCityHasCheapestInternetConnectionTest.isZero(number)
        //then check result
        assertTrue(divideSummation)
    }

    @Test
    fun should_returnFalse_when_numberIsNotZero() {
        //given number is not zero
        val number = 5f
        //when check the number
        val divideSummation = getCityHasCheapestInternetConnectionTest.isZero(number)
        //then check result
        assertFalse(divideSummation)
    }

}