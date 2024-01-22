package office;

public class Main {

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Jan Nowak");
        Nurse nurse1 = new Nurse("Janina Nowak");

        DoctorOffice doctorOffice = new DoctorOffice(doctor1, nurse1);

        Patient patientA = new Patient("PatientA", true);
        Patient patientB = new Patient("PatientB", true);

        patientA.reportHealthStatus();
        patientB.reportHealthStatus();

        nurse1.registerPatient(patientA, doctorOffice);
        nurse1.registerPatient(patientB, doctorOffice);
        nurse1.registerPatient(patientA, doctorOffice);

        doctor1.handlePatient(doctorOffice.getNextPatient());
        doctor1.handlePatient(doctorOffice.getNextPatient());
        doctor1.handlePatient(doctorOffice.getNextPatient());
        doctor1.handlePatient(doctorOffice.getNextPatient());

        patientA.reportHealthStatus();
        patientB.reportHealthStatus();

        System.out.println("Koszt dla NFZ " + doctorOffice.calculateSummaryWorkCosts());
    }
}
