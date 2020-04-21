package helpers;
import java.util.Collection;
import java.util.*;


public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        List<Friend> visited = new ArrayList<>();
        LinkedList<Friend> queue = new LinkedList<>(); 
        
        visited.add(this);
        queue.add(this);
        Friend curr = null;
		while (queue.size() != 0) {
			curr = queue.poll();
			
			if(friend.getEmail().equals(curr.getEmail()))
				return true;
			
			Iterator<Friend> i = curr.getFriends().iterator();
			while (i.hasNext()) {
				Friend n = i.next();
				if (!visited.contains(n)) {
					visited.add(n);
					queue.add(n);
				}
			}
		}
    	return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}