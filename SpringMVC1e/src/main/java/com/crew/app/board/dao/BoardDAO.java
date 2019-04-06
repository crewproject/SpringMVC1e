package com.crew.app.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.crew.app.data.BBSInsertVO;
import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;
import com.crew.app.data.BBSUpdateVO;
import com.crew.app.data.SearchType;

public interface BoardDAO {

	public List<Map<String, Object>> test();

	// bbs컬럼을 추가시킨다.
	public void insertBBS(BBSInsertVO vo);

	// id로 bbs를 검색해 하나만 가져온다.
	public BBSOneVO selectOneBBS(String id);

	// bbs 목록을 가져온다.
	public List<BBSListVO> selectListBBS();
	
	// name 또는 title또는 comment로 검색한 결과를 가져온다.
	public List<BBSListVO> selectSearchListBBS(
			@Param("searchType") SearchType searchType,
			@Param("text") String text);

	// 특정 bbs컬럼의 see를 증가시킨다.
	public void updateSee(String id);

	// bbs컬럼을 수정한다.
	public void updateBBS(BBSUpdateVO vo);

	// bbs컬럼을 삭제한다.
	public void deleteBBS(String id);
	
	

}
