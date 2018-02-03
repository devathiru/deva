<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
<style type="text/css">
.form-style-40{
    font-family: 'Open Sans Condensed', arial, sans;
    width: 500px;
    padding: 30px;
    background: #FFFFFF;
    margin: 50px auto;
    box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);
    -moz-box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);
    -webkit-box-shadow:  0px 0px 15px rgba(0, 0, 0, 0.22);

}
.form-style-40 h2{
    background: #4D4D4D;
    text-transform: uppercase;
    font-family: 'Open Sans Condensed', sans-serif;
    color: #797979;
    font-size: 18px;
    font-weight: 100;
    padding: 20px;
    margin: -30px -30px 30px -30px;
}
label{
font-style:bold;
font-size:20px;
}
.form-style-40 input[type="text"],
.form-style-40 input[type="date"],
.form-style-40 input[type="datetime"],
.form-style-40 input[type="email"],
.form-style-40 input[type="number"],
.form-style-40 input[type="search"],
.form-style-40 input[type="time"],
.form-style-40 input[type="url"],
.form-style-40 input[type="password"],
.form-style-40 placeholder,
.form-style-40 textarea,
.form-style-40 select 
{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    outline: none;
    display: block;
    width: 100%;
    padding: 7px;
    border: none;
    border-bottom: 1px solid #ddd;
    background: transparent;
    margin-bottom: 10px;
    font: 16px Arial, Helvetica, sans-serif;
    height: 45px;
}
.form-style-40 textarea{
    resize:none;
    overflow: hidden;
}
.form-style-40 input[type="button"], 
.form-style-40 input[type="submit"]{
    -moz-box-shadow: inset 0px 1px 0px 0px #45D6D6;
    -webkit-box-shadow: inset 0px 1px 0px 0px #45D6D6;
    box-shadow: inset 0px 1px 0px 0px #45D6D6;
    background-color: #2CBBBB;
    border: 1px solid #27A0A0;
    display: inline-block;
    cursor: pointer;
    color: #FFFFFF;
    font-family: 'Open Sans Condensed', sans-serif;
    font-size: 14px;
    padding: 8px 18px;
    text-decoration: none;
    text-transform: uppercase;
}
.form-style-40 input[type="button"]:hover, 
.form-style-40 input[type="submit"]:hover {
    background:linear-gradient(to bottom, #34CACA 5%, #30C9C9 100%);
    background-color:#34CACA;
}
</style>
<body>

<div class="form-style-40">
  <h2>Sign Up Form</h2>
  <form>
  <table>
  
  <tr><td>
  
    <label>First Name</label>
			<input type="text" name="field1" size="35" placeholder="" /></td>
		<td><label>Last Name</label>
			<input type="text" name="field2" size="35" placeholder="" />  </td></tr> 
		<tr><td><label>Email</label>
    		<input type="email" name="field3" size="35" placeholder="@sample.com" /> </td>
    	<td><label>Date of Birth</label>
    		<input type="date" name="field6" size="35" placeholder="" /></td></tr>
    	<tr><td><label>Password</label>
    		<input type="password" name="field4" placeholder="" /></td>
    	<td><label>Confirm Password</label>
    		<input type="password" name="field5" placeholder="" /> </td></tr>
    	<tr><td> <label>City</label>
    		<textarea placeholder="" onkeyup="adjust_textarea(this)"></textarea> 
   		<label>Country</label>
    		<textarea placeholder="" onkeyup="adjust_textarea(this)"></textarea> </td></tr>
   		<tr><td> <input type="button" value="Sign Up" /></td></tr>
    </table>
  </form>
</div>
</html>
