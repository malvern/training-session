package zw.co.malv3rn;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ShopBusinessUnitTest.class,
	ShopControllerTest.class,
	StockUnitTest.class,
	BusinessConfigUnitTest.class,
	SimpleShopApplicationUnitTest.class
})
public class StockTestSuite {

}
