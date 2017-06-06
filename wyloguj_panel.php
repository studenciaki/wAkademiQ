<?php
session_start();
if(isset($_SESSION['dostep_panel']))
unset($_SESSION['dostep_panel']);
header('Location: \wakademiq/panel_administracji/logowanie.php');
?>