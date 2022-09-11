package BussinessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JavaBeans.SanPham;

public class SanPhamBL {
	public static List<SanPham> getAll(){
		List<SanPham> lstSanPham=new ArrayList<SanPham>();
		try (Connection connect=CSDL.getConnection()){
			Statement stm=connect.createStatement();
			String sql="select * from sanpham";
			ResultSet rs=stm.executeQuery(sql);
			while (rs.next()) {
				SanPham sp=new SanPham();
				sp.setId(rs.getInt("id"));
				sp.setTenSanPham(rs.getString("tensanpham"));
				sp.setMoTa(rs.getString("mota"));
				sp.setHinhAnh(rs.getString("hinhanh"));
				sp.setDonGia(rs.getDouble("dongia"));
				sp.setDonGiaKM(rs.getDouble("dongiaKM"));
				sp.setSoLuong(rs.getInt("soluong"));
				sp.setIdLoai(rs.getInt("id_loai"));
				sp.setIdThuongHieu(rs.getInt("id_thuonghieu"));
				lstSanPham.add(sp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstSanPham;
	}
	public static SanPham getSanPham(int id) {
		SanPham sp=null;
		String sql="select * from sanpham where id = "+id;
		try (Connection connect=CSDL.getConnection()){
			Statement stm=connect.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while (rs.next()) {
				sp=new SanPham();
				sp.setId(id);
				sp.setTenSanPham(rs.getString("tensanpham"));
				sp.setMoTa(rs.getString("mota"));
				sp.setHinhAnh(rs.getString("hinhanh"));
				sp.setDonGia(rs.getDouble("dongia"));
				sp.setDonGiaKM(rs.getDouble("dongiaKM"));
				sp.setSoLuong(rs.getInt("soluong"));
				sp.setIdLoai(rs.getInt("id_loai"));
				sp.setIdThuongHieu(rs.getInt("id_thuonghieu"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sp;
	}
	public static void main(String[] args) {
//		SanPham sp=getSanPham(2);
//		System.out.println(sp.getTenSanPham());
		
	}
}
