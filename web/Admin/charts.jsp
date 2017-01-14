<%-- 
    Document   : charts
    Created on : Jan 12, 2017, 10:00:25 AM
    Author     : Toan
--%>
<%@page import="model.Bill"%>
<%@page import="dao.BillDAO"%>
<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.Producer"%>
<%@page import="dao.ProducerDAO"%>
<%@page import="model.Pricelevel"%>
<%@page import="dao.PricelevelDAO"%>
<%@page import="model.Screensize"%>
<%@page import="dao.ScreensizeDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="helpers.MoneyFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang báo cáo, thống kê</title>
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
        
        <link rel="stylesheet" href="${root}/Admin/layout/plugins/morris/morris.css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <%
            BillDAO billDAO = new BillDAO();    
            int thang1 = billDAO.doanhthuthang("1").getBillTotal();
            int thang2 = billDAO.doanhthuthang("2").getBillTotal();
            int thang3 = billDAO.doanhthuthang("3").getBillTotal();
            int thang4 = billDAO.doanhthuthang("4").getBillTotal();
            int thang5 = billDAO.doanhthuthang("5").getBillTotal();
            int thang6 = billDAO.doanhthuthang("6").getBillTotal();
            int thang7 = billDAO.doanhthuthang("7").getBillTotal();
            int thang8 = billDAO.doanhthuthang("8").getBillTotal();
            int thang9 = billDAO.doanhthuthang("9").getBillTotal();
            int thang10 = billDAO.doanhthuthang("10").getBillTotal();
            int thang11 = billDAO.doanhthuthang("11").getBillTotal();
            int thang12= billDAO.doanhthuthang("12").getBillTotal();
            CategoryDAO categoryDAO = new CategoryDAO();
            ProducerDAO producerDAO = new ProducerDAO();
            PricelevelDAO pricelevelDAO = new PricelevelDAO();
            ScreensizeDAO screensizeDAO = new ScreensizeDAO();
            ProductDAO productDAO = new ProductDAO();
            ArrayList<Category> listCategory = productDAO.getListChartCategory(); 
            ArrayList<Producer> listProducer = productDAO.getListChartProducer(); 
            ArrayList<Pricelevel> listPricelevel = productDAO.getListChartPricelevel(); 
            ArrayList<Screensize> listScreensize = productDAO.getListChartScreensize(); 

        %>
         <div class="wrapper">
            <jsp:include page="./layout/header.jsp"></jsp:include>
            <div class="content-wrapper">
