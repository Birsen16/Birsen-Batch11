package Object;

public class NetFlix {
    /*
     create following instance fields in the NetFlix-Class
        -accountName, userName, monthlyData
    `create a method that will update monthlyData for every usage
    `make sure this method takes parameter for data usage
    `run your code in a Test-Class

     */
    String accountName;
    String userName;
    static int monthlyData=100;


    public static void usage(int usedDate){
        monthlyData=monthlyData-usedDate;
        System.out.println("You have left " + monthlyData + "GB of monthly data");

    }

}
