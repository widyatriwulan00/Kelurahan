package Entity;
public class RT
{
    private int id_rt;
    private String nama_rt, no_telp;
    
    public RT(){}
    public RT(int id_rt, String nama_rt, String no_telp) {
        this.id_rt = id_rt;
        this.nama_rt = nama_rt;
        this.no_telp = no_telp;
    }

    public int getId_rt() {
        return id_rt;
    }

    public void setId_rt(int id_rt) {
        this.id_rt = id_rt;
    }

    public String getNama_rt() {
        return nama_rt;
    }

    public void setNama_rt(String nama_rt) {
        this.nama_rt = nama_rt;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
}