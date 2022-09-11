<%-- 
    Document   : san-pham-moi
--%>

<script>
	function addToCart(id){
		var xhr=new XMLHttpRequest();
		xhr.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200){
				var s=this.responseText;
				var totalMoney=s.substr(0,s.indexOf(";"));
				var productCount=s.substr(s.indexOf(";")+1);
				document.getElementById("total-money").innerHTML=totalMoney;
				document.getElementById("product-count").innerHTML=productCount;
			}
		}
		xhr.open("get","AddNewProductServlet?id="+id+"&c=1");
		xhr.send();
	}
</script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">New Products</h2>
                        <div class="product-carousel">
                    	<c:forEach items="${lstSanPham }" var="sp">
                    		<div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/${sp.hinhAnh }" alt="">
                                    <div class="product-hover">
                                        <a href="javascript:addToCart(${sp.id })" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Thêm vào giỏ hàng</a>
                                        <a href="single-product.html" class="view-details-link"><i class="fa fa-link"></i> Xem chi tiết</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.html">${sp.tenSanPham }</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>${sp.donGia }</ins> <del>${sp.donGiaKM }</del>
                                </div> 
                            </div>
                    	</c:forEach>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    