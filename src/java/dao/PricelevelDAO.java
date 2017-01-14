package dao;
import connect.DBConnect; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import model.Pricelevel;
public class PricelevelDAO {
    //get tên loại sản phẩm them id
    public ArrayList<Pricelevel> getPricelevelNameID(long pricelevelID) throws SQLException { 
        Connection connection = DBConnect.getConnecttion();        
        String sql = "SELECT pricelevel_name FROM pricelevel WHERE pricelevel_id = '" + pricelevelID + "'";       
        PreparedStatement ps = connection.prepareCall(sql);        
        ResultSet rs = ps.executeQuery();       
        ArrayList<Pricelevel> list = new ArrayList<>();        
        while (rs.next()) 
        {             
            Pricelevel pricelevel = new Pricelevel();        
            pricelevel.setPricelevelName(rs.getString("pricelevel_name"));       
            list.add(pricelevel);         
        }         
        return list;    
    }
    public Pricelevel getPricelevel(long producerID) {
    try {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM pricelevel WHERE pricelevel_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, producerID);
        ResultSet rs = ps.executeQuery();
        Pricelevel u = new Pricelevel();
        while (rs.next()) {
        u.setPricelevelName(rs.getString("pricelevel_name"));
        }
    return u;
    } catch (SQLException ex) {
    }
    return null;
    }
    // get danh sách khoảng giá 
    public ArrayList<Pricelevel> getListPricelevel() throws SQLException { 
        Connection connection = DBConnect.getConnecttion();        
        String sql = "SELECT * FROM pricelevel";       
        PreparedStatement ps = connection.prepareCall(sql);        
        ResultSet rs = ps.executeQuery();       
        ArrayList<Pricelevel> list = new ArrayList<>();        
        while (rs.next()) 
        {             
            Pricelevel category = new Pricelevel();      
            category.setPricelevelID(rs.getInt("pricelevel_id"));       
            category.setPricelevelName(rs.getString("pricelevel_name"));       
            list.add(category);         
        }         
        return list;    
    }
    public static void main(String[] args) throws SQLException 
    {       
        PricelevelDAO dao = new PricelevelDAO();      
        for (Pricelevel ds : dao.getListPricelevel()) 
        {           
            System.out.println(ds.getPricelevelID() + " - " + ds.getPricelevelName());         
        }     
    } 
    
}
