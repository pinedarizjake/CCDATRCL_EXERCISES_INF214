import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Favlist = new LinkedList<>();

        // Add 5 new songs to your Playlist using the add() method
        Favlist.add("Let me go");
        Favlist.add("Scarred");
        Favlist.add("Lost me");
        Favlist.add("For tonight");
        Favlist.add("Like i want you");

        // Add a new song at the front of the Playlist using the addFirst() method
        Favlist.addFirst("Favorite mistake");

        // Add a new song at the end of the Playlist using the addLast() method
        Favlist.addLast("The beach");

       // Display the song at the front of the Playlist using the combination of get() method and the println() method
        System.out.println(Favlist.get(0));

        // Replace the last song using the set() method
        Favlist.set(6, "Still your best");

        // Remove the first song using the remove() method
        Favlist.remove(0);

        // Display all songs in your Playlist using the println method
        System.out.println("Updated playlist: " + Favlist);
    }
}
