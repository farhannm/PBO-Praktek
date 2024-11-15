import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n[ TASK 1.2 ] OOP - PR");
            System.out.println("1. Add Niece");
            System.out.println("2. Add Uncle");
            System.out.println("3. List Nieces");
            System.out.println("4. List Uncles");
            System.out.println("5. Add Present from Uncle to Niece");
            System.out.println("6. List Presents from Uncle");
            System.out.println("7. List Presents for Niece");
            System.out.println("8. Clear Presents for a Niece (After Birthday)");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1": // tambah Niece
                    System.out.print("Enter niece name: ");
                    String nieceName = scanner.nextLine();
                    System.out.print("Enter niece's birth day: ");
                    int day = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter niece birth month: ");
                    int month = Integer.parseInt(scanner.nextLine());

                    if (family.addNiece(nieceName, day, month)) {
                        System.out.println("Niece added successfully.");
                    } else {
                        System.out.println("Niece already exists.");
                    }
                    break;

                case "2": // Add Uncle
                    System.out.print("Enter uncle's name: ");
                    String uncleName = scanner.nextLine();
                    if (family.addUncle(uncleName)) {
                        System.out.println("Uncle added successfully.");
                    } else {
                        System.out.println("Uncle already exists.");
                    }
                    break;

                case "3": // List Nieces
                    family.listNieces();
                    break;

                case "4": // List Uncles
                    family.listUncles();
                    break;

                case "5": // Add Present
                    System.out.print("Enter uncle's name: ");
                    uncleName = scanner.nextLine();
                    Uncle uncle = family.findUncle(uncleName);
                    if (uncle == null) {
                        System.out.println("[ ! ] Uncle not found.");
                        break;
                    }
                    System.out.print("Enter niece's name: ");
                    nieceName = scanner.nextLine();
                    Niece niece = family.findNiece(nieceName);
                    if (niece == null) {
                        System.out.println("[ ! ] Niece not found.");
                        break;
                    }
                    System.out.print("Enter present description: ");
                    String presentDescription = scanner.nextLine();
                    if (uncle.addPresent(niece, presentDescription)) {
                        System.out.println("[ INFO ] Present added successfully.");
                    } else {
                        System.out.println("[ ! ] Failed to add present. Duplicate present found.");
                    }
                    break;

                case "6": // List Presents dari Uncle
                    System.out.print("Enter uncle's name: ");
                    uncleName = scanner.nextLine();
                    uncle = family.findUncle(uncleName);
                    if (uncle != null) {
                        uncle.listPresents();
                    } else {
                        System.out.println("[ ! ] Uncle not found.");
                    }
                    break;

                case "7": // List Presents untuk Niece
                    System.out.print("Enter niece's name: ");
                    nieceName = scanner.nextLine();
                    niece = family.findNiece(nieceName);
                    if (niece != null) {
                        niece.listPresents();
                    } else {
                        System.out.println("[ ! ] Niece not found.");
                    }
                    break;

                case "8": 
                    System.out.print("Enter niece's name: ");
                    nieceName = scanner.nextLine();
                    niece = family.findNiece(nieceName);
                    if (niece != null) {
                        int removedCount = niece.clearPresents();
                        System.out.println("Cleared " + removedCount + " presents for " + nieceName);
                    } else {
                        System.out.println("[ ! ] Niece not found.");
                    }
                    break;

                case "9": 
                    System.out.println("[ EXIT] Exiting the program...");
                    break;

                default:
                    System.out.println("[ WARNING ] Invalid choice. Please select a valid option.");
            }
        } while (!choice.equals("9"));

        scanner.close();
    }
}
