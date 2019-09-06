import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HandBook {

    public static void main(String[] args) throws IOException {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500 +8 800 200 600")));
        map.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        map.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800 +8 800 2000 900 +8 800 2000 000")));
        map.put("Лидоров С.С.", new ArrayList<String>(Arrays.asList("")));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String surnamеAndInitials = reader.readLine();

         SearchAndOutputImpl searchAndOutput = new SearchAndOutputImpl();
         searchAndOutput.FindAndDisplayPhoneNumber(surnamеAndInitials, map);

//        for (Map.Entry entry : map.entrySet()) {
//            if (entry.getKey().equals(surnamеAndInitials)) {
//                if (!entry.getValue().equals("")) {
//                    String numberWithStringsRaw = String.valueOf(entry.getValue());
//                    String stringNumbers = numberWithStringsRaw.substring(1, numberWithStringsRaw.length() - 1);
//                    String[] numberList = stringNumbers.split("\\+");
//
//                    for (int i = 1; i < numberList.length; i++) {
//                        System.out.println(i + ". +" + numberList[i]);
//                    }
//                }
//                else System.err.println("Такого ФИО в БД нет.");
//            }
//            else {
//                System.err.println("Такого ФИО в БД нет.");
//                break;
//            }
//        }
    }
}
