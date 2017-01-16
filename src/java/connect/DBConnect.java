package connect;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
public class DBConnect 
{
    public static Connection getConnecttion() 
    {
        Connection cons = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            cons = (Connection) DriverManager.getConnection( "jdbc:mysql://node40993-ktlaptop.jelastic.skali.net/ktlaptop?useUnicode=true&characterEncoding=UTF-8", "root", "PYGogo32293");
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return cons;
    }
    public static void main(String[] args) 
    {
        System.out.println(getConnecttion());
    }
}