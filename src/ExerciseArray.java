
import java.util.*;

public class ExerciseArray {

    /* ArrayList de objetos definidos por el usuario
    Dado que ArrayList admite genéricos, puede crear una ArrayList de cualquier tipo. Puede ser de tipos simples como
    Integer, String, Doubleo tipos complejos como un ArrayList de ArrayLists,
    o un ArrayList de HashMaps o un ArrayList de objetos definidos por el usuario.*/

    public static void main(String[] args)
    {
        arrayListUserDefinedObjectExample();

    }
        public static void arrayListUserDefinedObjectExample() {
            List<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Black");
            colors.add("Blue");
            colors.add("White");

            List<String> cars = new ArrayList<>();
            cars.add("Bmw");
            cars.add("Toyota");
            cars.add("Vw");
            cars.add("Benz");

            // Se add new elementos al List cars
            cars.add(4, "Mclaren");
            cars.add(5, "Mazda");
            cars.add(6, "Ferrari");
            cars.add(7, "Hyundai");

            // Se modifican elementos al List cars segun el indice que se desea
            cars.set(2, "Ford");
            cars.set(5, "Honda");
            cars.set(7, "Mazda");

            List<User> users = new ArrayList<>();
            users.add(new User("Rajeev", 25, colors, cars));
            users.add(new User("John", 34, colors, cars));
            users.add(new User("Steve", 29, colors, cars));
            users.add(new User("Patric", 18, colors, cars));

            users.forEach(user -> System.out.println("Name : " + user.getName() + ", Age : " + user.getAge() +
                    ", Color : " + user.getColors() + ", Car : " + user.getCars()));

        }







    /* Buscando elementos en una ArrayList
    Compruebe si una ArrayList contiene un elemento determinado | contiene ()

    Encuentre el índice de la primera aparición de un elemento en un ArrayList | índice de()

    Encuentre el índice de la última aparición de un elemento en un ArrayList | lastIndexOf () */

        public static void searchElementsInArrayListExample() {
            // Se crea un list de String
            List<String> names = new ArrayList<>();

            // Se agregan elementos al List
            names.add("Juan");
            names.add("Andres");
            names.add("Martha");                                   // DUDAS
            names.add("Fabiola");
            names.add("Juliana");
            names.add("Gustavo");
            names.add("Mayadelin");

            // Vamos a comprobar si el ArrayList tiene un elemento determinado
            System.out.println("Does names array contain \"Mayadelin\"? : " + names.contains("Mayadelin"));

            // Vamos a encontrar el indice de la primera aparicion de un elemento en unArrayList
            System.out.println("\nindexOf \"Fabiola\": " + names.indexOf("Fabiola"));
            System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

            // Vamos a encontrar el indice de la primera aparicion de un elemento en unArrayList
            System.out.println("\nindexOf \"Andres\": " + names.indexOf("Andres"));
            System.out.println("indexOf \"Lucia\": " + names.indexOf("Lucia"));

        }

        public static void arrayListIteratorRemoveExample() {
        // Se crea un list Interge
            List<Integer> numbers = new ArrayList<>();

            // Se agregan los elementos deseados
            numbers.add(13);
            numbers.add(18);
            numbers.add(25);                                        // DUDAS
            numbers.add(40);

            // Se crea el metodo Iterator
            numbers.removeIf(num -> num % 2 != 0);

            System.out.println(numbers);
    }

        public static void iteratingArray(){

        /* Iterando sobre una ArrayList

        El siguiente ejemplo muestra cómo iterar sobre una ArrayList usando

        1. Java 8 forEachy expresión lambda.
        2. iterator().
        3. iterator()y el método Java 8 forEachRemaining () .
        4. listIterator().
        5. Simple para cada bucle.
        6. para bucle con índice. */


        // Se crea el List animes
        List<String> animes = new ArrayList<>();

        // Se agg los elementos que se desean al arrayList, en esta caso tipo String
            animes.add("Dragon Ball");
            animes.add("Naruto");
            animes.add("Los Simpson");
            animes.add("Los padrinos magicos");

            // Iterar utilizando Java 8 forEach y lambda
            System.out.println("=== Iterate using Java 8 forEach and lambda ===");
            animes.forEach(System.out::println);

            System.out.println("\n=== Iterar usando un iterator() ===");
            Iterator<String> animeIterator = animes.iterator();
            while (animeIterator.hasNext()) {
                String anime = animeIterator.next();
                System.out.println(anime);
            }

            // Vamos a iterar utilizando ambos metodos iterator y java 8 forEach
            System.out.println("\n=== Iterate using an iterator and Java 8 forEachRemaining() method ===");
            animeIterator = animes.iterator();
            animeIterator.forEachRemaining(System.out::println);

            // Vamos a iterar utilizando un ListIterator() para que recorra en ambas direcciones
            System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");

            // En este caso se empieza por el final de la lista
            ListIterator<String> animeListIterator = animes.listIterator(animes.size());
            while (animeListIterator.hasPrevious()) {
                String anime = animeListIterator.previous();
                System.out.println(anime);
            }

            // Vamos a iterar utilizando bucle for-each
            System.out.println("\n=== Iterate using simple for-each loop ===");
            for (String tvAnime: animes) {
                System.out.println(tvAnime);
            }

            // Vamos a iterar urilizando el bucle for con el indice
            System.out.println("\n=== Iterate using for loop with index ===");
            for (String anime : animes) {
                System.out.println(anime);
            }

    }

        public static void arrayExercise3(){

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

        public static void arrayExercise2(){

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

        public static void arrayExercise1(){

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

        public static void arrayExercise(){

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
