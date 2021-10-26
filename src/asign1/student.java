package asign1;

   class Student{
    String name;
    int age;
    String address;

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student();
        students[0].setInfo("shreeraj","Mumbai"  ,19);

        students[1] = new Student();
        students[1].setInfo("krishi",  "Panvel  ",22);

        students[2] = new Student();
        students[2].setInfo("jasmit",  "Powai   ",21);

        students[3] = new Student();
        students[3].setInfo("ronak",   "Kurla    ",22);

        students[4] = new Student();
        students[4].setInfo("aakash",  "Mumbai  ",24);

        students[5] = new Student();
        students[5].setInfo("sairaj",  "Borivali",19);

        students[6] = new Student();
        students[6].setInfo("Waghu",   "Pune    ",27);

        students[7] = new Student();
        students[7].setInfo("Gajdeep", "Vashi "  ,18);

        students[8] = new Student();
        students[8].setInfo("raina",   "Mulund  ",19);

        students[9] = new Student();
        students[9].setInfo("Rupesh",  "Mumbai " ,21);

    }

    void setInfo(String name ,String address , int age){

        this.name = name;

        this.address = address;

        this.age = age;

        System.out.println("Name : "+name+"\t\tAddress : "+address+"\t\t\t\t\tAge : "+age);

    }
}