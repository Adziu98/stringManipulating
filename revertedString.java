package pl.piechowicz.adam;

import java.util.ArrayList;
import java.util.Collections;

public class revertedString {
    private static int toAscii;
    private static char toChar;

    public void revertString(String name) {
//        String reverse = "";
//        for(int i = name.length() - 1; i >= 0; i--) {
//            reverse = reverse + name.charAt(i);
//        }
//
//        System.out.println(reverse);
//      Spróbujmy za pomocą Spring buildera
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }

    private ArrayList<Integer> myString(String name) {
        ArrayList<Integer> lista = new ArrayList();
        for(int i = name.length() - 1; i>= 0; i--){

            toAscii = (int) + name.charAt(i);
            lista.add(toAscii);
        }
        Collections.sort(lista);
        return lista;
    }

    public void revertStringDesc(String name) {
        ArrayList<Integer> lista = myString(name);

        for(int i = lista.size() - 1; i >= 0; i--) {
            toChar = (char) + lista.get(i);
            System.out.print(toChar);
        }
        System.out.println();
    }

    public void revertStringAsc(String name) {
        ArrayList<Integer> listaT = myString(name);

        Collections.sort(listaT);
        for (int i = 0; i <= listaT.size() - 1; i++) {
            toChar = (char) + listaT.get(i);
            System.out.print(toChar);
        }
        System.out.println();
    }

}
