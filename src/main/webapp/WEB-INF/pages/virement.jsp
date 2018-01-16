<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" />
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
<title>Virement</title>
</head>
<body>
	
  
<div class="navbar fixed-top">

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ConseillerServlet"><strong>Home</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./NouveauCompteServlet"><strong>Nouveau Compte</strong></a></li>
	<!-- 	
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ClientUpdateServlet"><strong>Mise à Jour Compte Client</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" href="./ListerUnClientServlet"><strong>Lister un Client</strong></a></li>
		
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="./VirementServlet"><strong>Virements</strong></a></li>
		 -->	
			</ul>
			</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>

<div class="main">
	

<div class="row"> 

	
<div class="container-fluid">
	<div class="row">
		<div class="col-md-1">
			${MsgJSPVirement}
		</div>
		
			<div class="col-lg-6">
	<legend>Compte a Debiter</legend>

		<form name="virementform" method="post" action="actionvirement">
<div class="form-group">
	<label class="col-form-label" for="inputDefault">Id Client</label>
  <input name="nom" class="form-control" value="${client.id}" type="number" >

  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="${client.nom}" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value="${client.prenom}"  type="text" readonly>

   <label for="exampleSelect1">Veuillez selectionner le type de compte</label>
      <select class="form-control" id="exampleSelect1" name="comptedebiteur">
        <option>${client.cpteC.numCompte}</option>
        <option>${client.cpteEp.numCompte}</option>
    </select>
<p>&nbsp;</p>
   <label class="col-form-label" for="inputDefault"><strong> Montant du transfert </strong></label>
  <input name="montant" class="form-control" placeholder="Veuillez indiquer le montant du transfert" id="inputDefault" type="text" >

<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>

    <div class="col-lg-12">
	<legend>Compte a Crediter</legend>
	

<select id="select" name="clientcrediteur">
<c:forEach items="${ALLCLIENT}" var="clientcredit" >
  <option value="${clientcredit.id} - comptecourant" >${clientcredit.nom} ${clientcredit.prenom} ${clientcredit.cpteC.numCompte}</option> 
  </c:forEach>
</select>


<!--
	<label class="col-form-label" for="inputDefault">${ALLCLIENT}</label>
 	 <input name="nom" class="form-control" value="" type="number">


  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="${clientcredit.nom}" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value="${clientcredit.prenom}"  type="text" readonly>

   <label for="exampleSelect1">Veuillez selectionner le type de compte</label>
      <select class="form-control" id="exampleSelect1" name="comptecrediteur">
        <option>${clientcredit.cpteC.numCompte}</option>
        <option>${clientcredit.cpteEp.numCompte}</option>
    </select>
 -->	   
<p>&nbsp;</p>
	
	<button type="reset" class="btn btn-danger btn-lg">Annuler</button>
    <button type="submit" class="btn btn-primary btn-lg">Valider</button>

</div>
</form>
</div>
</div>
</div>
	
		
	</div>
</div>

</body>
</html>