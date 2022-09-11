package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BussinessLogic.ShoppingCart;
import JavaBeans.SanPham;

/**
 * Servlet implementation class DanhSachGioHang
 */
@WebServlet("/DanhSachGioHang")
public class DanhSachGioHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachGioHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ShoppingCart cart=(ShoppingCart) session.getAttribute("cart");
		if (cart==null) {
			cart=new ShoppingCart();
		}
		System.out.println("dahdsaj");
		session.setAttribute("cart", cart);
		List<SanPham> lstSP=cart.getAll();
		request.setAttribute("lstSP", lstSP);
		request.getRequestDispatcher("trang-gio-hang.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
