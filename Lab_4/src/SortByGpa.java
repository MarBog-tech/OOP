import java.util.Comparator;

public class SortByGpa implements Comparator<Students> {
    public int compare(Students obj1, Students obj2){
        return obj2.gpa - obj1.gpa;
    }
}
