package rest;

public class Patient {
    public Patient() {
    }

    public String name;
    public String Cpr;

    public String getName() {
        return name;
    }
    public String getCpr() {
        return Cpr;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCpr(String Cpr) {
        this.Cpr = Cpr;
    }
}
