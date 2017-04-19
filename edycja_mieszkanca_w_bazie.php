<?php
session_start();

$imie=$_POST['imie'];
$nazwisko=$_POST['nazwisko'];
$nr_albumu=$_POST['nr_albumu'];
$nr_pokoju=$_POST['nr_pokoju'];

$imie=htmlentities($imie, ENT_QUOTES, "UTF-8");
$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8");
$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8");
$nr_pokoju=htmlentities($nr_pokoju, ENT_QUOTES, "UTF-8");

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

if($czy_ok==true)
{
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	$info=mysql_query("SELECT * FROM mieszkancy WHERE nr_album=$nr_albumu");
	$stare_imie=$info['imie'];
	if($stare_imie!=$imie)
		$edytuj_imie=mysql_query("UPDATE mieszkancy SET imie='$imie' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania imie");
	$stare_nazwisko=$info['nazwisko'];
	if($stare_nazwisko!=$nazwisko)
		$edytuj_nazwisko=mysql_query("UPDATE mieszkancy SET nazwisko='$nazwisko' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania nazwisko");
	$stary_pokoj=$info['nr_pokoju'];
	if($stary_pokoj!=$nr_pokoju)
	{
		$spr_pokoj=mysql_query("SELECT * FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';");
		if(mysql_num_rows($spr_pokoj)==2)
		{
			$_SESSION['pokoj_zajety']=true;
		}
		else
		{
			$edytuj_pokoj=mysql_query("UPDATE mieszkancy SET nr_pokoju='$nr_pokoju' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania pokój");
			if($info['lokator']!='')
			{
				$stary_lokator=$info['lokator'];
				$akt_stary_lokator=mysql_query("UPDATE mieszkancy SET lokator=NULL WHERE nr_albumu=$stary_lokator;") or die ("Błąd zapytania pokój 2");
			}
			$czy_lokator=mysql_query("SELECT * FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';") or die ("Błąd zapytania pokój 3");
			if(mysql_num_rows($czy_lokator)>0)
			{
				$nowy_lokator=$czy_lokator['nr_albumu'];
				$akt_lokatora=mysql_query("UPDATE mieszkancy SET lokator=$nowy_lokator WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania pokój 4- $nowy_lokator");
			}
		}
	}
	mysql_close($polaczenie);
	header('Location: \wakademiq/panel_administracji/');
}
else
{
	header('Location: \wakademiq/panel_administracji/');
}
?>
