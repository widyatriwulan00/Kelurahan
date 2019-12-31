package Entity;
public class Penghasilan
{
    private int id_penghasilan;
    private String nik, nama_usaha;
    private int penghasilan;
    private String status;
    private int id_akun;
    
    public Penghasilan(){}

    public Penghasilan(int id_penghasilan, String nik, String nama_usaha, int penghasilan, String status, int id_akun) {
        this.id_penghasilan = id_penghasilan;
        this.nik = nik;
        this.nama_usaha = nama_usaha;
        this.penghasilan = penghasilan;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_penghasilan() {
        return id_penghasilan;
    }

    public void setId_penghasilan(int id_penghasilan) {
        this.id_penghasilan = id_penghasilan;
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

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
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