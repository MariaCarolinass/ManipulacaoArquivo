package main;

/* import coordinatelist.CoordinateList;
import static coordinatelist.CoordinateList.getCoordinateList;
import file.FileList;
import coordinateclass.CoordinateClass;
import static coordinateclass.CoordinateClass.getCoordinateClass;
import file.FileClass; */
import coordinatemap.CoordinateMap;
import file.FileMap;
import static coordinatemap.CoordinateMap.getCoordinateMap;
import java.util.Map;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // Armazenando o documento txt em uma String
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        
        /*Retornando as coordenadas usando lista
        ArrayList <String[]> attributes = FileList.reader(path);
        getCoordinateList("0294-0181", "101", attributes); */
        
        /* Retornando as coordenadas usando classe
        ArrayList <CoordinateClass> attributes2 = FileClass.reader(path);
        getCoordinateClass("0294-0181", 102, attributes2); */
       
        // Retornando as coordenadas usando Map
        Map <String, ArrayList<CoordinateMap>> attributes3 = FileMap.reader(path);
        getCoordinateMap("0294-0181", 103, attributes3);
    }

}
