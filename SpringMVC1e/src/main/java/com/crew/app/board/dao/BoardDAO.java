package com.crew.app.board.dao;

import java.util.List;
import java.util.Map;

import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;


public interface BoardDAO {
	public List<Map<String,Object>> test();
	public BBSOneVO selectOneBBS(String id);
	public List<BBSListVO> selectListBBS();
	public void updateSee(String id);
}
