<%-- 
    Document   : Pengarang
    Created on : Jun 15, 2017, 7:07:38 PM
    Author     : Hp i3 Geforce
--%>

<%@page import="java.util.List"%>
<%@page import="control.*"%>
<%@page import="model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Daftar Karya Ilmiah</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.2 -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Ionicons -->
    <link href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css" rel="stylesheet" type="text/css" />
    <!-- Theme style -->
    <link href="dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    <!-- AdminLTE Skins. Choose a skin from the css/skins 
         folder instead of downloading all of them to reduce the load. -->
    <link href="dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="skin-green layout-boxed">
    <!-- Site wrapper -->
    <div class="wrapper">
      
      <header class="main-header">
        <a href="index2.html" class="logo">Prototype-0</a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
<ul class="dropdown-menu">
              <!-- User image -->
            
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>

      <!-- =============================================== -->

      <!-- Left side column. contains the sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
              <p>Suparman</p>
              <a href="#"><em class="fa fa-circle text-success"></em> dosen</a></div>
          </div>
          <!-- search form -->

          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">Navigasi Utama</li>
            <li><a href="#"><i class="fa fa-circle-o text-info"></i> Home</a></li>
            <li><a href="#"><i class="fa fa-circle-o text-info"></i> Profil</a></li>
            <li><a href="#"><i class="fa fa-circle-o text-info"></i> Upload</a></li>
            <li><a href="#"><i class="fa fa-book"></i> Karya Ilmiah Saya</a></li>
            <li><a href="#"><i class="fa fa-circle-o text-red"></i> Sign Out</a></li>
            <li class="treeview" hidden="true">
              <a href="#">
                <i class="fa fa-share"></i> <span>Multilevel</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
                <li>
                  <a href="#"><i class="fa fa-circle-o"></i> Level One <i class="fa fa-angle-left pull-right"></i></a>
                  <ul class="treeview-menu">
                    <li><a href="#"><i class="fa fa-circle-o"></i> Level Two</a></li>
                    <li>
                      <a href="#"><i class="fa fa-circle-o"></i> Level Two <i class="fa fa-angle-left pull-right"></i></a>
                      <ul class="treeview-menu">
                        <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
                      </ul>
                    </li>
                  </ul>
                </li>
                <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
              </ul>
            </li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- =============================================== -->

      <!-- Right side column. Contains the navbar and content of the page -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Daftar Karya Ilmiah
            <small>di isi gak ya?</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Examples</a></li>
            <li class="active">Blank page</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
              <!-- general form elements disabled -->
              
                      
                      
              

          <!-- ========================================================================= -->
          <!--div class="col-xs-12"-->
          <div class="row">
            <div class="box">
                <div class="box-header">
                  <h3 class="box-title"></h3>
                </div><!-- /.box-header -->
                
                <div class="col-md-3">
                <div class="box box-pane">
                <div class="box-header">
                  <h3 class="box-title">Pencarian Karya Ilmiah</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <form role="form">
                    <!-- text input -->
                    <div class="input-group input-group-sm">
                      <input type="search" class="form-control"  placeholder="pencarian ...">
                      
                   <span class="input-group input-group-sm" >
                    <select class="form-control">
                        <option>Judul</option>
                        <option>Penulis</option>
                        <option>Prodi</option>
                        <option>Penerbit</option>
                        <option>Tahun</option>
                      </select>
                      </span>
                      
                      <span class="input-group input-group-sm">
                    </span>
                      
                    </div>
                      </form>
                      </div>
                      </div>
                      </div>
                      
                <div class="box-body">
                  <div id="example2_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="row"><div class="col-xs-6"></div><div class="col-xs-6"></div></div><table id="example2" class="table table-bordered table-hover dataTable" aria-describedby="example2_info">
                    <thead>
                      <tr role="row">
                      <th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">No</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">Judul</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Penulis</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">Prodi</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Penerbit</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Tahun Terbit</th>
                      <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Aksi</th>
                      </tr>
                    </thead>
                    
                    <tfoot hidden="true">
                      <tr><th rowspan="1" colspan="1">Rendering engine</th><th rowspan="1" colspan="1">Browser</th><th rowspan="1" colspan="1">Platform(s)</th><th rowspan="1" colspan="1">Engine version</th><th rowspan="1" colspan="1">CSS grade</th></tr>
                    </tfoot>
                    
                  <tbody role="alert" aria-live="polite" aria-relevant="all">
                       <% 
    List<Pengarang> list=ControlPengarang;
    for(int i=0; i<list.size();i++){%>
    <tr class="odd">
    <td class="  sorting_1"><% out.print(i+1);%> </td>
    <td class=" "><% out.print(list.get(i).getJudul());%></td>
                        <td class=" ">Paijo Diningrat</td>
                        <td class=" "><%out.print(list.get(i).getDisiplin_ilmu());%></td>
                        <td class=" "><% out.print(list.get(i).getNama_penerbit());%></td>
                        <td class=" "> <%out.print(list.get(i).getTahun_terbit());%></td>
                    <td class=" "><a href="#" />Detail | Hapus | Edit</td>
                    </tr>
<%};
 %>
                      <tr class="even">
                        <td class="  sorting_1">2</td>
                        <td class=" ">Pengujian algoritma Bellmarn-Ford untuk mencari jalur terbaik</td>
                        <td class=" ">Jacky Chan</td>
                        <td class=" ">Teknik Informatika</td>
                        <td class=" ">UIIA Indonesia</td>
                        <td class=" ">2010</td>
                        <td class=" "><a href="#" />Baca | Edit | Hapus</td>
                      </tr><tr class="odd">
                        <td class="  sorting_1">3</td>
                        <td class=" ">Pembuatan Program Pengamanan Berbasis Biometrik</td>
                        <td class=" ">Steven and Coconut Tree</td>
                        <td class=" ">Sistem Informatika</td>
                        <td class=" ">Gramedia</td>
                        <td class=" ">2013</td>
                        <td class=" "><a href="#" />Baca | Edit | Hapus</td>
                      </tr><tr class="even">
                        <td class="  sorting_1">4</td>
                        <td class=" ">Uji coba modifikasi DNA Manusia</td>
                        <td class=" ">Albert Einsten</td>
                        <td class=" ">Biologi</td>
                        <td class=" ">Jews Research Corp.</td>
                        <td class=" ">2017</td>
                        <td class=" "><a href="#" />Baca | Edit | Hapus</td>
                      </tr><tr class="odd">
                        <td class="  sorting_1">5</td>
                        <td class=" ">Analisa Anomali Gaya Gravitasi di Bermuda</td>
                        <td class=" ">Ruterford</td>
                        <td class=" ">Fisika</td>
                        <td class=" ">Sanata Dharma</td>
                        <td class=" ">2010</td>
                        <td class=" "><a href="#" />Baca | Edit | Hapus</td>
                        </tr>
                      </tbody>
                      
                      
                      </table>
                      </div>
                </div><!-- /.box-body -->
              </div>
          </div>
          <!--/div-->
          
          <!-- ========================================================================= -->
          
          
          
          
               
              
            

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 2.0
        </div>
        <strong>Copyright &copy; 2014-2015 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights reserved.
      </footer>
    </div><!-- ./wrapper -->

    
    <!-- jQuery 2.1.3 -->
    <script src="plugins/jQuery/jQuery-2.1.3.min.js"></script>
    <!-- Bootstrap 3.3.2 JS -->
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- DATA TABES SCRIPT -->
    <script src="plugins/datatables/jquery.dataTables.js" type="text/javascript"></script>
    <script src="plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
    <!-- SlimScroll -->
    <script src="plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- FastClick -->
    <script src='plugins/fastclick/fastclick.min.js'></script>
    <!-- AdminLTE App -->
    <script src="dist/js/app.min.js" type="text/javascript"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="dist/js/demo.js" type="text/javascript"></script>
    <!-- page script -->
    <script type="text/javascript">
      $(function () {
        $("#example1").dataTable();
        $('#example2').dataTable({
          "bPaginate": true,
          "bLengthChange": false,
          "bFilter": false,
          "bSort": true,
          "bInfo": true,
          "bAutoWidth": false
        });
      });
    </script>
  </body>
</html>