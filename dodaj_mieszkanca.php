<?php
session_start();
if(!isset($_SESSION['dostep_panel']))
	header('Location: \wakademiq/panel_administracji/logowanie.php');

$_SESSION['form_imie']=$_POST['imie'];
$_SESSION['form_nazwisko']=$_POST['nazwisko'];
$_SESSION['form_nr_albumu']=$_POST['album'];
$_SESSION['form_nr_pokoju']=$_POST['nr_pokoju'];

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


if($czy_ok==true)
{
	$imie=$_POST['imie'];
	$nazwisko=$_POST['nazwisko'];
	$nr_albumu=$_POST['album'];
	$nr_pokoju=$_POST['nr_pokoju'];
	
	$imie=htmlentities($imie, ENT_QUOTES, "UTF-8");
	$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8");
	$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8");
	$nr_pokoju=htmlentities($nr_pokoju, ENT_QUOTES, "UTF-8");
	
	$zdjecie=$_FILES['plik'];
	$adr='../sum/zdjecia/'.$nr_albumu.'.png';
	move_uploaded_file($_FILES['plik']['tmp_name'], $adr);
	
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	//sprawdzenie czy osoba o podanym albumie jest już w bazie
	$spr_album=mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu;");
	if(mysql_num_rows($spr_album)>0)
	{
		$_SESSION['album_w_bazie']=true;
		header('Location: \wakademiq/panel_administracji/dodaj.php');
		mysql_close($polaczenie);
		exit();
	}
	//sprawdzenie czy w pokoju są już zameldowane 2 osoby
	$spr_pokoj=mysql_query("SELECT * FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';");
	if(mysql_num_rows($spr_pokoj)==2)
	{
		$_SESSION['pokoj_zajety']=true;
		header('Location: \wakademiq/panel_administracji/dodaj.php');
		mysql_close($polaczenie);
		exit();
	}
	//sprawdzenie czy istnieje ewentualny lokator
	$czy_lokator=mysql_query("SELECT nr_albumu FROM mieszkancy WHERE nr_pokoju='$nr_pokoju';");
	if(mysql_num_rows($czy_lokator)==1)
	{
		while($d=mysql_fetch_assoc($czy_lokator))
		{
			$lokator=$d['nr_albumu'];
		}
	}
	//dodawanie osoby do bazy danych
	if(isset($lokator))
	{
		$dodaj_osobe=mysql_query("INSERT INTO mieszkancy (nr_albumu,imie,nazwisko,nr_pokoju,lokator) VALUES ($nr_albumu,'$imie','$nazwisko','$nr_pokoju',$lokator);") or die ("Błąd zapytania!!!");
		$akt_lokatora=mysql_query("UPDATE mieszkancy SET lokator=$nr_albumu WHERE nr_albumu=$lokator;");
	}
	else
	{
		$dodaj_osobe=mysql_query("INSERT INTO mieszkancy (nr_albumu,imie,nazwisko,nr_pokoju) VALUES ($nr_albumu,'$imie','$nazwisko','$nr_pokoju');") or die ("Błąd zapytania!!!");
	}
	mysql_close($polaczenie);
	unset($_SESSION['form_imie']);
	unset($_SESSION['form_nazwisko']);
	unset($_SESSION['form_nr_albumu']);
	unset($_SESSION['form_nr_pokoju']);
	unset($_SESSION['form_wydzial']);
	header('Location: \wakademiq/panel_administracji/panel.php');
	
	$_SESSION['sukces_dodano']=true;
}
else
{
	header('Location: \wakademiq/panel_administracji/dodaj.php');
}
?>
