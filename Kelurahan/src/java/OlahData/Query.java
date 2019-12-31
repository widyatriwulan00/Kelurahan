package OlahData;
import Entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Query
{
    public boolean tambahAkunPNS(AkunPNS data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO akunpns VALUES(NULL,"
                    + "'%s','%s','%s','%s')",data.getNip(),data.getPassword(),
                    data.getNama(),data.getLevel());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editAkunPNS(AkunPNS data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE akunpns SET nip='%s', password='%s',"
                    + "nama='%s',level='%s' WHERE id_akunpns=%d",data.getNip(),
                    data.getPassword(),data.getNama(),data.getLevel(),
                    data.getId_akunpns());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusAkunPNS(AkunPNS data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM akunpns WHERE id_akunpns=%d",
                    data.getId_akunpns());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public AkunPNS getAkunPNS(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM akunpns WHERE "
                    + "id_akunpns=%d",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        int id_akunpns=rs.getInt("id_akunpns");
        String nip=rs.getString("nip");
        String password=rs.getString("password");
        String nama=rs.getString("nama");
        String level=rs.getString("level");
        
        AkunPNS data=new AkunPNS(id_akunpns,nip,password,nama,level);
        akses.disconnect();
        return data;
    }
    
    public AkunPNS[] getDaftarAkunPNS() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM akunpns";
        
        AkunPNS[] daftar;
        AkunPNS data;
        ArrayList<AkunPNS> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_akunpns=rs.getInt("id_akunpns");
            String nip=rs.getString("nip");
            String password=rs.getString("password");
            String nama=rs.getString("nama");
            String level=rs.getString("level");
            data=new AkunPNS(id_akunpns,nip,password,nama,level);
            list.add(data);
        }
        daftar=new AkunPNS[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahAkun(Akun data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO akun VALUES(NULL,"
                    + "'%s','%s','%s','%s','%s')",data.getNo_kk(),data.getPassword(),
                    data.getNama(),data.getNo_telp(),data.getFoto());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editAkun(Akun data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE akunpns SET no_kk='%s', password='%s',"
                    + "nama='%s',no_telp='%s',foto='%s' WHERE id_akun=%d",data.getNo_kk(),
                    data.getPassword(),data.getNama(),data.getNo_telp(),data.getFoto(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusAkun(Akun data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM akun WHERE id_akun=%d",
                    data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Akun getAkun(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM akun WHERE "
                    + "id_akun=%d",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        int id_akun=rs.getInt("id_akun");
        String no_kk=rs.getString("no_kk");
        String password=rs.getString("password");
        String nama=rs.getString("nama");
        String no_telp=rs.getString("no_telp");
        String foto=rs.getString("foto");
        
        Akun data=new Akun(id_akun,no_kk,password,nama,no_telp,foto);
        akses.disconnect();
        return data;
    }
    
    public Akun[] getDaftarAkun() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM akun";
        
        Akun[] daftar;
        Akun data;
        ArrayList<Akun> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_akun=rs.getInt("id_akun");
            String no_kk=rs.getString("no_kk");
            String password=rs.getString("password");
            String nama=rs.getString("nama");
            String no_telp=rs.getString("no_telp");
            String foto=rs.getString("foto");
        
            data=new Akun(id_akun,no_kk,password,nama,no_telp,foto);
            list.add(data);
        }
        daftar=new Akun[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahKK(KK data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO kk VALUES('%s',"
                    + "%d,%d,'%s')",data.getNo_kk(),data.getId_rt(),
                    data.getId_rw(),data.getAlamat());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editKK(KK data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE kk SET id_rt=%d, id_rw=%d,"
                    + "alamat='%s' WHERE no_kk='%s'",data.getId_rt(),
                    data.getId_rw(),data.getAlamat(),data.getNo_kk());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusKK(KK data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM kk WHERE no_kk='%s'",
                    data.getNo_kk());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public KK getKK(String primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM kk WHERE "
                    + "no_kk='%s'",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        String no_kk=rs.getString("no_kk");
        int id_rt=rs.getInt("id_rt");
        int id_rw=rs.getInt("id_rw");
        String alamat=rs.getString("alamat");
        
        KK data=new KK(no_kk,id_rt,id_rw,alamat);
        akses.disconnect();
        return data;
    }
    
    public KK[] getDaftarKK() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM kk";
        
        KK[] daftar;
        KK data;
        ArrayList<KK> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            String no_kk=rs.getString("no_kk");
            int id_rt=rs.getInt("id_rt");
            int id_rw=rs.getInt("id_rw");
            String alamat=rs.getString("alamat");
        
            data=new KK(no_kk,id_rt,id_rw,alamat);
            list.add(data);
        }
        daftar=new KK[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahRW(RW data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO rw VALUES(%d,"
                    + "'%s','%s')",data.getId_rw(),data.getNama_rw(),
                    data.getNo_telp());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editRW(RW data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE rw SET nama_rw='%s', no_telp='%s'"
                    + " WHERE id_rw=%d",data.getNama_rw(),
                    data.getNo_telp(),data.getId_rw());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusRW(RW data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM rw WHERE id_rw=%d",
                    data.getId_rw());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public RW getRW(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM rw WHERE "
                    + "id_rw=%d",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        int id_rw=rs.getInt("id_rw");
        String nama_rw=rs.getString("nama_rw");
        String no_telp=rs.getString("no_telp");
        
        RW data=new RW(id_rw,nama_rw,no_telp);
        akses.disconnect();
        return data;
    }
    
    public RW[] getDaftarRW() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM rw";
        
        RW[] daftar;
        RW data;
        ArrayList<RW> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_rw=rs.getInt("id_rw");
            String nama_rw=rs.getString("nama_rw");
            String no_telp=rs.getString("no_telp");
        
            data=new RW(id_rw,nama_rw,no_telp);
            list.add(data);
        }
        daftar=new RW[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahRT(RT data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO rt VALUES(%d,"
                    + "'%s','%s')",data.getId_rt(),data.getNama_rt(),
                    data.getNo_telp());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editRT(RT data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE rt SET nama_rt='%s', no_telp='%s'"
                    + " WHERE id_rt=%d",data.getNama_rt(),
                    data.getNo_telp(),data.getId_rt());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusRT(RT data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM rt WHERE id_rt=%d",
                    data.getId_rt());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public RT getRT(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM rt WHERE "
                    + "id_rt=%d",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        int id_rt=rs.getInt("id_rt");
        String nama_rt=rs.getString("nama_rt");
        String no_telp=rs.getString("no_telp");
        
        RT data=new RT(id_rt,nama_rt,no_telp);
        akses.disconnect();
        return data;
    }
    
    public RT[] getDaftarRT() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM rt";
        
        RT[] daftar;
        RT data;
        ArrayList<RT> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_rt=rs.getInt("id_rt");
            String nama_rt=rs.getString("nama_rt");
            String no_telp=rs.getString("no_telp");
        
            data=new RT(id_rt,nama_rt,no_telp);
            list.add(data);
        }
        daftar=new RT[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahPenduduk(Penduduk data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO penduduk VALUES('%s',"
                    + "'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s',"
                    + "%d,'%s')",data.getNik(),data.getNama_penduduk(),data.getJenis_kelamin(),
                    data.getTempat_lahir(),data.getTanggal_lahir(),data.getAgama(),
                    data.getPendidikan(),data.getPekerjaan(),data.getStatus_pernikahan(),
                    data.getStatus_hub_kel(),data.getNama_ayah(),data.getNama_ibu(),
                    data.getAnak_ke(),data.getNo_kk());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editPenduduk(Penduduk data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE penduduk SET nama_penduduk='%s', "
                    + "jenis_kelamin='%s', tempat_lahir='%s', tanggal_lahir='%s', "
                    + "agama='%s', pendidikan='%s', pekerjaan='%s', status_pernikahan='%s', "
                    + "status_hub_kel='%s', nama_ayah='%s', nama_ibu='%s', "
                    + "anak_ke=%d, no_kk='%s' WHERE nik='%s'",data.getNama_penduduk(),
                    data.getJenis_kelamin(),data.getTempat_lahir(),data.getTanggal_lahir(),
                    data.getAgama(),data.getPendidikan(),data.getPekerjaan(),
                    data.getStatus_pernikahan(),data.getStatus_hub_kel(),data.getNama_ayah(),
                    data.getNama_ibu(),data.getAnak_ke(),data.getNo_kk(),
                    data.getNik());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean hapusPenduduk(Penduduk data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("DELETE FROM penduduk WHERE nik='%s'",
                    data.getNik());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Penduduk getPenduduk(String primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM penduduk WHERE "
                    + "nik='%s'",primary_key);
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        String nik=rs.getString("nik");
        String nama_penduduk=rs.getString("nama_penduduk");
        String jenis_kelamin=rs.getString("jenis_kelamin");
        String tempat_lahir=rs.getString("tempat_lahir");
        String tanggal_lahir=rs.getString("tanggal_lahir");
        String agama=rs.getString("agama");
        String pendidikan=rs.getString("pendidikan");
        String pekerjaan=rs.getString("pekerjaan");
        String status_pernikahan=rs.getString("status_pernikahan");
        String status_hub_kel=rs.getString("status_hub_kel");
        String nama_ayah=rs.getString("nama_ayah");
        String nama_ibu=rs.getString("nama_ibu");
        int anak_ke=rs.getInt("anak_ke");
        String no_kk=rs.getString("no_kk");
        
        Penduduk data=new Penduduk(nik, nama_penduduk, jenis_kelamin, 
                tempat_lahir, tanggal_lahir, agama, pendidikan, pekerjaan,
                status_pernikahan, status_hub_kel, nama_ayah, nama_ibu, 
                anak_ke, no_kk);
        akses.disconnect();
        return data;
    }
    
    public Penduduk[] getDaftarPenduduk() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM penduduk";
        
        Penduduk[] daftar;
        Penduduk data;
        ArrayList<Penduduk> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            String nik=rs.getString("nik");
            String nama_penduduk=rs.getString("nama_penduduk");
            String jenis_kelamin=rs.getString("jenis_kelamin");
            String tempat_lahir=rs.getString("tempat_lahir");
            String tanggal_lahir=rs.getString("tanggal_lahir");
            String agama=rs.getString("agama");
            String pendidikan=rs.getString("pendidikan");
            String pekerjaan=rs.getString("pekerjaan");
            String status_pernikahan=rs.getString("status_pernikahan");
            String status_hub_kel=rs.getString("status_hub_kel");
            String nama_ayah=rs.getString("nama_ayah");
            String nama_ibu=rs.getString("nama_ibu");
            int anak_ke=rs.getInt("anak_ke");
            String no_kk=rs.getString("no_kk");

            data=new Penduduk(nik, nama_penduduk, jenis_kelamin, 
                tempat_lahir, tanggal_lahir, agama, pendidikan, pekerjaan,
                status_pernikahan, status_hub_kel, nama_ayah, nama_ibu, 
                anak_ke, no_kk);
            list.add(data);
        }
        daftar=new Penduduk[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahDomisili(Domisili data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO domisili VALUES(NULL,"
                    + "'%s','%s',%d)",data.getNik(),data.getStatus(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editDomisili(Domisili data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE domisili SET nik='%s', status='%s'"
                    + " WHERE id_domisili=%d",data.getNik(),
                    data.getStatus(),data.getId_domisili());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Domisili getDomisili(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM domisili WHERE id_domisili=%d",
                primary_key);
        
        Domisili data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_domisili=rs.getInt("id_domisili");
        String nik=rs.getString("nik");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Domisili(id_domisili,nik,status,id_akun);
        akses.disconnect();
        return data;
    }
    
    public Domisili[] getDomisiliAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM domisili WHERE id_akun=%d",
                id_akun);
        
        Domisili[] daftar;
        Domisili data;
        ArrayList<Domisili> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_domisili=rs.getInt("id_domisili");
            String nik=rs.getString("nik");
            String status=rs.getString("status");
            data=new Domisili(id_domisili,nik,status,id_akun);
            list.add(data);
        }
        daftar=new Domisili[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Domisili[] getDaftarDomisili() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM domisili";
        
        Domisili[] daftar;
        Domisili data;
        ArrayList<Domisili> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_domisili=rs.getInt("id_domisili");
            String nik=rs.getString("nik");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Domisili(id_domisili,nik,status,id_akun);
            list.add(data);
        }
        daftar=new Domisili[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahKelahiran(Kelahiran data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO kelahiran VALUES(NULL,"
                    + "'%s','%s','%s','%s','%s','%s','%s',%d,'%s',%f,%d,"
                    + "'%s','%s','%s','%s','%s',%d)",data.getNama(),data.getJenis_kelamin(),
                    data.getTempat_dilahirkan(),data.getTempat_kelahiran(),data.getTanggal(),data.getPukul(),
                    data.getJenis_kelahiran(),data.getKelahiran_ke(),data.getPenolong_kelahiran(),
                    data.getBerat_bayi(),data.getPanjang_bayi(),data.getNo_kk(),data.getNik_pelapor(),
                    data.getNik_saksi_satu(),data.getNik_saksi_dua(),data.getStatus(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editKelahiran(Kelahiran data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE kelahiran SET nama='%s', "
                    + "jenis_kelahiran='%s', tempat_dilahirkan='%s', "
                    + "tempat_kelahiran='%s', tanggal='%s', pukul='%s', "
                    + "jenis_kelahiran='%s', kelahiran_ke=%d, penolong_kelahiran='%s', "
                    + "berat_bayi=%f, panjang_bayi=%d, no_kk='%s', nik_pelapor='%s', "
                    + "nik_saksi_satu='%s', nik_saksi_dua='%s', status='%s', "
                    + "id_akun=%d WHERE id_kelahiran=%d",data.getNama(),data.getJenis_kelamin(),
                    data.getTempat_dilahirkan(),data.getTempat_kelahiran(),data.getTanggal(),data.getPukul(),
                    data.getJenis_kelahiran(),data.getKelahiran_ke(),data.getPenolong_kelahiran(),
                    data.getBerat_bayi(),data.getPanjang_bayi(),data.getNo_kk(),data.getNik_pelapor(),
                    data.getNik_saksi_satu(),data.getNik_saksi_dua(),data.getStatus(),data.getId_akun(),
                    data.getId_kelahiran());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Kelahiran getKelahiran(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM kelahiran WHERE id_kelahiran=%d",
                primary_key);
        
        Kelahiran data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_kelahiran=rs.getInt("id_kelahiran");
        String nama=rs.getString("nama");
        String jenis_kelamin=rs.getString("jenis_kelamin");
        String tempat_dilahirkan=rs.getString("tempat_dilahirkan");
        String temapt_kelahiran=rs.getString("tempat_kelahiran");
        String tanggal=rs.getString("tanggal");
        String pukul=rs.getString("pukul");
        String jenis_kelahiran=rs.getString("jenis_kelahiran");
        int kelahiran_ke=rs.getInt("kelahiran_ke");
        String penolong_kelahiran=rs.getString("penolong_kelahiran");
        double berat_bayi=Double.parseDouble(rs.getString("berat_bayi"));
        int panjang_bayi=rs.getInt("panjang_bayi");
        String no_kk=rs.getString("no_kk");
        String nik_pelapor=rs.getString("nik_pelapor");
        String nik_saksi_satu=rs.getString("nik_saksi_satu");
        String nik_saksi_dua=rs.getString("nik_saksi_dua");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Kelahiran(id_kelahiran, nama, jenis_kelamin, tempat_dilahirkan, temapt_kelahiran, tanggal, pukul, jenis_kelahiran, kelahiran_ke, penolong_kelahiran, berat_bayi, panjang_bayi, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
        akses.disconnect();
        return data;
    }
    
    public Kelahiran[] getKelahiranAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM kelahiran WHERE id_akun=%d",
                id_akun);
        
        Kelahiran[] daftar;
        Kelahiran data;
        ArrayList<Kelahiran> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_kelahiran=rs.getInt("id_kelahiran");
            String nama=rs.getString("nama");
            String jenis_kelamin=rs.getString("jenis_kelamin");
            String tempat_dilahirkan=rs.getString("tempat_dilahirkan");
            String temapt_kelahiran=rs.getString("tempat_kelahiran");
            String tanggal=rs.getString("tanggal");
            String pukul=rs.getString("pukul");
            String jenis_kelahiran=rs.getString("jenis_kelahiran");
            int kelahiran_ke=rs.getInt("kelahiran_ke");
            String penolong_kelahiran=rs.getString("penolong_kelahiran");
            double berat_bayi=Double.parseDouble(rs.getString("berat_bayi"));
            int panjang_bayi=rs.getInt("panjang_bayi");
            String no_kk=rs.getString("no_kk");
            String nik_pelapor=rs.getString("nik_pelapor");
            String nik_saksi_satu=rs.getString("nik_saksi_satu");
            String nik_saksi_dua=rs.getString("nik_saksi_dua");
            String status=rs.getString("status");
            
            data=new Kelahiran(id_kelahiran, nama, jenis_kelamin, tempat_dilahirkan, temapt_kelahiran, tanggal, pukul, jenis_kelahiran, kelahiran_ke, penolong_kelahiran, berat_bayi, panjang_bayi, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
            list.add(data);
        }
        daftar=new Kelahiran[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Kelahiran[] getDaftarKelahiran() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM kelahiran";
        
        Kelahiran[] daftar;
        Kelahiran data;
        ArrayList<Kelahiran> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_kelahiran=rs.getInt("id_kelahiran");
            String nama=rs.getString("nama");
            String jenis_kelamin=rs.getString("jenis_kelamin");
            String tempat_dilahirkan=rs.getString("tempat_dilahirkan");
            String temapt_kelahiran=rs.getString("tempat_kelahiran");
            String tanggal=rs.getString("tanggal");
            String pukul=rs.getString("pukul");
            String jenis_kelahiran=rs.getString("jenis_kelahiran");
            int kelahiran_ke=rs.getInt("kelahiran_ke");
            String penolong_kelahiran=rs.getString("penolong_kelahiran");
            double berat_bayi=Double.parseDouble(rs.getString("berat_bayi"));
            int panjang_bayi=rs.getInt("panjang_bayi");
            String no_kk=rs.getString("no_kk");
            String nik_pelapor=rs.getString("nik_pelapor");
            String nik_saksi_satu=rs.getString("nik_saksi_satu");
            String nik_saksi_dua=rs.getString("nik_saksi_dua");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Kelahiran(id_kelahiran, nama, jenis_kelamin, tempat_dilahirkan, temapt_kelahiran, tanggal, pukul, jenis_kelahiran, kelahiran_ke, penolong_kelahiran, berat_bayi, panjang_bayi, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
            list.add(data);
        }
        daftar=new Kelahiran[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahKematian(Kematian data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO kematian VALUES(NULL,"
                    + "'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s',%d)",
                    data.getNik(), data.getTanggal(), data.getPukul(),data.getSebab_kematian(),
                    data.getTempat_kematian(),data.getYang_menerangkan(),data.getNo_kk(),data.getNik_pelapor(),
                    data.getNik_saksi_satu(),data.getNik_saksi_dua(),data.getStatus(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editKematian(Kematian data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE kematian SET nik='%s', tanggal='%s', "
                    + "pukul='%s', sebab_kematian='%s', tempat_kematian='%s', "
                    + "yang_menerangkan='%s', no_kk='%s', nik_pelapor='%s', "
                    + "nik_saksi_satu='%s', nik_saksi_dua='%s', status='%s', "
                    + "id_akun=%d WHERE id_kematian=%d",data.getNik(), data.getTanggal(), data.getPukul(),data.getSebab_kematian(),
                    data.getTempat_kematian(),data.getYang_menerangkan(),data.getNo_kk(),data.getNik_pelapor(),
                    data.getNik_saksi_satu(),data.getNik_saksi_dua(),data.getStatus(),data.getId_akun(),
                    data.getId_kematian());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Kematian getKematian(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM kematian WHERE id_kematian=%d",
                primary_key);
        
        Kematian data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_kematian=rs.getInt("id_kematian");
        String nik=rs.getString("nik");
        String tanggal=rs.getString("tanggal");
        String pukul=rs.getString("pukul");
        String sebab_kematian=rs.getString("sebab_kematian");
        String tempat_kematian=rs.getString("tempat_kematian");
        String yang_menerangkan=rs.getString("yang_menerangkan");
        String no_kk=rs.getString("no_kk");
        String nik_pelapor=rs.getString("nik_pelapor");
        String nik_saksi_satu=rs.getString("nik_saksi_satu");
        String nik_saksi_dua=rs.getString("nik_saksi_dua");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Kematian(id_kematian, nik, tanggal, pukul, sebab_kematian, tempat_kematian, yang_menerangkan, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
        akses.disconnect();
        return data;
    }
    
    public Kematian[] getKematianAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM kematian WHERE id_akun=%d",
                id_akun);
        
        Kematian[] daftar;
        Kematian data;
        ArrayList<Kematian> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_kematian=rs.getInt("id_kematian");
            String nik=rs.getString("nik");
            String tanggal=rs.getString("tanggal");
            String pukul=rs.getString("pukul");
            String sebab_kematian=rs.getString("sebab_kematian");
            String tempat_kematian=rs.getString("tempat_kematian");
            String yang_menerangkan=rs.getString("yang_menerangkan");
            String no_kk=rs.getString("no_kk");
            String nik_pelapor=rs.getString("nik_pelapor");
            String nik_saksi_satu=rs.getString("nik_saksi_satu");
            String nik_saksi_dua=rs.getString("nik_saksi_dua");
            String status=rs.getString("status");
            
            data=new Kematian(id_kematian, nik, tanggal, pukul, sebab_kematian, tempat_kematian, yang_menerangkan, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
            list.add(data);
        }
        daftar=new Kematian[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Kematian[] getDaftarKematian() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM kematian";
        
        Kematian[] daftar;
        Kematian data;
        ArrayList<Kematian> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_kematian=rs.getInt("id_kematian");
            String nik=rs.getString("nik");
            String tanggal=rs.getString("tanggal");
            String pukul=rs.getString("pukul");
            String sebab_kematian=rs.getString("sebab_kematian");
            String tempat_kematian=rs.getString("tempat_kematian");
            String yang_menerangkan=rs.getString("yang_menerangkan");
            String no_kk=rs.getString("no_kk");
            String nik_pelapor=rs.getString("nik_pelapor");
            String nik_saksi_satu=rs.getString("nik_saksi_satu");
            String nik_saksi_dua=rs.getString("nik_saksi_dua");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Kematian(id_kematian, nik, tanggal, pukul, sebab_kematian, tempat_kematian, yang_menerangkan, no_kk, nik_pelapor, nik_saksi_satu, nik_saksi_dua, status, id_akun);
            list.add(data);
        }
        daftar=new Kematian[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahPenghasilan(Penghasilan data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO penghasilan VALUES(NULL,'%s','%s',%d,'%s',%d)",
                    data.getNik(),data.getNama_usaha(),data.getPenghasilan(),data.getStatus(),
                    data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editPenghasilan(Penghasilan data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE penghasilan SET nik='%s', "
                    + "nama_usaha='%s', penghasilan=%d, status='%s', "
                    + "id_akun=%d WHERE id_penghasilan=%d",data.getNik(),data.getNama_usaha(),data.getPenghasilan(),data.getStatus(),
                    data.getId_akun(), data.getId_penghasilan());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Penghasilan getPenghasilan(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM penghasilan WHERE id_penghasilan=%d",
                primary_key);
        
        Penghasilan data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_penghasilan=rs.getInt("id_penghasilan");
        String nik=rs.getString("nik");
        String nama_usaha=rs.getString("nama_usaha");
        int penghasilan=rs.getInt("penghasilan");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Penghasilan(id_penghasilan, nik, nama_usaha, penghasilan, status, id_akun);
        akses.disconnect();
        return data;
    }
    
    public Penghasilan[] getPenghasilanAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM penghasilan WHERE id_penghasilan=%d",
                id_akun);
        
        Penghasilan[] daftar;
        Penghasilan data;
        ArrayList<Penghasilan> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_penghasilan=rs.getInt("id_penghasilan");
            String nik=rs.getString("nik");
            String nama_usaha=rs.getString("nama_usaha");
            int penghasilan=rs.getInt("penghasilan");
            String status=rs.getString("status");
            
            data=new Penghasilan(id_penghasilan, nik, nama_usaha, penghasilan, status, id_akun);
            list.add(data);
        }
        daftar=new Penghasilan[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Penghasilan[] getDaftarPenghasilan() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM penghasilan";
        
        Penghasilan[] daftar;
        Penghasilan data;
        ArrayList<Penghasilan> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_penghasilan=rs.getInt("id_penghasilan");
            String nik=rs.getString("nik");
            String nama_usaha=rs.getString("nama_usaha");
            int penghasilan=rs.getInt("penghasilan");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Penghasilan(id_penghasilan, nik, nama_usaha, penghasilan, status, id_akun);
            list.add(data);
        }
        daftar=new Penghasilan[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahUsaha(Usaha data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO usaha VALUES(NULL,'%s','%s','%s',%d)",
                    data.getNik(),data.getNama_usaha(),data.getStatus(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editUsaha(Usaha data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UPDATE usaha SET nik='%s', nama_usaha='%s', "
                    + "status='%s', id_akun=%d WHERE id_usaha=%d",data.getNik(),
                    data.getNama_usaha(),data.getStatus(),data.getId_akun(),
                    data.getId_usaha());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Usaha getUsaha(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM usaha WHERE id_usaha=%d",
                primary_key);
        
        Usaha data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_usaha=rs.getInt("id_usaha");
        String nik=rs.getString("nik");
        String nama_usaha=rs.getString("nama_usaha");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Usaha(id_usaha, nik, nama_usaha, status, id_akun);
        akses.disconnect();
        return data;
    }
    
    public Usaha[] getUsahaAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM usaha WHERE id_akun=%d",
                id_akun);
        
        Usaha[] daftar;
        Usaha data;
        ArrayList<Usaha> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_usaha=rs.getInt("id_usaha");
            String nik=rs.getString("nik");
            String nama_usaha=rs.getString("nama_usaha");
            String status=rs.getString("status");
        
            data=new Usaha(id_usaha, nik, nama_usaha, status, id_akun);
            list.add(data);
        }
        daftar=new Usaha[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Usaha[] getDaftarUsaha() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM usaha";
        
        Usaha[] daftar;
        Usaha data;
        ArrayList<Usaha> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_usaha=rs.getInt("id_usaha");
            String nik=rs.getString("nik");
            String nama_usaha=rs.getString("nama_usaha");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Usaha(id_usaha, nik, nama_usaha, status, id_akun);
            list.add(data);
        }
        daftar=new Usaha[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    public boolean tambahPesan(Pesan data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("INSERT INTO pesan VALUES(NULL,'%s','%s','%s',%d)",
                    data.getIsi_pesan(),data.getIsi_balasan(),data.getStatus(),data.getId_akun());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public boolean editPesan(Pesan data) throws SQLException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        try
        {
            String query=String.format("UDDATE pesan SET isi_pesan='%s', "
                    + "isi_balasan='%s', isi_status='%s', id_akun=%d "
                    + "WHERE id_pesan=%d",data.getIsi_pesan(),data.getIsi_balasan(),
                    data.getStatus(),data.getId_akun(),data.getId_pesan());
            akses.connect();akses.executeUpdate(query);akses.disconnect();
            return true;
        }
        catch(ClassNotFoundException | SQLException e){return false;}
    }
    
    public Pesan getPesan(int primary_key) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM pesan WHERE id_pesan=%d",
                primary_key);
        
        Pesan data;
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        int id_pesan=rs.getInt("id_pesan");
        String isi_pesan=rs.getString("isi_pesan");
        String isi_balasan=rs.getString("isi_balasan");
        String status=rs.getString("status");
        int id_akun=rs.getInt("id_akun");
        
        data=new Pesan(id_pesan, isi_pesan, isi_balasan, status, id_akun);
        akses.disconnect();
        return data;
    }
    
    public Pesan[] getPesanAkun(int id_akun) throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query=String.format("SELECT * FROM pesan WHERE id_akun=%d",
                id_akun);
        
        Pesan[] daftar;
        Pesan data;
        ArrayList<Pesan> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_pesan=rs.getInt("id_pesan");
            String isi_pesan=rs.getString("isi_pesan");
            String isi_balasan=rs.getString("isi_balasan");
            String status=rs.getString("status");
            
            data=new Pesan(id_pesan, isi_pesan, isi_balasan, status, id_akun);
            list.add(data);
        }
        daftar=new Pesan[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
    
    //Tampilkan yang statusnya belum selesai diproses
    public Pesan[] getDaftarPesan() throws SQLException, ClassNotFoundException
    {
        Akses akses=new Akses("jdbc:mysql://localhost:3306/sukaramai","root","");
        String query="SELECT * FROM pesan";
        
        Pesan[] daftar;
        Pesan data;
        ArrayList<Pesan> list = new ArrayList<>();
        
        akses.connect();
        ResultSet rs=akses.executeQuery(query);
        
        while(rs.next())
        {
            int id_pesan=rs.getInt("id_pesan");
            String isi_pesan=rs.getString("isi_pesan");
            String isi_balasan=rs.getString("isi_balasan");
            String status=rs.getString("status");
            int id_akun=rs.getInt("id_akun");
            
            data=new Pesan(id_pesan, isi_pesan, isi_balasan, status, id_akun);
            list.add(data);
        }
        daftar=new Pesan[list.size()];
        list.toArray(daftar);
        akses.disconnect();
        return daftar;
    }
}

