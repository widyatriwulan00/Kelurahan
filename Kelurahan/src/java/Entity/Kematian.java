package Entity;
public class Kematian
{
    private int id_kematian;
    private String nik, tanggal, pukul, sebab_kematian,
            tempat_kematian, yang_menerangkan, no_kk,
            nik_pelapor, nik_saksi_satu, nik_saksi_dua,
            status;
    private int id_akun;
    public Kematian(){}
    public Kematian(int id_kematian, String nik, String tanggal, String pukul, String sebab_kematian, String tempat_kematian, String yang_menerangkan, String no_kk, String nik_pelapor, String nik_saksi_satu, String nik_saksi_dua, String status, int id_akun) {
        this.id_kematian = id_kematian;
        this.nik = nik;
        this.tanggal = tanggal;
        this.pukul = pukul;
        this.sebab_kematian = sebab_kematian;
        this.tempat_kematian = tempat_kematian;
        this.yang_menerangkan = yang_menerangkan;
        this.no_kk = no_kk;
        this.nik_pelapor = nik_pelapor;
        this.nik_saksi_satu = nik_saksi_satu;
        this.nik_saksi_dua = nik_saksi_dua;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_kematian() {
        return id_kematian;
    }

    public void setId_kematian(int id_kematian) {
        this.id_kematian = id_kematian;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPukul() {
        return pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public String getSebab_kematian() {
        return sebab_kematian;
    }

    public void setSebab_kematian(String sebab_kematian) {
        this.sebab_kematian = sebab_kematian;
    }

    public String getTempat_kematian() {
        return tempat_kematian;
    }

    public void setTempat_kematian(String tempat_kematian) {
        this.tempat_kematian = tempat_kematian;
    }

    public String getYang_menerangkan() {
        return yang_menerangkan;
    }

    public void setYang_menerangkan(String yang_menerangkan) {
        this.yang_menerangkan = yang_menerangkan;
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }

    public String getNik_pelapor() {
        return nik_pelapor;
    }

    public void setNik_pelapor(String nik_pelapor) {
        this.nik_pelapor = nik_pelapor;
    }

    public String getNik_saksi_satu() {
        return nik_saksi_satu;
    }

    public void setNik_saksi_satu(String nik_saksi_satu) {
        this.nik_saksi_satu = nik_saksi_satu;
    }

    public String getNik_saksi_dua() {
        return nik_saksi_dua;
    }

    public void setNik_saksi_dua(String nik_saksi_dua) {
        this.nik_saksi_dua = nik_saksi_dua;
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