import java.util.HashMap;
import java.util.Map;

class Uncle {
    private String name;
    private Map<Niece, String> presents;

    protected Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsValue(description)) {
            return false; // Duplikasi description untuk uncle
        }
        if (recipient.hasPresentFromUncle(this)) {
            return false; // Duplikasi description niece dari uncle lain
        }
        presents.put(recipient, description);
        recipient.receivePresent(this, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println(niece.getName() + " - " + presents.get(niece));
        }
    }
}