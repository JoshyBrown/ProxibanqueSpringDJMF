<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" />

<!-- <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>  -->

<style>
body {
	background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6) 0%,
		rgba(255, 255, 255, 0.6) 0%), url("${pageContext.request.contextPath}/resources/img/banque-futur.jpg");
}

.jumbotron {
	background: rgb(200, 54, 54); /* This is for ie8 and below */
	background: rgba(200, 54, 54, 0.6);
}

.col {
	float: left;
	width: 200px;
	margin: 10px;
	color: black;
	padding: 10px;
	font-weight: bold;
}

.jumbotron:hover .bg-overlay {
	height: 100%;
	background: rgba(0, 0, 0, 0.2);
}

ul {
	width: 70%;
	margin: auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxiBanque DJMF</title>
</head>
<body>

<!-- nouvelle maniere d'indiquer les liens <a href="${pageContext.request.contextPath}/displayClients">Display users</a> -->
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="${pageContext.request.contextPath}/index"><strong>Home</strong></a></li>
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="${pageContext.request.contextPath}/comptes"><strong>Comptes</strong></a></li>
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/credits"><strong>Credits</strong></a></li>
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

	<p>&nbsp;</p>

	<div class="jumbotron">
		<div class="bg-overlay">
			<h1 class="display-3">Bienvenue sur le site de ProxyBanque!</h1>
			<p class="lead">La Banque en Ligne d'une nouvelle generation!</p>
			<hr class="my-4">
			<p>ProxyBanque a ete developpe par un groupe de candidats venant
				de milieu tres divers effectuant un POEC chez GT'M Ingenierie.</p>
			<p>Tout le cursus a ete principalement supervise par Yann
				Creac'h.</p>
			<p class="lead">
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-4">
			<div class="card text-white bg-primary mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Actualites</div>
				<div class="card-body">
					<h4 class="card-title">Dernieres Nouvelles</h4>
					<p class="card-text">Le deuxieme jour du TP est en cours de
						finition</p>
				</div>
			</div>
			<div class="card text-white bg-secondary mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Decouverte</div>
				<div class="card-body">
					<h4 class="card-title">Curiosite</h4>
					<p class="card-text">Venez visiter les salles de GT'M</p>
				</div>
			</div>
			<div class="card text-white bg-success mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Informatique</div>
				<div class="card-body">
					<h4 class="card-title">Linux</h4>
					<p class="card-text">Decouvrez les systemes Linux</p>
				</div>

			</div>
			<div class="card text-white bg-secondary mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Bourse</div>
				<div class="card-body">
					<h4 class="card-title">Bourse de Paris</h4>
					<p class="card-text">Venez visiter les salles de le Bourse
						Paris</p>
				</div>
			</div>
		</div>
		

		<div class="row">
			<div class="col-lg-8">
				<div>
					<img class="mySlides1" src="${pageContext.request.contextPath}/resources/img/banque.jpg"> <img
						class="mySlides1" src="${pageContext.request.contextPath}/resources/img/banque-en-ligne-696x465.jpg">
					<img class="mySlides1" src="${pageContext.request.contextPath}/resources/img/banque-essentiel-main-3315379.jpg"> 
					<img class="mySlides1" src="${pageContext.request.contextPath}/resources/img/argent.jpg">
					<button class="w3-button w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
					<button class="w3-button w3-display-right" onclick="plusDivs(+1)">&#10095;</button>
				</div>
			</div>
		</div>

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
<script type="text/javascript">
	var slideIndex = 0;
	carousel();

	function carousel() {
		var i;
		var x = document.getElementsByClassName("mySlides1");
		for (i = 0; i < x.length; i++) {
			x[i].style.display = "none";
		}
		slideIndex++;
		if (slideIndex > x.length) {
			slideIndex = 1
		}
		x[slideIndex - 1].style.display = "block";
		setTimeout(carousel, 3000); // Change image every 2 seconds
	}
</script>
<!-- 
JavaScript Explained
First, set the slideIndex to 1. (First picture)
Then call showDivs() to display the first image.
When the user clicks one of the buttons call plusDivs().
The plusDivs() function subtracts one or  adds one to the slideIndex.
The showDiv() function hides (display="none") all elements with the class name "mySlides", and displays (display="block") the element with the given slideIndex.
If the slideIndex is higher than the number of elements (x.length), the slideIndex is set to zero.
If the slideIndex is less than 1 it is set to number of elements (x.length).
 -->
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</html>