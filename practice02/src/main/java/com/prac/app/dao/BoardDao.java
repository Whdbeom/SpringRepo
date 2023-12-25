package com.prac.app.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.prac.app.vo.BoardVo;

@Repository
public class BoardDao {

	public int insertBoard(SqlSessionTemplate sst, BoardVo vo) {
		return sst.insert("PracMapper.insertBoard", vo);
	}

}
