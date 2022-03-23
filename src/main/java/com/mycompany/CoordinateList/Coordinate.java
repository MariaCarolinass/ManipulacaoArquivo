package com.mycompany.CoordinateList;

import java.util.ArrayList;

public class Coordinate {
    
    // Pesquisando por coordenadas na lista
    public static void getCoordinateList(String lineName, String pointNumber, 
            ArrayList <String[]> attributes) {
        
        // Percorrendo pela lista de atrihutos
        for (String[] list: attributes) {
        
            // Verificando se os atributos lineName e pointNumber correspondem
            if (list[0].equals(lineName) && list[1].equals(pointNumber)) {
                
                // Imprimindo os valores das coordenadas
                System.out.println("Latitude: " + list[2]);
                System.out.println("Longitude: " + list[3]);
                System.out.println("X: " + list[4]);
                System.out.println("Y: " + list[5]);
                System.out.println("Z: " + list[6]);
                
                return;
             }
        
         }
        
        // Se a coordenada não corresponder
        System.out.println("Coordenadas não encontradas!");
        
    }
}
