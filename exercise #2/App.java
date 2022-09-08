import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Favlist = new LinkedList<>();

        // Adds new songs to Playlist
        Favlist.add("Let me go");
        Favlist.add("Scarred");
        Favlist.add("Lost me");
        Favlist.add("For tonight");
        Favlist.add("Like i want you");

        // Adds a new song at the front of the Playlist
        Favlist.addFirst("Favorite mistake");

        // Adds a new song at the end of the Playlist
        Favlistt.addLast("The beach");

        // Display node at the front in the LinkedList
        System.out.println(Favlist.get(0));

        // Replace the last song using the set() method
        Favlist.set(6, "Still your best");

        // Remove the first song using the remove() method
        Favlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Favlist);
    }
}
