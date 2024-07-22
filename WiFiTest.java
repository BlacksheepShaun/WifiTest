/************Algorithm************
1. Display "Reboot the computer and try to connect."
2. Prompt user for input and store it in userInput.
3. If userInput is "yes," display "Glad to be of help." and end.
4. Otherwise, iterate steps 1-3 with different messages until a solution is found or suggest getting a new router.
**********************************/

/************Header************
Author: Shun Lae Thawtar Khaing 
Date of Last Modification: 02/7/2024 
Course: CS111B 
Instructor: C. Conner 
Assignment #2
File Name: WiFiTest.java
---> troubleshooting a bad Wi_Fi connection
**********************************/

/************Documentation************
fixed brackets
**********************************/

import java.util.Scanner;

public class WiFiTest
{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      String userInput;
      
      System.out.println("Reboot the computer and try to connect.");
      System.out.println("Did that fix the problem?");
      userInput = scan.next();
      
      if(userInput.equals("yes")){
         System.out.println("Glad to be of help.");
      }
      else{
      System.out.println("Reboot the router and try to connect. \nDid that fix the problem?");
         userInput = scan.next();
         if(userInput.equals("yes")){
            System.out.println("Glad to be of help.");
            }
         else{
            System.out.println("Make sure the cables between the router and modem are plugged in firmly. \nDid that fix the problem?");
            userInput = scan.next();
            if(userInput.equals("yes")){
               System.out.println("Glad to be of help.");
               }
            else {
               System.out.println("Move the router to a new location and try to connect. \nDid that fix the problem?");
               userInput = scan.next();
               if(userInput.equals("yes")){
                  System.out.println("Glad to be of help.");
                  }
               else System.out.println("Get a new router.");
               }

            }
         }
      }
   
   }
