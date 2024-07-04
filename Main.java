


import control.TeacherControl;

public class Main {

    public static void main(String[] args) {
        TeacherControl teacherController = new TeacherControl();
        teacherController.create("Сидоров", "Сергей", "Сергеевич");
        teacherController.create("Иванов", "Иван", "Петрович");
        teacherController.create("Кузнецов", "Петр", "Иванович");
        teacherController.create("Абрикосов", "Георгий", "Алексеевич");
        teacherController.create("Власов", "Василий", "Васильевич");
        teacherController.printTeachers();
        System.out.println("Редактируем учителя с TeacherID = 3");
        teacherController.editTeacher(4, "Иванов", "Георгий", "Алексеевич");
        teacherController.printTeachers();

    }
}
