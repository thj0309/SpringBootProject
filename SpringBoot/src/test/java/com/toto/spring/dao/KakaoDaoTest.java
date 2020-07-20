package com.toto.spring.dao;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class KakaoDaoTest {

	private static final Logger logger = LoggerFactory.getLogger(KakaoDaoTest.class);
	
	@Autowired
	private MockMvc mvc;
		
	@Test
	public void selectQuestion01() throws Exception{
		logger.info("test01");
		// given		
		mvc.perform(get("/kakao/test01"))
		// when & then
		.andExpect(status().isOk())
		.andReturn()
		;
	}
	
	@Test
	public void selectQuestion02() throws Exception{
		logger.info("test02");
		// given		
		mvc.perform(get("/kakao/test02"))
		// when & then
		.andExpect(status().isOk())
		.andReturn()
		;
	}
	
	@Test
	public void selectQuestion03() throws Exception{
		logger.info("test03");
		// given		
		mvc.perform(get("/kakao/test03"))
		// when & then
		.andExpect(status().isOk())
		.andReturn()
		;
	}
	
	@Test
	public void selectQuestion04() throws Exception{
		logger.info("test04");
		// given		
		mvc.perform(get("/kakao/test04"))
		// when & then
		.andReturn()
		;
	}
}
