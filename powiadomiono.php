<html>
<head>
<title>System Uwierzytelniania Mieszkańca</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<center>
<?php 
	$plik = fopen("ostatni.txt", "r");
	$nr_albumu = fread($plik, 6);
   $polaczenie=@mysql_connect('localhost','root','');
   $baza = @mysql_select_db('wakademiq', $polaczenie);
   $wynik = mysql_query("UPDATE mieszkancy SET wiadomosci_administracja=NULL WHERE nr_albumu=$nr_albumu;") or die('Błąd zapytania!');
echo "<a href='index.php'>Powrót</a>";
mysql_close($polaczenie);
?>
</body>
</html>