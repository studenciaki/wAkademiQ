<?php
session_start();
if(isset($_SESSION['wskazany_album']))
{
	$nr_albumu=$_SESSION['wskazany_album'];
	unset($_SESSION['wskazany_album']);
	$polaczenie=@mysql_connect('localhost','root','');
	$baza = @mysql_select_db('wakademiq', $polaczenie);
	$wynik=mysql_query("SELECT * FROM mieszkany WHERE nr_albumu=$nr_albumu;");
	while($d=mysql_fetch_assoc($wynik))
	{
		$akt_pow=$d['wiadomosci_administracja'];
	}
	$zmiana=mysql_query("UPDATE mieszkancy SET wiadomosci_administracja='Kontakt z administracją!' WHERE nr_albumu=$nr_albumu;");
	mysql_close($polaczenie);
	header('Location: \wakademiq/panel_administracji/index.php');
}
else
{
	mysql_close($polaczenie);
	header('Location: \wakademiq/panel_administracji/index.php');
	exit();
}
?>