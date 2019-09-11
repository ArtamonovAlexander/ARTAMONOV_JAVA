package home;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Before
    public void setUp() throws Exception {
        new People("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600");
        new People("Петров П.П.", "+8 800 2000 700");
        new People("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000");
        new People("Воткин Л.Л.", null);
    }

    @Test
    public void searchToFindIvanov() {
        String actual = "1. +8 800 2000 500" + "\r\n" + "2. +8 800 200 600";
        String expected = People.search("иванов и.и.");

        assertEquals(expected , actual);
    }

    @Test
    public void searchToFindPetrov() {
        String actual = "1. +8 800 2000 700";
        String expected = People.search("ПЕТРОВ П.П.");

        assertEquals(expected , actual);
    }

    @Test
    public void searchToFindSidorov() {
        String actual = "1. +8 800 2000 800" + "\r\n" + "2. +8 800 2000 900"  + "\r\n" +  "3. +8 800 2000 000";
        String expected = People.search("СиДороВ С.С. ");

        assertEquals(expected , actual);
    }

    @Test
    public void searchToFindVotkin() {
        String actual = "Такого ФИО в БД нет";
        String expected = People.search("Воткин Л.Л.");

        assertEquals(expected , actual);
    }
    @Test
    public void searchForMissingInDatabase() {
        String actual = "Такого ФИО в БД нет";
        String expected = People.search("Ложкарёв Т.П.");

        assertEquals(expected , actual);
    }
    @Test
    public void searchEmpty() {
        String actual = "Такого ФИО в БД нет";
        String expected = People.search("");

        assertEquals(expected , actual);
    }
}
