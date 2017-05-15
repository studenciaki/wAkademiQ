<?php
session_start();
?>
<html>
<head><title>wAkademiQ</title>
<link rel="stylesheet" href="powiadomianie_admin.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="Shortcut icon" href="img/favicon.ico" />

</head>

<body onLoad="wyswietlDane()">
<div id="kontener_glowny">
	<div id="menu">
		<a href="panel_admin"><div id="menu1"><< Cofnij</div></a>
		<div id="menu2">Panel administracyjny - AkademiQ v2.5</div><br>
		<div id="powiadom"><h1>Panel powiadomień</h1><br>
		<?php
			$nr_albumu=$_POST['nr_albumu'];
			if(strlen($nr_albumu)!=6)
			{
				$_SESSION['zly_nr_albumu']=true;
				header('Location: \wakademiq/panel_administracji/powiadom.php');
				exit();
			}
			else
			{
				$nr_albumu=htmlentities($nr_albumu, ENT_QUOTES, "UTF-8"); //zabezpieczenie przed wstrzykiwaniem SQL
				$polaczenie=@mysql_connect('localhost','root','');
				$baza = @mysql_select_db('wakademiq', $polaczenie);
				$wynik = mysql_query("SELECT * FROM mieszkancy WHERE nr_albumu=$nr_albumu;") or die(header('Location: \wakademiq/sum/index.php') && $_SESSION['blad_zapytania']=true);
				if(mysql_num_rows($wynik) > 0) {
				while($d = mysql_fetch_assoc($wynik)) {
					$_SESSION['wskazany_album']=$d['nr_albumu'];
					echo $_SESSION['wskazany_album'];
					echo "<br>";
					echo $d['imie'];
					echo " ";
					echo $d['nazwisko'];
					echo " (";
					echo $d['nr_pokoju'];
					echo ")<br><br>";
					mysql_close($polaczenie);
				}
				}
				else
				{
					mysql_close($polaczenie);
					$_SESSION['zly_nr_albumu']=true;
					header('Location: \wakademiq/panel_administracji/powiadom.php');
					exit();
				}
			}
		?>
Ustaw status: <br><br>
<form action="kontakt_z_admin.php">
<button type="submit"><img src="user.jpg" height="50%" width="90%">Kontakt z administracja</button>
</form>
<form action="platnosc.php">
<button type="submit"><img src="user.jpg" height="50%" width="90%">Alarm płatności</button>
</form>
<form>
<button type="button" disabled="disabled"><img src="user.jpg" height="50%" width="90%">.............. TEST</button>
</form>
	</div>
</div>
	
	
	
</div>
</body>
</html>