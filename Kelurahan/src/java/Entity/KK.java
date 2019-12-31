package Entity;
public class KK
{
    private String no_kk;
    private int id_rt, id_rw;
    private String alamat;

    public KK(){}
    public KK(String no_kk, int id_rt, int id_rw, String alamat) {
        this.no_kk = no_kk;
        this.id_rt = id_rt;
        this.id_rw = id_rw;
        this.alamat = alamat;
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }

    public int getId_rt() {
        return id_rt;
    }

    public void setId_rt(int id_rt) {
        this.id_rt = id_rt;
    }

    public int getId_rw() {
        return id_rw;
    }

    public void setId_rw(int id_rw) {
        this.id_rw = id_rw;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}