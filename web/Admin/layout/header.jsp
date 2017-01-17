<%-- 
    Document   : header
    Created on : Dec 31, 2016, 7:50:08 PM
    Author     : Toan
--%>
<%@page import="model.Pq"%>
<%@page import="dao.PqDAO"%>
<%
    PqDAO pqDAO = new PqDAO();         
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>-->

    <header class="main-header">
    <!-- Logo -->
    <a href="../Admin/index.jsp" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>A</b>LT</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Admin</b>LTE</span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="${root}/Admin/images/admin/<%=session.getAttribute("avatar")%>" class="user-image" alt="User Image">
              <span class="hidden-xs"><%=session.getAttribute("nameAdmin")%></span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="${root}/Admin/images/admin/<%=session.getAttribute("avatar")%>" class="img-circle" alt="User Image">

                <p>
                  <%=session.getAttribute("nameAdmin")%>
                  <small>- <%=pqDAO.getPqName(session.getAttribute("pqAdmin").toString()).getPqName()%></small>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-right">
                  <a href="../LogOutAdminServlet" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>

    </nav>
  </header>
    <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar" style="height: auto;">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${root}/Admin/images/admin/<%=session.getAttribute("avatar")%>" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p><%=session.getAttribute("nameAdmin")%></p>
          <a href="#"><i class="fa fa-circle text-success"></i>- <%=pqDAO.getPqName(session.getAttribute("pqAdmin").toString()).getPqName()%></a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li><a href="../Admin/index.jsp"><i class="fa fa-dashboard"></i> <span>Trang chủ</span></a></li>
        <li><a href="../Admin/manager_category.jsp"><i class="fa fa-list-ul"></i> <span>Danh mục</span></a></li>
        <li><a href="../Admin/manager_product.jsp"><i class="fa fa-laptop"></i> <span>Laptop</span></a></li>
        <li><a href="../Admin/manager_bill.jsp"><i class="fa fa-file-o"></i> <span>Hóa đơn</span></a></li>
        <li><a href="../Admin/manager_image.jsp"><i class="fa fa-file-image-o"></i> <span>Hình ảnh</span></a></li>    
        <li><a href="../Admin/manager_cpu.jsp"><i class="fa fa-bolt"></i> <span>Loại CPU</span></a></li>
        <li><a href="../Admin/manager_producer.jsp"><i class="fa fa-windows"></i> <span>Nhà sản xuất</span></a></li>        
        <li><a href="../Admin/manager_admin.jsp"><i class="fa fa-user"></i> <span>Quản lý Admin</span></a></li>
        <li><a href="../Admin/manager_users.jsp"><i class="fa fa-users"></i> <span>Quản lý Users</span></a></li>
        <li><a href="../Admin/feedback.jsp"><i class="fa fa-send-o"></i> <span>Góp ý</span></a></li>
        <li><a href="../Admin/charts.jsp"><i class="fa fa-pie-chart"></i> <span>Thống kê</span></a></li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
<!--    </body>
</html>-->
