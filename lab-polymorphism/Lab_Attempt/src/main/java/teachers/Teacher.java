package teachers;

import schools.School;
import weekdays.Day;

public abstract class Teacher {
    private String name;
    private int teacherId;
    private int age;
    private int salary;
    private String mainSubject;
    protected School school;


    public Teacher(String name, int age, int teacherId, int salary, String mainSubject, School employer) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
        this.salary = salary;
        this.mainSubject = mainSubject;
        this.setSchool(employer);
    }

//    Day day = Day.MONDAY;
//
//    switch(day){
//        case MONDAY:
//            System.out.println("Monday, better get back to work!");
//        case TUESDAY:
//        case WEDNESDAY:
//        case THURSDAY:
//        case FRIDAY:
//            System.out.println("It's a weekday!");
//            break;
//        case SATURDAY:
//        case SUNDAY:
//            System.out.println("It's the weekend!!!");
//            break;
//        default:
//            System.out.println("None of that is true");
//    }


    public void setSchool(School employer) {
        this.school = employer;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getAge() {
        return age;
    }

    public String getMainSubject() {
        return mainSubject;
    }
}
