package com.example.demoboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.formation.service.Calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoBootApplicationTests {
	
	Calculator calculator = new Calculator();

	@Test
	void sumTest() {
		
		assertEquals(6, calculator.sum(2, 4));
		
	}

}
