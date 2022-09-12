package com.lear.graph.demograph;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"graphql.servlet.enabled=false",
		"graphql.servlet.websocket.enabled=false"
})
class DemoGraphApplicationTests {

	@Test
	void contextLoads() {
	}

}
