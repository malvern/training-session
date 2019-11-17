package zw.co.malv3rn;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.mock.mockito.MockBean;

import zw.co.malv3rn.business.ShopService;
import zw.co.malv3rn.utils.messages.DailyStockResponse;
import static org.mockito.BDDMockito.given;


@RunWith(JUnit4.class)
public class ShopBusinessUnitTest {
	@MockBean
	private ShopService shopService;
	private DailyStockResponse dailyStockReponse;
	
	@Before
	public void setup() {
		dailyStockReponse = new DailyStockResponse();
		dailyStockReponse.setNarrative("today's sales");
	}
	
	@Test
	public void getStocksShouldReturnSuccess() {
		given(shopService.getStocks()).willReturn(dailyStockReponse);
		final DailyStockResponse availableStocks = shopService.getStocks();
		assertNotNull(availableStocks);
		assertEquals(availableStocks.getNarrative(),"today's sales");
		assertEquals("stock size",availableStocks.getStockList().size(),4);
		
	}
}
