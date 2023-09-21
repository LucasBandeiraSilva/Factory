package concreteClasses;

import product.Lista;

public class LinkedList implements Lista {

    @Override
    public Lista getLista() {
       return new LinkedList<>();
    }

    
    
}
