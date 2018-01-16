<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" />">
<style>
body {
	background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6) 0%,
		rgba(255, 255, 255, 0.6) 0%), url("${pageContext.request.contextPath}/resources/img/banque.jpg");
}

.col {
	float: left;
	width: 200px;
	margin: 10px;
	color: black;
	padding: 10px;
	font-weight: bold;
}

ul {
	width: 70%;
	margin: auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simulation de Credit</title>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/index"><strong>Home</strong></a></li>
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/comptes"><strong>Comptes</strong></a></li>
		<li class="nav-item"><a class="nav-link active"
			href="${pageContext.request.contextPath}/credits"><strong>Credits</strong></a></li>
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/demandeouverturecompte"><strong>Ouvrir un Compte</strong></a></li>

		<!--  		
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
			aria-expanded="false"><strong>Langues</strong></a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="Anglais">Action</a> <a
					class="dropdown-item" href="#">Another action</a> <a
					class="dropdown-item" href="#">Something else here</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Separated link</a>
			</div></li>
	-->

	</ul>
	<div id="myTabContent" class="tab-content">
		<div class="tab-pane fade show active" id="home"></div>
		<div class="tab-pane fade" id="comptes">
			<p></p>
		</div>
		<div class="tab-pane fade" id="dropdown1">
			<p></p>
		</div>
		<div class="tab-pane fade" id="dropdown2">
			<p></p>
		</div>
	</div>
	<p>&nbsp;</p>
	<p>
		<b><h1>BIENVENUE SUR LA PAGE DE SIMULATION DE CREDITS A LA
				CONSOMMATION ET IMMOBILIER</h1></b>
	</p>

	<ul>
		<fieldset class="col1">
			<legend>
				<strong>SIMULATION DE CREDITS</strong>
			</legend>
			<div class="form-group">
				<form method="post" action="CalculCreditServlet">
					<label for="exampleInputEmail1">Montant emprunte :</label> <input
						class="form-control" aria-describedby="emailHelp"
						placeholder="Entrez votre montant souhaite" name="mntEmprunt"
						type="number"> <label for="exampleInputEmail1">Nombre
						de mensualites (mois): </label> <input class="form-control"
						aria-describedby="emailHelp"
						placeholder="Entrez votre nombre de mensualites"
						name="mensualites" type="number"> <label
						for="exampleInputEmail1">Taux du Credit</label> <input
						class="form-control" aria-describedby="emailHelp"
						placeholder="Entrez votre taux de credit" name="txCredit"
						type="text"> <input type="submit" class="btn btn-primary">
				</form>
			</div>

		</fieldset>
	</ul>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<div class="footer">
		<div class="col">
			<div class="row">
				<div class="col-lg-4">
					<ul>
						<h4>Contact</h4>
						<li><a
							href="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fhl%3Dfr&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=fr&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin">Email</a></li>
						<li><a href="https://www.facebook.com/">Facebook</a></li>
						<li><a href="https://twitter.com/">Twitter</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="col">
			<div class="row">
				<div class="col-lg-5">
					<ul>
						<h4>A Propos</h4>
						<li>Blog</li>
						<li>Histoire</li>
						<li>Recrutement</li>
					</ul>
				</div>
			</div>
		</div>

		<div class="col">
			<div class="row">
				<div class="col-lg-4">
					<ul>
						<h4>Applications</h4>
						<li><a href="https://www.apple.com/ios/app-store/">iPhone</a>
						</li>
						<li><a href="https://play.google.com/store">Android</a></li>
						<li><a
							href="https://www.microsoft.com/en-us/store/apps/windows-phone">Windows
								Phone</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="row">
				<div class="col-lg-4">
					<ul>
						<h4>CGV</h4>
						<li>Conditions Generales de Ventes</li>

					</ul>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="row">
				<div class="col-lg-4">
					<ul>
						<h4>Langues</h4>
						<li>English</li>
						<li>Français</li>
						<li>Deutsch</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</html>