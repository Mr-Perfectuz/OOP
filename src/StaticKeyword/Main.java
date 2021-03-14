package StaticKeyword;

public class Main {
    public static void main(String[] args){
//        static = modifier, A single copy of a variable/method is created and shared
//                         the class owns the static member

        Friend friend = new Friend("Tony");

        System.out.println(Friend.numberOfFriends);
    }
}
