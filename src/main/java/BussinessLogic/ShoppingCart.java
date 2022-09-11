package BussinessLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import JavaBeans.SanPham;

public class ShoppingCart {
	private static Map<Integer,Integer> mapProduct=new HashMap<Integer, Integer>();
	public static void add(int id,int num) {
		if (mapProduct.containsKey(id)) {
			mapProduct.replace(id, mapProduct.get(id)+num);
		}else
			mapProduct.put(id, num);
	}
	public static int getTotal() {
		int sum=0;
		for (int id : mapProduct.keySet()) {
			sum+=mapProduct.get(id)*SanPhamBL.getSanPham(id).getDonGia();
		}
		return sum;
	}
	public static int getSize() {
		return mapProduct.size();
	}
	public static List<SanPham> getAll(){
		List<SanPham> lstSP=new ArrayList<SanPham>();
		for (int id : mapProduct.keySet()) {
			SanPham sp=SanPhamBL.getSanPham(id);
			sp.setInCart(mapProduct.get(id));
			lstSP.add(sp);
		}
		return lstSP;
	}
	public static void main(String[] args) {
//		ShoppingCart.add(2, 3);
//		System.out.println(mapProduct.get(2));
		ShoppingCart.add(2, 3);
		ShoppingCart.add(1, 2);
		List<SanPham> lstSanPham=getAll();
		for (SanPham sanPham : lstSanPham) {
			System.out.println(sanPham.getTenSanPham());
		}
	}
}
