package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.hansung.dao.SubjectDAO;
import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

/**
 * Servlet implementation class DoApplication
 */
@WebServlet("/DoApplication")
public class DoApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data
		String year = request.getParameter("year");
		String grade = request.getParameter("grade");
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String division = request.getParameter("division");
		String score = request.getParameter("score");
		
		SubjectService subjectService = new SubjectService();
		
		Subject subject = new Subject(Integer.parseInt(year),Integer.parseInt(grade),code,name,division,Integer.parseInt(score));
		
		subjectService.dataInsert(subject);
		
		
		// perform business logic
		
		PrintWriter out = response.getWriter();
		
		//Build HTML code
		String htmlResponse="<html>";
		
		htmlResponse+= "<h2> �����⵵ : " + year + "<br/>";
		htmlResponse+= " �б�: " + grade + "<br/>";
		htmlResponse+= " ��û�ڵ�: " + code + "<br/>";
		htmlResponse+= " �����: " + name + "<br/>";
		htmlResponse+= " ����: " + division + "<br/>";
		htmlResponse+= " ����: " + score + "<br/>";
		htmlResponse+= " 2017�� 1�б⿡ ��û�� ���� ������ �Է��� �Ϸ�Ǿ����ϴ�. " + "<h2>";
		htmlResponse+= "</html>";
		
		out.println(htmlResponse);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
