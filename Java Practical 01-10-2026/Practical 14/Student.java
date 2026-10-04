class Student {
    String name;
    int id;
    double marks;
    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    void displayStudentInfo() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Student Information System\n");
        Student student1 = new Student("Alice Smith", 101, 88.5);
        Student student2 = new Student("Bob Jones", 102, 92.0);
        Student student3 = new Student("Charlie Brown", 103, 79.5);

        System.out.println("Details of Student 1:");
        student1.displayStudentInfo();

        System.out.println("Details of Student 2:");
        student2.displayStudentInfo();

        System.out.println("Details of Student 3:");
        student3.displayStudentInfo();
    }
}