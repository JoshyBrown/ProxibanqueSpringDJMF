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
<title>Mise a jour Client</title>
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
		
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./VirementServlet"><strong>Virements</strong></a></li>
			-->
			</ul>
			</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
${MsgJSPUpdate}

<div class="main">
<div class="row"> 
<div class="col-lg-4">
			<div class="card text-white bg-primary mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Modification de Compte</div>
				<div class="card-body">
					<h4 class="card-title">Precautions d'usage</h4>
					<p class="card-text">Bien verifier les donnees saisies avant de valider</p>
				</div>
			</div>
			</div>
<div class="col-xs-1">
</div>
<div class="col-lg-4">
<form name="updateform" method="post" action="editsave">
<div class="form-group">
	<label class="col-form-label" for="inputDefault">IdClient</label>
  <input name="id" class="form-control" value="${client.id}" id="inputDefault" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="${client.nom}" id="inputDefault" type="text">

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value="${client.prenom}" id="inputDefault" type="text" >

  <label class="col-form-label" for="inputDefault">Adresse</label>
  <input name="adresse" class="form-control" value="${client.adresse.rue}" id="inputDefault" type="adresse">

  <label class="col-form-label" for="inputDefault">Code Postal</label>
  <input name="codepostal" class="form-control" value="${client.adresse.codePostal}" id="inputDefault" type="number">

  <label class="col-form-label" for="inputDefault">Ville</label>
  <input name="ville" class="form-control" value="${client.adresse.ville}" id="inputDefault" type="text">

  <label class="col-form-label" for="inputDefault">Telephone</label>
  <input name="telephone" class="form-control" value="${client.numTel}" id="inputDefault" type="text">

 <label class="col-form-label" for="inputDefault">Email</label>
  <input name="email" class="form-control" value="${client.email}" id="inputDefault" type="email">

  <label class="col-form-label" for="inputDefault">Numero de Compte Courant</label>
  <input name="comptecourant" class="form-control" value="${client.cpteC.numCompte}" id="inputDefault" type="text" readonly>
  
  <label class="col-form-label" for="inputDefault">Solde Compte Courant</label>
  <input name="soldecomptecourant" class="form-control" value="${client.cpteC.soldeCompte}" id="inputDefault" type="text">
    
  <label class="col-form-label" for="inputDefault">Date d'ouverture Compte Courant</label>
  <input name="datecomptecourant" class="form-control" value="${client.cpteC.date}" id="inputDefault" type="date">

 <label class="col-form-label" for="inputDefault">Numero de Compte Epargne</label>
  <input name="compteepargne" class="form-control" value="${client.cpteEp.numCompte}" id="inputDefault" type="text" readonly>
  
  <label class="col-form-label" for="inputDefault">Solde Compte Epargne</label>
  <input name="soldecompteepargne" class="form-control" value="${client.cpteEp.soldeCompte}" id="inputDefault" type="text">

 <label class="col-form-label" for="inputDefault">Date d'ouverture Compte Epargne</label>
  <input name="datecompteepargne" class="form-control" value="${client.cpteEp.date}" id="inputDefault" type="date">


<p>&nbsp;</p>
    <button type="submit" class="btn btn-primary">Valider</button>
    <button type="reset" class="btn btn-primary">Annuler</button>
    </div>
    </form>
 </div>
 </div>
</div>

</body>
</html>