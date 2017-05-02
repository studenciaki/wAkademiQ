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
	$info=mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu");
	if(mysql_num_rows($info)>0)
			{
				while($d=mysql_fetch_assoc($info))
				{
					$stare_imie=$d['imie'];
					$stare_nazwisko=$d['nazwisko'];
					$lokator=$d['lokator'];
					$stary_pokoj=$d['nr_pokoju'];
				}
			}
	if($stare_imie!=$imie)
		$edytuj_imie=mysql_query("UPDATE mieszkancy SET imie='$imie' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania imie");
	if($stare_nazwisko!=$nazwisko)
		$edytuj_nazwisko=mysql_query("UPDATE mieszkancy SET nazwisko='$nazwisko' WHERE nr_albumu=$nr_albumu;") or die ("Błąd zapytania nazwisko");
	if($stary_pokoj!=$nr_pokoju)
	{
		$spr_pokoj=mysql_query("SELECT * FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';");
		if(mysql_num_rows($spr_pokoj)>1)
		{
			$_SESSION['edycja_imie']=$imie;
			$_SESSION['edycja_nazwisko']=$nazwisko;
			$_SESSION['edycja_nr_albumu']=$nr_albumu;
			$_SESSION['pokoj_przepelniony']=true;
			header('Location: \wakademiq/panel_administracji/edycja_mieszkanca.php');
		}
		else if(mysql_num_rows($spr_pokoj)==1)
		{
			$jaki_nowy_lokator=mysql_query("SELECT * FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';");
			if(mysql_num_rows($jaki_nowy_lokator)>0)
			{
				while($d=mysql_fetch_assoc($jaki_nowy_lokator))
					$nowy_lokator=$d['nr_albumu'];
			}
			if(strlen($lokator)>0)
			$usun_u_starego_lokatora=mysql_query("UPDATE mieszkancy SET lokator=NULL WHERE nr_albumu=$lokator;") or die ("Nie usunięto u starego lokatora");
			$ustaw_pokoj=mysql_query("UPDATE mieszkancy SET nr_pokoju='$nr_pokoju' WHERE nr_albumu=$nr_albumu;");
			$dodaj_nowego_lokatora=mysql_query("UPDATE mieszkancy SET lokator=$nowy_lokator WHERE nr_albumu=$nr_albumu;");
			$dodaj_u_nowego_lokatora=mysql_query("UPDATE mieszkancy SET lokator=$nr_albumu WHERE nr_albumu=$nowy_lokator");
		}
		else
		{
			$ustaw_pokoj=mysql_query("UPDATE mieszkancy SET nr_pokoju='$nr_pokoju' WHERE nr_albumu=$nr_albumu;");
			$usun_u_starego_lokatora=mysql_query("UPDATE mieszkancy SET lokator=NULL WHERE nr_albumu=$lokator;");
			$wyzeruj_lokatora=mysql_query("UPDATE mieszkancy SET lokator=NULL WHERE nr_albumu=$nr_albumu;");
		}
	}
	mysql_close($polaczenie);
	header('Location: \wakademiq/panel_administracji/');
	$_SESSION['sukces_edycja']=true;
}
else
{
	header('Location: \wakademiq/panel_administracji/');
}
?>
