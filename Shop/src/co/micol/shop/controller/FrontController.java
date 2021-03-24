package co.micol.shop.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.shop.border.command.BorderList;
import co.micol.shop.common.Command;
import co.micol.shop.main.command.MainCommand;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>(); // <key값, value값>
	// mapput 값을 넣을때  / mapget 값을 가져올때
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException { // 최초 한번만 실행
		// TODO 수행할 command 그룹
		map.put("/main.do", new MainCommand()); // main Command를 만들어 주는 역활 // 처음 접근할 페이지
		map.put("/borderList.do", new BorderList()); // 게시판 목록 보기
		// 다른 파일 받음 여기 추가
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 넘어오는값 한글화 실행
		String uri = request.getRequestURI(); // 주소값 자르기 // localhost뺀부분
		String context = request.getContextPath();
		String path = uri.substring(context.length()); // length부분을 뺀 나머지 부분만 출력 // localhost다음 부분 제외 localhost8088/ /
		
		System.out.println(path);
		
		Command command = map.get(path); // 실행할 command를 가져온다.
	
		String viewPage = command.exec(request, response);  // 처리한 결과를 돌려줄 페이지
		
		if((viewPage.endsWith(".jsp"))) { // endsWith / return page에서 돌아왔을때 .jsp로 끝나면..
			viewPage = "/WEB-INF/views/" + viewPage; // viewResolve 역활을 할 수 있도록 구현 (views폴더 안에 간다면) / spring 에서는 spring일 알아서 처리를 해준다.
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
