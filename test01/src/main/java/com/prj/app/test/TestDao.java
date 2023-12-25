package com.prj.app.test;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	public int insert(SqlSessionTemplate sst, TestVo vo) {
		System.out.println("dao진입");
		int result = sst.insert("TestMapper.insert", vo);
		System.out.println(result);
		return result;
	}

	public List<TestVo> list(SqlSessionTemplate sst) {
		return sst.selectList("TestMapper.list");
	}

}
