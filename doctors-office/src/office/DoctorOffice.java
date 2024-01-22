package office;

import java.util.ArrayList;
import java.util.List;

public class DoctorOffice {

    private final List<Patient> patientsQueue = new ArrayList<>();

    public final List<MedicalWorker> medicalWorkers = new ArrayList<>();

    public DoctorOffice(Doctor doctor, Nurse nurse) {
        medicalWorkers.add(doctor);
        medicalWorkers.add(nurse);
    }

    public void addPatient(Patient patient) {
        System.out.println("Dodano pacjenta " + patient.getName() + " do kolejki");
        patientsQueue.add(patient);
    }

    public Patient getNextPatient() {
        if (patientsQueue.size() > 0) {
            return patientsQueue.remove(0);
        }
        return null;
    }

    public int calculateSummaryWorkCosts() {
        int workersSalary = 0;
        for (MedicalWorker worker : medicalWorkers) {
            workersSalary += worker.calculateSalary();
        }
        return workersSalary;
    }
}
