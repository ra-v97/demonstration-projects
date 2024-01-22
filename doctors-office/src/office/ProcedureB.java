package office;

public class ProcedureB implements MedicalProcedure{

    @Override
    public boolean doProcedureOnPatient(Patient patient) {
        System.out.println("Procedura B wykonana na " + patient.getName());
        return false;
    }
}
