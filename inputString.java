package pl.piechowicz.adam;

import java.util.Scanner;

public class inputString extends revertedString {
    private String siur = "xD";

    @Override
    public void revertStringDesc(String name) {
        super.revertStringDesc(name);
    }

    public static void main(String[] args) {
        revertedString rS = new revertedString();
        inputString iS = new inputString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny ciąg znaków: ");
        String name = scanner.nextLine();
        rS.revertString(name);
        iS.revertStringDesc(name);
        rS.revertStringAsc(name);

    }

}
