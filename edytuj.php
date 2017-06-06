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
Podaj:
<form action="edytuj_mieszkanca.php" method="POST">
Imię: <input type="text" name="imie"
<?php
if(isset($_SESSION['form_imie']))
{
	echo ('value="');
	echo $_SESSION['form_imie'];
	echo ('"');
}
?>
>
<?php
if(isset($_SESSION['e_imie']))
{
	echo $_SESSION['e_imie'];
}
unset($_SESSION['e_imie']);
?>
<br>
Nazwisko: <input type="text" name="nazwisko"
<?php
if(isset($_SESSION['form_nazwisko']))
{
	echo ('value="');
	echo $_SESSION['form_nazwisko'];
	echo ('"');
}
?>
>
<?php
if(isset($_SESSION['e_nazwisko']))
{
	echo $_SESSION['e_nazwisko'];
}
unset($_SESSION['e_nazwisko']);
?>
<br><input type="submit" value="EDYTUJ">
</form>
<br>lub<br>
<form action="edytuj_mieszkanca.php" method="POST">
<br>
Numer albumu: <input type="text" name="album"
<?php
if(isset($_SESSION['form_nr_albumu']))
{
	echo ('value="');
	echo $_SESSION['form_nr_albumu'];
	echo ('"');
}
?>
>
<?php
if(isset($_SESSION['e_album']))
{
	echo $_SESSION['e_album'];
}
unset($_SESSION['e_album']);
?>
<br><input type="submit" value="EDYTUJ">
</form>
<?php
if(isset($_SESSION['e_odczyt']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Błąd odczytu danych lub dane niekompletne!");';
    echo '</script>';
	unset($_SESSION['e_odczyt']);
}
?>
</div>
</body>
</html>