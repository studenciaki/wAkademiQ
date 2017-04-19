<?php
session_start();
?>
<html>
<head><title>wAkademiQ - dodawanie mieszkańca</title>
<link rel="stylesheet" href="admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
<form action="dodaj_mieszkanca.php" method="POST">
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
</body>
</html>
