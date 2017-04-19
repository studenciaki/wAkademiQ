<?php
session_start();
?>
<html>
<head><title>wAkademiQ - edycja mieszkańca</title>
<link rel="stylesheet" href="admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
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
			echo ('<form action="edycja_mieszkanca.php" method="POST"><br>Imię:');
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
			echo ("<br><input type=\"submit\" value=\"PRZEJDŹ DO EDYCJI\"></form>");
		}
	}
	else
	{
		$_SESSION['brak_osoby_w_bazie']=true;
		header ('location: \wakademiq/panel_administracji');
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
				echo ('<form action="edycja_mieszkanca.php" method="POST"><br>Imię:');
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
				echo ("<br><input type=\"submit\" value=\"PRZEJDŹ DO EDYCJI\"></form>");
			}
		}	
	}
	else
	{
		$_SESSION['brak_osoby_w_bazie']=true;
		header ('location: \wakademiq/panel_administracji');
	}
}
?>
