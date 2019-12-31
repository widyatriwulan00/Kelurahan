package Entity;
public class Domisili
{
    private int id_domisili;
    private String nik, status;
    private int id_akun;

    public Domisili() {}
    public Domisili(int id_domisili, String nik, String status, int id_akun) {
        this.id_domisili = id_domisili;
        this.nik = nik;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_domisili() {
        return id_domisili;
    }

    public void setId_domisili(int id_domisili) {
        this.id_domisili = id_domisili;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }
    
    
}