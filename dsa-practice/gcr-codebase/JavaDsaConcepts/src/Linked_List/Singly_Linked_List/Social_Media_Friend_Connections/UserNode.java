package Linked_List.Singly_Linked_List.Social_Media_Friend_Connections;

public class UserNode {
    int userId;
    String name;
    int age;

    FriendNode friends;   // head of friend list
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

