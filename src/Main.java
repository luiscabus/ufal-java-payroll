//javac -d /projects/ufal-java-payroll/bin/ /projects/ufal-java-payroll/src/*.java
//java Main /projects/ufal-java-payroll/bin/Main.class
//https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#exerccios-orientao-a-objetos
//refactor init

import java.util.*;

public class Main {

    static ArrayList<Empregado> empregadosArrayList = new ArrayList<>();



    public static void main(String[] args) {


        Menu menu = new Menu();
        menu.Menu();
    }

}