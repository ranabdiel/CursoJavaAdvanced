
package javaadvanced.Miercoles.Banco3;

/**
 *
 * @author Ramses Santos
 */
public interface Bank {
    int getTasaDeInteres();
}

class HSBC1 implements Bank{

    @Override
    public int getTasaDeInteres() {
        return 7;
    }
}

class BanCoppel1 implements Bank {

    @Override
    public int getTasaDeInteres() {
        return 9;
    }
}

class Bancomer1 implements Bank {

    @Override
    public int getTasaDeInteres() {
        return 9;
    }   
}

class PruebaBank{
    public static void main(String[] args) {
        Bank b, b1, b2;
        
        b = new Bancomer1();
        b1 = new BanCoppel1();
        b2 = new HSBC1();
        
        System.out.println(b.getTasaDeInteres());
        System.out.println(b1.getTasaDeInteres());
        System.out.println(b2.getTasaDeInteres());
    }
}