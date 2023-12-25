package com.kh.app.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.vo.BoardVo;

@Repository
public class BoardDao {

	public int insertBoard(BoardVo vo, SqlSessionTemplate sst) {
		
		return sst.insert("BoardMapper.insertBoard", vo);
	}

	public List<BoardVo> getBoardList(SqlSessionTemplate sst) {
		
		return sst.selectList("BoardMapper.getBoardList");
	}

	public BoardVo getBoardByNo(String no, SqlSessionTemplate sst) {
		
		return sst.selectOne("BoardMapper.getBoardByNo", no);
	}

	public int deleteBoardByNo(String no, SqlSessionTemplate sst) {
		return sst.delete("BoardMapper.deleteBoardByNo", no);
	}

	public int editBoardByNo(BoardVo vo, SqlSessionTemplate sst) {

		return sst.update("BoardMapper.editBoardByNo", vo);
	}

}
