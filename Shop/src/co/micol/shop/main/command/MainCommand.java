package co.micol.shop.main.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.shop.common.Command;

public class MainCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO main.jsp 파일을 호출하면 된다.
		// 이곳에 처리할 Model(DAO)호출 작성

		return "main/main.jsp"; // 보여줄 페이지
	}
}
