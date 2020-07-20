package com.toto.spring.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.BooleanTypeHandler;
import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(basePackages="com.toto.spring.dao")
@EnableTransactionManagement
public class DataSourceConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		Resource[] res = new PathMatchingResourcePatternResolver().getResources ("classpath:/mapper/*Mapper.xml");
		
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setMapperLocations(res);
		sqlSessionFactory.setTypeAliasesPackage("com.toto.spring.dto");
		sqlSessionFactory.setTypeHandlers(new TypeHandler[] {
				new DateTypeHandler(),
				new BooleanTypeHandler()
		});
		
		System.out.println("## H2 DB 연결 성공");
		
		return sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception{
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
