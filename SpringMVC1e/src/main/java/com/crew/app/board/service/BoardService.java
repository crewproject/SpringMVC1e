package com.crew.app.board.service;

import java.util.List;
import java.util.Map;

import com.crew.app.data.*;


public interface BoardService {
	public List<Map<String,Object>> test();
	public BBSOneVO getOneBBS(String id);
	public List<BBSListVO> getListBBS();
	public void newBBS(BBSInsertVO vo);
	public void deleteBBS(String id);
}
