package interactor

import fakedata.FakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnectionTest: GetCityHasCheapestInternetConnectionInteractor

    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        dataSource = fakeData
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
    fun should_returnPositiveInfinity_when_firstNumberIsPositiveAndSecondNumberIsZero() {
        //given second number is zero
        val number1 = 50f
        val number2 = 0f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(
            number1, number2
        )
        //then check result
        assertEquals(Float.POSITIVE_INFINITY, divideSummation)
    }

    @Test
    fun should_returnNegativeInfinity_when_firstNumberIsNegativeAndSecondNumberIsZero() {
        //given second number is zero
        val number1 = -50f
        val number2 = 0f
        //when find the divide summation
        val divideSummation = getCityHasCheapestInternetConnectionTest.getThePercentage(
            number1, number2
        )
        //then check result
        assertEquals(Float.NEGATIVE_INFINITY, divideSummation)
    }

    @Test
    fun should_returnPositiveAndCorrectIndex_when_listIsNotNull() {
        //given list of city entity
        val list = dataSource.getAllCitiesData().filter {
            it.averageMonthlyNetSalaryAfterTax != null
                    && it.dataQuality
        }
        //when find the index
        val index = getCityHasCheapestInternetConnectionTest.getTheIndexOfCheapestCityOfInternet(list)
        //then check result
        assertEquals(1, index)
    }


}