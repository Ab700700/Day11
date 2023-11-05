// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Account class
        Account account1 = new Account("1","Ahmad",1000);
        System.out.println("Get");
        System.out.println("----------");
        System.out.println("Name: "+account1.getName());
        System.out.println("ID: "+account1.getID());
        System.out.println("Balance: "+account1.getBalance());
        System.out.println("\n-------\ncredit");

        account1.credit(100);
        System.out.println("-----------");
        System.out.println("Balance: "+account1.getBalance());
        account1.debit(100);
        System.out.println("Balance: "+account1.getBalance());

        //transfer
        Account account2 = new Account("2","Ali",1000);
        System.out.println("\n-------\nBefore transfer");
        System.out.println("---------");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println("-----------");
        account1.transferTo(account2,100);
        System.out.println("---------");
        System.out.println("After transfer");
        System.out.println("---------");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println("--------------");
        System.out.println(account2.toString());


        //employee

//        Employee emp = new Employee("1","Ahmad",2000);
//        System.out.println("ID: "+emp.getID());
//        System.out.println("Name: "+emp.getName());
//        System.out.println("Salary: "+emp.getSalary());
//        System.out.println("Annual Salary: "+emp.getAnnualSalary());
//
//        emp.raisedSalary(10);
//        System.out.println(emp.toString());
    }
}