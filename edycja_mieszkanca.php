<?php
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
	<div id="pasek2"><img src="awatar3.png"> <a href="wylogowanie.php"> <img src="wylogoj.png"></a></div>
	<div id="pasek1"></div>
	</div>
	
	<div id="panel_lewa">
		<div id="menu">Mieszkańcy<div id="menu2">
		<a href="dodaj.php"><div id="przycisk_menu">Dodaj</div></a>
		<a href="edytuj.php"><div id="przycisk_menu">Edytuj</div></a>
		<a href="wymelduj.php"><div id="przycisk_menu">Wymelduj</div></a>
		<a href="powiadom.php"><div id="przycisk_menu">Powiadom</div></a>
		</div></div>
		<div id="menu">Panel<div id="menu2">
		<a href="ustawienia.php"><div id="przycisk_menu">Ustawienia</div></a>
		<a href="serwis.php"><div id="przycisk_menu">Kontakt z serwis</div></a>
		</div></div>
	</div>
	
	<div id="panel_prawa"><center>Panel główny<bR><br> &nbsp
	


<?php
$imie=$_POST['imie'];
$nazwisko=$_POST['nazwisko'];
$nr_albumu=$_POST['nr_albumu'];
$wydzial=$_POST['wydzial'];
$nr_pokoju=$_POST['nr_pokoju'];
if(isset($_SESSION['edycja_imie']))
{
	$imie=$_SESSION['edycja_imie'];
	unset($_SESSION['edycja_imie']);
}
if(isset($_SESSION['edycja_nazwisko']))
{
	$nazwisko=$_SESSION['edycja_nazwisko'];
	unset($_SESSION['edycja_nazwisko']);
}
	
if(isset($_SESSION['edycja_nr_albumu']))
{
	$nr_albumu=$_SESSION['edycja_nr_albumu'];
	unset($_SESSION['edycja_nr_albumu']);
}
echo ('<form action="edycja_mieszkanca_w_bazie.php" method="POST"><br>Imię:');
echo ("<input type=\"text\" name=\"imie\" value=\"$imie\">");
echo ('<br>Nazwisko:');
echo ("<input type=\"text\" name=\"nazwisko\" value=\"$nazwisko\">");
echo ('<br>Nr albumu:');
echo ("<input type=\"text\" name=\"nr_albumu\" value=\"$nr_albumu\" readonly>");
echo ('<br>Nr pokoju:');
echo ("<input type=\"text\" name=\"nr_pokoju\" value=\"$nr_pokoju\">");
echo ("<br><input type=\"submit\" value=\"ZAPISZ W BAZIE\">");
if(isset($_SESSION['pokoj_przepelniony']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Wybrany pokój jest zajęty!");';
    echo '</script>';
	unset($_SESSION['pokoj_przepelniony']);
}
?>	
	
</div>
</body>
</html>