<!--                MAIN------------------------------------------------------------------->
                        <section class="content">
                             <div class="row">
                               <div class="col-xs-12">
                                 <!-- /.box -->
                                 <div class="box box-primary">
                                    <div class="box-header with-border">
                                      <i class="fa fa-bar-chart-o"></i>

                                      <h3 class="box-title">Doanh thu theo tháng</h3>

                                      <div class="box-tools pull-right">
                                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                        </button>
                                        <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                      </div>
                                    </div>
                                    <div class="box-body">
                                      <div id="bar-chart" style="height: 300px;"></div>
                                    </div>
                                    <!-- /.box-body-->
                                  </div>
                                  <!-- /.box -->
                                 <!-- /.box -->
                               </div>
                               <!-- /.col -->
                             </div>
                            
                            <div class="row">
                                <div class="col-xs-6">
                                    <div class="box box-danger">
                                        <div class="box-header with-border">
                                          <h3 class="box-title">Loại sản phẩm</h3>

                                          <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                            </button>
                                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                          </div>
                                        </div>
                                        <div class="box-body chart-responsive">
                                          <div class="chart" id="1-chart" style="height: 300px; position: relative;"></div>
                                        </div>
                                        <!-- /.box-body -->
                                      </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="box box-danger">
                                        <div class="box-header with-border">
                                          <h3 class="box-title">Thương hiệu</h3>

                                          <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                            </button>
                                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                          </div>
                                        </div>
                                        <div class="box-body chart-responsive">
                                          <div class="chart" id="2-chart" style="height: 300px; position: relative;"></div>
                                        </div>
                                        <!-- /.box-body -->
                                      </div>
                                </div>
                                
                            </div>
                            
                            <div class="row">
                                <div class="col-xs-6">
                                    <div class="box box-danger">
                                        <div class="box-header with-border">
                                          <h3 class="box-title">Khoảng giá</h3>

                                          <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                            </button>
                                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                          </div>
                                        </div>
                                        <div class="box-body chart-responsive">
                                          <div class="chart" id="3-chart" style="height: 300px; position: relative;"></div>
                                        </div>
                                        <!-- /.box-body -->
                                      </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="box box-danger">
                                        <div class="box-header with-border">
                                          <h3 class="box-title">Màn hình</h3>

                                          <div class="box-tools pull-right">
                                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                            </button>
                                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                                          </div>
                                        </div>
                                        <div class="box-body chart-responsive">
                                          <div class="chart" id="4-chart" style="height: 300px; position: relative;"></div>
                                        </div>
                                        <!-- /.box-body -->
                                      </div>
                                </div>
                                
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
            
            <script src="${root}/Admin/layout/plugins/flot/jquery.flot.min.js"></script>
            <script src="${root}/Admin/layout/plugins/flot/jquery.flot.resize.min.js"></script>
            <script src="${root}/Admin/layout/plugins/flot/jquery.flot.pie.min.js"></script>
            <script src="${root}/Admin/layout/plugins/flot/jquery.flot.categories.min.js"></script>
            
            <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
            <script src="${root}/Admin/layout/plugins/morris/morris.min.js"></script>
            <script>
                
            $(function () {
                    /*
                    * BAR CHART
                    * ---------
                    */

                   var bar_data = {
                     data: [["1", <%=thang1%>], ["2", <%=thang2%>], ["3", <%=thang3%>], ["4", <%=thang4%>], ["5", <%=thang5%>], ["6", <%=thang6%>], ["7", <%=thang7%>], ["8", <%=thang8%>], ["9", <%=thang9%>], ["10", <%=thang10%>], ["11", <%=thang11%>], ["12", <%=thang12%>]],
                     color: "#3c8dbc"
                   };
                   $.plot("#bar-chart", [bar_data], {
                     grid: {
                       borderWidth: 1,
                       borderColor: "#f3f3f3",
                       tickColor: "#f3f3f3"
                     },
                     series: {
                       bars: {
                         show: true,
                         barWidth: 0.5,
                         align: "center"
                       }
                     },
                     xaxis: {
                       mode: "categories",
                       tickLength: 0
                     }
                   });
                   /* END BAR CHART */
                   var donut1 = new Morris.Donut({
                    element: '1-chart',
                    resize: true,
                    colors: ["#3c8dbc", "#f56954", "#00a65a"],
                    data: [
                        <%
                           for(Category category : listCategory){
                        %>
                      {label: "<%=categoryDAO.getCategory(category.getCategoryID()).getCategoryName()%>", value: <%=productDAO.tongluotmualsp(String.valueOf(category.getCategoryID()))%>},
                       <% }%>
                    ],
                    hideHover: 'auto'
                  });
                  
                  var donut2 = new Morris.Donut({
                    element: '2-chart',
                    resize: true,
                    colors: ["#3c8dbc", "#f56954", "#00a65a"],
                    data: [
                        <%
                           for(Producer producer : listProducer){
                        %>
                      {label: "<%=producerDAO.getProducer(producer.getProducerID()).getProducerName()%>", value: <%=productDAO.tongluotmuathuonghieu(String.valueOf(producer.getProducerID()))%>},
                        <% }%>
                    ],
                    hideHover: 'auto'
                  });
                  
                  var donut3 = new Morris.Donut({
                    element: '3-chart',
                    resize: true,
                    colors: ["#3c8dbc", "#f56954", "#00a65a"],
                    data: [
                      {label: "Download Sales", value: 12},
                      {label: "In-Store Sales", value: 30},
                      {label: "Mail-Order Sales", value: 20}
                    ],
                    hideHover: 'auto'
                  });
                  
                  var donut4 = new Morris.Donut({
                    element: '4-chart',
                    resize: true,
                    colors: ["#3c8dbc", "#f56954", "#00a65a"],
                    data: [
                      {label: "Download Sales", value: 12},
                      {label: "In-Store Sales", value: 30},
                      {label: "Mail-Order Sales", value: 20}
                    ],
                    hideHover: 'auto'
                  });
            });
              function labelFormatter(label, series) {
    return '<div style="font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;">'
        + label
        + "<br>"
        + Math.round(series.percent) + "%</div>";
  }
</script>
    </body>
</html>
