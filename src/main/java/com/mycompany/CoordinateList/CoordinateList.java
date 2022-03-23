package com.mycompany.CoordinateList;

import java.util.ArrayList;

public class CoordinateList {
    
    // Pesquisando por coordenadas na lista
    public static void getCoordinateList(String lineName, String pointNumber, 
            ArrayList <String[]> attributes) {
        
        // Percorrendo pela lista de atrihutos
        for (String[] coord: attributes) {
        
            // Verificando se os atributos lineName e pointNumber correspondem
            if (coord[0].equals(lineName) && coord[1].equals(pointNumber)) {
                
                // Imprimindo os valores das coordenadas
                System.out.println("Latitude: " + coord[2]);
                System.out.println("Longitude: " + coord[3]);
                System.out.println("X: " + coord[4]);
                System.out.println("Y: " + coord[5]);
                System.out.println("Z: " + coord[6]);
                
                return;
             }
        
         }
        
        // Se a coordenada não corresponder
        System.out.println("Coordenadas não encontradas!");
        
    }
}
