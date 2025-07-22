package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Employee;
import model.GetEmpByIdLogic;
import servlet.util.MakeEmpByParam;

@WebServlet(urlPatterns = {"/createInput", "/updateInput","/deleteInput"})
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		String url = "WEB-INF/jsp/input.jsp";
		String nextURL = null;
		switch (path) {
		case "/createInput":
			nextURL = "createConfirm";
			break;
		case "/updateInput":
			setEmpScope(request);
			nextURL = "updateConfirm";
			break;
		case "/deleteInput":
			setEmpScope(request);
			url = "WEB-INF/jsp/confirm.jsp";
			nextURL = "deleteDone";//仮
			break;
		}
		request.setAttribute("nextURL", nextURL);
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	private void setEmpScope(HttpServletRequest request) {
		String id = request.getParameter("id");
		GetEmpByIdLogic logic = new GetEmpByIdLogic();
		Employee emp = logic.execute(id);
		request.setAttribute("emp", emp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/createInput":
			request.setAttribute("nextURL", "createConfirm");
			break;
		case "/updateInput":
			request.setAttribute("nextURL", "updateConfirm");
			break;
		}
		
		MakeEmpByParam makeEmp = new MakeEmpByParam();
		Employee emp = makeEmp.execute(request);
		request.setAttribute("emp", emp);
		String url = "WEB-INF/jsp/input.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
