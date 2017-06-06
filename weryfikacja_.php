<?php
session_start();
if(!isset($_SESSION['weryfikacja_dostep']))
	header('Location: \wakademiq/ekran_blokady.php');
?>
<html>
<head><title>wAkademiQ</title>
<link rel="stylesheet" href="style_mieszkaniec.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="Shortcut icon" href="favicon.ico" />
</head>

<body link="yellow" vlink="white" alink="white">
<div id="strona">
<center>
<?php
$nr_albumu=$_POST['wyszukaj'];
if($nr_albumu=='' or $nr_albumu=='Wyszukaj mieszkańca')
{
   $_SESSION['blad']=true;
   header('Location: \wakademiq/sum/index.php');
   exit();
}
$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8"); //zabezpieczenie przed wstrzykiwaniem SQL
$polaczenie=@mysql_connect('localhost','root','');
$baza = @mysql_select_db('wakademiq', $polaczenie);
$wynik = mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu;") or die(header('Location: \wakademiq/sum/index.php') && $_SESSION['blad_zapytania']=true);
   
if(mysql_num_rows($wynik) > 0) {
while($d = mysql_fetch_assoc($wynik)) {
	echo ('<div id="ramka_mieszkaniec"><div id="mieszkaniec"><br>');
	echo ("<div id='zdjecie'><img src=\"zdjecia/$nr_albumu.png\" width=\"300px\" height=\"400px\"></div>");
	echo ("<h1><div id=\"imie\">");
	echo $d['imie'];
	echo ("&nbsp;");
	echo $d['nazwisko'];
	echo ("</div></h1><div id=\"status2\">");
	$_SESSION['nr_albumu']=$nr_albumu;
	if($d['wiadomosci_administracja']!='')
	{
		echo $d['wiadomosci_administracja'];
		echo("<div id=\"przycisk\"><form action=\"powiadomiono.php\"><input type=\"submit\" value=\"POWIADOM\"></form></div>");
	}
	echo ("</div></div></div><div id=\"pasek\">");
	echo ("<div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><div id=\"pokoj2\">");
	echo $d['nr_pokoju'];
	echo ("</div><a href=\"index.php\"><div id=\"cofaj\"><<br>cofnij</div></a></div>");
	$lokator=$d['lokator'];
	if($lokator!='')
	{
		$wynik2=mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$lokator;") or die ($SESSION['blad_zapytania'] && header("location: wakademiq/sum"));
		while($e=mysql_fetch_assoc($wynik2))
		{
			echo ('<div id="ramka_mieszkaniec"><div id="mieszkaniec"><br>');
			echo ("<div id='zdjecie'><img src=\"zdjecia/$lokator.png\" width=\"300px\" height=\"400px\"></div>");
			echo ("<h1><div id=\"imie\">");
			echo $e['imie'];
			echo ("&nbsp;");
			echo $e['nazwisko'];
			echo ("</div></h1><div id=\"status2\">");
			echo $e['wiadomosci_administracja'];
			echo ("</div></div></div>");
		}
	}
}
}
else
{
   $_SESSION['brak_w_bazie']=true;
   header('Location: \wakademiq/sum/index.php');
}
mysql_close($polaczenie);
?>
</body>
</html>
