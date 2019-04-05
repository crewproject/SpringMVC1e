package com.crew.app.board.dao;

import java.util.List;
import java.util.Map;

import com.crew.app.data.BBSInsertVO;
import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;
import com.crew.app.data.BBSUpdateVO;


public interface BoardDAO {
	public List<Map<String,Object>> test();
	public BBSOneVO selectOneBBS(String id);
	public List<BBSListVO> selectListBBS();
	public void updateSee(String id);
	public void insertBBS(BBSInsertVO vo);
	public void deleteBBS(String id);
	public void updateBBS(BBSUpdateVO vo);
}
