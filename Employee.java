public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name,int salary){
        this.id= id;
        this.name= name;
        this.salary= salary;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setSalary(int salary){
        this.salary =salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }

    public int raisedSalary(double percent){
        salary+=(salary/100)*percent;
        return salary;
    }
    public String toString(){
        return "ID: "+id+"\nName: "+name+"\nSalary: "+salary;
    }

}
