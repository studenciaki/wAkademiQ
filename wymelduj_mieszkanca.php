<?php
session_start();
if(!isset($_SESSION['dostep_panel']))
	header('Location: \wakademiq/panel_administracji/logowanie.php');
?>
<html>
<head><title>AKADEMIQ</title>
<link rel="stylesheet" href="panel.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="Shortcut icon" href="img/favicon.ico" />
</head>

<body link="white" vlink="white" alink="white">

<div id="panel">
	<div id="panel_gora">
	<div id="pasek1"></div>
	<a href="panel.php"><div id="pasek2"><img src="logo.png"></div></a>
	<div id="pasek3"></div>
	<div id="pasek2"><img src="awatar3.png"> <a href="wylogowanie.php"> <img src="wylogoj.png"></a></div>
	<div id="pasek1"></div>
	</div>
	
	<div id="panel_lewa">
		<div id="menu">Mieszkańcy<div id="menu2">
		<a href="dodaj.php"><div id="przycisk_menu">Dodaj</div></a>
		<a href="edytuj.php"><div id="przycisk_menu">Edytuj</div></a>
		<a href="wymelduj.php"><div id="przycisk_menu">Wymelduj</div></a>
		<a href="powiadom.php"><div id="przycisk_menu">Powiadom</div></a>
		</div></div>
		<div id="menu">Panel<div id="menu2">
		<a href="ustawienia.php"><div id="przycisk_menu">Ustawienia</div></a>
		<a href="serwis.php"><div id="przycisk_menu">Kontakt z serwis</div></a>
		</div></div>
	</div>
	
	<div id="panel_prawa"><center>Wymelduj mieszkańca<bR><br> &nbsp
<?php

$_SESSION['form_imie']=$_POST['imie'];
$_SESSION['form_nazwisko']=$_POST['nazwisko'];

if(strlen($_POST['imie'])>0 && strlen($_POST['nazwisko'])>0)
{
	$imie=$_POST['imie'];
	$nazwisko=$_POST['nazwisko'];

	$imie=htmlentities($imie, ENT_QUOTES, "UTF-8");
	$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8");
	
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	$wynik=mysql_query("SELECT * FROM mieszkancy WHERE imie='$imie' AND nazwisko='$nazwisko';");
	if(mysql_num_rows($wynik)>0)
	{
		while($d=mysql_fetch_assoc($wynik))
		{
			echo ('<form action="wymelduj_mieszkanca_z_bazy.php" method="POST"><br>Imię:');
			$pom=$d['imie'];
			echo ("<input type=\"text\" name=\"imie\" value=\"$pom\" readonly>");
			echo ('<br>Nazwisko:');
			$pom=$d['nazwisko'];
			echo ("<input type=\"text\" name=\"nazwisko\" value=\"$pom\" readonly>");
			echo ('<br>Nr albumu:');
			$pom=$d['nr_albumu'];
			echo ("<input type=\"text\" name=\"nr_albumu\" value=\"$pom\" readonly>");
			echo ('<br>Nr pokoju:');
			$pom=$d['nr_pokoju'];
			echo ("<input type=\"text\" name=\"nr_pokoju\" value=\"$pom\" readonly>");
			echo ('<br>Lokator:');
			$pom=$d['lokator'];
			if(strlen($pom)==0)
			{
				echo ("<input type=\"text\" name=\"lokator\" value=\"brak\" readonly>");
			}
			else
			{
				echo ("<input type=\"text\" name=\"lokator\" value=\"$pom\" readonly>");
			}
			echo ("<br><input type=\"submit\" value=\"WYMELDUJ\"></form>");
		}
	}
}
else
{
	$_SESSION['nr_albumu']=$_POST['album'];
	if(strlen($_POST['album'])>0)
	{
		$nr_albumu=$_POST['album'];
		$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8");
		
		$polaczenie=@mysql_connect('localhost','root','');
		$baza = @mysql_select_db('wakademiq', $polaczenie);
		$wynik=mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu;");
		if(mysql_num_rows($wynik)>0)
		{
			while($d=mysql_fetch_assoc($wynik))
			{
				echo ('<form action="wymelduj_mieszkanca_z_bazy.php" method="POST"><br>Imię:');
				$pom=$d['imie'];
				echo ("<input type=\"text\" name=\"imie\" value=\"$pom\" readonly>");
				echo ('<br>Nazwisko:');
				$pom=$d['nazwisko'];
				echo ("<input type=\"text\" name=\"nazwisko\" value=\"$pom\" readonly>");
				echo ('<br>Nr albumu:');
				$pom=$d['nr_albumu'];
				echo ("<input type=\"text\" name=\"nr_albumu\" value=\"$pom\" readonly>");
				echo ('<br>Nr pokoju:');
				$pom=$d['nr_pokoju'];
				echo ("<input type=\"text\" name=\"nr_pokoju\" value=\"$pom\" readonly>");
				echo ('<br>Lokator:');
				$pom=$d['lokator'];
				if(strlen($pom)==0)
				{
					echo ("<input type=\"text\" name=\"lokator\" value=\"brak\" readonly>");
				}
				else
				{
					echo ("<input type=\"text\" name=\"lokator\" value=\"$pom\" readonly>");
				}
				echo ("<br><input type=\"submit\" value=\"WYMELDUJ\"></form>");
			}
		}	
	}
	else
	{
		$_SESSION['e_odczyt']=true;
		header('Location: \wakademiq/panel_administracji/formularz_edycji_mieszkanca.php');
	}
}
?>
</div>
</body>
</html>
