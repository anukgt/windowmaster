/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azg.windowmaster;

import java.util.Scanner;
/**
 *
 * @author vinug
 */
public class windowmaster {
    public static void main(String[] args) {
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter window height:");
        stringHeight = sc.nextLine();
        
        System.out.println("Please enter window width:");
        stringWidth = sc.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        areaOfWindow = height*width;
        perimeterOfWindow = 2 * (height + width);
        cost = (3.50f * areaOfWindow) + (2.25f * perimeterOfWindow);
        
        System.out.println("window height=" + stringHeight);
        System.out.println("window width=" + stringWidth);
        System.out.println("window area=" + areaOfWindow);
        System.out.println("window perimeter=" + perimeterOfWindow);
        System.out.println("Total Cost=" + cost);
        
        
        
        
        
    }
    
    
}
