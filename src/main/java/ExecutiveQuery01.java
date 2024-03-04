import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExecutiveQuery01 {
    public static void main(String[] args) throws SQLException {

        Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");

        Statement st =con.createStatement();

        System.out.println("success");

        boolean sql1=st.execute("select country_name from country where id>4 and id<10;\n");

        System.out.println("sql1:"+sql1);

        ResultSet resulSet =st.executeQuery("select country_name from country where id>4 and id<10;\n");

        //ResultSet.next();
        //System.out.println("Ulke ismi:"+resulSet.getString("country_name"));

        while (resulSet.next()){

            System.out.println("Ulke ismi:"+resulSet.getString("country_name"));
            //System.out.println("Ulke ismi:"+resulSet.getString(1));
        }

        System.out.println("------Ornek1---------");

        ResultSet rs2=st.executeQuery("SELECT phone_code,country_name FROM country WHERE phone_code>600");
        while (rs2.next()){
            System.out.println("tel_kodu: "+rs2.getInt("phone_code")+"ulke ismi:"+rs2.getString("country_name"));

        }
        System.out.println("-------Ornek3------");

        ResultSet rs3 = st.executeQuery("select * from it_persons where salary=(select MIN(salary) from it_persons);\n");

        while (rs3.next()){
            System.out.println(rs3.getInt("id")+"--"+rs3.getString("name")+"--"
                    +rs3.getDouble("salary")+"--"+rs3.getString("prog_lang"));


            String name=rs3.getString("name");
            System.out.println(name+"Bey");
            List<String>names =new ArrayList<>();
            names.add(name);
        }


        System.out.println("--------Ornek4---------");

        String query4="select isim,puan from ogrenciler4 where puan>(select avg(puan)from ogrenciler4);\n";
        ResultSet rs4=st.executeQuery(query4);

        while (rs4.next()){
            System.out.println();

        }

        String query5="";
        ResultSet rs5= st.executeQuery(query5);

        st.close();
        con.close();
    }
}
