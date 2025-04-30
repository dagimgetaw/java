public class Friend {

    String name;
    static int numOfFriend;

    Friend(String name) {
        this.name = name;
        numOfFriend++;
    }

    static void showFriend() {
        System.out.printf("You have total %d friend.\n", numOfFriend);
    }
}