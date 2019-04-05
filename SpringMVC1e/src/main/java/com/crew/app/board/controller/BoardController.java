package com.crew.app.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crew.app.board.service.BoardService;
import com.crew.app.data.BBSInsertVO;
import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;
import com.crew.app.data.BBSUpdateVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		// DB test
		logger.info("DB TEST ");
		List<Map<String, Object>> boardList = boardService.test();

		for (Map<String, Object> map : boardList) {
			logger.info("=====>" + map.get("name").toString());
		}

		model.addAttribute("board", boardList);
		return "test";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Model model) {
		List<BBSListVO> bbsList = boardService.getListBBS();
		model.addAttribute("vo", bbsList);
		return "BBSList";
	}

	@RequestMapping(value = "/getone/{id}", method = RequestMethod.GET)
	public String getOne(@PathVariable("id") String id, Model model) {
		BBSOneVO vo = boardService.getOneBBS(id);
		model.addAttribute("vo", vo);
		return "BBSOne";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteBBS(@ModelAttribute("id") String id) {
		boardService.deleteBBS(id);
		return "redirect:/list";
	}

	@RequestMapping(value = "/insertBBS")
	public String inserPage() {
		return "BBSWriter";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertBBS(@ModelAttribute BBSInsertVO vo, HttpServletRequest request) {
		vo.setIp(request.getRemoteAddr());
		boardService.newBBS(vo);
		return "redirect:/list";
	}

	//업데이트 페이지로 전송해준다.
	@RequestMapping(value = "/updateBBS", method = RequestMethod.POST)
	public String updatePage(
			@ModelAttribute("id") String id,
			@ModelAttribute("pass") String pass,
			Model model
			) {

		//id와 일치하는 bbs의 정보를 업데이트 페이지에 전해준다.
		BBSOneVO oneVO = boardService.getOneBBS(id);

		model.addAttribute("id", oneVO.getId());
		model.addAttribute("name", oneVO.getName());
		model.addAttribute("title", oneVO.getTitle());
		model.addAttribute("comment", oneVO.getComment());
		return "BBSUpdate";
	}	

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateBBS(BBSUpdateVO vo) {
		//bbs update
		System.out.println("update vo "+vo);
		System.out.println("vo.id : "+vo.getId());
		System.out.println("vo.title : "+vo.getTitle());
		System.out.println("vo.comment : "+vo.getComment());
		boardService.updateBBS(vo);
		return "redirect:/getone/" + vo.getId();
	}



}
