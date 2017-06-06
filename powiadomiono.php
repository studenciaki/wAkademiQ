<?php
session_start();
if(!isset($_SESSION['weryfikacja_dostep']))
	header('Location: \wakademiq/ekran_blokady.php');

if(!isset($_SESSION['nr_albumu']))
{
	header('Location: \wakademiq/sum/index.php');
	exit();
}
else
{
	$nr_albumu=$_SESSION['nr_albumu'];
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	$wynik = mysql_query("UPDATE mieszkancy SET wiadomosci_administracja=NULL WHERE nr_albumu=$nr_albumu;") or die('Błąd zapytania!');
	$_SESSION['powiadomiony']=true;
	mysql_close($polaczenie);	
	header('Location: \wakademiq/sum/index.php');
}
?>
