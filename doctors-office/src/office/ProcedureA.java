package office;

public class ProcedureA implements MedicalProcedure{

    @Override
    public boolean doProcedureOnPatient(Patient patient) {
        System.out.println("Procedura A wykonana na " + patient.getName());
        return true;
    }
}
