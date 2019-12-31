package Entity;
public class Pesan
{
    private int id_pesan;
    private String isi_pesan, isi_balasan, status;
    private int id_akun;

    public Pesan(){}
    public Pesan(int id_pesan, String isi_pesan, String isi_balasan, String status, int id_akun) {
        this.id_pesan = id_pesan;
        this.isi_pesan = isi_pesan;
        this.isi_balasan = isi_balasan;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_pesan() {
        return id_pesan;
    }

    public void setId_pesan(int id_pesan) {
        this.id_pesan = id_pesan;
    }

    public String getIsi_pesan() {
        return isi_pesan;
    }

    public void setIsi_pesan(String isi_pesan) {
        this.isi_pesan = isi_pesan;
    }

    public String getIsi_balasan() {
        return isi_balasan;
    }

    public void setIsi_balasan(String isi_balasan) {
        this.isi_balasan = isi_balasan;
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