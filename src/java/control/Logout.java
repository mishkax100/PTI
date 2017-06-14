package control;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DatabaseConnection database = new DatabaseConnection();
        Connection connection= database.getConnection();
        try {
            connection.close();
        } catch (SQLException ex) {
            
        }finally{
            HttpSession session=request.getSession();
            session.invalidate();
            response.sendRedirect("/ProjectWEB/Home");  //redirect ke homepage
        }
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                DatabaseConnection database = new DatabaseConnection();
        Connection connection= database.getConnection();
        try {
            connection.close();
        } catch (SQLException ex) {
            
        }finally{
            HttpSession session=request.getSession();
            session.invalidate();
            response.sendRedirect("/ProjectWEB/Home");  //redirect ke homepage
        }
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
