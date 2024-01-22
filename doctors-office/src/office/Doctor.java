package office;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Doctor extends MedicalWorker {

    private final List<MedicalProcedure> procedures = new ArrayList<>();

    public Doctor(String name) {
        super(name);
        procedures.add(new ProcedureA());
        procedures.add(new ProcedureB());
    }

    @Override
    public int calculateSalary() {
        return 1000;
    }

    public void handlePatient(Patient patient) {
        if (null == patient) {
            return;
        }
        System.out.println("Doktor " + getName() + " leczy pacjenta " + patient.getName());
        if (patient.isIll()) {
            MedicalProcedure medicalProcedure = procedures.get(new Random().nextInt() % 2 == 1 ? 0 : 1);
            boolean result = medicalProcedure.doProcedureOnPatient(patient);
            patient.setIll(!result);
        }
    }
}
