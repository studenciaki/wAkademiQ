<?php
session_start();
$login=(string)$_POST['login'];
$pin=$_POST['pin'];
if($login=="wiola" && $pin=="akad15")
{
	$_SESSION['dostep_panel']=true;
	header('Location: \wakademiq/panel_administracji/panel.php');
}
else
{
	header('Location: \wakademiq/panel_administracji/logowanie.php');
}
?>