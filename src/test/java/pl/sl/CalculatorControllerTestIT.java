package pl.sl;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class CalculatorControllerTestIT {

	@Autowired
	private MockMvc mvc;

	@Test
	void should_return_5_when_adding_2_to_3() throws Exception {
		this.mvc.perform(post("/add/{a}/{b}", 2, 3)).andExpect(status().isOk())
				.andExpect(content().string("5"));
	}
	
	@Test
	void should_return_10_when_adding_4_to_6() throws Exception {
		this.mvc.perform(post("/add/{a}/{b}", 4, 6)).andExpect(status().isOk())
		.andExpect(content().string("10"));
	}
}
