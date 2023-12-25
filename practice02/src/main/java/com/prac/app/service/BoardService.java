package com.prac.app.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.prac.app.dao.BoardDao;
import com.prac.app.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardDao dao;
	private final SqlSessionTemplate sst;
	
	public int insertBoard(BoardVo vo) {
		return dao.insertBoard(sst, vo);
	}

}
