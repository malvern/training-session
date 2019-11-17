package zw.co.malv3rn.business;

import java.util.Arrays;
import java.util.List;

import zw.co.malv3rn.utils.messages.DailyStockResponse;
import zw.co.malv3rn.utils.dto.*;

public class ShopService {

	public DailyStockResponse getStocks() {
		final DailyStockResponse response = new DailyStockResponse();
		response.setNarrative("today's stock");
		response.setStockList(populateStocks());
		return response;
	}

	private List<Stock> populateStocks() {
		return Arrays.asList(
				new Stock("bread", 2.50), 
				new Stock("Rice", 4.50), 
				new Stock("Upfu", 10.01),
				new Stock("Nyama", 12.37));
	}
}
