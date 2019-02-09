var playing = false;
var score; 
var trialsLeft; 
var step; 
var action; 
var fruits = ['apple', 'banana', 'cherries', 'grapes', 'mango', 'orange', 'peach', 'pear', 'watermelon']; 

$(function(){      
       $("#startreset").click(function(){  
         
    if(playing == true){  
                
         location.reload();     
        }
        else{  
                 
        playing = true; 
        score = 0;     

        $("#scorevalue").html(score);         
           $("#trialsLeft").show();         
           trialsLeft = 3;         
           addHearts();  
            
         $("#gameOver").hide();         
         $("#startreset").html("Reset Game");  
               
        startAction();     
    } 
});  
     //slice a fruit      
     $("#fruit1").mouseover(function(){        
         score++;     
         $("#scorevalue").html(score);    
          clearInterval(action);          
    
          $("#fruit1").hide("explode", 500); 
               
          setTimeout(startAction, 500); 
        });        
function addHearts(){     
    $("#trialsLeft").empty(); 
    for(i = 0; i < trialsLeft; i++){        
         $("#trialsLeft").append('<img src="images/heart.png" class="life">');     
        } 
    }  
function startAction(){        
 
      $("#fruit1").show();     
      chooseFruit();    
      $("#fruit1").css({'left' : Math.round(450*Math.random()), 'top' : -50});

                //generate a random step     
                step = 1+ Math.round(5*Math.random()); // change step          
                // Move fruit down by one step every 10ms     
                action = setInterval(function(){                  
                    //move fruit by one step         
                    $("#fruit1").css('top', $("#fruit1").position().top + step);  
                    
                    //check if the fruit is too low         
                    if($("#fruit1").position().top > $("#fruitsContainer").height()){       
                              //check if we have trials left             
                              if(trialsLeft > 1 ){                
                                   //generate a fruit                
                                    $("#fruit1").show();                 
                                    chooseFruit(); //choose a random fruit                 
                                    $("#fruit1").css({'left' : Math.round(450*Math.random()), 'top' : -50}); 
                                    //random position  
                                     //generate a random step                 
                                 step = 1+ Math.round(5*Math.random()); // change step 
                                 //reduce trials by one                 
                                 trialsLeft --;                                  
                                 //populate trialsLeft box                
                                 addHearts();                              
                                }
                                else{ // game over                 
                                    playing = false; //we are not playing anymore  
                                   $("#startreset").html("Start Game");
                                   // change button to Start Game
                                  $("#gameOver").show();                 
                                  $("#gameOver").html('<p>Game Over!</p><p>Your score is '+ score +'</p>');           
                                    $("#trialsLeft").hide();                 
                               stopAction();            
 }         
}    
 }, 10); }  
// generate a random fruit  
function chooseFruit(){     
    $("#fruit1").attr('src' , 'images/' + fruits[Math.round(8*Math.random())] +'.png');   
 }  
//Stop dropping fruits  
function stopAction(){     
    clearInterval(action);     
    $("#fruit1").hide(); 
} }); 