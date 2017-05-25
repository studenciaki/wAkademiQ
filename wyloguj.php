<?php
session_start();
if(isset($_SESSION['weryfikacja_dostep']))
unset($_SESSION['weryfikacja_dostep']);
header('Location: \wakademiq/index.html');
?>