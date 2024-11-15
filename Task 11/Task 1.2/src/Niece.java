import java.util.HashMap;
import java.util.Map;

class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> receivedPresents;

    protected Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public boolean hasPresentFromUncle(Uncle uncle) {
        return receivedPresents.containsKey(uncle);
    }

    public void receivePresent(Uncle uncle, String description) {
        receivedPresents.put(uncle, description);
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Map.Entry<Uncle, String> entry : receivedPresents.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return name + " (Birthday: " + day + "/" + month + ")";
    }
}
