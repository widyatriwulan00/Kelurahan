package Entity;
public class AkunPNS
{
    private int id_akunpns;
    private String nip, password, nama, level;

    public AkunPNS(){}
    public AkunPNS(int id_akunpns, String nip, String password, String nama, String level) {
        this.id_akunpns = id_akunpns;
        this.nip = nip;
        this.password = password;
        this.nama = nama;
        this.level = level;
    }

    public int getId_akunpns() {
        return id_akunpns;
    }

    public void setId_akunpns(int id_akunpns) {
        this.id_akunpns = id_akunpns;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
}