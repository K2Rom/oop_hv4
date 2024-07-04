package service;

import java.util.List;
import model.Human;

public interface HumanService<T extends Human> {

    public List<T> getAll();

    public void initData(List<T> list);

    public void create(String lastName, String firstName, String middleName);
}
