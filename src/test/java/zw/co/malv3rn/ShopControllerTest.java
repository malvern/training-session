package zw.co.malv3rn;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import zw.co.malv3rn.business.ShopService;
import zw.co.malv3rn.rest.ShopController;
import zw.co.malv3rn.utils.messages.DailyStockResponse;

@RunWith(SpringRunner.class)
@WebMvcTest(ShopController.class)
public class ShopControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ShopService shopService;
	
	private DailyStockResponse dailyStockReponse;
	

	@Before
	public void setup() {
		dailyStockReponse = new DailyStockResponse();
		dailyStockReponse.setNarrative("today's sales");
	}

	@Test
	public void getItemsShouldReturnItemsOnSale() throws Exception {
		final String url = "/api/stock";
		given(shopService.getStocks()).willReturn(dailyStockReponse);
		mockMvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("narrative").value("today's sales"));

	}

}
