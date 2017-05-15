<html>
<head><title>wAkademiQ</title>
<link rel="stylesheet" href="admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
<div id="strona">
 <div id="logo">Panel administracyjny</div>
 <div id="panel">

	<a href="formularz_dodawania_mieszkanca.php"><div id="przycisk">Dodaj</div></a>
	<a href="formularz_edycji_mieszkanca.php"><div id="przycisk2">Edytuj</div></a>
	<a href="wymelduj.php"><div id="przycisk3">Wymelduj</div></a>
	<a href="powiadomienie.php"><div id="przycisk4">Powiadom</div></a>
  </div>

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
