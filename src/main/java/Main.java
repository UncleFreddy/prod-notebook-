import Database.DoData;
import excel.GetProductsFromExcel;
import org.hibernate.SessionFactory;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        /*GetProductsFromExcel getProductsFromExcel = new GetProductsFromExcel();
        DoData doData = new DoData();
        doData.start();*/

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();



    }

}
