import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class CountryTest01 {
    @Test
    public void countryTest() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");

        Statement st = con.createStatement();

        String sql = "select country_name from countries4;\n";

        ResultSet resultSet = st.executeQuery(sql);

        int ulkeSayisi=0;
        while (resultSet.next()){
            System.out.println("ulke isimleri: /n" + resultSet.getString("country_name"));
            ulkeSayisi++;
        }

        Assert.assertTrue(ulkeSayisi>0);

        con.close();
        st.close();
    }
}
