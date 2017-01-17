<%-- 
    Document   : manager_category
    Created on : Dec 30, 2016, 10:14:21 AM
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
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý danh mục</title>
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
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <%
            CategoryDAO categorydao = new CategoryDAO();
            ArrayList<Category> listCategory = categorydao.getListCategory();            
        %>
        <div class="wrapper">
            <%if (admin != null){%>
            <jsp:include page="./layout/header.jsp"></jsp:include>
            <%}%>
            <div class="content-wrapper">
                <section class="content-header">
                    <%if(pqAdmin!="disabled"){%>
                    <a class="btn btn-primary mini_btn center-block" href="../Admin/insert_category.jsp">THÊM MỚI</a>
                    <% }%>
                  </section>
<!--                MAIN------------------------------------------------------------------->
                        <section class="content">
                             <div class="row">
                               <div class="col-xs-12">
                                 <!-- /.box -->

                                 <div class="box">
                                   <div class="box-header">
                                     <h3 class="box-title">Bảng danh mục sản phẩm</h3>                                     
                                     <%if(session.getAttribute("adid")=="noti"){%>
                                        <div class="alert alert-success alert-dismissible fade in" id="myAlert">
                                            <a href="#" class="close">&times;</a>
                                            <strong><%=session.getAttribute("adnoti")%></strong>
                                        </div>    
                                    <% }%>
                                   </div>
                                   <!-- /.box-header -->
                                   <div class="box-body">
                                     <table id="example1" class="table table-bordered table-striped display" cellspacing="0" width="100%">
                                       <thead>
                                       <tr>
                                            <th>Mã Danh Mục</th>
                                            <th>Tên Danh Mục</th>
                                            <th>Tittle</th>
                                            <th>Keywords</th>
                                            <th>Description</th>
                                            <th width="75px">Tùy chọn</th>
                                       </tr>
                                       </thead>
                                       <tbody>
                                        <%
                                            for(Category category : listCategory){
                                        %>
                                        <tr>                                        
                                          <td><%=category.getCategoryID()%></td>
                                          <td><%=category.getCategoryName()%></td>
                                          <td><%=category.getCategorymt()%></td>
                                          <td><%=category.getCategorymkw()%></td>
                                          <td><%=category.getCategorymd()%></td>
                                          <td width="75px"> 
                                              <center> 
                                             <button <%=pqAdmin%> class="btn btn-primary btn-xs" onclick="location.href='${root}../Admin/update_category.jsp?command=update&category_id=<%=category.getCategoryID()%>'"><i class="glyphicon glyphicon-pencil"></i> Sửa</button>
                                             <button <%=pqAdmin%> class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myModal<%=category.getCategoryID()%>"><i class="glyphicon glyphicon-remove"></i> Xóa</button>
                                                </center> 
                                           </td>                                         
                                        </tr>
                                        <div class="modal fade" id="myModal<%=category.getCategoryID()%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                        <div class="modal-dialog" role="document">
                                          <div class="modal-content">
                                            <div class="modal-header">
                                              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                              <h4 class="modal-title" id="myModalLabel">Bạn muốn xóa danh mục <strong><%=category.getCategoryName()%></strong></h4>
                                            </div>         
                                            <div class="modal-footer">
                                              <button type="button" class="btn btn-default" data-dismiss="modal">Hủy</button>
                                              <button type="button" class="btn btn-danger" onclick="location.href='../ManagerCategoryServlet?command=delete&category_id=<%=category.getCategoryID()%>'">Xóa</button>
                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                       <% }%>
                                       </tbody>
                                       <tfoot>
                                       <tr>
                                            <th>Mã Danh Mục</th>
                                            <th>Tên Danh Mục</th>
                                            <th>Tittle</th>
                                            <th>Keywords</th>
                                            <th>Description</th>
                                            <th width="75px">Tùy chọn</th>
                                       </tr>
                                       <!-- Modal -->
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
