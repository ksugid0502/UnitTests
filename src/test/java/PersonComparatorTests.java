import org.example.Person;
import org.example.PersonComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonComparatorTests {

    @Test
    public void compare_shouldCompareBySurnameWords_ifWordsCountBelowMax() {
        var personComparator = new PersonComparator(4);
        var person1 = new Person("Ronald", "Harris", 20);
        var person2 = new Person("Thomas", "Smith Ward", 20);

        assertEquals(-1, personComparator.compare(person1, person2));
        assertEquals(1, personComparator.compare(person2, person1));
    }

    @Test
    public void compare_shouldCompareByAge_ifWordsCountEquals() {
        var personComparator = new PersonComparator(4);
        var person1 = new Person("Ronald", "Harris", 20);
        var person2 = new Person("Thomas", "Smith", 21);

        assertEquals(-1, personComparator.compare(person1, person2));
        assertEquals(1, personComparator.compare(person2, person1));
    }

    @Test
    public void compare_shouldCompareByAge_ifWordsCountAboveMax() {
        var personComparator = new PersonComparator(1);
        var person1 = new Person("Ronald", "Harris", 20);
        var person2 = new Person("Thomas", "Smith Ward", 21);

        assertEquals(-1, personComparator.compare(person1, person2));
        assertEquals(1, personComparator.compare(person2, person1));
    }
}
