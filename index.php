<?php
session_start();
if(!isset($_SESSION['weryfikacja_dostep']))
	header('Location: \wakademiq/ekran_blokady.php');
?>
<html>
<head><title>wAkademiQ</title>
<link rel="stylesheet" href="wyszukaj.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body link="white" vlink="white" alink="white">
<div id="strona">
<a href="wyloguj.php" ><div id="wyloguj"> >>>>> Wyloguj</div> </a>
<div id="lo">
<div id="gora"><H2>WERYFIKUJ AUTOMATYCZNIE</h2>
	<div id="bloki">
		<div id="blok"><br><img src="klucz2.png" width="50%" height="50%"><br><br>1. wybierz klucz</div>
		<div id="blok"><br><img src="skaner.png" width="50%" height="50%"><br><br>2. zeskanuj kod</div>
		<div id="blok"><br><img src="ok.png" width="50%" height="50%"><br><br>3. zweryfikuj mieszkańca</div>
</div></div>


<div id="dol"><H2>WERYFIKUJ RĘCZNIE</h2>
	<div id="wyszukaj">
	<form action="weryfikacja.php" method="post">
		<div id="szukaj_pasek"><input type="text" name="wyszukaj" /></div>
		<div id="lupa"><button type="submit"><img src="lupa.png" width="80%" height="80%"></button> </div>
	</form>
	</div>
</div>
</div>
</div>
<?php
if(isset($_SESSION['nr_albumu']) && isset($_SESSION['powiadomiony']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Mieszkaniec poinformowany!");';
    echo '</script>';
	unset($_SESSION['nr_albumu']);
	unset($_SESSION['powiadomiony']);
}
if(isset($_SESSION['blad_zapytania']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Błąd zapytania!");';
    echo '</script>';
	unset($_SESSION['blad_zapytania']);
}
if(isset($_SESSION['blad']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Błąd odczytu danych!");';
    echo '</script>';
	unset($_SESSION['blad']);
}
if(isset($_SESSION['brak_w_bazie']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Brak danych w bazie!");';
    echo '</script>';
	unset($_SESSION['brak_w_bazie']);
}
?>
</body>
</html>