<?php
session_start();
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
   $nr_albumu=$_POST['nr_albumu'];
   $polaczenie=@mysql_connect('localhost','root','');
   $baza = @mysql_select_db('wakademiq', $polaczenie);
   $wynik = mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu;") or die('Błąd zapytania');
   
   if(mysql_num_rows($wynik) > 0) {
	   echo ("Mieszkaniec: <br>");
    while($d = mysql_fetch_assoc($wynik)) {
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
		echo ("<br><br></b><div id='ramka'><img src=\"zdjecia/$nr_albumu.png\"></div>");
		$lokator=$d['lokator'];
		$wynik2 = mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$lokator;") or die('');
		if(mysql_num_rows($wynik2) > 0) {
	   echo ("<br><br>Lokator: <br>");
    while($e = mysql_fetch_assoc($wynik2)) {
		echo ("Imię: <b>");
		echo $e['imie'];
		echo ("<br></b>Nazwisko: <b>");
		echo $e['nazwisko'];
		echo ("<br></b>Nr pokoju: <b>");
		echo $e['nr_pokoju'];
		echo ("<br></b>Wydział: <b>");
		echo $e['wydzial'];
		if($e['wiadomosci_administracja']!='')
		{
			echo "</b><br><body bgcolor='red'>Wiadomość od administracji: <b>";
			echo $e['wiadomosci_administracja'];
		}
		echo ("<br><br></b><div id='ramka'><img src=\"zdjecia/$lokator.png\"></div>");
	}
    }
}
   }
   else
	   echo "Brak numeru indeksu w bazie!";
mysql_close($polaczenie);
?>
</body>
</html>
