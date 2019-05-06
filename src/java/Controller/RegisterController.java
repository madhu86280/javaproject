
package Controller;

import Bean.Stu;
import DAO.StudentDeclaration;
import DAO.StudentOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String type, username, password;
        username = req.getParameter("uname");
        password = req.getParameter("pwd");
        type = req.getParameter("type");
        Stu st = new Stu(type, username, password);
        StudentDeclaration sd = new StudentOperation();
        long id = sd.insertStudent(st);
        if (id > 0) {
            resp.sendRedirect("Register.jsp");
        }
        else{
            out.println("Wrong");
    }
}
}
