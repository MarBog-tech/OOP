import java.util.Comparator;
public class SortById implements Comparator<Students>{
    public int compare(Students obj1, Students obj2){
        return obj1.id - obj2.id;
    }
}
