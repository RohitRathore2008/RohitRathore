package OOPS;

 class Student {
    String name;
    int age;

       Student( String name , int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("Name =" + name + " Age =" + age );
    }
}

class name{
    static void main(String[] args) {
        Student s1 = new Student( "golu", 18);
             s1.print();
             Student s2 = new Student("ansh", 17);
             s2.print();
    }
}
