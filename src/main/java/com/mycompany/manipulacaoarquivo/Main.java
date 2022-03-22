package com.mycompany.manipulacaoarquivo;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Armazenando o documento txt em uma String e adicionando na lista
    public static void main(String[] args) throws IOException {
        
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        
        ArrayList <String[]> attributes = File.reader(path);
        
        // Retornando as coordenadas
        getCoordinate("0294-0181", "101", attributes);
        
    }
    
    // Pesquisando por coordenadas na lista
    public static void getCoordinate(String lineName, String pointNumber, 
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
