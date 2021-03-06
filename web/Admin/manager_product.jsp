<%-- 
    Document   : manager_product
    Created on : Dec 30, 2016, 10:18:52 AM
    Author     : Khang
--%>
<%@page import="model.Admin"%>
<% 
    Admin admin = (Admin) session.getAttribute("admin");
    String pqAdmin = "";
    if (admin == null) {
        response.sendRedirect("../Admin/login.jsp");
    }else{        
        if(Integer.parseInt(session.getAttribute("pqAdmin").toString()) != 2 && Integer.parseInt(session.getAttribute("pqAdmin").toString()) != 1){
            pqAdmin = "disabled";
        }
    }
%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@page import="dao.ProducerDAO"%>
<%@page import="model.Product"%>
<%@page import="helpers.MoneyFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý sản phẩm</title>
        <link rel="icon" href="./images/favicon.png" type="image/x-icon" />
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="${root}/Admin/layout/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <link rel="stylesheet" href="${root}/Admin/layout/plugins/datatables/dataTables.bootstrap.css">
        <link rel="stylesheet" href="${root}/Admin/layout/dist/css/AdminLTE.min.css">
        <link rel="stylesheet" href="${root}/Admin/layout/dist/css/skins/_all-skins.min.css">     
    </script>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <%
            MoneyFormat formatter = new MoneyFormat();
            ProductDAO productdao = new ProductDAO();
            ProducerDAO producerdao = new ProducerDAO();
            ArrayList<Product> listProduct = productdao.getListProduct();            
        %>
       <div class="wrapper">
            <%if (admin != null){%>
            <jsp:include page="./layout/header.jsp"></jsp:include>
            <%}%>
            <div class="content-wrapper">
                <section class="content-header">
                    <%if(pqAdmin!="disabled"){%>
                    <a class="btn btn-primary mini_btn center-block" href="../Admin/insert_product.jsp">THÊM MỚI</a>
                    <% }%>
                  </section>
