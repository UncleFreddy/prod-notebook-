package excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import products.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DoExcel {
    private FileOutputStream file = new FileOutputStream("target/generated-sources/excel/products.xls");
    private Workbook wb = new HSSFWorkbook();
    private Sheet sheet;
    private Row row;
    private Row rowElements;
    private Cell cell;
    private Cell cellName;
    private Cell cellKkal;
    private int indexCell;

    private String groupName;
    private String productName;
    private Double kKal;
    private String elementName;
    private String elementsValue;
    private ArrayList<String> elementsOfProducts;
    private ArrayList<Product> products;
    private ArrayList<String> productsGroupList = new ArrayList<String>();

    public void start() throws IOException {
	    for (Product product : products) {
		    groupName = product.getProductGroup();
		    productName = product.getProductName();
		    kKal = product.getProductKkal();
		    sheet = selectSheet(groupName);
		    row = sheet.createRow(sheet.getLastRowNum() + 1);
		    rowElements = sheet.getRow(0);

		    for (int i = 0; i < elementsOfProducts.size(); i++) {
			    cell = row.createCell(i);
			    cellKkal = row.createCell(1);
			    if (i == 0) {
			    	cell.setCellValue(productName);
			    	sheet.autoSizeColumn(i);
			    } else {

			        cellKkal.setCellValue(kKal);
					for (Map.Entry<String, Double> pair : product.getAllElements().entrySet()) {
						String elementName = pair.getKey();
						Double elementValue = pair.getValue();

						for (Cell cellElement : rowElements) {
							if (cellElement.getStringCellValue().equals(elementName)) {
								indexCell = cellElement.getColumnIndex();
							}
						}
						cellName = row.createCell(indexCell);
						cellName.setCellValue(elementValue);
					}
			    }
		    }

	    }


	    wb.write(file);
	    file.close();
    }




    public DoExcel(ArrayList<Product> products, ArrayList<String> elementsOfProducts) throws FileNotFoundException {
        this.products = products;
        this.elementsOfProducts = elementsOfProducts;
    }
	private Sheet selectSheet(String groupName) {
        int sheetIndex = wb.getSheetIndex(groupName);
        System.out.println(groupName + ": " + sheetIndex);
        if (sheetIndex < 0) {
			sheet = wb.createSheet(groupName);
			row = sheet.createRow(0);
			for (int i = 0; i < elementsOfProducts.size(); i++) {
				if (i == 0) {
					cell = row.createCell(1);
					cell.setCellValue(elementsOfProducts.get(i));
				} else {
					cell = row.createCell(i + 1);
					cell.setCellValue(elementsOfProducts.get(i));
					sheet.autoSizeColumn(i);
				}
			}
			return sheet;
		} else {
			return wb.getSheet(groupName);
		}
	}
}
