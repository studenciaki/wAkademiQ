<?php
session_start();
if(!isset($_SESSION['dostep_panel']))
	header('Location: \wakademiq/panel_administracji/logowanie.php');

$imie=$_POST['imie'];
$nazwisko=$_POST['nazwisko'];
$nr_albumu=$_POST['nr_albumu'];
$nr_pokoju=$_POST['nr_pokoju'];
$lokator=$_POST['lokator'];

$imie=htmlentities($imie, ENT_QUOTES, "UTF-8");
$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8");
$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8");
$nr_pokoju=htmlentities($nr_pokoju, ENT_QUOTES, "UTF-8");
$lokator=htmlentities($lokator, ENT_QUOTES, "UTF-8");

$polaczenie=@mysql_connect('localhost','root','');
$baza = @mysql_select_db('wakademiq', $polaczenie);
$wymelduj=mysql_query("DELETE FROM mieszkancy WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania imie");

if (file_exists('../sum/zdjecia/'.$nr_albumu.'.png')) 
  unlink('../sum/zdjecia/'.$nr_albumu.'.png');

$_SESSION['sukces_wymeldowano']=true;
mysql_close($polaczenie);
header('Location: \wakademiq/panel_administracji/panel.php');
?>
