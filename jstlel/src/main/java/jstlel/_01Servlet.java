package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 값
		int iVal = 10;
		long lVal = 1234567890;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "가\n나\n다\n라\n마\n바\n사";
		
		// 객체 
		UserVo vo = new UserVo();
		vo.setNo(10L);
		vo.setName("안대혁");
		Object obj = null;
		
		// map
		Map<String, Object> map = new HashMap<>();
		map.put("i", iVal);
		map.put("l", lVal);
		map.put("s", sVal);
		
		request.setAttribute("m", map);
		
		request.setAttribute("ival", iVal);
		request.setAttribute("lval", lVal);
		request.setAttribute("fval", fVal);
		request.setAttribute("bval", bVal);
		request.setAttribute("sval", sVal);
		
		request.setAttribute("obj", obj);
		request.setAttribute("userVo", vo);
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
