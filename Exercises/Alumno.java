package Exercises;

    /**
     * Alumno
     */
    public class Alumno extends Sobrecarga{
        public Alumno(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }
        public String reprobar(){
            return calificacion < 6 ? ":(" : ":)";

        }
        
    }

