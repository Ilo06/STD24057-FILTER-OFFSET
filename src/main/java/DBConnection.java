import lombok.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class DBConnection {
    public static Connection getDBConnection() {
        String url = "jdbc:postgresql://localhost:5432/product_management_db";
        String user = "product_manager_user";
        String password = "123456";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
            return connection;  // ✔️ la connexion reste OUVERTE
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
