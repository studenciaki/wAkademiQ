<?php
session_start();
if(!isset($_SESSION['dostep_panel']))
	header('Location: \wakademiq/panel_administracji/logowanie.php');
?>
<html>
<head><title>AKADEMIQ</title>
<link rel="stylesheet" href="panel.css" type="text/css">
<link rel="stylesheet" href="input.css" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Lato:400,900&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="Shortcut icon" href="img/favicon.ico" />
</head>

<body link="white" vlink="white" alink="white" onLoad="wyswietlDane()">

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
		<a href="powiadomienie.php"><div id="przycisk_menu">Powiadom</div></a>
		</div></div>
		<div id="menu">Panel<div id="menu2">
		<a href="ustawienia.php"><div id="przycisk_menu">Ustawienia</div></a>
		<a href="serwis.php"><div id="przycisk_menu">Kontakt z serwis</div></a>
		</div></div>
	</div>
	
	<div id="panel_prawa"><center>Powiadom mieszkańca<bR><br> &nbsp



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
Ustaw status: <br><br><center>
<form action="kontakt_z_admin.php">
<button type="submit"><img src="user.jpg" height="80px" width="80px"><br>Kontakt z administracja</button>
</form>
<form action="platnosc.php">
<button type="submit"><img src="user.jpg" height="80px" width="80px"><br>Alarm płatności</button>
</form>
<form>
<button type="submit" disabled="disabled"><img src="user.jpg" height="80px" width="80px"><br>.............. TEST</button>
</form>
	

	
	
	
</div>
</body>
</html>
