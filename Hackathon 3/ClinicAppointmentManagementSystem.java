import java.util.Scanner;

class Clinic {
    String patientName;
    String patientId;
    String doctorName;
    String appointmentType;
    double fee;

    Clinic() {
        patientName = "Priya Sharma";
        patientId = "P101";
        doctorName = "Dr. Kumar";
        appointmentType = "General";
        fee = 500;
    }

    Clinic(String p, String id, String d, String type, double f) {
        patientName = p;
        patientId = id;
        doctorName = d;
        appointmentType = type;
        fee = f;
    }

    void bookAppointment(String p, String id, String d, String type, double f) {
        patientName = p;
        patientId = id;
        doctorName = d;
        appointmentType = type;
        fee = f;
    }

    void bookAppointment(String p, String id, double f) {
        patientName = p;
        patientId = id;
        fee = f;
    }

    void display() {
        System.out.println("Patient Name: " + patientName.toUpperCase());
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor Name: " + doctorName.toUpperCase());
        System.out.println("Appointment Type: " + appointmentType.toUpperCase());

        if (fee > 0) {
            System.out.println("Consultation Fee: Rs. " + String.format("%.2f", fee));
            System.out.println("Appointment Status: Confirmed");
        } else {
            System.out.println("Consultation Fee: Rs. 0.00");
            System.out.println("Appointment Status: Not Confirmed");
        }
    }

    boolean checkPatient(String p1, String p2) {
        return p1.equalsIgnoreCase(p2);
    }
}

public class ClinicAppointmentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== CLINIC APPOINTMENT SYSTEM ==========");

        Clinic c1 = new Clinic();
        c1.display();

        System.out.println();

        Clinic c2 = new Clinic();

        System.out.println("Enter Patient Name:");
        String name = sc.nextLine();

        System.out.println("Enter Patient ID:");
        String id = sc.nextLine();

        System.out.println("Enter Doctor Name:");
        String doctor = sc.nextLine();

        System.out.println("Enter Appointment Type:");
        String type = sc.nextLine();

        System.out.println("Enter Consultation Fee:");
        double fee = sc.nextDouble();

        c2.bookAppointment(name, id, doctor, type, fee);

        System.out.println();
        c2.display();

        System.out.println();
        System.out.println("---------- APPOINTMENT SUMMARY ----------");

        int count = 0;
        double total = 0;

        if (c1.fee > 0) {
            count++;
            total = total + c1.fee;
        }

        if (c2.fee > 0) {
            count++;
            total = total + c2.fee;
        }

        System.out.println("Total Appointments : " + count);
        System.out.println("Total Consultation : Rs. " + String.format("%.2f", total));

        if (c1.checkPatient(c1.patientName, c2.patientName)) {
            System.out.println("Patient Verification: Names Match");
        } else {
            System.out.println("Patient Verification: Names Do Not Match");
        }

        System.out.println("==============================================");

        sc.close();
    }
}
