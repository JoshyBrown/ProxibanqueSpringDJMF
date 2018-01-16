<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap4.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/sb-admin.css" rel="stylesheet" />

<style>
body {
 
background-image: linear-gradient(to bottom, rgba(255,255,255,0.6) 0%,rgba(255,255,255,0.6) 0%), 
					url("${pageContext.request.contextPath}/resources/img/Green8.jpg");
}
.nav {
    overflow: hidden;
   background-color: rgb(244,253,174);
    position: fixed; /* Set the navbar to fixed position */
    top: 0; /* Position the navbar at the top of the page */
    width: 100%; /* Full width */
}
.main {
  margin-top: 30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Conseiller</title>
</head>
<body>
  
<div class="navbar fixed-top">

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="${pageContext.request.contextPath}/conseiller"><strong>Home</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/nouveaucompteclient"><strong>Nouveau Compte</strong></a></li>
	<!-- 	
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ClientUpdateServlet"><strong>Mise à Jour Compte Client</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" href="./ListerUnClientServlet"><strong>Lister un Client</strong></a></li>
		
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./VirementServlet"><strong>Virements</strong></a></li>
	 -->	
			</ul>
			</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>


<div>
<p><h1>Bienvenue Conseiller</h1></p>
<p>&nbsp;</p>
</div>
<div class="row">
        <div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-primary o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-comments"></i>
              </div>
              <div class="mr-5"><strong>Creer un nouveau Compte Client</strong></div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="nouveaucompteclient">
              <span class="float-left"><strong>Cliquez pour creer Maintenant!</strong></span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
        <div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-warning o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-list"></i>
              </div>
              <div class="mr-5"><strong>Nouvelles fonctions a venir</strong></div>
            </div>
            <a class="card-footer text-white clearfix big z-1" href="#">
              <span class="float-left">Revenez nous voir plus tard!</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
<div>


 <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i><h3><strong> Liste Clients </strong></h3></div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>No Compte Courant</th>
                  <th>Solde Compte Courant</th>
                  <th>No Carte Visa Premier</th>
                  <th>Modification Client</th>
                  <th>Virement</th>
                  <th>Suppression</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>No Compte Courant</th>
                  <th>Solde Compte Courant</th>
                  <th>No Carte Visa Premier</th>
                  <th>Modification Client</th>
                  <th>Virement</th>
                  <th>Suppression</th>
                </tr>
              </tfoot>
              <c:forEach items="${clients}" var="client" >
              <tbody>
            
                  <tr>
                  <td>${client.nom}</td>
                  <td>${client.prenom}</td>
                  <td>${client.cpteC.numCompte}</td>
                  <td>${client.cpteC.soldeCompte}</td>
                  <td>${client.cpteC.visaP.numCarte}</td>
                  
             
                  <td><a href="edit/${client.id}"
		 class="btn btn-info" role="button">Modification</a></td>
                  <td><a href="virementidclient/${client.id}"
		 class="btn btn-info" role="button">Virement</a></td>
              <td><a href="delete/${client.id}"
		 class="btn btn-info" role="button">Supprimer</a></td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © David Ming & co</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="${pageContext.request.contextPath}/resources/js/Chart.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap4.js"></script>
     <!-- Custom scripts for all pages-->
     <script src="${pageContext.request.contextPath}/resources/js/sb-admin.min.js"></script>
      <!-- Custom scripts for this page-->
     <script src="${pageContext.request.contextPath}/resources/js/sb-admin-datatables.min.js"></script>
     <script src="${pageContext.request.contextPath}/resources/js/sb-admin-charts.min.js"></script>
     
  </div>
</body>

</html>