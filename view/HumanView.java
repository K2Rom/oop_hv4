package view;

import java.util.List;
import model.Human;

public interface HumanView<T extends Human> {

    public void sendOnConsole(List<T> list);
}
