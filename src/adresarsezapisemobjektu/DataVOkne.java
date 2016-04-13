package adresarsezapisemobjektu;

import java.io.Serializable;

public class DataVOkne implements Serializable {
    private String jmeno;
    private String prijmeni;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
}
