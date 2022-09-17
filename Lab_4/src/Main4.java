import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        Students[] Array = {
                new Students(5,"Alex", "Goldman", "Ik-05", 85),
                new Students(7,"Jenna","Ortega","Ik-01",79),
                new Students(3,"Emma","Myers","Ik-02",95),
                new Students(1,"Hunter","Doohan","Ik-04",91),
                new Students(5,"Percy","Hynes White","Ik-01",65),
                new Students(10,"Joy","Sunday ","Ik-04",74),
                new Students(8,"Riki","Lindhome","Ik-04",98),
                new Students(4,"Jamie","McShane","Ik-03",66),
        };

        Arrays.sort(Array, new SortById());
        System.out.println("Sorting by id:");
        for (Students students : Array) {
            System.out.println(students.name + " student id: " + students.id);
        }
        System.out.println();

        Arrays.sort(Array, new SortByGpa());
        System.out.println("Sorting by GPA:");
        for (Students students : Array) {
            System.out.println(students.name + " student GPA " + students.gpa);
        }

    }
}
