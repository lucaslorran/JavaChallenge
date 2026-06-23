package io.github.lucaslorran.javachallenge.modelos.exerciciogatocachorro;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("miau miau miau miau!");
    }

    public void arranharMoveis(){
        System.out.println("Gato arranhando móveis!");
    }
}
