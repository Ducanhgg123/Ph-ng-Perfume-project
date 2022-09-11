package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BussinessLogic.ShoppingCart;

/**
 * Servlet implementation class AddNewProductServlet
 */
@WebServlet("/AddNewProductServlet")
public class AddNewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int num=Integer.parseInt(request.getParameter("c"));
		HttpSession session=request.getSession();
		ShoppingCart cart=(ShoppingCart) session.getAttribute("cart");
		if (cart==null) {
			cart=new ShoppingCart();
		}
		cart.add(id, num);
		session.setAttribute("cart", cart);
//		response.sendRedirect("trang-chu.jsp");
		response.getWriter().print(cart.getTotal()+";"+cart.getSize());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
