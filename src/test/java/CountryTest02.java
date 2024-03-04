import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class CountryTest02 {
    @Test
    public void countryTest() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");

        Statement st = con.createStatement();

        String sql = "select country_name from countries4;\n";

        ResultSet resultSet = st.executeQuery(sql);

        int actualData =0;

        while (resultSet.next()){
            actualData++;
        }
        System.out.println("ulke :"+actualData);

        int expectionData =12;
        Assert.assertEquals(5,actualData);

        con.close();
        st.close();
    }
}
