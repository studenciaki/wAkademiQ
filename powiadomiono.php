<?php
session_start();
?>
<html>
<head>
<title>System Uwierzytelniania Mieszkańca</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<center>
<?php 
$nr_albumu=$_SESSION['nr_albumu'];
$polaczenie=@mysql_connect('localhost','root','');
$baza = @mysql_select_db('wakademiq', $polaczenie);
$wynik = mysql_query("UPDATE mieszkancy SET wiadomosci_administracja=NULL WHERE nr_albumu=$nr_albumu;") or die('Błąd zapytania!');
header('Location: \wakademiq/sum/index.php');
mysql_close($polaczenie);
?>
</body>
</html>
