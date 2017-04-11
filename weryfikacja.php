<?php
session_start();
?>
<html>
<head>
<title>System Uwierzytelniania Mieszkańca</title>
<link rel="stylesheet" href="mieszkancy.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<center>
<?php
   $nr_albumu=$_POST['nr_albumu'];
   if($nr_albumu=='')
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
	   echo ('<div id="panel_glowny"><div id="panel_mieszkanca">');
    while($d = mysql_fetch_assoc($wynik)) {
		echo ("<div id='zdjecie'><img src=\"zdjecia/$nr_albumu.png\" width=\"250px\" height=\"300px\"></div>");
		echo ("<div id=\"imie_nazwisko\">");
		echo $d['imie'];
		echo ("&nbsp;");
		echo $d['nazwisko'];
		echo ("</div></div><div id=\"pasek\"></div>");
		$lokator=$d['lokator'];
		$wynik2 = mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$lokator;") or die('');
		if(mysql_num_rows($wynik2) > 0) {
	   echo ("<div id=\"panel_mieszkanca\">");
    while($e = mysql_fetch_assoc($wynik2)) {
		echo ("<div id='zdjecie'><img src=\"zdjecia/$lokator.png\" width=\"250px\" height=\"300px\"></div>");
		echo ("<div id=\"imie_nazwisko\">");
		echo $e['imie'];
		echo ("&nbsp;");
		echo $e['nazwisko'];
		echo ("</div></div>");
	}
    }
	echo ("<div id=\"numer_pokoju\">");
		echo $d['nr_pokoju'];
		echo("</div></div>");
}
   }
   else
   {
	   header('Location: \wakademiq/sum/index.php');
	   $_SESSION['brak_w_bazie']='Brak numeru indeksu w bazie!';
   }
mysql_close($polaczenie);
?>
</body>
</html>
