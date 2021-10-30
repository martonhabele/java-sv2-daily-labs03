package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(150);
        students.addHeight(170);
        students.addHeight(165);

        System.out.print(students.isHeightIncreased());
    }
}