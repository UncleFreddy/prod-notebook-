package getFromWeb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import products.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class GetProductsFromSite {
    public GetProductsFromSite() throws IOException {

    }

    private String foodmeals = "http://pbprog.ru/databases/foodmeals/";
    private String url = "http://pbprog.ru";
    private String groupName;
    private String productName;
    private Double kKal;
    private String elementName;
    private Double elementsValue;
    private ArrayList<String> elementsOfProducts = new ArrayList<String>();
    private ArrayList<Product> products = new ArrayList<Product>();
    private TreeMap<String, Double> elementsProduct;


    int countGroup = 1;

    {
        for (int i = 1; i < 62; i++) {


            System.out.println("Group " + countGroup + " is start!");

            Document site = Jsoup.connect(foodmeals + i + "/").get();
            groupName = site.title().substring(site.title().lastIndexOf(':') + 2).toUpperCase()
            .replace(",", "");
            if (groupName.length() > 30) {
                groupName = groupName.substring(0, groupName.lastIndexOf(' '));
            }



            Elements li = site.getElementsByTag("li");
            for (Element element : li) {



                if (element.child(0).attr("title").equals("Открыть информацию о блюде") ||
                        element.child(0).attr("title").equals("Открыть информацию о продукте")) {

                    Product product = new Product();
                    productName = element.child(0).text();

                    product.setProductGroup(groupName);
                    product.setProductName(productName);

                    String urlProduct = url + element.child(0).attr("href");
                    Document currentProduct = Jsoup.connect(urlProduct).get();

                    Elements tr = currentProduct.getElementsByTag("tr");


                    elementsProduct = new TreeMap<String, Double>();

                    for (Element td : tr) {

                        if (td.parent().parent().attr("id").equals("wt-table")) {

                            if (td.child(0).text().equals("Калорийность, ккал")) {
                                kKal = Double.parseDouble(new String(td.child(1).text()));
                                product.setProductKkal(kKal);
                            }

                            if (td.child(0).tag().getName().equals("td")) {
                                elementName = td.child(0).text();
                                elementsValue = Double.parseDouble(td.child(1).text());
                                elementsProduct.put(elementName, elementsValue);

                                if (!elementsOfProducts.contains(elementName)) {
                                    elementsOfProducts.add(elementName);
                                }
                            }
                        }
                    }
                    product.getElements(elementsProduct);
                    products.add(product);
                }
            }
            System.out.println("Group " + countGroup + " done!");
            countGroup++;
        }

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<String> getElementsOfProducts() {
        return elementsOfProducts;
    }
}
