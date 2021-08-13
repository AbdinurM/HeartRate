/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.mavenproject2;

/**
 *
 * @author Nur
 */
import java.util.Random;
import java.util.Scanner;
        
public class NewClass {

public static void main (String[] args){
        Scanner HC = new Scanner(System.in);
        int age;
        int maxHeartRate;
        int targetHRateMin;
        int targetHRateMax;
        
        System.out.println("What is your age?");
        age = HC.nextInt();
        maxHeartRate = (220-age);
        targetHRateMin = (int)(.5*maxHeartRate);
        targetHRateMax = (int)(.85*maxHeartRate);
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " Beats Per Minute");
        System.out.println("Your target Hr Zone is " +targetHRateMin + "-" +targetHRateMax +" " +"Beats per Minute");
         }
    }