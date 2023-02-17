package fakedata
import fakedata.DataSourceType
import interactor.CostOfLivingDataSource
import model.*

class FakeDataSource(var dataSourceType: DataSourceType = DataSourceType.VALID) : CostOfLivingDataSource {

    private lateinit var validCityEntityList: List<CityEntity>
    private lateinit var nullableCityEntityList: List<CityEntity>
    private lateinit var mixedCityEntityList: List<CityEntity>
    private val emptyCityEntityList = emptyList<CityEntity>()
    val newYorkLowQuality by lazy {
        CityEntity(
            cityName = "NewYork",
            country = "England",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 1f,
                riceWhite1kg = 3f,
                eggsRegular12 = 1f,
                localCheese1kg = 6f,
                chickenFillets1kg = 9f,
                beefRound1kgOrEquivalentBackLegRedMeat = 12f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 4000f,
            dataQuality = false
        )
    }

    val alexHighQuality by lazy {
        CityEntity(
            cityName = "Alex",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 6000f,
            dataQuality = true
        )
    }

    val lyonHighQuality by lazy {
        CityEntity(
            cityName = "Lyon",
            country = "France",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 4f,
                riceWhite1kg = 12f,
                eggsRegular12 = 24f,
                localCheese1kg = 9f,
                chickenFillets1kg = 16f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 9000f,
            dataQuality = true
        )
    }

    val portoLowQualityNull by lazy {
        CityEntity(
            cityName = "Porto",
            country = "Portugal",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = false
        )
    }

