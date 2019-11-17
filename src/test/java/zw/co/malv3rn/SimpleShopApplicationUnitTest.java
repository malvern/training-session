package zw.co.malv3rn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SimpleShopApplication.class)
public class SimpleShopApplicationUnitTest {
	@Test
	public void contextLoads() {
		SimpleShopApplication.main(new String[] {});
	}

}
