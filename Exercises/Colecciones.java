package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;


public class Colecciones {
    ArrayList<String> cars ;
    String[] bikes;
    Set<String> bicicles;
public  HashMap<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport= new HashMap<Integer, String>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String>  obtenerHash(){
        this.transport.clear();

         Set<String> elementosUnicos = new HashSet<>();
       // int length = cars.size() + bikes.length + bicicles.size();// obtener tamaño
        int count =1;

            for (String car : cars) {
                if (car != null && !car.trim().isEmpty() && elementosUnicos.add(car)) {
                this.transport.put(count++, car);
                }
            }
            for (String bike : bikes) {
                if (bike != null && !bike.trim().isEmpty() && elementosUnicos.add(bike)) {
                this.transport.put(count++, bike);
                }
             }
        for (String bicicle : bicicles) {
            if (bicicle != null && !bicicle.trim().isEmpty() && elementosUnicos.add(bicicle)) {
            this.transport.put(count++, bicicle);
            }
        }

        //this.transport.forEach((key, value) -> System.out.println(key + " " + value)); //imprimir para pruebas
        return this.transport;
    }
}
