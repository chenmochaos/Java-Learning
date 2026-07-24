package OOP;

public class CalcPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        System.out.println(Person.getCount());
    }
}

class Person {
    private static int count;

    public static int getCount() {
        return count;
    }

    public Person() {
        count++;
    }
}
