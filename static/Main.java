public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Peter");
        Friend friend2 = new Friend("Joe");
        Friend friend3 = new Friend("Quagmire");

        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriend);  


        Friend.showFriend();
    }
}