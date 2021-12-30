package Aula2;

public class TiposDeDados {

    public static void main(String[] args) {

        byte b1 = 10; //O byte têm a menor capacidade
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int i1 = -10000000000;
        int i2 = 28505;

        long l1 = 1000000000000000000l; //long é o que têm a maior capacidade
        long l2 = 2004005000500055000l;

        //float f1 = 4.5; Não têm a letra f no final
        float f2 = 10.68f;

        double d1 = 85.69; // quando não têm o d no final entende-se que é double
        double d2 = 99.84d;

        char c1 = 'w';
        //char c2 = 'tw'; o char é somente um caractere não sendo aceito dois e aspas simples
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et t KNBJBJBB &*''&%&75894389";

        //String dt1 = "09/02/1981";

        boolean bo1 = true; // só existe duas possibilidades, true ou false
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);


    }
}
