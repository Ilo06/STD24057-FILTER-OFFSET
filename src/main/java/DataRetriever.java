import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    Connection connection = DBConnection.getDBConnection();

    public List<Category> getAllCategories() throws SQLException {
        List<Category> categories = new ArrayList<>();

        String query = "SELECT * FROM Product_category";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            categories.add(
                    new Category(resultSet.getInt("id"),resultSet.getString("name")));
        }

        resultSet.close();
        statement.close();

        return categories;
    }
}