<!--                MAIN------------------------------------------------------------------->
                        <section class="content">
                             <div class="row">
                               <div class="col-xs-12">
                                 <!-- /.box -->

                                 <div class="box">
                                   <div class="box-header">
                                     <h3 class="box-title">Bảng sản phẩm</h3>                                     
                                    <%if(session.getAttribute("adid")=="noti"){%>
                                        <div class="alert alert-success alert-dismissible fade in" id="myAlert">
                                            <a href="#" class="close">&times;</a>
                                            <strong><%=session.getAttribute("adnoti")%></strong>
                                        </div>    
                                    <% }%>
                                   </div>
                                   <!-- /.box-header -->
                                   <div class="box-body">
                                     <table id="example1" class="table table-bordered table-striped">
                                       <thead>
                                       <tr>
                                            <th>Mã Danh Mục</th>
                                            <th>Tên Sản Phẩm</th>
                                            <th>Hình ảnh</th>
                                            <th>Màu sắc</th>
                                            <th>Giá</th>
                                            <th>Ngày cập nhật</th>
                                            <th>Nhà sản xuất</th>
                                            <th>Tùy chọn</th>
                                       </tr>
                                       </thead>
                                       <tbody>
                                        <%
                                            for(Product p : listProduct){
                                        %>
                                        <tr>                                        
                                          <td><%=p.getProductID()%></td>
                                          <td><a href="#" data-toggle="modal" data-target="#myModal<%=p.getProductID()%>"><%=p.getProductName()%></a></td>
                                          <td>
                                              <div class="col-sm-5 col-md-5 no-padding-l">
                                                <div class="product-img-parent">
                                                    <a href="#" data-toggle="modal" data-target="#myModal<%=p.getProductID()%>" class="product-img"><img src="${root}../images/product/<%=p.getProductImage()%>" width="50" height="50" alt="<%=p.getProductName()%>"></a>
                                                </div>
                                              </div>
                                          </td>
                                          <td><%=p.getProductColor()%></td>
                                          <td><%=formatter.format(p.getProductPrice())%></td>
                                          <td><%=p.getProductUpdate()%></td>
                                          <td><%=producerdao.getProducer(p.getProducerID()).getProducerName()%></td>
                                          <td>
                                              <center> 
                                                  <button <%=pqAdmin%> class="btn btn-primary btn-xs" onclick="location.href='${root}../Admin/update_product.jsp?product_id=<%=p.getProductID()%>'"><i class="glyphicon glyphicon-pencil"></i> Sửa</button>
                                                    <button <%=pqAdmin%> class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myModall<%=p.getProductID()%>"><i class="glyphicon glyphicon-remove"></i> Xóa</button>
                                                </center> 
                                           </td>                                         
                                        </tr>
                                        <div class="modal fade" id="myModall<%=p.getProductID()%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                        <div class="modal-dialog" role="document">
                                          <div class="modal-content">
                                            <div class="modal-header">
                                              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                              <h4 class="modal-title" id="myModalLabel">Bạn muốn xóa laptop <strong><%=p.getProductName()%></strong></h4>
                                            </div>         
                                            <div class="modal-footer">
                                              <button type="button" class="btn btn-default" data-dismiss="modal">Hủy</button>
                                              <button type="button" class="btn btn-danger" onclick="location.href='../ManagerProductServlet?command=delete&product_id=<%=p.getProductID()%>'">Xóa</button>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                        
                       <!-------------------- Modal --------------------------------------->
                                                <div class="modal fade" id="myModal<%=p.getProductID()%>" role="dialog">
                                                  <div class="modal-dialog modal-open">

                                                    <!-- Modal content-->
                                                    <div class="modal-content">
                                                      <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal"></button>
                                                        <h4 class="modal-title"><%=p.getProductName()%></h4>
                                                      </div>
                                                      <div class="modal-body">
                                                          
                                                          
                                                          
                                                        <div class="box box-solid">
                                                          <div class="box-header with-border">
                                                            <i class="fa fa-text-width"></i>
                                                            <h3 class="box-title">Thông tin cơ bản</h3>
                                                          </div>
                                                          <div class="box-body">
                                                            <dl class="dl-horizontal">
                                                              <dt>Nhà sản xuất: </dt><dd><%=producerdao.getProducer(p.getProducerID()).getProducerName()%></dd>                                                                                                                         
                                                              <dt>Kích thước: </dt><dd><%=p.getProductSize()%></dd>
                                                              <dt>Trọng lương: </dt><dd><%=p.getProductWeight()%></dd>
                                                            </dl>
                                                          </div>
                                                        </div>
                                                      
                                                       <div class="box box-solid"> 
                                                        <div class="box-header with-border">
                                                            <i class="fa fa-text-width"></i>
                                                            <h3 class="box-title">Thông tin SEO</h3>
                                                          </div>
                                                          <div class="box-body">
                                                            <dl class="dl-horizontal">
                                                              <dt>MetaTitle: </dt><dd><%=p.getProductMetaTitle()%></dd>
                                                              <dt>MetaKeywords: </dt><dd><%=p.getProductMetaKeywords()%></dd>                                                              
                                                              <dt>MetaDescription: </dt><dd><%=p.getProductMetaDescription()%></dd>
                                                            </dl>
                                                          </div>
                                                      </div>
                                                            
                                                       <div class="box box-solid"> 
                                                        <div class="box-header with-border">
                                                            <i class="fa fa-text-width"></i>
                                                            <h3 class="box-title">Giá và số lượng</h3>
                                                          </div>
                                                          <div class="box-body">
                                                            <dl class="dl-horizontal">
                                                              <dt>Giá bán: </dt><dd><%=formatter.format(p.getProductPrice())%></dd>
                                                              <dt>Khuyến mãi: </dt><dd><%=p.getProductSale()%></dd>                                                              
                                                              <dt>Lượt mua: </dt><dd><%=p.getProductBuys()%></dd>
                                                              <dt>Còn lại: </dt><dd><%=p.getProductInventory()%></dd>
                                                            </dl>
                                                          </div>
                                                      </div>
                                                            
                                                      <div class="box box-solid"> 
                                                        <div class="box-header with-border">
                                                            <i class="fa fa-text-width"></i>
                                                            <h3 class="box-title">Cấu hình</h3>
                                                          </div>
                                                          <div class="box-body">
                                                            <dl class="dl-horizontal">
                                                              <dt>CPU: </dt><dd><%=p.getProductCpuDetail()%></dd>
                                                              <dt>RAM: </dt><dd><%=p.getProductRamDetail()%></dd>                                                              
                                                              <dt>Ổ cứng: </dt><dd><%=p.getProductStorageDetail()%></dd>
                                                              <dt>Màn hình: </dt><dd><%=p.getProductScreenDetail()%></dd>
                                                              <dt>VGA: </dt><dd><%=p.getProductVGA()%></dd>
                                                              <dt>Âm thanh: </dt><dd><%=p.getProductSound()%></dd>                                                             
                                                            </dl>
                                                          </div>
                                                      </div>
                                                         


                                                      </div>
                                                      <div class="modal-footer">            
                                                          <a href="${root}../Admin/update_product.jsp?product_id=<%=p.getProductID()%>" class="btn btn-primary pull-left"><i class="glyphicon glyphicon-pencil"></i> SỬA</a>
                                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                      </div>
                                                    </div>

                                                  </div>
                                                </div>
                 <!-------------------------------- /Modal --------------------------------------------->
                                        
                                        
                                       <% }%>
                                       </tbody>
                                       <tfoot>
                                       <tr>
                                            <th>Mã Danh Mục</th>
                                            <th>Tên Sản Phẩm</th>
                                            <th>Hình ảnh</th>
                                            <th>Màu sắc</th>
                                            <th>Giá</th>
                                            <th>Ngày cập nhật</th>
                                            <th>Nhà sản xuất</th>
                                            <th>Tùy chọn</th>
                                       </tr>
                                       </tfoot>
                                     </table>
                                   </div>
                                   <!-- /.box-body -->
                                 </div>
                                 <!-- /.box -->
                               </div>
                               <!-- /.col -->
                             </div>
                             <!-- /.row -->
                           </section>

