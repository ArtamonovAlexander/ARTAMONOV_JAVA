package home;

import java.io.IOException;
import java.util.Scanner;


class HandBook {

    public static void main(String[] args) throws IOException {

        new People("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        new People("Петров П.П.", "+8 800 2000 700");
        new People("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000");
        new People("Воткин Л.Л.", null);

        String searchResult = People.search(new Scanner(System.in).nextLine());

        System.out.println(searchResult);
    }
}

