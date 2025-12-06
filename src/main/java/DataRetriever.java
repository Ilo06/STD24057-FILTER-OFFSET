import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
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

    public List<Product> getProductList(int page, int size) throws SQLException {
        List<Product> products = new ArrayList<>();

        String query = "SELECT * FROM Product LIMIT " + size + " OFFSET " + page;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            products.add(
                    new Product(resultSet.getInt("id"),resultSet.getString("name"), (Instant) resultSet.getObject("creation_datetime"), (Category) resultSet.getObject("category")));
        }

        resultSet.close();
        statement.close();

        return products;
    }
}
