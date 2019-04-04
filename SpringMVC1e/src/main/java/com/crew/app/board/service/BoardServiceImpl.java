package com.crew.app.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.crew.app.board.dao.BoardDAO;
import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	SqlSessionTemplate sqlSession;
	BoardDAO boardDAO;
	
	public void setBoardDAO() {
		this.boardDAO = sqlSession.getMapper(BoardDAO.class);
		System.out.println("setBoardDAO : "+boardDAO);
	}

	@Override
	public List<Map<String, Object>> test() {
		setBoardDAO();
		return boardDAO.test();
	}

	@Override
	public BBSOneVO getOneBBS(String id) {
		setBoardDAO();
		return boardDAO.selectOneBBS(id);
		
	}

	@Override
	public List<BBSListVO> getListBBS() {
		setBoardDAO();
		return boardDAO.selectListBBS();
	}

}
