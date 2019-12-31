package OlahData;
import java.sql.*;
public class Akses
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private String dbUrl, login, pwd;
    
    public Akses(String dbUrl, String login, String pwd)
    {
        this.dbUrl=dbUrl;
        this.login=login;
        this.pwd=pwd;
    }
    
    public Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(dbUrl,login,pwd);
        st=con.createStatement();
        return con;
    }
    
    public int executeUpdate(String str) throws SQLException
    {
        return st.executeUpdate(str);
    }
    
    public ResultSet executeQuery(String str) throws SQLException
    {
        return rs=st.executeQuery(str);
    }
    
    public void disconnect() throws SQLException
    {
        if(rs!=null)  rs.close();
        if(st!=null)  st.close();
        if(con!=null) con.close();
    }
}