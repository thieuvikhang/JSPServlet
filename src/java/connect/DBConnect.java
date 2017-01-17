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
            cons = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/ShopLaptop?useUnicode=true&characterEncoding=UTF-8", "root", "84348291");
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