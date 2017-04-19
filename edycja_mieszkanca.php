<?php
session_start();
?>
<html>
<head><title>wAkademiQ - edycja mieszkańca</title>
<link rel="stylesheet" href="admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<?php
$imie=$_POST['imie'];
$nazwisko=$_POST['nazwisko'];
$nr_albumu=$_POST['nr_albumu'];
$wydzial=$_POST['wydzial'];
$nr_pokoju=$_POST['nr_pokoju'];

echo ('<form action="edycja_mieszkanca_w_bazie.php" method="POST"><br>Imię:');
echo ("<input type=\"text\" name=\"imie\" value=\"$imie\">");
echo ('<br>Nazwisko:');
echo ("<input type=\"text\" name=\"nazwisko\" value=\"$nazwisko\">");
echo ('<br>Nr albumu:');
echo ("<input type=\"text\" name=\"nr_albumu\" value=\"$nr_albumu\" readonly>");
echo ('<br>Nr pokoju:');
echo ("<input type=\"text\" name=\"nr_pokoju\" value=\"$nr_pokoju\">");
echo ("<br><input type=\"submit\" value=\"ZAPISZ W BAZIE\">");
?>
