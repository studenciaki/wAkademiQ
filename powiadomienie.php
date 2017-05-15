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
		<a href="\wakademiq/panel_administracji"><div id="menu1"><< Cofnij</div></a>
		<div id="menu2">Panel administracyjny - AkademiQ v2.5</div><br>
		<div id="powiadom"><h1>Panel powiadomień</h1><br>
		Podaj ID: <br>
			<form method="post" action="powiadomienie_wyb_nr.php">
			<input type="text" name="nr_albumu" />
			<input type="submit" value="Wybierz">
			</form>
		</div>
	</div>
</div>
<?php
if(isset($_SESSION['zly_nr_albumu']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Niepoprawny numer albumu!");';
    echo '</script>';
	unset($_SESSION['zly_nr_albumu']);
}
?>
</body>
</html>
