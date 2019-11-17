package zw.co.malv3rn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import zw.co.malv3rn.business.ShopService;
import zw.co.malv3rn.utils.messages.DailyStockResponse;


@RunWith(JUnit4.class)
public class ShopBusinessUnitTest {
	
	private ShopService shopService;
	
	@Before
	public void setup() {
		shopService = new ShopService();
	}
	
	@Test
	public void getStocksShouldReturnSuccess() {
		final DailyStockResponse availableStocks = shopService.getStocks();
		assertNotNull(availableStocks);
		assertEquals(availableStocks.getNarrative(),"today's stock");
		assertEquals("stock size",availableStocks.getStockList().size(),4);
		
	}
}
