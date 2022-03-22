package com.mycompany.manipulacaoarquivo;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Armazenando o documento txt em uma String e adicionando na lista
    public static void main(String[] args) throws IOException {
        
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        
        ArrayList <String[]> attributes = File.reader(path);
        
    }
    
    // Pesquisando por coordenadas na lista
    public static void getCoordinate(String lineName, String pointNumber, 
            ArrayList <String[]> attributes) {
        
        /* while (attributes) {
            
            System.out.println();
            
        }
        
        System.out.println("Não encontrado!");
        */
    }
    
}
