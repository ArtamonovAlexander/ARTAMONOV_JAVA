import java.util.List;
import java.util.Map;

public class SearchAndOutputImpl {

    protected void FindAndDisplayPhoneNumber(String surnamеAndInitials, Map<String, List<String>> map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(surnamеAndInitials)) {
                if (!entry.getValue().equals("")) {
                    String numberWithStringsRaw = String.valueOf(entry.getValue());
                    String stringNumbers = numberWithStringsRaw.substring(1, numberWithStringsRaw.length() - 1);
                    String[] numberList = stringNumbers.split("\\+");

                    for (int i = 1; i < numberList.length; i++) {
                        System.out.println(i + ". +" + numberList[i]);
                    }
                    break;
                }
                else System.err.println("Такого ФИО в БД нет.");
            }
            else {
                System.err.println("Такого ФИО в БД нет.");
                break;
            }
        }
    }
}
