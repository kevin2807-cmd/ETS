/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;

    /**
     * Constructor for objects of class Book
     */
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku)
    {
        // initialise instance variables
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategoriBuku = kategoriBuku;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print_details()
    {
        System.out.println("===============Informasi Detail Buku===============");
        System.out.println("Judul\t\t\t\t= " + judul);
        System.out.println("enulis\t\t\t\t= " + penulis);
        System.out.println("Tahun terbit\t\t\t= " + tahunTerbit);
        System.out.println("Nama Penerbit\t\t\t= " + namaPenerbit);
        System.out.println("judul\t\t\t\t= " + kategoriBuku);
    }
}
