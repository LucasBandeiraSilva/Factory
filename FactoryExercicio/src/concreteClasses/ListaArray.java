package concreteClasses;

import java.util.ArrayList;
import java.util.List;

import product.Lista;

public class ListaArray implements Lista {
    @Override
    public List getLista() {
        return new ArrayList<>();
    }
    
}
