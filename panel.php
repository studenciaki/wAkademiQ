﻿<?php
session_start();
if(!isset($_SESSION['dostep_panel']))
	header('Location: \wakademiq/panel_administracji/logowanie.php');
?>
<html>
<head><title>AKADEMIQ</title>
<link rel="stylesheet" href="panel.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="Shortcut icon" href="img/favicon.ico" />
</head>

<body link="white" vlink="white" alink="white">

<div id="panel">
	<div id="panel_gora">
	<div id="pasek1"></div>
	<a href="panel.php"><div id="pasek2"><img src="logo.png"></div></a>
	<div id="pasek3"></div>
	<div id="pasek2"><img src="awatar3.png"> <a href="wyloguj_panel.php"> <img src="wylogoj.png"></a></div>
	<div id="pasek1"></div>
	</div>
	
	<div id="panel_lewa">
		<div id="menu">Mieszkańcy<div id="menu2">
		<a href="dodaj.php"><div id="przycisk_menu">Dodaj</div></a>
		<a href="edytuj.php"><div id="przycisk_menu">Edytuj</div></a>
		<a href="wymelduj.php"><div id="przycisk_menu">Wymelduj</div></a>
		<a href="powiadomienie.php"><div id="przycisk_menu">Powiadom</div></a>
		</div></div>
		<div id="menu">Panel<div id="menu2">
		<a href="ustawienia.php"><div id="przycisk_menu">Ustawienia</div></a>
		<a href="serwis.php"><div id="przycisk_menu">Kontakt z serwis</div></a>
		</div></div>
	</div>
	
	<div id="panel_prawa"><center>Panel główny<bR><br> &nbsp
	
	<a href="dodaj.php"><div id="przycisk">Dodaj</div></a>
	<a href="edytuj.php"><div id="przycisk2">Edytuj</div></a>
	<a href="wymelduj.php"><div id="przycisk3">Wymelduj</div></a>
	<a href="powiadomienie.php"><div id="przycisk4">Powiadom</div></a>
	
	
	<?php
session_start();
if(isset($_SESSION['sukces_dodano']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Dodano mieszkańca!");';
    echo '</script>';
	unset($_SESSION['sukces_dodano']);
}
if(isset($_SESSION['brak_osoby_w_bazie']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Brak osoby w bazie!");';
    echo '</script>';
	unset($_SESSION['brak_osoby_w_bazie']);
}
if(isset($_SESSION['pokoj_zajety']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Pokój zajęty!");';
    echo '</script>';
	unset($_SESSION['pokoj_zajety']);
}
if(isset($_SESSION['sukces_wymeldowano']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Mieszkaniec wymeldowany!");';
    echo '</script>';
	unset($_SESSION['sukces_wymeldowano']);
}
if(isset($_SESSION['sukces_edycja']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Dane mieszkańca zmienione!");';
    echo '</script>';
	unset($_SESSION['sukces_edycja']);
}
unset($_SESSION);
?>
	
		
	
</div>
</body>
</html>

