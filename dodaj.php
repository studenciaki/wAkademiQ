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
	
	<div id="panel_prawa"><center>Dodawnie mieszkańca<bR><br> &nbsp
	<form action="dodaj_mieszkanca.php" method="POST" enctype="multipart/form-data">
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
<br>
Numer pokoju: <input type="text" name="nr_pokoju"
<?php
if(isset($_SESSION['form_nr_pokoju']))
{
	echo ('value="');
	echo $_SESSION['form_nr_pokoju'];
	echo ('"');
}
?>
>
<?php
if(isset($_SESSION['e_pokoj']))
{
	echo $_SESSION['e_pokoj'];
}
unset($_SESSION['e_pokoj']);
?>
<br><input type="file" name="plik" accept="image/png"><br>
<br><input type="submit" value="DODAJ">
<?php
if(isset($_SESSION['album_w_bazie']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Osoba o podanym numerze albumu jest już w bazie danych!");';
    echo '</script>';
	unset($_SESSION['album_w_bazie']);
}
if(isset($_SESSION['pokoj_zajety']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Podany pokój jest już wypełniony!");';
    echo '</script>';
	unset($_SESSION['pokoj_zajety']);
}
?>
</form>

	</div>
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
	
		
	

</body>
</html>

