<?php
session_start();
$pin=$_POST['pin'];
if($pin!=5421)
{
	header('Location: \wakademiq/index.html');
}
else
{
	$_SESSION['weryfikacja_dostep']=true;
	header('Location: \wakademiq/sum/index.php');
}
?>