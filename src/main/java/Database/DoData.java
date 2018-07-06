package Database;

import products.Product;

import java.sql.*;
import java.util.ArrayList;

public class DoData {
    private static final String URL = "jdbc:mysql://localhost:3306/products?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private ArrayList<Product> products;
    private ArrayList<String> elementsOfProducts;
    private Driver driver;
    private Connection connection;
    private Statement stmt;
    private PreparedStatement pstmt;

    public void start() {

    }

    public DoData() {

    }
}
