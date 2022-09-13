public class Main {
    public static void main(String[] args) {
        Course mat=new Course("Matematik","MAT101","MAT");
        Course smat=new Course("Matematik","MAT101","MAT");
        Course fizik=new Course("Fizik","FZK101","FZK");
        Course sfizik=new Course("Fizik","FZK101","FZK");
        Course kimya=new Course("Kimya","KMY101","KMY");
        Course skimya=new Course("Kimya","KMY101","KMY");


        Teacher t1=new Teacher("Şerif Hoca","90550000000","MAT");
        Teacher t2=new Teacher("Yusuf Hoca","90550000001","FZK");
        Teacher t3=new Teacher("Melike Hoca","90550000002","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("İnek Şaban",4,"140144015",mat,smat,fizik,sfizik,kimya,skimya);
        s1.addBulExamNote(50,20,40,50,60,40);

        Student s2=new Student("Düdük Necmi",4,"22111333",mat,smat,fizik,sfizik,kimya,skimya);
        s2.addBulExamNote(100,50,40,90,50,60);
        s2.isPass();

        Student s3=new Student("Hayta İsmail",4,"144144015",mat,smat,fizik,sfizik,kimya,skimya);
        s3.addBulExamNote(50,20,40,40,30,50);
        s3.isPass();

    }
}
