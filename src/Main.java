public class Main {

    public static void main(String[] args) {

        //Student
        Name studname1 = new Name("Razita", "Syazwana", "Rizalmi");
        Address studAdd1 = new Address("Taman Desa Makmur", "Kulim", "09600", "Kedah");
        Student wana = new Student("22006407", 15, "SMKSBP");
        wana.addMarks(75);
        wana.addMarks(90);
        wana.addMarks(87);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname1.getFullName());
        System.out.println("IC: " + wana.getIc());
        System.out.println("Address: " + studAdd1.getFullAddress());
        System.out.println("Year: " + wana.getYear());
        System.out.println("Marks: " + wana.getMarks());
        System.out.println("");

        Name studname2 = new Name("Nur", "Amira", "Jalil");
        Address studAdd2 = new Address("Taman Sentosa", "Bandar Baharu", "09000", "Kedah");
        Student nur = new Student("22003857", 16, "SMKL");
        nur.addMarks(89);
        nur.addMarks(45);
        nur.addMarks(43);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname2.getFullName());
        System.out.println("IC: " + nur.getIc());
        System.out.println("Address: " + studAdd2.getFullAddress());
        System.out.println("Year: " + nur.getYear());
        System.out.println("Marks: " + nur.getMarks());
        System.out.println("");

        //Teacher
        Name teachname1 = new Name("Nur", "Atikah", "Hamzah");
        Teacher Atikah = new Teacher("14182993", "Johor", "4 years teaching", 4, "12/02", 4);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname1.getFullName());
        System.out.println("IC: " + Atikah.getIc());
        System.out.println("Address: " + Atikah.getAddress());
        System.out.println("Qualifications: " + Atikah.getQualification());
        System.out.println("Year of Experience: " + Atikah.getYearsExp());
        System.out.println("Date Joined: " + Atikah.getDatejoined());
        System.out.println("Years since enter: " + Atikah.getYearsSinceEnter());
        System.out.println("");

        Name teachname2 = new Name("Amir", "Hakim", "Borhan");
        Teacher Amir = new Teacher("11002345", "Selangor", "13 years teaching", 13, "29/04", 5);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname2.getFullName());
        System.out.println("IC: " + Amir.getIc());
        System.out.println("Address: " + Amir.getAddress());
        System.out.println("Qualifications: " + Amir.getQualification());
        System.out.println("Year of Experience: " + Amir.getYearsExp());
        System.out.println("Date Joined: " + Amir.getDatejoined());
        System.out.println("Years since enter: " + Amir.getYearsSinceEnter());
        System.out.println("");

        //Tuition Center
        TuitionCenter Seri = new TuitionCenter("Seri Iskandar");

        Seri.addteachers(Atikah);
        Seri.addteachers(Amir);
        Seri.addnumstud(wana);
        Seri.addnumstud(nur);

        System.out.println("---Tuition Center Info---");
        System.out.println("Address: " + Seri.getAddress());
        System.out.println("Number of teacher: " + Seri.getnumteachers());
        System.out.println("Number of students: " + Seri.getnumstud());
        System.out.println("Average student marks: " + Seri.getAverageMarks());
        System.out.println("Minimum mark: " + Seri.getMinMarks());
        System.out.println("Maximum mark: " + Seri.getMaxMarks());
        System.out.println("Tutor's background: " + Seri.getTutorQualifications());

    }

}