package co.micol.shop.border.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.shop.border.vo.BorderVO;
import co.micol.shop.common.Command;

public class BorderList implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// 수행할 것 작업
		
		
		
		// request.setAttribute("list", list);
		return "border/borderList.jsp";
	}
}
