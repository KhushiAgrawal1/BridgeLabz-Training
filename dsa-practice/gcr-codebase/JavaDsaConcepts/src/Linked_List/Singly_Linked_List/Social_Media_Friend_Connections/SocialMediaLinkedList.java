package Linked_List.Singly_Linked_List.Social_Media_Friend_Connections;

public class SocialMediaLinkedList {

    UserNode head;

    // Add new user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by name
    void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    // Add friend connection
    void addFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        UserNode friend = findUserById(friendId);

        if (user == null || friend == null) {
            System.out.println("User not found");
            return;
        }

        user.friends = addFriendToList(user.friends, friendId);
        friend.friends = addFriendToList(friend.friends, userId);
    }

    // Helper to add friend ID
    FriendNode addFriendToList(FriendNode head, int id) {
        FriendNode newNode = new FriendNode(id);
        newNode.next = head;
        return newNode;
    }

    // Remove friend connection
    void removeFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        UserNode friend = findUserById(friendId);

        if (user == null || friend == null)
            return;

        user.friends = removeFromFriendList(user.friends, friendId);
        friend.friends = removeFromFriendList(friend.friends, userId);
    }

    // Helper to remove friend
    FriendNode removeFromFriendList(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display friends of a user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    // Find mutual friends
    void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.println("Friend ID: " + f1.friendId);
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }

    // Count friends for each user
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    void displayUser(UserNode u) {
        System.out.println(
                "ID: " + u.userId +
                ", Name: " + u.name +
                ", Age: " + u.age
        );
    }

    // Main method
    public static void main(String[] args) {
        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        sm.addUser(1, "Aman", 21);
        sm.addUser(2, "Riya", 22);
        sm.addUser(3, "Karan", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);

        System.out.println("\nMutual Friends between 1 & 2:");
        sm.findMutualFriends(1, 2);

        System.out.println("\nFriend Count:");
        sm.countFriends();

        sm.searchByName("Riya");

        sm.removeFriend(1, 2);

        System.out.println("\nAfter Removing Friend:");
        sm.displayFriends(1);
    }
}
