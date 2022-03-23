package com.mycompany.CoordinateClass;

import java.util.ArrayList;

public class CoordinateClass {

    // Atributos
    private String lineName;
    private Integer pointNumber;
    private String lat;
    private String lon;
    private Double x;
    private Double y;
    private Double z;
    
    // Construtor

    public CoordinateClass(String lineName, Integer pointNumber, String lat, 
            String lon, Double x, Double y, Double z) {
        this.lineName = lineName;
        this.pointNumber = pointNumber;
        this.lat = lat;
        this.lon = lon;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    // Pesquisando por coordenadas utilizando classe
    public static void getCoordinateClass(String lineName, Integer pointNumber, 
            ArrayList <CoordinateClass> attributes) {
        
        // Percorrendo pela lista de atrihutos
        for (CoordinateClass coord: attributes) {
            
            // Verificando se os atributos lineName e pointNumber correspondem
            if (coord.getLineName().equals(lineName) && coord.getPointNumber(
                ).equals(pointNumber)) {
                
                // Imprimindo os valores das coordenadas
                System.out.println("Latitude: " + coord.getLat());
                System.out.println("Longitude: " + coord.getLon());
                System.out.println("X: " + coord.getX());
                System.out.println("Y: " + coord.getY());
                System.out.println("Z: " + coord.getZ());
                
                return;
             }
            
        }
        
        // Se a coordenada não corresponder
        System.out.println("Coordenadas não encontradas!");
        
    }

    // get e set
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Integer getPointNumber() {
        return pointNumber;
    }

    public void setPointNumber(Integer pointNumber) {
        this.pointNumber = pointNumber;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    
}
