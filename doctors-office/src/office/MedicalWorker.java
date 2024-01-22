package office;

public abstract class MedicalWorker {

    private final String name;

    public MedicalWorker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateSalary();
}
