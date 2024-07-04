package view;

import java.util.List;
import model.Teacher;

public class TeacherView implements HumanView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
