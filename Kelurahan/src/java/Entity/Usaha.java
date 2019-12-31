package Entity;
public class Usaha
{
    private int id_usaha;
    private String nik, nama_usaha, status;
    private int id_akun;
    
    public Usaha(){}

    public Usaha(int id_usaha, String nik, String nama_usaha, String status, int id_akun) {
        this.id_usaha = id_usaha;
        this.nik = nik;
        this.nama_usaha = nama_usaha;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_usaha() {
        return id_usaha;
    }

    public void setId_usaha(int id_usaha) {
        this.id_usaha = id_usaha;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama_usaha() {
        return nama_usaha;
    }

    public void setNama_usaha(String nama_usaha) {
        this.nama_usaha = nama_usaha;
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