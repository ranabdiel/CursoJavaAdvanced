
package javaadvanced.Miercoles.Banco3;

/**
 *
 * @author Ramses Santos
 */
public interface Drawable {
    void draw();
}

class SuperHeroe implements Drawable{

    @Override
    public void draw() {
        System.out.println("Dibujando a SuperMan");
    }
}

class SuperVillano implements Drawable{

    @Override
    public void draw() {
        System.out.println("Dibujando a Lex Luthor");
    }
}

class Historia {
    public static void main(String[] args) {
        Drawable d, e;
        d = new SuperHeroe();
        e = new SuperVillano();
        
        d.draw();
        e.draw();
    }
}
