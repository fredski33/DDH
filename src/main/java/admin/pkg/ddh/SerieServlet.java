package admin.pkg.ddh;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



@WebServlet("/serie")
public class SerieServlet extends HttpServlet {
	
	
	@Resource(name = "ddhdatasource")
	  private DataSource dataSource;

	
	
    private static final long serialVersionUID = 7446985734933559486L;

    @Override
    public void init() throws ServletException {
        System.out.println("# # # init " + getServletName());
    }

    @Override
    public void destroy() {
        System.out.println("# # #  destroy " + getServletName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	
    	
    	
		SerieDAO serieDAO = new SerieDAO(dataSource);
		String hello = serieDAO.sayHello();
    	
    	
    	resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/plain");
        resp.getWriter().write(hello);
        
        try {
			resp.getWriter().write(dataSource.getConnection().toString());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        resp.getWriter().write("\n");
        resp.getWriter().write(getServletName() + " called successfully");
        resp.getWriter().write("\n");
        try {
			
        	
        	
        	for (int i = 0; i < serieDAO.afficherToutesSeries().size(); i++) {
				resp.getWriter().write(serieDAO.afficherToutesSeries().get(i).getNom()+"\t");
				resp.getWriter().write(serieDAO.afficherToutesSeries().get(i).getAnneeParution()+"\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			resp.getWriter().write("Pas de resultat");
			e.printStackTrace();
		}
        
        try {
			req.setAttribute("toutesseries", serieDAO.afficherToutesSeries());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        req.getRequestDispatcher("serie.jsp").forward(req,resp);
        
        
    }

}