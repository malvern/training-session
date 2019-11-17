package zw.co.malv3rn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zw.co.malv3rn.business.ShopService;

@Configuration
public class BusinessConfig {

	
	@Bean
	public ShopService shopService() {
		return new ShopService();
	}
}
