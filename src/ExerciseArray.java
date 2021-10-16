import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseArray {


    public static void main(String[] args) {ArrayExercise3();}

        public static void ArrayExercise3(){

        // Se crea el arrayList
        List<String> soccerPlayers = new ArrayList<>();

            // Se agregan los elementos que se desean
            soccerPlayers.add("Falcao");
            soccerPlayers.add("Suarez");
            soccerPlayers.add("Aguero");
            soccerPlayers.add("Lewandowski");
            soccerPlayers.add("Messi");
            soccerPlayers.add("CR7");
            soccerPlayers.add("Neymar JR");

            // Se muestra el arreglo y sus elementos
            System.out.println("Lista de jugadores :" + soccerPlayers);

            // Eliminar los elementos segun el indice utilizando remove
            soccerPlayers.remove(2);

            /* Se realiza la impresion para verificar que el elemento,
            segun su indice se elimine correctamente */
            System.out.println("Se elimino al jugador en la posicion (2): " +soccerPlayers);

            // Forma para remover un elementos de la lista, si no existe regresa false
            boolean isRemoved = soccerPlayers.remove("Aguero");
            System.out.println("Se debe retirar (\"Aguero\"): " + soccerPlayers);

            // Eliminar todos los elementos que existen en una coleccion determinada
            List<String> players = new ArrayList<>();
            players.add("Falcao");
            players.add("Suarez");
            players.add("Lewandowski");

            soccerPlayers.removeAll(players);
            System.out.println("Despues de removeAll(players): " +soccerPlayers);

            // Remover el elemento que satisfacen el predicado??
            soccerPlayers.removeIf(s -> s.startsWith("N"));

            // Se imprime los datos en el arreglo despues de eliminar los que empiezan por N
            System.out.println("Se deben eliminar los elementos que empiecen con \"N\": " + soccerPlayers);

            // Eliminar todos los elementos del ArrayList utilizando clear
            soccerPlayers.clear();

            // Se imprime el arreglo, el cual debe estar vacio []
            System.out.println("Despues de limpiar el arreglo: " +soccerPlayers);
        }

        public static void ArrayExercise2(){

            // Se declara un array de tipo String que se llama carros
            List<String> carros = new ArrayList<>();

            // Metodo para comprobar si el array esta vacio, llamando el nombre del array y agregando isEmpty
            System.out.println("El elemento debe estar vacio : " + true);

            // Se agregan elementos al array de la misma forma con add, por lo  tanto el array deja de estar vacio
            carros.add("BMW");
            carros.add("VW");
            carros.add("HYUNDAI");
            carros.add("TOYOTA");
            carros.add("TESLA");

            // para encontrar el tamano de un array se utiliza size y luego se imprime
            System.out.println("Estas son las " + carros.size() + " mejores marcas de carros de todo el mundo");
            System.out.println(carros);

            // Como mostrar un elemento en el array, segun su posicion.
            // Se declaran nuevas variables y se asignan al array segun la posicion
            String cars = carros.get(0);
            String cars1 = carros.get(1);
            String cars2 = carros.get(carros.size() - 1);

            // Se imprime lo que anterior mente se establecio en la posicion que se desea
            System.out.println("La primera mejor marca es: " +cars);
            System.out.println("La segunda mejor marca es: " + cars1);
            System.out.println("La marca mas vendida es: " + cars2);

            // Como modificar un dato del array con la posicion
            carros.set(3, "PORSCHE");
            // Imprimir nueva marca de automovil
            System.out.println("Marca modifica, la nueva marca es : " +carros.get(3));
            // Imprimir array completo con la nueva modificacion
            System.out.println("Todas las marcas son: " + carros);

        }

        public static void ArrayExercise1(){

        /*  Crear ArrayList a partir de otra coleccion */
            // Se crea el primer Array de tipo Integer
            List<Integer> numeros = new ArrayList<>();   // El array esta vacio

            // Se agregan elementos al array con add para agregarlo a coches
            numeros.add(3);
            numeros.add(5);
            numeros.add(7);
            numeros.add(9);
            numeros.add(11);

            // Se crea el array, apartir de la coleccion del primero "numeros"
            List<Integer> todosLosNumeros = new ArrayList<>(numeros);

            // Se crea el nuevo array, donde iran los otros datos a agregar de los dos arrays
            List<Integer> numeroTwo = new ArrayList<>();
            numeroTwo.add(8);
            numeroTwo.add(1);
            numeroTwo.add(2);
            numeroTwo.add(12);
            numeroTwo.add(4);

            // Se agrega el array numeroTwo al array todosLosNumeros, ya que el contiene el primer array
            todosLosNumeros.addAll(numeroTwo);

            // Aca se imprime el arreglo que contiene a los arreglos, en este caso seria todosLosNumeros
            System.out.println(todosLosNumeros);
        }

        public static void ArrayExercise(){

        // Se crea un ArrayList de tipo String
        List<String> mascotas = new ArrayList<>();  // El array esta vacio

        // Se agregan datos al array utilizando la herramienta add para agregar al array mascotas
        mascotas.add("Gato");
        mascotas.add("Perro");
        mascotas.add("Loro");
        mascotas.add("Caballo");

        // Se imprime los datos del array
        System.out.println(mascotas);

        // Se agrega un nuevo dato al array, indicando la posicion en la que se desea agregar
        mascotas.add(4, "Tortuga");

        // Se imprime el array con su nuevo dato ya agregado
        System.out.println(mascotas);

    }

}
