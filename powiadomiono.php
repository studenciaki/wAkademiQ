<?php
session_start();
$nr_albumu=$_SESSION['nr_albumu'];
$polaczenie=@mysql_connect('localhost','root','');
$baza = @mysql_select_db('wakademiq', $polaczenie);
$wynik = mysql_query("UPDATE mieszkancy SET wiadomosci_administracja=NULL WHERE nr_albumu=$nr_albumu;") or die('Błąd zapytania!');
$_SESSION['powiadomiony']=true;
header('Location: \wakademiq/sum/index.php');
mysql_close($polaczenie);
?>
