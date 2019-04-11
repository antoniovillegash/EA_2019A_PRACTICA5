import data.Processing;
import templates.Persona;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Persona> outPersonas = new ArrayList<>();

        personas.add(new Persona("Jose sanchez",23,1.80,76));
        personas.add(new Persona("leo lopez",33,1.50,90));
        personas.add(new Persona("gerardo rodriguez",33,1.75,78));

        Processing processing = new Processing();
        outPersonas = processing.leerPersonasDeArchivo("personas.txt");
        
        for (int i=0; i< outPersonas.size(); i++){
            System.out.println(
                    outPersonas.get(i).getNombre() + " | " +
                            outPersonas.get(i).getEdad() + " | " +
                            outPersonas.get(i).getEstatura() + " | " +
                            outPersonas.get(i).getPeso() + " | ");
        }
        
        Persona personaUltima = new Persona(outPersonas.get(outPersonas.size()-1).getNombre(), outPersonas.get(outPersonas.size()-1).getEdad(), outPersonas.get(outPersonas.size()-1).getEstatura(), outPersonas.get(outPersonas.size()-1).getPeso());
        
        System.out.println(personaUltima.toString());
    }
}
