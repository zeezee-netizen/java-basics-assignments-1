package session;

public class Session {
    private static int count = 0;
    private String owner;

    public Session(String owner) {
        this.owner = owner;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        Session s1 = new Session("Alice");
        Session s2 = new Session("Bob");
        Session s3 = new Session("Charlie");

        System.out.println("Total sessions = " + Session.getCount());
        System.out.println(s1.getOwner());
        System.out.println(s2.getOwner());
        System.out.println(s3.getOwner());
    }
}

