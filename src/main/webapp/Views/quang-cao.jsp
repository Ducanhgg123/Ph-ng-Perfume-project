<%-- 
    Document   : quang-cao-slider
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <div class="slider-area">
        	<!-- Slider -->
			<div class="block-slider block-slider4">
				<ul class="" id="bxslider-home4">
					<c:forEach items="${lstQuangCao }" var="quangCao">
						<li>
							<img src="img/${quangCao.hinhAnh }" alt="Slide">
							<div class="caption-group">
								<h2 class="caption title">
									 <span class="primary"> <strong>${quangCao.thongDiep }</strong></span>
								</h2>
								<h4 class="caption subtitle">${quangCao.thongDiep }</h4>
								<a class="caption button-radius" href="#"><span class="icon"></span>Chi tiết</a>
							</div>
						</li>
					</c:forEach>
					
				</ul>
			</div>
			<!-- ./Slider -->
    </div> <!-- End slider area -->