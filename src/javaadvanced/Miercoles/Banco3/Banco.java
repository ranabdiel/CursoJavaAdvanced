package javaadvanced.Miercoles.Banco3;

/**
 *
 * @author Ramses Santos
 */
abstract class Banco {
    abstract int getTasaDeInteres();
}

class HSBC extends Banco{

    @Override
    int getTasaDeInteres() {
        return 7;
    }
}

class BanCoppel extends Banco {

    @Override
    int getTasaDeInteres() {
        return 9;
    }
    
}

class Bancomer extends Banco {

    @Override
    int getTasaDeInteres() {
        return 9;
    }
    
}


class PruebaBanco{
    public static void main(String[] args) {
        Banco b ;
        
        b = new HSBC();
        System.out.println("Tasa de interes de HSBC: " + b.getTasaDeInteres());
        
        b = new BanCoppel();
        System.out.println("Tasa de interes de BanCoppel: " + b.getTasaDeInteres());
        
        b = new Bancomer();
        System.out.println("Tasa de interes de Bancomer: " + b.getTasaDeInteres());
    }
}