import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {


    private Map<String,Student> map = new HashMap<>();
    public void registerStudent(String id, Student student){
        map.put(id,student);
    }
    public Student get(String id){
        return map.get(id);
    }
}
