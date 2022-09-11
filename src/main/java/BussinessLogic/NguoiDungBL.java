package BussinessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import JavaBeans.NguoiDung;

public class NguoiDungBL {
	public static NguoiDung getNguoiDungByEmailPassword(String email,String password) {
		NguoiDung nd=null;
		try (Connection connect=CSDL.getConnection()){
			Statement stm=connect.createStatement();
			String sql="select * from nguoidung where email='"+email+"' and password='"+password+"';";
			ResultSet rs=stm.executeQuery(sql);
			if (rs.next()) {
				nd=new NguoiDung();
				nd.setId(rs.getInt("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassword(rs.getString("password"));
				nd.setHoTen(rs.getString("hoten"));
				nd.setDiaChi(rs.getString("diachi"));
				nd.setDtdd(rs.getString("dtdd"));
				nd.setIdVaiTro(rs.getInt("id_vaitro"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nd;
	}
}
