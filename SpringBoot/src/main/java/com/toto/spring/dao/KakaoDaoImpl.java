package com.toto.spring.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KakaoDaoImpl implements KakaoDao {
	
	private static final Logger logger = LoggerFactory.getLogger(KakaoDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectQuestion01() {
		// 1. 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API
		logger.info("select01");
		return sqlSession.selectList("com.toto.spring.dao.KakaoDao.selectQuestion01");
	}

	@Override
	public List selectQuestion02() {
		// 2. 2018년 또는 2019년에 거래가 없는 고객을 추출하는 API 
		logger.info("select02");
		return sqlSession.selectList("com.toto.spring.dao.KakaoDao.selectQuestion02");
	}

	@Override
	public List selectQuestion03() {
		// 3.연도별 관리점별 거래금액 합계를 구하고  합계금액이 큰 순서로 출력하는 API
		logger.info("select03");
		return sqlSession.selectList("com.toto.spring.dao.KakaoDao.selectQuestion03");
	}
	
	@Override
	public List selectQuestion04(HashMap map) throws Exception {
		logger.info("select04");
		List list = null ;

		// 4-1. 판교점, 분당점 통합 -> 판교점
		sqlSession.update("com.toto.spring.dao.KakaoDao.updateQuestion04");

		// 4-2. 관리점 조회 (유효 관리점 여부 확인)
		int cnt = (int) sqlSession.selectOne("com.toto.spring.dao.KakaoDao.selectQuestion04_1", map);
		System.out.println("cnt : " + cnt);
		if (cnt != 0) {
			// 4-2-True. 조회
			list = sqlSession.selectList("com.toto.spring.dao.KakaoDao.selectQuestion04_2", map);
		} else {
			list = null;
		}

		return list;
	}

}
