package Entity;
public class RW
{
    private int id_rw;
    private String nama_rw, no_telp;
    
    public RW(){}

    public RW(int id_rw, String nama_rw, String no_telp) {
        this.id_rw = id_rw;
        this.nama_rw = nama_rw;
        this.no_telp = no_telp;
    }

    public int getId_rw() {
        return id_rw;
    }

    public void setId_rw(int id_rw) {
        this.id_rw = id_rw;
    }

    public String getNama_rw() {
        return nama_rw;
    }

    public void setNama_rw(String nama_rw) {
        this.nama_rw = nama_rw;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
}