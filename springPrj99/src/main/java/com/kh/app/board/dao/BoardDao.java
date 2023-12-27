package com.kh.app.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.board.vo.BoardVo;

@Repository
public class BoardDao {

	public int write(BoardVo vo, SqlSessionTemplate sst) {
		return sst.insert("BoardMapper.write", vo);
	}

	public List<BoardVo> list(SqlSessionTemplate sst) {
		return sst.selectList("BoardMapper.list");
	}
	public BoardVo detail(BoardVo vo, SqlSessionTemplate sst) {
		return sst.selectOne("BoardMapper.detail");
	}

	public int delete(BoardVo vo, SqlSessionTemplate sst) {
		return sst.update("BoardMapper.delete", vo);
	}

	public int edit(BoardVo vo, SqlSessionTemplate sst) {
		return sst.update("BoardMapper.edit", vo);
	}


}
