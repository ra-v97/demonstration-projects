package office;

public class Patient {

    private final String name;

    private boolean isIll;

    public Patient(String name, boolean isIll) {
        this.name = name;
        this.isIll = isIll;
    }

    public void reportHealthStatus() {
        System.out.println("Jako pacjent " + name + " jestem " + (isIll ? "chory" : "zdrowy"));
    }

    public String getName() {
        return name;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }
}
