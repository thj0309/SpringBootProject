package com.toto.spring.dao;

import java.util.HashMap;
import java.util.List;

public interface KakaoDao {
	public List selectQuestion01();
	public List selectQuestion02();
	public List selectQuestion03();
	public List selectQuestion04(HashMap map) throws Exception;

}
