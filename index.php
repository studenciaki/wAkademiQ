<?php
session_start();
?>
<html>
<head>
<title>System Uwierzytelniania Mieszkańca</title>
</head>
<body>
<center>
<h1><sub>w</sub>AkademiQ</h1>
<h3>System Uwierzytelniania Mieszkańca</h3>
<form action="weryfikacja.php" method="post">
Nr albumu:  <input type="text" name="nr_albumu"/>
<input type="submit" name="submit" value="WERYFIKUJ"/>
</form>
<font size="5" face="Consolas">
<script type="text/javascript">
var data = new Date();
var godz = data.getHours();
var min = data.getMinutes();
if(min<10)
	min='0'+min;
document.write(godz + ':' + min);
</script>
</font>
<?php
if(isset($_SESSION['nr_albumu']) && isset($_SESSION['powiadomiony']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Mieszkaniec poinformowany!");';
    echo '</script>';
	unset($_SESSION['nr_albumu']);
	unset($_SESSION['powiadomiony']);
}
if(isset($_SESSION['blad_zapytania']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Błąd zapytania!");';
    echo '</script>';
	unset($_SESSION['blad_zapytania']);
}
if(isset($_SESSION['blad']))
{
	echo("</font><br><br><font color='red'>Błąd odczytu numeru albumu!");
	unset($_SESSION['blad']);
}
if(isset($_SESSION['brak_w_bazie']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Brak numeru albumu w bazie!");';
    echo '</script>';
	unset($_SESSION['brak_w_bazie']);
}
?>
</body>
</html>
