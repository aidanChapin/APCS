package DesignClasses;

public class Instagram {
    private String handle;
    private String displayName;
    private int followers;
    private int following;
    private int posts;
    private int likes;
    private int notifications;

    Instagram(String handle, String displayName, int followers, int following, int posts, int likes, int notifications){
        this.handle = handle;
        setDisplayName(displayName);
        this.followers = followers;
        this.following = following;
        this.posts = posts;
        this.likes = likes;
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return "@" + getHandle() + ", or \"" + getDisplayName() + "\". \n"
                + getFollowers() + " followers, " + getLikes() + " likes from " + getPosts() + " posts. \n"
                + "Following " + getFollowing() + " users. " + notifications + " unread messages.";
    }

    public String getHandle() {
        return handle;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getFollowers() {
        return followers;
    }

    public void addFollowers() {
        followers++;
    }
    public void loseFollowers(){
        followers--;
    }

    public int getFollowing() {
        return following;
    }

    public void follow() {
        following++;
    }
    public void unfollow(){
        following--;
    }

    public void printRatio(){
        System.out.print("Your followers to following ration is: " + getFollowers() + "/" + getFollowing() + " or " + 1.0*getFollowers()/getFollowing());
    }

    public int getPosts() {
        return posts;
    }

    public void newPost(){
        posts++;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike() {
        likes ++;
    }
    public void loseLikes(){
        likes--;
    }
    public int getNotifications() {
        return notifications;
    }
    public void newNotification() {
        notifications++;
    }
    public void readNotification(){
        notifications--;
    }
    public double likesPerPost(){
        return 1.0*likes/posts;
    }
}
