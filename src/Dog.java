public class Dog {

    private int age;
    private String name;
    private String color;

    public void empty(){
        this.age=0;
        this.name="";
        this.color="";
    }

    public Dog(int age, String name, String color){
        this.age=age;
        this.name=name;
        this.color=color;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        this.age=age;
        return age;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name=name;
        return name;
    }

    public String getColor(){
        return color;
    }

    public String setColor(String color){
        this.color=color;
        return color;
    }

    private int addOneAge(){
        age+=1;
        return age;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        String output = "The dog is called " + name + " and is " + age + " years old.  This dog is " + color;
        return output;
    }



}
