package Object;

public class Employee {
    /*
    Method: to update company budget
    instance fields: --> id, name, budgetOfCompany, companyName
    constructors: --> no args, one arg, multiple
     */

    int id;
    String name;
    double budgetOfCompany;
    String companyName;

    public void updateCompanyBudget(double expenses){
        this.budgetOfCompany=budgetOfCompany-expenses;
        System.out.println("The budget of the company is now " + budgetOfCompany);
    }
    public Employee(){

    }
    public Employee(int id){

    }
    public Employee(String name,int id){

    }
    public Employee(String name,String companyName){

    }

    public void setBudgetOfCompany(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public static void main(String[] args) {
        Employee a1 = new Employee("Zack",34);
        a1.updateCompanyBudget(5000);
        a1.budgetOfCompany = 200000000;


    }

}

