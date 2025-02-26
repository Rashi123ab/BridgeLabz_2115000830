import org.json.JSONObject;
import org.json.XML;
public class JSONToXML{
    public static void main(String[] args) {
         String jsonString = """
            {
                "student": {
                    "name": "Rashi",
                    "age": 22,
                    "email": "rashi@gmail.com",
                     "phone no.": 9696078312
                }
            }
        """;
        JSONObject Object = new JSONObject(jsonString);
        String s = XML.toString(Object, "root");
        System.out.println("Converted XML:");
        System.out.println(s);
    }
}
