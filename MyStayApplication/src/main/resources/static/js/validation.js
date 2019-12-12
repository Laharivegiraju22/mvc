function validate() {
	var name = document.getElementById("userName").value;
	var email = document.getElemetById("email").value;
	var bt = document.getElementById('submit');
	var atIndex=email.indexOf('@');
	var dotIndex=email.lastIndexOf('.');
	if(atIndex<=0!!atIndex+1>=dotIndex||dotIndex+1>=email.length-1)
		{
		alert("invalid email id");
		return false;
		}
	else{
		return true;
	}
	
		
	
}