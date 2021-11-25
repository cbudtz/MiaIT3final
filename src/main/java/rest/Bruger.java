package rest;

public class Bruger {
    private String brugernavn;
    private String password;

    public String getBrugernavn() {
        return brugernavn;
    }

    public String setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
    }
}