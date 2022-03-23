package main;

import static com.mycompany.CoordinateList.Coordinate.getCoordinateList;
import file.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Armazenando o documento txt em uma String e adicionando na lista
    public static void main(String[] args) throws IOException {
        
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        
        ArrayList <String[]> attributes = File.reader(path);
        
        // Retornando as coordenadas da lista
        getCoordinateList("0294-0181", "101", attributes);
        
    }
    
}
