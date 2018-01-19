/*
function to analyze what the given input is
input: A number or string
output: Whether the input is string or a number and whether the number is in range or not
*/
function analyzeName(){
	var rows="";
	var name = document.getElementById('userName').value;
	var age = document.getElementById('userAge').value;
	
	if(name.trim()=='')
		output = "Enter the name ";
	else if(age.trim()=='')
		output = "Age is missing";
	else if(document.getElementById('male').checked==false&&document.getElementById('female').checked==false)
		output = "Select a gender";
	else{
		if(document.getElementById('male').checked==true){
			gender='male';
			output = "The name is Master "+ name;
		}else{
			gender='female';
			output = "The name is Miss "+ name;	
		}
	}
	
	document.getElementById('output').innerHTML=output;
	rows += "<td>" + name + "</td><td>" + gender + "</td><td>" + age + "</td><td>" + output + "</td>";
            var tbody = document.querySelector("#list tbody");
        var tr = document.createElement("tr");

        tr.innerHTML = rows;
        tbody.appendChild(tr)
}

function analyzeNumber(){
	
	var number = document.getElementById('userInput').value;
	if(number.trim()=='')
		output = "Enter Something ";
	else{
		if(number<0 || number>1000)
			output = "The number cannot be more than 1000 and less than 0";
		 else if(number<50)
			output = "The number is below 50";
		 else if(number>=50 && number<=100)
			output = "The number is between 50 and 100";
		 else
			output = "The number is greater that 100";
	}
	 document.getElementById('output').innerHTML=output;
}

function showDiv(){
	var check = document.getElementById("nameNumber").checked;
	var number = document.getElementById("number");
	var name = document.getElementById("name");
	if(check==false){
		number.style.display="block";
		name.style.display="none";
	}else{
		name.style.display="block";
		number.style.display="none";
	}
}