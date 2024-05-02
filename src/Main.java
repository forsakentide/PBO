abstract class Individu
{
    protected String nama;
    protected String jurusan;
    protected int umur;

    public Individu(String nama, String jurusan, int umur)
    {
        this.nama = nama;
        this.jurusan = jurusan;
        this.umur = umur;
    }

    public abstract void introduce();
}

class Student extends Individu
{
    private int angkatan;

    public Student(String nama, String jurusan, int umur, int angkatan)
    {
        super(nama, jurusan, umur);
        this.angkatan = angkatan;
    }

    @Override
    public void introduce()
    {
        System.out.println("Saya adalah mahasiswi Universitas Esa Unggul yang bernama " + nama + ", saya berumur " + umur + " tahun, saya dari fakultas Ilmu Komputer jurusan " + jurusan + ", angkatan " + angkatan);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("Defira Patricia", "Teknik Informatika", 23,2022);
        student.introduce();
    }
}
