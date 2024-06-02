public class Employees {

    Employees(){}

    Employees (String name, String position) {
        this.name=name;
        this.position=position;
    }


    private String name;
    private String position;
    public void addEmp (String name, String position) {
        this.name=name;
        this.position=position;
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String toString (){
        return "Name "+name+", position "+position;
    }
}
