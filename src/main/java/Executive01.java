import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Executive01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection =DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");



        Statement st = connection.createStatement();

        //System.out.println("Connection is success");

        //boolean sql1=st.execute("CREATE TABLE IF not EXISTS workers(worker_id INT, worker_name VARCHAR(50),salary REAL)");
        //System.out.println("sql1 :"+sql1);

        //boolean sql2=st.execute("ALTER TABLE workers ADD COLUMN city VARCHAR(20)");

        //System.out.println("sql2:"+sql2);

        boolean sql3=st.execute("DROP TABLE workers");
        System.out.println("sql3:"+sql3);

        st.close();
        connection.close();
    }
}
