
function hello(){
    alert("Hello World!");
    }
    var count= 0;
    var timer;
    function interval(x) {
        count = count + x;
        if (count <= 1) {
            timer = setInterval(changeTxtArea,500);
        }else
            clearInterval(timer);
    }
    function changeTxtArea(){

        // document.getElementById("textArea").style.fontSize="24px";
        var textFont = window.getComputedStyle(document.getElementById("textArea")).fontSize;
        bigger = parseInt(textFont) + 2 +'px';
        
        document.getElementById("textArea").style.fontSize=bigger;
    }
    function boldTxtArea() {
        if(document.getElementById("checkBox").checked==true){
            document.getElementById("textArea").style.fontweight="bold";
            document.getElementById("textArea").style.color="green";
            document.getElementById("textArea").style.textDecoration = "underline";
          //  document.body.style.backgroundImage="images/dollar-bill.jpg";
            document.body.style.backgroundImage = "url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
    
        }else{
            document.getElementById("textArea").style.fontweight="normal";
            document.getElementById("textArea").style.textDecoration = "none";
        }
    }
    