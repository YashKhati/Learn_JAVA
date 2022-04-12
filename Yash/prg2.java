class Person
{
    int id;
    String name,City;
    Person(int id,String name,String City)
    {
        this.id=id;
        this.name=name;
        this.City=City;
    }
}
class Employee extends Person
{
    int salary;      
    Employee(int id,String name,String City,int salary)
    {
        super(id,name,City);
        this.salary=salary;
    }
    void disp()
    {
        System.out.println("id = "+super.id);
        System.out.println("name = "+super.name);
        System.out.println("city = "+super.City);
        System.out.println("salary = "+salary);
    }  
}
class Abc
{
    public static void main(String  args[])
    {
        Employee obj=new Employee(Integer.parseInt(args[0]),args[1],args[2],Integer.parseInt(args[3]));
        obj.disp();
    }
}
