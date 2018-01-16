<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" />
<style>
body {

background-image: linear-gradient(to bottom, 
					rgba(255,255,255,0.6) 0%,
					rgba(255,255,255,0.6) 0%), 
					url("${pageContext.request.contextPath}/resources/img/banque-futur.jpg");
}
ul {
    width: 70%;
    margin: auto;
}
.col {
	float:left;
	width:200px;
	margin: 10px;
	color: black;
	padding: 10px;
	font-weight: bold;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ouvrir un compte chez Proxibanque</title>
</head>
<body>
<ul class="nav nav-tabs">
<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/index"><strong>Home</strong></a></li>
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/comptes"><strong>Comptes</strong></a></li>
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/credits"><strong>Credits</strong></a></li>
		<li class="nav-item"><a class="nav-link active" data-toggle="tab" href="${pageContext.request.contextPath}/demandeouverturecompte"><strong>Ouvrir un Compte</strong></a></li>
	</ul>
	<p><b><h1>OUVRIR UN COMPTE CHEZ PROXIBANQUE</h1></b></p>	
<ul>
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Votre Nom</label>
  <input name="nom" class="form-control" placeholder="Votre nom" id="inputDefault" type="text">
</div>
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Votre Prenom</label>
  <input name="prenom" class="form-control" placeholder="Votre prenom" id="inputDefault" type="text">
</div>
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Email</label>
  <input name="email" class="form-control" placeholder="Votre email" id="inputDefault" type="text">
</div>
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Telephone</label>
  <input name="telephone" class="form-control" placeholder="Votre telephone" id="inputDefault" type="text">
</div>
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Code Postal</label>
  <input name="codePostal" class="form-control" placeholder="Votre code postal" id="inputDefault" type="text">
</div>
 <fieldset class="form-group">
      <legend>Vous souhaitez etre contacte(e) par</legend>
      <div class="form-check">
        <label class="form-check-label">
          <input class="form-check-input" name="contactParTelephone" id="optionsRadios1" value="option1" checked="" type="radio">
          Telephone
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input class="form-check-input" name="contactParEmail" id="optionsRadios2" value="option2" type="radio">
          Email
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input class="form-check-input" name="toutTypeContact" id="optionsRadios3" value="option3" type="radio">
         Les Deux
        </label>
      </div>
    </fieldset>
<input type="submit" class="btn btn-primary">
</ul>
<p>&nbsp;</p>
	<div class="footer">
			<div class="col">
				<div class="row">
					<div class="col-lg-4">
						<ul>
							<h4>Contact</h4>
							<li><a href="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fhl%3Dfr&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=fr&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin">Email</a></li>
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
							<li><a href="https://www.apple.com/ios/app-store/">iPhone</a> </li>
							<li><a href="https://play.google.com/store">Android</a></li>
							<li><a href="https://www.microsoft.com/en-us/store/apps/windows-phone">Windows Phone</a></li>
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