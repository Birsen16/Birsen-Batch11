package JDBC;

import utils.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCIntro {
    /*Connection --> it will connect us to the database and allows us to our credentials.
     *Statement-->We are going to define our conditions to get result from database
     * Result set-->We store data from db to java object.
            Three of the above are interfaces in java which comes from jdbc dependency.

     */
    public static void main(String[] args) throws SQLException {//this is declaring exception into the method signature
        //Connection suppose to come from java.sql
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@birsenduman.clrq06nwij4z.us-east-1.rds.amazonaws.com:1521/ORCL",
                ConfigReader.readProperty("jdbcUderName"),ConfigReader.readProperty("jdbcPassword"));//those credentials coming from AWS
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select first_name, email, department_name\n" +
                "from employees e right join departments d\n" +
                "on d.department_id = e.department_id");
        resultSet.next();//we will return true if there is a next row otherwise it will retuen false.
        //it will take us to the next row
        System.out.println(resultSet.getString("first_name"));
        //using get string we can get our colu;mn value from the row we are in
        System.out.println(resultSet.getRow());
        resultSet.next();
        System.out.println(resultSet.getRow());
        //if you want to go the the last row, we could use resultSet.last() method
        resultSet.last();
        System.out.println(resultSet.getString("first_name"));
        resultSet.first();
        System.out.println(resultSet.getString("first_name"));
       // resultSet.deleteRow();//this is if i want to delate any row. If i run it now it will delate first row becase i am at the first row now.
        //MetaData --> it is information about the database.
        ResultSetMetaData rSetMetaData = resultSet.getMetaData();
        //count of the columns for your table
        System.out.println(rSetMetaData.getColumnCount());//this tell you how many columns you have
        System.out.println(rSetMetaData.getColumnName(1));//this gives you name of the 1st column
        //How can I print all the column names from employees table?
        for (int i =1;i <= rSetMetaData.getColumnCount();i++){
            System.out.println(rSetMetaData.getColumnName(i));
        }
        //creating a map for one row--> above will be key for one map
        Map<String, Object> oneRow = new HashMap<>();
        System.out.println(resultSet.getRow());
        for (int i =1;i <=rSetMetaData.getColumnCount();i++){
            oneRow.put(rSetMetaData.getColumnName(i),resultSet.getObject(i));
            //i is the number for column and our row number is defined by resultSet next method
            //to be able to get column Name we will use resultSetMeta data objet wiht index of row
            //to bea able to get column value we will use resultset.getObjeect method with index number of column

            //result.set is about row and Metadata is about the column
           // System.out.println(rSetMetaData.getColumnName(i));
        }
        System.out.println(oneRow);
        List<Map<String,Object>> allTable = new ArrayList<>();

        while(resultSet.next()){
            Map<String,Object> currentRow = new HashMap<>();
            for (int i =1;i <= rSetMetaData.getColumnCount();i++){
                currentRow.put(rSetMetaData.getColumnName(i),resultSet.getObject(i));
                //i is the number for column and our row number is defined by resultSet next method
                //to be able to get column Name we will use resultSetMeta data objet wiht index of row
                //to bea able to get column value we will use resultset.getObjeect method with index number of column

                //result.set is about row and Metadata is about the column
                // System.out.println(rSetMetaData.getColumnName(i));
                allTable.add(currentRow);
            }

        }
        System.out.println(allTable);
    }

}
