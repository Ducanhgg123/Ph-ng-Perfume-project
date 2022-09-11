package BussinessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JavaBeans.QuangCao;

public class QuangCaoBL {
	public static List<QuangCao> getAll(){
		List<QuangCao> lstQuangCao=new ArrayList<QuangCao>();
		try (Connection connect=CSDL.getConnection()){
			Statement stm=connect.createStatement();
			String sql="select * from quangcao";
			ResultSet rs=stm.executeQuery(sql);
			while (rs.next()) {
				QuangCao qc=new QuangCao();
				qc.setId(rs.getInt("id"));
				qc.setHinhAnh(rs.getString("hinhanh"));
				qc.setThongDiep(rs.getString("thongdiep"));
				qc.setThongTinChiTiet(rs.getString("thongtinchitiet"));
				qc.setNgayDang(rs.getDate("ngaydang"));
				lstQuangCao.add(qc);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstQuangCao;
	}
}
