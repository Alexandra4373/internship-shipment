package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	//creating scanner object
        Scanner input = new Scanner(System.in);


        //prompt user to enter a weight
        System.out.println("PLEASE ENTER A WEIGHT");
        double weight= input.nextDouble();


        //display output
        System.out.println("Weight is:"+weight+"pounds");

       //displaying shipping cost using if else selection
        if (weight>0 && weight<=2){
            System.out.println("The Shipping cost is 2.5 dollars for " + weight + " pounds" );
        }


        else if(weight>2 &&weight<=4){
            System.out.println("The Shipping cost is 4.5 dollars for " + weight + " pounds");
        }


        else if(weight>4 && weight<=10){
            System.out.println("The Shipping cost is 7.5 dollars for " + weight + " pounds");
        }


        else if (weight>10 && weight<=20){
            System.out.println("The Shipping cost is 10.5 dollars for " + weight + " pounds");

        }
        else if(weight>20){
            System.out.println("the package cannot be shipped");

        }
        else{
            System.out.println("invalid");

        }


    }
}
