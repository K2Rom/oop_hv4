package model;

public class Teacher extends Human {

    public Teacher(Integer teacherId, String lastName, String firstName, String middleName) {
        super(teacherId, lastName, firstName, middleName);
    }

    public Integer getTeacherId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{"
                + "teacherId=" + id
                + " Фамилия '" + super.getLastName() + '\''
                + ", Имя '" + super.getFirstName() + '\''
                + ", Отчество '" + super.getMiddleName() + '\''
                + '}';
    }
}
