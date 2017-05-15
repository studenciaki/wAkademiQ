<?php
session_start();
?>
<html>
<head><title>wAkademiQ - wymelduj mieszkańca</title>
<link rel="stylesheet" href="admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
Podaj:
<form action="wymelduj_mieszkanca.php" method="POST">
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
<br><input type="submit" value="WYMELDUJ">
</form>
<br>lub<br>
<form action="wymelduj_mieszkanca.php" method="POST">
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
<br><input type="submit" value="WYMELDUJ">
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
</body>
</html>
