package general;

import entity.Person;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneralLoggerTest {

    @Test
    public void demonstratePlainLogger() {
        GeneralLogger logger = new GeneralLogger();
        logger.demonstratePlainLogger();
    }

    @Test
    public void demonstrateParameterizedLogging() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Omkar", "Joshi", Date.valueOf("1985-01-01")));
        persons.add(new Person("Sneha", "Joshi", Date.valueOf("1987-10-23")));

        GeneralLogger logger = new GeneralLogger();
        assertTrue(logger.demonstrateParameterizedLogging("This is a list of {} {}", "Persons", persons));
    }
}