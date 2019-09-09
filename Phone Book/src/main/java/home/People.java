package home;

import java.util.*;
import java.util.stream.Collectors;

class People{

    private final static Map<String, People> PEOPLES_MAP = new TreeMap<>();

    private String searchKey;
    private String surnameInitials;
    private List<String> phones;

    public People(String surnameInitials, String... phones) {
        if (surnameInitials == null) return;
        this.surnameInitials = surnameInitials.trim();
        this.searchKey = this.surnameInitials.toUpperCase();
        if (phones!=null) this.phones = Arrays.asList(phones);
        PEOPLES_MAP.put(searchKey, this);
    }

    // Метод поиска человека по ФИО.
    public static String search(String surnameInitials) {
        final People searchResult = PEOPLES_MAP.get(surnameInitials.toUpperCase().trim());
        return searchResult==null || searchResult.phones == null ? "Такого ФИО в БД нет": searchResult.toString(); // если ФИО или телефон null, выдаем сообщение, иначе номера.
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.searchKey);
    }

    @Override //Переопределение метода equals. Сравниваем по ФИО
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(this.searchKey, ((People) obj).searchKey);
    }

    @Override // Переопределенный метод toString возвращает номера соответствующие ФИО
    public String toString() {
        return phones.stream().collect(Collectors.joining("\r\n"));
    }

}
