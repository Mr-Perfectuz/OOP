package StaticKeyword;

public class Friend {
    String name;

    static int numberOfFriends;

    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void DisplayFriends(){
        System.out.println(" You have "+ numberOfFriends+ " friends");
    }
}
