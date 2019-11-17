package zw.co.malv3rn;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import zw.co.malv3rn.utils.dto.Stock;

@RunWith(JUnit4.class)
public class StockUnitTest {
	
	private Stock stock;
	
	@Before()
	public void setup() {
		stock = new Stock("Upfu",10.50);
	}
	
	@Test
	public void createStockShouldReturnStockItem() {
		assertNotNull(stock);
		assertEquals(stock.getName(),"Upfu","Stock Item Name");
		assertEquals(stock.getPrice(),10.50,"Stock Item price");
		
	}

}
