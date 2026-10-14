         //MAP.

let num =[1,2,3,4];
 let double = num.map((element)=>{
     return element *2;

 });

// // Example 1.

let students = [
    {
        name:"aman",
        marks :95,
    },
    {
        name : "shardha",
        marks : 95.5,
    },
    {
        name : "salman",
        marks : 80,
    },
  ];
  let gpa = students.map((el)=>{
    return el.marks/10;
});

      // FILTER.

 // 1 Example--

let nums =[1,2,3,4,5,6,7,8,9,10,11,12,13,14];

let  ans = nums.filter((el)=>{
    return el % 2 == 0;
  });


       // EVERY.

   //  1 EXAMPLE--
     
     let num2=[1,2,3,4];
     let answer = num.every((el)=>{

        return el % 2 == 0;
     });


       // REDUCE.
    
    // 1 EXAMPLE.

    let num1 = [1,2,3,4];
    let finalVal = num1.reduce((res,el)=>{
        return res + el;
    });
      console.log(finalVal);

       // 2 EXAMPLE. 
    
    let arr = [2,3,4,5,3,4,7,8,1,2,16];
     
    let max = arr.reduce((max,el)=>{

        if (el > max){
            return el;

        }else {
            return max;
        }
    });

    // REST.

    // 1 EXAMPLE .
 
   function sum(...args){

        for(let i=0; i<args.length; i++){

            console.log("You gave us :",args[i]);
        }
    }

        //  DESTRCTURING.

        // 1 EXAMPLE-

    let names = ["tony", "salman", "soban","khalid"];
     
    let [winnner, runner, secondrunner] = names;

    // DESTRCTURING USING OBJECT.

    // EXAMPLE 2-

    const student1 = {
        name : "salman",
        age : 10,
        class : 10,
        subject : ["hindi","english","math"],
        username : "salman234",
        pass : "1234"
    };

    let {username,pass}= student1;