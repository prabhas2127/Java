class Employee {

    private int emp_id;
    private String name;
    private int age;
    
    public int getEmpid(){
        return emp_id;
    }

    public void setEmpid(int emp_id){
        this.emp_id = emp_id;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }


    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

    public void display(){

        System.out.println("Emp ID : " + emp_id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setage(21);
        emp.setEmpid(1012);
        emp.setname("maxx");
        emp.display();
    }


    
}
