package file;

import coordinateclass.CoordinateClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileClass {
    
    // Leitura do arquivo armazenado na classe
    public static ArrayList<CoordinateClass> reader(String path) throws IOException {
        
        // Lista para armazenar os atributos na classe
        ArrayList <CoordinateClass> attributes2 = new ArrayList();
        
        // Carregamento dos dados salvo na memória Buffer
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String line = "";
            
            // Carrega as linhas do arquivo txt
            while ((line = buffRead.readLine()) != null) {
                
                // Ignorar todas as linhas que começam com H
                if (!line.startsWith("H")) {
                    
                    // Atributos do arquivo organizados e trasformados em string
                    String lineName = line.substring(1, 13).trim(); 
                    Integer pointNumber = Integer.parseInt(line.substring(19, 25).trim()); 
                    String latitude = line.substring(25, 35).trim();
                    String longitude = line.substring(35, 46).trim();
                    Double x = Double.parseDouble(line.substring(46, 55).trim());
                    Double y = Double.parseDouble(line.substring(55, 64).trim());
                    Double z = Double.parseDouble(line.substring(64, 70).trim());
                    
                    // Atributos passados para a lista
                    attributes2.add(new CoordinateClass(lineName, pointNumber, 
                        latitude, longitude, x, y, z));
                }
               
            }
            
        }
        
        return attributes2;
    }
    
} 

