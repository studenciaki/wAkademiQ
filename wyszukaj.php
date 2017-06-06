<?php
session_start();
if(!isset($_SESSION['weryfikacja_dostep']))
	header('Location: \wakademiq/ekran_blokady.php');
?>
<html>
<head>
<title>System Uwierzytelniania Mieszkańca</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<center>
<a href='index.php'>Powrót</a><br>
<?php
$nazwisko=$_POST['nazwisko'];
if($nazwisko=='')
{
   $_SESSION['blad']=true;
   header('Location: \wakademiq/sum/index.php');
   exit();
}
$imie=$_POST['imie'];
$nazwisko=htmlentities($nazwisko, ENT_QUOTES, "UTF-8"); //zabezpieczenie przed wstrzykiwaniem SQL
$imie=htmlentities($imie, ENT_QUOTES, "UTF-8"); //zabezpieczenie przed wstrzykiwaniem SQL
$polaczenie=@mysql_connect('localhost','root','');
$baza = @mysql_select_db('wakademiq', $polaczenie);
$wynik = mysql_query("SELECT * FROM mieszkancy WHERE nazwisko='$nazwisko';") or die(header('Location: \wakademiq/sum/index.php') && $_SESSION['blad_zapytania']=true);
   
if(mysql_num_rows($wynik) > 0) {
while($d = mysql_fetch_assoc($wynik)) {
	if($imie!=$d['imie'])
	{
		echo("Czy chodziło Ci o: <br>");
	}
	echo ("Imię: <b>");
	echo $d['imie'];
	echo ("<br></b>Nazwisko: <b>");
	echo $d['nazwisko'];
	echo ("<br></b>Nr pokoju: <b>");
	echo $d['nr_pokoju'];
	echo ("<br></b>Wydział: <b>");
	echo $d['wydzial'];
	if($d['wiadomosci_administracja']!='')
	{
		echo "</b><br><body bgcolor='red'>Wiadomość od administracji: <b>";
		echo $d['wiadomosci_administracja'];
		echo "<form action=\"powiadomiono.php\ method=\"post\">";
		echo "<input type=\"submit\" name=\"submit\" value=\"POWIADOM\"/></form>";
		$_SESSION['nr_albumu']=$d['nr_albumu'];
	}
	$nr_albumu=$d['nr_albumu'];
	echo ("<br><br></b><div id='ramka'><img src=\"zdjecia/$nr_albumu.png\"></div>");
}
mysql_close($polaczenie);
}
else
{
   header('Location: \wakademiq/sum/index.php');
   $_SESSION['brak_w_bazie']='Brak wskazanej osoby w bazie danych!';
   mysql_close($polaczenie);
}
?>
</body>
</html>