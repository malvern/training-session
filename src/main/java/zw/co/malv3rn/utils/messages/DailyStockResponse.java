package zw.co.malv3rn.utils.messages;

import java.util.List;

import zw.co.malv3rn.utils.dto.Stock;

public class DailyStockResponse {
	private String narrative;
	private List<Stock> stockList;
	
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
}
