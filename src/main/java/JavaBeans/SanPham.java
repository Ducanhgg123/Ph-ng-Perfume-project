package JavaBeans;

public class SanPham {
	private int id;
	private String tenSanPham,moTa,hinhAnh;
	private double donGia,donGiaKM;
	private int soLuong,idLoai,idThuongHieu;
	private int inCart=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public int getInCart() {
		return inCart;
	}
	public void setInCart(int inCart) {
		this.inCart = inCart;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDonGiaKM() {
		return donGiaKM;
	}
	public void setDonGiaKM(double donGiaKM) {
		this.donGiaKM = donGiaKM;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getIdLoai() {
		return idLoai;
	}
	public void setIdLoai(int idLoai) {
		this.idLoai = idLoai;
	}
	public int getIdThuongHieu() {
		return idThuongHieu;
	}
	public void setIdThuongHieu(int idThuongHieu) {
		this.idThuongHieu = idThuongHieu;
	}
	public SanPham() {
		super();
	}
}
