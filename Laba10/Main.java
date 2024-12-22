public class Main {
    public static void main(String[] args) {
        Employee dean = new ResearchAssociate("1337228", "Chel", "coolGuy@mail.ru",10,"магистр");
        Faculty faculty1 = new Faculty(dean, "ФКН");
        Faculty faculty2 = new Faculty(dean, "ПММ");

        University university = new University(10);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        System.out.println("University: " + university.getNumberOfEmployers() + " employees");
        System.out.println("Faculties:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println(" - " + faculty.getName());
        }
    }
}
