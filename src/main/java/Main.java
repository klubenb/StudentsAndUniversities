public class Main {
    public static void main(String[] args) {
        University university1 = new University();
        University university2 = new University("National Research Nuclear University Moscow Engineering Physics Institute", "MEPhI", 1942, StudyProfile.PHYSICS);

        Student student1 = new Student();
        Student student2 = new Student("Petr Lomonosov", university2.getId(), 1, 4.2F);


        System.out.println(university1);
        System.out.println(university2);
        System.out.println(student1);
        System.out.println(student2);
    }
}
