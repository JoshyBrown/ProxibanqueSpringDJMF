<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Lister et Modifier un Compte Client</title>
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
			
		<li class="nav-item"><a class="nav-link active" href="./ListerUnClientServlet"><strong>Lister un Client</strong></a></li>
		
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
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
			
		</div>

<div class="col-lg-4">
	<form method="post" action="CreationCompteServlet A MODIFIER!!!!">
<div class="form-group">
	<label class="col-form-label" for="inputDefault">Id Client</label>
  <input name="nom" class="form-control" value="" type="number" readonly>

  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="" type="text">

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value=""  type="text" >

  <label class="col-form-label" for="inputDefault">Adresse</label>
  <input name="adresse" class="form-control" value="" type="adresse">

  <label class="col-form-label" for="inputDefault">Code Postal</label>
  <input name="codepostal" class="form-control" value="" type="number">

  <label class="col-form-label" for="inputDefault">Ville</label>
  <input name="ville" class="form-control" value="" type="text">

  <label class="col-form-label" for="inputDefault">Telephone</label>
  <input name="telephone" class="form-control" value="" type="text">

 <label class="col-form-label" for="inputDefault">Email</label>
  <input name="email" class="form-control" value="" type="email">

<label class="col-form-label" for="inputDefault">Numero de Compte Courant</label>
  <input name="solde" class="form-control" value="" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Solde Compte Courant</label>
  <input name="solde" class="form-control" value="" type="text">
  
  <label class="col-form-label" for="inputDefault">Date d'ouverture</label>
  <input name="date" class="form-control"value="" type="text" readonly>

<label class="col-form-label" for="inputDefault">Numero de Compte Epargne</label>
  <input name="solde" class="form-control" value="" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Solde Compte Epargne</label>
  <input name="solde" class="form-control" value="" type="text">

  <label class="col-form-label" for="inputDefault">Type de Carte Bancaire</label>
  <input name="solde" class="form-control" value="" type="text">


  <label class="col-form-label" for="inputDefault">Numero de Carte Bancaire</label>
  <input name="solde" class="form-control" value="" type="text">


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