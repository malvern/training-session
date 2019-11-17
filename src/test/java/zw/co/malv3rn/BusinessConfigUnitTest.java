package zw.co.malv3rn;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import zw.co.malv3rn.business.ShopService;
import zw.co.malv3rn.config.BusinessConfig;

@RunWith(JUnit4.class)
public class BusinessConfigUnitTest {
	
	private BusinessConfig businessConfig;
	@Before
	public void setup() {
		businessConfig = new BusinessConfig();
	}
	
	@Test
	public void shopServiceShouldReturnShopServiceObject() {
	final ShopService shopService =	businessConfig.shopService();
	assertNotNull(shopService);
	}

}
