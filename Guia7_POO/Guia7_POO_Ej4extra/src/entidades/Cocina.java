/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
*/
package entidades;

import java.util.ArrayList;
import java.util.List;


//public class Cocina {
//
//    public Cocina() {
//    }
//    
//    Receta receta1 = new Receta();
//    Receta receta2 = new Receta(); 
//}

public class Cocina {
    private List<Receta> recetas;

    public Cocina() {
        recetas = new ArrayList<>();
    }

    public void agregarReceta(String nombre, List<String> ingredientes) {
        Receta receta = new Receta(nombre, ingredientes);
        recetas.add(receta);
    }

    public Receta buscarRecetaPorNombre(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public List<Receta> recetasDisponibles(List<String> ingredientesDisponibles) {
        List<Receta> recetasPosibles = new ArrayList<>();
        for (Receta receta : recetas) {
            boolean todosLosIngredientes = true;
            for (String ingrediente : receta.getIngredientes()) {
                if (!ingredientesDisponibles.contains(ingrediente)) {
                    todosLosIngredientes = false;
                    break;
                }
            }
            if (todosLosIngredientes) {
                recetasPosibles.add(receta);
            }
        }
        return recetasPosibles;
    }
}

class Receta {
    private String nombre;
    private List<String> ingredientes;

    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}