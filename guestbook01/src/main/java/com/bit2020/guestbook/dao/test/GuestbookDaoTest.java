package com.bit2020.guestbook.dao.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.bit2020.guestbook.dao.GuestbookDao;
import com.bit2020.guestbook.vo.GuestbookVo;


public class GuestbookDaoTest {

	public static void main(String[] args) {
		testInsert();
//		testSelectList();
	}
	
	public static void testSelectList() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		if(list.size() == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	public static void testInsert() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("둘리");
		vo.setPassword("1234");
		vo.setText("성공이냐?");
		LocalDate date = LocalDate.now();
		vo.setDate(Date.valueOf(date));
		
		boolean result = new GuestbookDao().insert(vo);
		if(result) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
