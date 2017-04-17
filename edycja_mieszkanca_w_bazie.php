<?php
session_start();

$imie=$_POST['imie'];
$nazwisko=$_POST['nazwisko'];
$nr_albumu=$_POST['nr_albumu'];
$wydzial=$_POST['wydzial'];
$nr_pokoju=$_POST['nr_pokoju'];
$lokator=$_POST['lokator'];

$imie=htmlentities($imie, ENT_QUOTES, "UTF-8");
$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8");
$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8");
$nr_pokoju=htmlentities($nr_pokoju, ENT_QUOTES, "UTF-8");
$wydzial=htmlentities($wydzial, ENT_QUOTES, "UTF-8");
$lokator=htmlentities($lokator, ENT_QUOTES, "UTF-8");

$czy_ok=true;

if(isset($_POST['imie']))
{
	if(strlen($_POST['imie'])<2 || strlen($_POST['imie'])>30)
	{
		$_SESSION['e_imie']='Długość imienia musi mieć od 2 do 30 znaków!';
		$czy_ok=false;
	}
}

if(isset($_POST['nazwisko']))
{
	if(strlen($_POST['nazwisko'])<2 || strlen($_POST['nazwisko'])>50)
	{
		$_SESSION['e_nazwisko']='Długość nazwiska musi mieć od 2 do 50 znaków!';
		$czy_ok=false;
	}
}

if(isset($_POST['album']))
{
	if(strlen($_POST['album'])!=6)
	{
		$_SESSION['e_album']='Długość numeru albumu musi mieć 6 znaków!';
		$czy_ok=false;
	}
}

if(isset($_POST['nr_pokoju']))
{
	if(strlen($_POST['nr_pokoju'])!=4)
	{
		$_SESSION['e_pokoj']='Długość numeru albumu musi mieć 4 znaków!';
		$czy_ok=false;
	}
}

if(isset($_POST['wydzial']))
{
	if(strlen($_POST['wydzial'])<1)
	{
		$_SESSION['e_wydzial']='Nie podano wydziału!';
		$czy_ok=false;
	}
}

if($czy_ok==true)
{
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	$edytuj_imie=mysql_query("UPDATE mieszkancy SET imie='$imie' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania imie");
	$edytuj_nazwisko=mysql_query("UPDATE mieszkancy SET nazwisko='$nazwisko' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania nazwisko");
	$edytuj_pokoj=mysql_query("UPDATE mieszkancy SET nr_pokoju='$nr_pokoju' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania pokój");
	$edytuj_wydzial=mysql_query("UPDATE mieszkancy SET wydzial='$wydzial' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania wydzial");
	$edytuj_lokator=mysql_query("UPDATE mieszkancy SET lokator='$lokator' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania lokator");
	mysql_close($polaczenie);
	header('Location: \wakademiq/panel_administracji/');
}
else
{
	header('Location: \wakademiq/panel_administracji/');
}
?>
