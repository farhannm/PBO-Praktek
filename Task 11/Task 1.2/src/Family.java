import java.util.ArrayList;
import java.util.List;

class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        this.uncles = new ArrayList<>();
        this.nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return false; // Niece sudah ada
            }
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public boolean addUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return false; // Uncle sudah ada
            }
        }
        uncles.add(new Uncle(name));
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        nieces.sort((n1, n2) -> n1.getBirthday().compareTo(n2.getBirthday()));
        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        uncles.sort((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        for (Uncle uncle : uncles) {
            System.out.println(uncle);
        }
    }
}