    val madridHighQualityNull by lazy {
        CityEntity(
            cityName = "Madrid",
            country = "España",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = null,
                localCheese1kg = null,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }

    val berlinHighQualityNull by lazy {
        CityEntity(
            cityName = "Berlin",
            country = "Germany",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }


    val romeHighQuality by lazy {
        CityEntity(
            cityName = "Rome",
            country = "Italy",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 40f,
                mealFor2PeopleMidRangeRestaurant = 35f,
                mealAtMcDonaldSOrEquivalent = 10f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 6000f,
            dataQuality = true
        )
    }

    val dubaiHighQuality by lazy {
        CityEntity(
            cityName = "Dubai",
            country = "United Arab Emirates",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 100f,
                mealFor2PeopleMidRangeRestaurant = 60f,
                mealAtMcDonaldSOrEquivalent = 30f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 6000f,
            dataQuality = true
        )
    }

    val bernHighQuality by lazy {
        CityEntity(
            cityName = "Bern",
            country = "Switzerland",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 70f,
                mealFor2PeopleMidRangeRestaurant = 35f,
                mealAtMcDonaldSOrEquivalent = 25f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 6000f,
            dataQuality = true
        )
    }
    val cubaLowQuality by lazy {
        CityEntity(
            cityName="Santiago de Cuba",
            country="Cuba",
            mealsPrices=MealsPrices(
                mealInexpensiveRestaurant=6.5f,
                mealFor2PeopleMidRangeRestaurant=15.0f,
                mealAtMcDonaldSOrEquivalent=5.0f),
            drinksPrices=DrinksPrices(cappuccinoRegularInRestaurants=2.0f,
                cokePepsiAThirdOfLiterBottleInRestaurants=2.0f,
                waterAThirdOfLiterBottleInRestaurants=1.0f,
                milkRegularOneLiter=3.8f,
                waterOneAndHalfLiterBottleAtTheMarket=2.0f),

            fruitAndVegetablesPrices=FruitAndVegetablesPrices(
                apples1kg=11.02f,
                banana1kg=0.44f,
                oranges1kg=1.1f,
                tomato1kg=0.88f,
                potato1kg=1.1f,
                onion1kg=2.2f,
                lettuceOneHead=0.25f),
            foodPrices=FoodPrices(
                loafOfFreshWhiteBread500g=1.1f,
                riceWhite1kg=1.1f,
                eggsRegular12=2.03f,
                localCheese1kg=9.0f,
                chickenFillets1kg=6.61f,
                beefRound1kgOrEquivalentBackLegRedMeat=6.61f),
            servicesPrices=ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.1f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl=null,
                fitnessClubMonthlyFeeForOneAdult=null,
                tennisCourtRentOneHourOnWeekend=null,
                cinemaInternationalReleaseOneSeat=1.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=null,
                internationalPrimarySchoolYearlyForOneChild=null),
            clothesPrices=ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar=40.0f,
                oneSummerDressInAChainStoreZaraHAndM=40.0f,
                onePairOfNikeRunningShoesMidRange=60.0f,
                onePairOfMenLeatherBusinessShoes=50.0f),
            transportationsPrices=TransportationsPrices(
                oneWayTicketLocalTransport=null,
                monthlyPassRegularPrice=null,
                taxiStartNormalTariff=null,
                taxi1kmNormalTariff=0.7f,
                taxi1hourWaitingNormalTariff=null,
                gasolineOneLiter=null),
            carsPrices=CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=null,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=null),
            realEstatesPrices=RealEstatesPrices(
                apartmentOneBedroomInCityCentre=null,
                apartmentOneBedroomOutsideOfCentre=null,
                apartment3BedroomsInCityCentre=600.0f,
                apartment3BedroomsOutsideOfCentre=null,
                pricePerSquareMeterToBuyApartmentInCityCentre=null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre=null),
            averageMonthlyNetSalaryAfterTax=18.0f,
            dataQuality=false
        )
    }
    val cubaHighQuality by lazy {
        CityEntity(
            cityName="Havana",
            country="Cuba",
            mealsPrices=MealsPrices(
                mealInexpensiveRestaurant=10.0f,
                mealFor2PeopleMidRangeRestaurant=40.0f,
                mealAtMcDonaldSOrEquivalent=7.0f),
            drinksPrices=DrinksPrices(
                cappuccinoRegularInRestaurants=1.91f,
                cokePepsiAThirdOfLiterBottleInRestaurants=2.28f,
                waterAThirdOfLiterBottleInRestaurants=1.63f,
                milkRegularOneLiter=3.52f,
                waterOneAndHalfLiterBottleAtTheMarket=0.98f),
            fruitAndVegetablesPrices=FruitAndVegetablesPrices(
                apples1kg=6.24f,
                banana1kg=1.1f,
                oranges1kg=1.12f,
                tomato1kg=2.05f,
                potato1kg=1.82f,
                onion1kg=2.34f,
                lettuceOneHead=0.86f),
            foodPrices=FoodPrices(
                loafOfFreshWhiteBread500g=1.18f,
                riceWhite1kg=1.85f,
                eggsRegular12=1.64f,
                localCheese1kg=4.85f,
                chickenFillets1kg=6.07f,
                beefRound1kgOrEquivalentBackLegRedMeat=11.59f),
            servicesPrices=ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=37.14f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.26f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl=165.0f,
                fitnessClubMonthlyFeeForOneAdult=16.67f,
                tennisCourtRentOneHourOnWeekend=13.75f,
                cinemaInternationalReleaseOneSeat=1.12f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=70.0f,
                internationalPrimarySchoolYearlyForOneChild=15166.67f),
            clothesPrices=ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar=55.5f,
                oneSummerDressInAChainStoreZaraHAndM=44.33f,
                onePairOfNikeRunningShoesMidRange=79.17f,
                onePairOfMenLeatherBusinessShoes=78.0f),
            transportationsPrices=TransportationsPrices(
                oneWayTicketLocalTransport=0.1f,
                monthlyPassRegularPrice=20.0f,
                taxiStartNormalTariff=1.0f,
                taxi1kmNormalTariff=0.5f,
                taxi1hourWaitingNormalTariff=15.0f,
                gasolineOneLiter=1.14f),
            carsPrices=CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=80000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=81500.0f
            ),
            realEstatesPrices=RealEstatesPrices(
                apartmentOneBedroomInCityCentre=532.86f,
                apartmentOneBedroomOutsideOfCentre=222.5f,
                apartment3BedroomsInCityCentre=1625.0f,
                apartment3BedroomsOutsideOfCentre=730.0f,
                pricePerSquareMeterToBuyApartmentInCityCentre=490.89f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre=268.23f),
            averageMonthlyNetSalaryAfterTax=35.75f,
            dataQuality=true
        )
    }

    private fun initListsOfCityEntity() {
        validCityEntityList = listOf(
            alexHighQuality, newYorkLowQuality,
            lyonHighQuality, dubaiHighQuality, bernHighQuality, romeHighQuality,
        )
        nullableCityEntityList = listOf(madridHighQualityNull, portoLowQualityNull, berlinHighQualityNull)

        mixedCityEntityList = listOf(
            madridHighQualityNull, berlinHighQualityNull, portoLowQualityNull,
            alexHighQuality, newYorkLowQuality, lyonHighQuality
        )
    }

    override fun getAllCitiesData(): List<CityEntity> {
        initListsOfCityEntity()

        return when (dataSourceType) {
            DataSourceType.VALID -> {
                validCityEntityList
            }

            DataSourceType.NULLABLE -> {
                nullableCityEntityList
            }

            DataSourceType.MIXED -> {
                mixedCityEntityList
            }

            DataSourceType.EMPTY -> {
                emptyCityEntityList
            }
        }
    }
}