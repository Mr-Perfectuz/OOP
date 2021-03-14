package StaticKeyword;

public class Main {
    public static void main(String[] args){
//        static = modifier, A single copy of a variable/method is created and shared
//                         the class owns the static member

        Friend friend = new Friend("Tony");
        Friend friend2 = new Friend("Patric");
        Friend friend3 = new Friend("Artur");

        System.out.println(Friend.numberOfFriends);
        Friend.DisplayFriends();

//        System.out.println(friend.name + " has "+ Friend.numberOfFriends+ " friend");
    }
}
