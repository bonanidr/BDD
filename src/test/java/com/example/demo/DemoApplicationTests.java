package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.Assert.assertTrue;
@RunWith(SpringRunner.class)
@SpringBootTest()
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue("Tudo Certo!", true);
	}

}
