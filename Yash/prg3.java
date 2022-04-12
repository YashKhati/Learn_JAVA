class Person
{
    int id;
    String name,City;
    void GetDet(int id,String name,String City)
    {
        this.id=id;
        this.name=name;
        this.City=City;
    }
    final void ShowDet()
    {
       System.out.println("id = "+id);
       System.out.println("name = "+name);
       System.out.println("city = "+City);
    }  
}
class Employee extends Person
{
    void ShowDet()
    {
        System.out.println("hello " );
    }
    
}

class Abc
{
    public static void main(String  args[])
    {
        Employee obj=new Employee();
        obj.GetDet(2001,"Yash","Dehradun");
        obj.ShowDet();
    }
}
