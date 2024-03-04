import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");

        Statement st =con.createStatement();

        //String query="UPDATE it_persons SET salary=51111 where salary(select avg(salary)from it_persons)";
       // int updated=st.executeUpdate(query);
        //System.out.println("gunsellenen kayit sayisi = "+updated);

        //ResultSet rs =st.executeQuery("select * from it_persons where salary=5111");
        //while (rs.next()){
          //  System.out.println(rs.getString(("name")+""));
    int deleted=st.executeUpdate("delete from it_persons where id=11");
        System.out.println("silinen kayit= "+deleted);


    }



    }

