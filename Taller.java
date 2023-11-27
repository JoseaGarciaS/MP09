

public class Taller {

    public static void main(String[] args) {

        Cesto cesto=new Cesto();

        Trabajador t1 = new Trabajador("Jose", "Hace Mangas",cesto);
        Trabajador t2 = new Trabajador("Maria", "Hace Cuerpos",cesto);
        Trabajador t3 = new Trabajador("Pedro", "Ensambla",cesto);

        t1.start();
        t2.start();
        t3.start();
    }
}