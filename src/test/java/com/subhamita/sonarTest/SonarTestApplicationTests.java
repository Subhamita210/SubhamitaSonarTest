package com.subhamita.sonarTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarTestApplicationTests {



	@Test
	void contextLoads() {

		System.out.println("I am in contextLoads");
	}
	@Test
	void test1() {
		System.out.println("I am in test class test 1");

	}
	@Test
	void test2() {
		System.out.println("I am in test class test 2");

	}

}
