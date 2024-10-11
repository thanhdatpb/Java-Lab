package P0055;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoctorHash doctorHash = new DoctorHash();
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\nDoctor Management Program");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter Code: ");
                        String code = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Specialization: ");
                        String specialization = scanner.nextLine();
                        System.out.print("Enter Availability: ");
                        int availability = scanner.nextInt();
                        scanner.nextLine(); // Clear buffer

                        Doctor newDoctor = new Doctor(code, name, specialization, availability);
                        doctorHash.addDoctor(newDoctor);
                        System.out.println("Doctor added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Doctor Code to update: ");
                        String updateCode = scanner.nextLine();
                        Doctor existingDoctor = new Doctor(updateCode, "", "", -1);

                        System.out.print("Enter new Name (leave blank if no change): ");
                        String newName = scanner.nextLine();
                        if (!newName.isEmpty()) existingDoctor.setName(newName);

                        System.out.print("Enter new Specialization (leave blank if no change): ");
                        String newSpecialization = scanner.nextLine();
                        if (!newSpecialization.isEmpty()) existingDoctor.setSpecialization(newSpecialization);

                        System.out.print("Enter new Availability (leave -1 if no change): ");
                        int newAvailability = scanner.nextInt();
                        scanner.nextLine(); // Clear buffer
                        if (newAvailability >= 0) existingDoctor.setAvailability(newAvailability);

                        doctorHash.updateDoctor(existingDoctor);
                        System.out.println("Doctor updated successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Doctor Code to delete: ");
                        String deleteCode = scanner.nextLine();
                        doctorHash.deleteDoctor(deleteCode);
                        System.out.println("Doctor deleted successfully!");
                        break;

                    case 4:
                        System.out.print("Enter search term: ");
                        String searchTerm = scanner.nextLine();
                        HashMap<String, Doctor> searchResults = doctorHash.searchDoctor(searchTerm);
                        if (searchResults.isEmpty()) {
                            System.out.println("No doctors found.");
                        } else {
                            for (Doctor doctor : searchResults.values()) {
                                System.out.println(doctor);
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Exiting the program...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
