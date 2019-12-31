package Entity;
public class Penduduk
{
    private String nik, nama_penduduk, jenis_kelamin,
            tempat_lahir, tanggal_lahir, agama,
            pendidikan, pekerjaan, status_pernikahan,
            status_hub_kel, nama_ayah, nama_ibu;
    private int anak_ke;
    private String no_kk;

    public Penduduk(){}
    public Penduduk(String nik, String nama_penduduk, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String agama, String pendidikan, String pekerjaan, String status_pernikahan, String status_hub_kel, String nama_ayah, String nama_ibu, int anak_ke, String no_kk) {
        this.nik = nik;
        this.nama_penduduk = nama_penduduk;
        this.jenis_kelamin = jenis_kelamin;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.agama = agama;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.status_pernikahan = status_pernikahan;
        this.status_hub_kel = status_hub_kel;
        this.nama_ayah = nama_ayah;
        this.nama_ibu = nama_ibu;
        this.anak_ke = anak_ke;
        this.no_kk = no_kk;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama_penduduk() {
        return nama_penduduk;
    }

    public void setNama_penduduk(String nama_penduduk) {
        this.nama_penduduk = nama_penduduk;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatus_pernikahan() {
        return status_pernikahan;
    }

    public void setStatus_pernikahan(String status_pernikahan) {
        this.status_pernikahan = status_pernikahan;
    }

    public String getStatus_hub_kel() {
        return status_hub_kel;
    }

    public void setStatus_hub_kel(String status_hub_kel) {
        this.status_hub_kel = status_hub_kel;
    }

    public String getNama_ayah() {
        return nama_ayah;
    }

    public void setNama_ayah(String nama_ayah) {
        this.nama_ayah = nama_ayah;
    }

    public String getNama_ibu() {
        return nama_ibu;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }

    public int getAnak_ke() {
        return anak_ke;
    }

    public void setAnak_ke(int anak_ke) {
        this.anak_ke = anak_ke;
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }
    
    
}