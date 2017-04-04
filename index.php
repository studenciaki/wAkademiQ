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
<?php
if(isset($_SESSION['nr_albumu']))
{
	echo '<script type="text/javascript">';
    echo 'alert("Mieszkaniec poinformowany!");';
    echo '</script>';
}
unset($_SESSION['nr_albumu']);
?>
</body>
</html>
