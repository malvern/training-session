package zw.co.malv3rn.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zw.co.malv3rn.business.ShopService;
import zw.co.malv3rn.utils.messages.DailyStockResponse;

@RestController
@RequestMapping("api")
public class ShopController {
	
	private final ShopService shopService;
	
	
	public ShopController(ShopService shopService) {
		super();
		this.shopService = shopService;
	}


	@GetMapping("stock")
	public DailyStockResponse getDailyStock(){
		return shopService.getStocks();
	}

}
