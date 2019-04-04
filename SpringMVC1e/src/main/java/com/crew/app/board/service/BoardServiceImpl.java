package com.crew.app.board.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crew.app.board.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	SqlSessionTemplate sqlSession;
	BoardDAO boardDAO;
	
	public void setBoardDAO() {
		this.boardDAO = sqlSession.getMapper(BoardDAO.class);
	}

	@Override
	public List<Map<String, Object>> test() {
		setBoardDAO();
		return boardDAO.test();
	}

}
