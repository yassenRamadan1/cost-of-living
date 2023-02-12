package interactor

import fakedata.FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetHieghestCitiesCokeTaxesTest {

    private lateinit var getHieghestCitiesCokeTaxes: GetHieghestCitiesCokeTaxes

    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        dataSource = fakeData
        getHieghestCitiesCokeTaxes= GetHieghestCitiesCokeTaxes(dataSource)
    }

    @Test
    fun should_return_decending_list(){
        //given
        val list = dataSource.getAllCitiesData()
        //when
        val isDecending = getHieghestCitiesCokeTaxes.getListOfPair(10,list).equals(
            getHieghestCitiesCokeTaxes.getListOfPair(10,list).sortedByDescending {it.second}
        )
       //then
       assertTrue(isDecending)

    }

    @Test
    fun should_returnThrowException_when_listIsEmpty() {
        //given empty list
        val list = emptyList<CityEntity>()
        //when check the list
        val emptyList = Executable {
            getHieghestCitiesCokeTaxes.getListOfPair(10,list)
        }

        //then check result
        assertThrows(Exception::class.java, emptyList)
    }

    @Test
    fun should_throw_exception_when_list_is_null(){
        //given null list
        lateinit var list: List<CityEntity>
        //when check the list
        val nullList = Executable {
            getHieghestCitiesCokeTaxes.getListOfPair(10,list)
        }
        //then check result
        assertThrows(Exception::class.java, nullList)
    }



}