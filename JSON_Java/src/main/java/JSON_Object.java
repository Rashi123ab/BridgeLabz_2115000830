import org.json.JSONArray;
import org.json.JSONObject;
public class JSON_Object{
    public static void main(String[] args) {
        JSONObject user = new JSONObject();
        user.put("name", "Rashi");
        user.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("Spring");
        subjects.put("SQL");

        user.put("Subjects", subjects);
        System.out.println(user.toString());
    }
}
