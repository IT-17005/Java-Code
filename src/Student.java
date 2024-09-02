public class Student {
    String name;
    int age;
    void display(){
        System.out.println("The method is called!!");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        Student s1 = new Student("Rokon",24);
        Student s2 = new Student("Rafi",22);
        Student s3 = new Student("Kounik",23);
        s1.display();
        System.out.println(s1.name+" "+s1.age);
        System.out.println(s2.name+" "+s2.age);
        System.out.println(s3.name+" "+s3.age);
    }
}
