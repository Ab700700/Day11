public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name){
        this.id=id;
        this.name= name;
    }
    public Account(String id, String name, int balance){
        this.id =id;
        this.balance=balance;
        this.name=name;
    }


    public String getID(){
        return  id;
    }
    public String getName(){
        return  name;
    }
    public int getBalance(){
        return  balance;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setId(String id){
        this.id =id;
    }
    public int credit(int amount){
        if(balance>amount){
            balance-=amount;
        }else{
            System.out.println("you don't have enough money.");
        }
        return balance;
    }
    public int debit(int amount){
        balance+=amount;
        return balance;
    }

    public  void setBalance(int balance){
        this.balance=balance;
    }
    public void setTransfer(int amount){
        balance+=amount;
    }
    public int transferTo(Account another , int amount){
        if(balance>amount){
            another.setTransfer(amount);
            balance-=amount;
            System.out.println("done\n your balance now : "+balance);
        }else {
            System.out.println("your balance is not enough to transfer");
        }
        return balance;
    }
    public String toString(){
        return "ID: "+id+"\nName: "+name+"\n"+"Balance: "+balance;
    }

}
