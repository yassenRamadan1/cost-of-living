package interactor

import fakedata.FakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

class GetCountriesHaveHighestPricesOfCarbonatedDrinksTest{
    package interactor

    import fakedata.FakeData
    import org.junit.jupiter.api.Assertions.*
    import org.junit.jupiter.api.BeforeEach
    import org.junit.jupiter.api.Test
    import org.junit.jupiter.api.TestInstance

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinksTest {
        private lateinit var dataSource: CostOfLivingDataSource
        private lateinit var fakeData: FakeData
        private lateinit var getTopTenCountriesHaveHighestPricesOfCoke:
                GetCountriesHaveHighestPricesOfCarbonatedDrinks


        @BeforeEach
        fun setUp() {
            fakeData = FakeData()
            dataSource=fakeData
            getTopTenCountriesHaveHighestPricesOfCoke = GetCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
        }

        @Test

        fun should_ReturnListOfCountriesAndPrice_when_OutPutIsCorrect() {
            //given the correct input
            val input = listOf("Cuba2.28","Syria0.82")

            //when check the input data
            val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
                .getCountriesOfHighestCarbonatedDrinksPrices(10)

            //then the result will be correct
            assertEquals(listOf(Pair("Cuba",2.28F),Pair("Syria",0.82F)), actualResult)
        }
        @Test
        fun should_ReturnCorrectListOfCountries_when_countryNameIsRepeated() {
            //given the country name is repeated
            val input = listOf(Pair("Cuba",2.28),Pair("Cuba",2.0),Pair("Syria",0.82))

            //when filter frequent names
            val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
                .getCountriesOfHighestCarbonatedDrinksPrices(3)

            //then the result without frequent names
            assertEquals(listOf(Pair("Cuba",2.28F),Pair("Syria",0.82F)), actualResult)
        }
