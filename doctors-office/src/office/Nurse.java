package office;

public class Nurse extends MedicalWorker {

    public Nurse(String name) {
        super(name);
    }

    @Override
    public int calculateSalary() {
        return 1500;
    }

    public void registerPatient(Patient patient, DoctorOffice doctorOffice) {
        System.out.println("Pielegniarka " + getName() + " rejestruje pacjenta " + patient.getName());
        doctorOffice.addPatient(patient);
    }
}
