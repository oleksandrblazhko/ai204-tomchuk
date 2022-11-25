import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProgramClientCode {

  public static void main(String[] args) {

	System.out.println("START || DB_NAME = " + args[0] + ", DB_PASSWD = " + args[1]);
    try {
      Class.forName("org.postgresql.Driver");
      Connection connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/" + args[0],
          "postgres", args[1]);

      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from users");

      while (resultSet.next()) {
        System.out.println("| " + resultSet.getString(1)
            + " | " + resultSet.getString(2) + " |");
      }

      connection.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
	System.out.println("END");
  }
}