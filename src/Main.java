import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> kitaplar = new TreeSet<>();

        Book book1 = new Book("Siyer", 300, "Yıldırım", 2000);

        kitaplar.add(book1);
        kitaplar.add(new Book("Kuran", 600, "Yayıncılık", 610));
        kitaplar.add(new Book("Tefsir", 200, "Tahlil", 2010));
        kitaplar.add(new Book("Ahlak", 100, "Nida", 2020));

        for (Book kitap : kitaplar
        ) {
            System.out.println(kitap.getKitapIsim());
        }

        TreeSet<Book> booksSortedByPage = new TreeSet<>(new Comparator<Book>() {

            //Compares the added books page numbers
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getSayfaSayisi() - o2.getSayfaSayisi();
            }
        });

        booksSortedByPage.add(book1);
        booksSortedByPage.add(new Book("Kuran", 600, "Yayıncılık", 610));
        booksSortedByPage.add(new Book("Tefsir", 200, "Tahlil", 2010));
        booksSortedByPage.add(new Book("Ahlak", 100, "Nida", 2020));

        for (Book kitap : booksSortedByPage
        ) {
            System.out.println(kitap.getSayfaSayisi());
        }

    }
}