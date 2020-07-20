package com.toto.spring.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toto.spring.dao.KakaoDaoImpl;

@RestController
public class KakaoController {
	private static final Logger logger = LoggerFactory.getLogger(KakaoController.class);
	
	@Autowired
	KakaoDaoImpl kakaoDao;
	
	@RequestMapping(value="/kakao/test01", method=RequestMethod.GET)
	public Object test01() throws Exception {
		List list = kakaoDao.selectQuestion01();
		logger.info(list.toString());
		
		return list.toString();
	}
	
	@RequestMapping(value="/kakao/test02", method=RequestMethod.GET)
	public Object test02() {
		List list = kakaoDao.selectQuestion02();
		logger.info(list.toString());
		
		return list.toString();
	}
	
	@RequestMapping(value="/kakao/test03", method=RequestMethod.GET)
	public Object test03() {
		List list = kakaoDao.selectQuestion03();
		logger.info(list.toString());
		
		return list.toString();
	}
	
	@RequestMapping(value="/kakao/test04", method=RequestMethod.POST)
	public Object test04(@RequestParam("storeMgtNm") String storeMgtNm) throws Exception {
		HashMap map = new HashMap();
		map.put("storeMgtNm", storeMgtNm);
		List list = null;
		
		list = kakaoDao.selectQuestion04(map);
		logger.info(list.toString());
		
		return list.toString();
	}
}