<!--                /MAIN------------------------------------------------------------------->
            </div>            
            <jsp:include page="./layout/footer.jsp"></jsp:include>
            <jsp:include page="./layout/control-sidebar.jsp"></jsp:include>
            <div class="control-sidebar-bg"></div>
        </div>
            <script src="${root}/Admin/layout/plugins/jQuery/jquery-2.2.3.min.js"></script>
            <script src="${root}/Admin/layout/bootstrap/js/bootstrap.min.js"></script>
            <script src="${root}/Admin/layout/plugins/datatables/jquery.dataTables.min.js"></script>
            <script src="${root}/Admin/layout/plugins/datatables/dataTables.bootstrap.min.js"></script>
            <script src="${root}/Admin/layout/plugins/slimScroll/jquery.slimscroll.min.js"></script>
            <script src="${root}/Admin/layout/plugins/fastclick/fastclick.js"></script>
            <script src="${root}/Admin/layout/dist/js/app.min.js"></script>
            <script src="${root}/Admin/layout/dist/js/demo.js"></script>            
            <script>
            $(document).ready(function () {
                $('#example1').DataTable({
                    responsive: true,
                    "language": {
                        "sProcessing":   "Đang xử lý...",
                        "sLengthMenu":   "Xem _MENU_ mục",
                        "sZeroRecords":  "Không tìm thấy dòng nào phù hợp",
                        "sInfo":         "Đang xem _START_ đến _END_ trong tổng số _TOTAL_ mục",
                        "sInfoEmpty":    "Đang xem 0 đến 0 trong tổng số 0 mục",
                        "sInfoFiltered": "(được lọc từ _MAX_ mục)",
                        "sInfoPostFix":  "",
                        "sSearch":       "Tìm:",
                        "sUrl":          "",
                        "oPaginate": {
                            "sFirst":    "Đầu",
                            "sPrevious": "Trước",
                            "sNext":     "Tiếp",
                            "sLast":     "Cuối"
                        }
                    }
                });
            });
            </script>
            <script type="text/javascript">
	$(function(){
		$('.sidebar-menu a').filter(function(){return this.href===location.href;}).parent().addClass('active').siblings().removeClass('active');
		$('.sidebar-menu a').click(function(){
			$(this).parent().addClass('active').siblings().removeClass('active');	
		});
	});
	</script>
        <script>
            $(document).ready(function(){
                $(".close").click(function(){
                   $("#myAlert").alert("close");
                   <%
                        session.setAttribute("adid", "");
                        session.setAttribute("aderror", "");
                        session.setAttribute("adnoti", "");
                   %>
                });
            setTimeout(function(){
                $("#myAlert").alert("close");
                <%
                    session.setAttribute("adid", "");
                    session.setAttribute("aderror", "");
                    session.setAttribute("adnoti", "");
                %>
            }, 6000);            
        });
        </script>
    </body>
</html>
