package co.micol.shop.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public String exec(HttpServletRequest request, HttpServletResponse response); // servelException이 발생할 것이다.
	// jsp 파일을 돌려받아야 되서 String이다. / exec는 나한테 view page를 돌려준다.
}
