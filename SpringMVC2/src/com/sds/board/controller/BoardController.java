/*
 * �� ��û���� 1:1 �����ϴ� ��Ʈ�ѷ� Ŭ������ �� ��� 
 * xml ������ �ʹ� ���������..���� ��û�� ó���ϴ� ��Ʈ
 * �ѷ��� ������ �ٿ�����...(������������ ���̸鼭....)
 * */
package com.sds.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sds.board.model.BoardDAO;
import com.sds.common.board.PagingManager;
import com.sds.domain.Board;

@Controller
@RequestMapping("/board/")
public class BoardController{
	//BoardDAO�� ���� ��Ʈ�ѷ��� ���յ��� ���ƾ�, ����������
	//�� ��������...���� BoardDAO �ֻ��� �������̽��� ����
	
	@Autowired
	@Qualifier("boardDAOMybatis")
	private BoardDAO boardDAO;
	
	@Autowired
	private PagingManager pm;
	
	//setter ����!
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	public void setPm(PagingManager pm) {
		this.pm = pm;
	}
	
	//Ŭ���̾�Ʈ�� ��û uri�� ó���� �޼��� ����, ����.
	@RequestMapping("write.do")
	public String insert(Board board){
		boardDAO.insert(board);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping("list.do")
	public ModelAndView selectAll(HttpServletRequest request){
		List list=boardDAO.selectAll();
		request.setAttribute("list", list);
		pm.init(request);
		
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("list", list);						//��� ����!
		mav.addObject("pm", pm);
		return mav;
	}
	
	@RequestMapping("detail.do")
	public ModelAndView select(int board_id){
		
		System.out.println("�Ѱܹ��� ���̵� : "+board_id);
		Board board = boardDAO.select(board_id);
		
		ModelAndView mav = new ModelAndView("board/detail");
		mav.addObject("board", board);				//	����
		
		return mav;
		
	}
	
	@RequestMapping("delete.do")
	public String delete( int board_id ){
		
		boardDAO.delete(board_id);
		
		return "redirect:/board/list.do";
		
	}
	
	@RequestMapping("edit.do")
	public String update( Board board ){
		
		boardDAO.update(board);
		
		return "redirect:/board/list.do";
		
	}
	
}











