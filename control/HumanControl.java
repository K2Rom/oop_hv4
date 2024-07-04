package control;

import model.Human;

public interface HumanControl<T extends Human> {

    void create(String lastName, String firstName, String middleName);
}
