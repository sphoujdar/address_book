package address_book;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
    public int compare(Person o1, String o2) {
        return 0;
    }
}

