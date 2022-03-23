package main;

import com.mycompany.CoordinateClass.CoordinateClass;
import static com.mycompany.CoordinateClass.CoordinateClass.getCoordinateClass;
import file.FileClass;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Armazenando o documento txt em uma String e adicionando na lista
    public static void main(String[] args) throws IOException {
        
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        
        /* Retornando as coordenadas da lista
        ArrayList <String[]> attributes = File.reader(path);
        getCoordinateList("0294-0181", "101", attributes); */
        
        // Retornando as coordenadas da lista por meio de uma classe
        ArrayList <CoordinateClass> attributes2 = FileClass.reader(path);
        getCoordinateClass("0294-0181", 102, attributes2);
       
    }

}
