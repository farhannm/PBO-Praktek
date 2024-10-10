import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        String JSON_FILE = "src/data.json";

        FileReader reader = new FileReader(JSON_FILE);
        Delivery[] deliveries = gson.fromJson(reader, Delivery[].class);
        
        for (Delivery delivery : deliveries) {
            System.out.println("Product Name: " + delivery.productName);
            System.out.println("Price Item: " + delivery.priceItem);
            System.out.println("Quantity: " + delivery.quantity);
            System.out.println("Weight: " + delivery.weight);
            System.out.println("Service: " + delivery.servicePackage.service);
            System.out.println("Service Value: " + delivery.servicePackage.value);
            System.out.println("Origin: " + delivery.city.origin);
            System.out.println("Destination: " + delivery.city.destination);
            System.out.println("Status Code: " + delivery.status.code);
            System.out.println("Status Description: " + delivery.status.description);
            System.out.println();
        }
    }
}
