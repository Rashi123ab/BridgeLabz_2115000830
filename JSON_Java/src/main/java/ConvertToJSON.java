import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
class Car {
    public String name;
    public int year;
    public String colour;
    public Car(String name, int year, String colour) {
        this.name = name;
        this.year = year;
        this.colour = colour;
    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }
}
public class ConvertToJSON{
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Tesla", 5, "red");
            // Convert Java Object to JSON String
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

