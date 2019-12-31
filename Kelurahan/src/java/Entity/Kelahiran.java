package Entity;
public class Kelahiran
{
    private int id_kelahiran;
    private String nama, jenis_kelamin, tempat_dilahirkan,
            tempat_kelahiran, tanggal, pukul, jenis_kelahiran;
    private int kelahiran_ke;
    private String penolong_kelahiran;
    private double berat_bayi;
    private int panjang_bayi;
    private String no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua,
            status;
    private int id_akun;

    public Kelahiran(){}
    public Kelahiran(int id_kelahiran, String nama, String jenis_kelamin, String tempat_dilahirkan, String tempat_kelahiran, String tanggal, String pukul, String jenis_kelahiran, int kelahiran_ke, String penolong_kelahiran, double berat_bayi, int panjang_bayi, String no_kk, String nik_pelapor, String nik_saksi_satu, String nik_saksi_dua, String status, int id_akun) {
        this.id_kelahiran = id_kelahiran;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tempat_dilahirkan = tempat_dilahirkan;
        this.tempat_kelahiran = tempat_kelahiran;
        this.tanggal = tanggal;
        this.pukul = pukul;
        this.jenis_kelahiran = jenis_kelahiran;
        this.kelahiran_ke = kelahiran_ke;
        this.penolong_kelahiran = penolong_kelahiran;
        this.berat_bayi = berat_bayi;
        this.panjang_bayi = panjang_bayi;
        this.no_kk = no_kk;
        this.nik_pelapor = nik_pelapor;
        this.nik_saksi_satu = nik_saksi_satu;
        this.nik_saksi_dua = nik_saksi_dua;
        this.status = status;
        this.id_akun = id_akun;
    }

    public int getId_kelahiran() {
        return id_kelahiran;
    }

    public void setId_kelahiran(int id_kelahiran) {
        this.id_kelahiran = id_kelahiran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTempat_dilahirkan() {
        return tempat_dilahirkan;
    }

    public void setTempat_dilahirkan(String tempat_dilahirkan) {
        this.tempat_dilahirkan = tempat_dilahirkan;
    }

    public String getTempat_kelahiran() {
        return tempat_kelahiran;
    }

    public void setTempat_kelahiran(String tempat_kelahiran) {
        this.tempat_kelahiran = tempat_kelahiran;
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

    public String getJenis_kelahiran() {
        return jenis_kelahiran;
    }

    public void setJenis_kelahiran(String jenis_kelahiran) {
        this.jenis_kelahiran = jenis_kelahiran;
    }

    public int getKelahiran_ke() {
        return kelahiran_ke;
    }

    public void setKelahiran_ke(int kelahiran_ke) {
        this.kelahiran_ke = kelahiran_ke;
    }

    public String getPenolong_kelahiran() {
        return penolong_kelahiran;
    }

    public void setPenolong_kelahiran(String penolong_kelahiran) {
        this.penolong_kelahiran = penolong_kelahiran;
    }

    public double getBerat_bayi() {
        return berat_bayi;
    }

    public void setBerat_bayi(double berat_bayi) {
        this.berat_bayi = berat_bayi;
    }

    public int getPanjang_bayi() {
        return panjang_bayi;
    }

    public void setPanjang_bayi(int panjang_bayi) {
        this.panjang_bayi = panjang_bayi;
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