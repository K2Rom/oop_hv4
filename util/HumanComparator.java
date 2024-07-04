package util;

import java.util.Comparator;
import model.Human;

public class HumanComparator<T extends Human> implements Comparator<T> {

    @Override
    public int compare(T arg0, T arg1) {
        String name0 = arg0.getLastName() + arg0.getFirstName() + arg0.getMiddleName();
        String name1 = arg1.getLastName() + arg1.getFirstName() + arg1.getMiddleName();
        return name0.compareToIgnoreCase(name1);
    }

}
