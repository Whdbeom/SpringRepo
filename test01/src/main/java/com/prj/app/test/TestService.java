package com.prj.app.test;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

	private final TestDao dao;
	private final SqlSessionTemplate sst;
	
	public int insert(TestVo vo) {
		System.out.println("service 진입");
		return dao.insert(sst, vo);
	}

	public List<TestVo> list() {
		return dao.list(sst);
	}

}
