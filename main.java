public class main {

    public static void main(String[] args) {
        Person m1 = new Person("Petrenko" , "Pavlo" , 1991);
        Person m2 = new Person("Kovalenko" , "Petro" , 1994);
        Person m3 = new Person("Zamriyanko" , "Oleg" , 1993);
        Person m4 = new Person("Privatenko" , "Vasya" , 1998);
        Person m5 = new Person("Zinchenko" , "Sasha" , 1996);
        System.out.println(m1.getAge());
        System.out.println(m1);
        System.out.println(m2.getAge());
        System.out.println(m2);
        System.out.println(m3.getAge());
        System.out.println(m3);
        System.out.println(m4.getAge());
        System.out.println(m4);
        System.out.println(m5.getAge());
        System.out.println(m5);
        m1.changeName("asssa", "ddddd");
        m2.changeName("assd", "dawq");
        m3.changeName("aqwde", "vfcf");
        m4.changeName("oqwo", "ocvix");
        m5.changeName("fvnik", "qiwefgv");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        m1.output();
        m2.output();
        m3.output();
        m4.output();
        m5.output();



    }
}
