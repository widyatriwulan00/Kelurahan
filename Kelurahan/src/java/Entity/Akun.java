package Entity;
public class Akun
{
    private int id_akun;
    private String no_kk, password, nama, no_telp, foto;

    public Akun(){}
    public Akun(int id_akun, String no_kk, String password, String nama, String no_telp, String foto) {
        this.id_akun = id_akun;
        this.no_kk = no_kk;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.foto = foto;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}