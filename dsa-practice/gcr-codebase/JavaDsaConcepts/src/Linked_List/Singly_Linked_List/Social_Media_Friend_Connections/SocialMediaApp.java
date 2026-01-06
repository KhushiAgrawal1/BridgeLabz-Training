package Linked_List.Singly_Linked_List.Social_Media_Friend_Connections;

public class SocialMediaApp {

    public static void main(String[] args) {

        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        sm.addUser(1, "Aman", 20);
        sm.addUser(2, "Riya", 21);
        sm.addUser(3, "Kunal", 22);
        sm.addUser(4, "Neha", 19);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.mutualFriends(1, 2);

        sm.countFriends(2);

        sm.searchUserById(3);
        sm.searchUserByName("Neha");

        sm.removeFriendConnection(1, 3);

        System.out.println("After removing connection:");
        sm.displayFriends(1);
    }
}
