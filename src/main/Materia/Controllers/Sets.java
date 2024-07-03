package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public Sets() {
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();
    }

    // Construir y mostrar un HashSet
    public void construirHashSet() {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Casa");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Pera");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Alexis");
        System.out.println("HashSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("HashSet" + conjunto);
        // Eliminar un elemento
        conjunto.remove("Juan");
        System.out.println("HashSet despues de eliminar un conjunto:" + conjunto);

        // Verificar si un elemento existe
        Boolean contineAlexis = conjunto.contains("Alexis");
        System.out.println("HashSet contiene Alexis?" + contineAlexis);

        // tamanio de hashset

        int tamanio = conjunto.size();
        System.out.println("El tamanio del HashSet es:" + tamanio);

    }

    public void construirLinkedHashSet() {
        TreeSet<String> conjunto = new TreeSet<>();
        System.out.println("Liked lista es");
        conjunto.add("Manzana");
        conjunto.add("Casa");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Pera");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Alexis");
        System.out.println("LikedHashSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("LikedHashSet" + conjunto);

    }

    public void construirTreeSet() {
        TreeSet<String> conjunto = new TreeSet<>();
        System.out.println("La lista de Tree");
        conjunto.add("Manzana");
        conjunto.add("Casa");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Pera");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Hola");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Alexis");
        System.out.println("TreeSet" + conjunto);
        conjunto.add("Juan");
        System.out.println("TreeSet" + conjunto);

    }

    public void construirTreeSetConComparador() {
        Comparator<String> comparardorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }

        };
        TreeSet<String> conjunto = new TreeSet<>(comparardorOrdenInverso);
        System.out.println("La lista es TreeConComparador");
        conjunto.add("Manzana");
        conjunto.add("Casa");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Hola");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Pera");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Juan");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Hola");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Alexis");
        System.out.println("TreeConComparador" + conjunto);
        conjunto.add("Juan");
        System.out.println("TreeConComparador" + conjunto);

    }

}