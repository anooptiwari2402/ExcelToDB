package com.developer.excelreader;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.ModelTable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ExcelReader {
    public static void main(String[] args) throws IOException {


//    	   hibernate sessionHibernate building
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory buildSessionFactory = configuration.buildSessionFactory();
    
    	
//        file loading
        String str = "Book2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(str);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

//       getting a last line to iterate
        XSSFRow headerRow = sheet.getRow(0);
        int lastCell = headerRow.getLastCellNum();
        int lastRow = sheet.getLastRowNum();



//        creating list to store the rowObject and modelObject
        ArrayList<ArrayList<String>> valueList = new ArrayList<ArrayList<String>>();
        ArrayList<ModelTable> modelList = new ArrayList<ModelTable>();



//        traversing to each cell
        for (int i = 1; i < lastRow+1; i++) {
            while(sheet.getRow(i)==null) {
                i++;
            }
            XSSFRow row = sheet.getRow(i);

//            creating a row list
            ArrayList<String> rowList = new ArrayList<String>();
            for (int j = 0; j < lastCell; j++) {
                XSSFCell cell = row.getCell(j);
                String obj = cell!=null?cell.toString():"null";

//                adding a each row objects in the rowList
                rowList.add(obj);
            }

            
            
// //           making a modelObject and adding it into the list
            ModelTable modelTable = new ModelTable();
            int k=0;
            modelTable.setSno(rowList.get(k)); k++;
            modelTable.setTransactionID(rowList.get(k)); k++;
            modelTable.setTransactionDate(rowList.get(k)); k++;
            modelTable.setMethod(rowList.get(k)); k++;
            modelTable.setPaymentData(rowList.get(k)); k++;
            modelTable.setPaymentStatus(rowList.get(k)); k++;
            modelTable.setSsoId(rowList.get(k)); k++;
            modelTable.setFirstName(rowList.get(k)); k++;
            modelTable.setLastNameAddress(rowList.get(k)); k++;
            modelTable.setAddress(rowList.get(k)); k++;
            modelTable.setState(rowList.get(k)); k++;
            modelTable.setCity(rowList.get(k)); k++;
            modelTable.setCountry(rowList.get(k)); k++;
            modelTable.setZip(rowList.get(k)); k++;
            modelTable.setMobile(rowList.get(k)); k++;
            modelTable.setEmail(rowList.get(k)); k++;
            modelTable.setCurrency(rowList.get(k)); k++;
            modelTable.setAmount(rowList.get(k)); k++;
            modelTable.setPackageType(rowList.get(k));
            modelList.add(modelTable);

            
            
//            adding a rowList into the list
            valueList.add(rowList);
//            System.out.println();
        }

//  //      rowList streaming
//        valueList.stream().forEach(l->{
//            System.out.println(l);
//        });


// //       modelObject streaming
        Session currentSession = buildSessionFactory.openSession();
        modelList.stream().forEach(l->{
//          need to use the session to sql query
        Transaction beginTransaction = currentSession.beginTransaction();
        currentSession.save(l);
        beginTransaction.commit();
        });
        currentSession.close();


//        closing the workbook and filestream
        workbook.close();
        fileInputStream.close();
        
    }
}
