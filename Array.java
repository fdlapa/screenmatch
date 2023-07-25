package br.com.screenmatch.arrays;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
