// function Scope.
 
 let name = "salman"; //Global scope.

 function calsum(a,b){
     let sum = a+b;  // function scope only accessible inside the function.
     
     console.log(sum);
 }

//  Block Scope.

let age = 20;
 
if(age >= 18){ 

    let str = "Adult";
    console.log(str);

}  // Block scope declared inside the block only.


// Lexical Scope.

function outer(){
    let x= 10;
    let y = 20;

// In this lexical scope we declared function inside a function. 

    function inner(){
        console.log(x);
        console.log(y);
        
    }
    inner();
}

// function expression.

let sum = function( e,f ) {
    return e+f;
} 
// sum(10,20);

let hello =function(){
    console.log("namstey");
    
}

//  we change the value aslo.

hello = function(){
    console.log("Welcome");
    
}