public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;

    Course smat;
    Course sfizik;
    Course skimya;
    double avarege;
    boolean ispass;

    Student(String name,int classes,String stuNo,Course mat,Course smat,Course fizik,Course sfizik,Course kimya,Course skimya)
    {
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.smat=smat;
        this.fizik=fizik;
        this.sfizik=sfizik;
        this.kimya=kimya;
        this.skimya=skimya;


        calcAvarage();
        this.ispass=false;

    }

    public  void addBulExamNote(int mat,int smat,int fizik,int sfizik,int kimya,int skimya)
    {
        if(mat>=0 && mat<=100){
            this.mat.note=mat;
        }

        if(smat>=0 && smat<=100){
            this.smat.soznote=smat;
        }

        if(fizik>=0 && fizik<=100){
            this.fizik.note=fizik;
        }

        if(sfizik>=0 && sfizik<=100){
            this.sfizik.soznote=sfizik;
        }

        if(kimya>=0 && kimya<=100){
                this.kimya.note=kimya;
        }
        if(skimya>=0 && skimya<=100){
            this.skimya.soznote=skimya;
        }
    }

    public void isPass(){

        if(this.mat.note==0 || this.smat.soznote==0 || this.fizik.note==0 || this.sfizik.soznote==0 || this.kimya.note==0 || this.skimya.soznote==0){
            System.out.println("Notlar Tam Olarak Girilmemiş");
        } else{
            this.ispass=isCheckPass();
            printNote();
            System.out.println("Ortalama"+this.avarege);
            if(this.ispass){
                System.out.println("Sınıfı Geçtiniz");
            }else {
                System.out.println("Sınıfta Kaldınız");
            }
        }
    }

    public void calcAvarage(){
        this.avarege=((this.fizik.note*0.8+this.sfizik.soznote*0.2)+(this.kimya.note*0.8+this.skimya.soznote*0.2)+(this.mat.note*0.8+this.mat.note*0.2))/3;
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarege>55;
    }
    public  void printNote(){
        System.out.println("==============");
        System.out.println("Öğrenci:"+this.name);
        System.out.println("Matematik Notu:"+this.mat.note);
        System.out.println("Matematik Sözlünotu:"+this.smat.soznote);
        System.out.println("Fizik Notu:"+this.fizik.note);
        System.out.println("Fizik Sözlünotu:"+this.sfizik.soznote);
        System.out.println("Kimya Notu:"+this.kimya.note);
        System.out.println("Kimya Sözlünotu:"+this.skimya.soznote);
    }

}
