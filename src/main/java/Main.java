import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataRetriever dataRetriever = new DataRetriever();

//        System.out.println(dataRetriever.getProductList(2, 2));
        System.out.println(dataRetriever.getProductsByCriteria("Dell", null, null, null));
        System.out.println(dataRetriever.getProductsByCriteria(null, "info", null, null));
        System.out.println(dataRetriever.getProductsByCriteria("iphone", "mobile", null, null));
    }

}
