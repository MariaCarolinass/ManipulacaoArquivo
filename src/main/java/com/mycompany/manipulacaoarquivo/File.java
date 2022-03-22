package com.mycompany.manipulacaoarquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    
    // Leitura do arquivo armazenado na lista
    public static ArrayList<String[]> reader(String path) throws IOException {
        
        // Lista para armazenar os atributos
        ArrayList <String[]> attributes = new ArrayList ();
        
        // Carregamento dos dados salvo na memória Buffer
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String line = "";
            
            // Carrega as linhas do arquivo txt
            while ((line = buffRead.readLine()) != null) {
                
                // Ignorar todas as linhas que começam com H
                if (!line.startsWith("H")) {
                    
                    // Atributos do arquivo organizados e trasformados em string
                    // trim() para eliminar os espaços
                    String lineName = line.substring(1, 13).trim(); 
                    String pointNumber = line.substring(19, 25).trim();
                    String latitude = line.substring(25, 35).trim();
                    String longitude = line.substring(35, 46).trim();
                    String x = line.substring(46, 55).trim();
                    String y = line.substring(55, 64).trim();
                    String z = line.substring(64, 70).trim();
                    
                    // Atributos armazenados no vetor
                    String vector [] = {
                        lineName, pointNumber, latitude, longitude, x, y, z
                    };
                    
                    // Atributos passados para a lista
                    attributes.add(vector);
                    
                }
               
            }
            
        }
        
        return attributes;
    }
    
}    
        
    
    