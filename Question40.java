package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Question 40:
Create a CD class with title and singer.
Sort CDs in ascending order of singer name using Comparable.
*/

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public int compareTo(CD other) {
        return this.singer.compareToIgnoreCase(other.singer);
    }

    @Override
    public String toString() {
        return "CD Title: " + title + ", Singer: " + singer;
    }
}

public class Question40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CD> cdList = new ArrayList<>();

        System.out.print("How many CDs to add? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter details for CD " + i + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Singer: ");
            String singer = scanner.nextLine();

            cdList.add(new CD(title, singer));
        }

        // Sort based on singer name
        Collections.sort(cdList);

        System.out.println("\n🎵 CDs sorted by Singer Name:");
        for (CD cd : cdList) {
            System.out.println(cd);
        }

        scanner.close();
    }
}


/*
 * How many CDs to add? 3
Enter details for CD 1:
Title: Love Songs
Singer: Arijit

Enter details for CD 2:
Title: Classic Hits
Singer: Lata

Enter details for CD 3:
Title: Retro Mix
Singer: Kishore

🎵 CDs sorted by Singer Name:
CD Title: Love Songs, Singer: Arijit
CD Title: Retro Mix, Singer: Kishore
CD Title: Classic Hits, Singer: Lata
*/
