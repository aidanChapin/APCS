package DesignClasses;

public class Spotify {
    private String owner;
    private String userName;
    private String currentSong;
    private String favoriteArtist;
    private int followers;
    private int following;
    private int playlists;
    private boolean premium;
    private boolean online;



    public Spotify(String owner, String userName, String currentSong, String favoriteArtist, int followers, int following
            , int playlists, boolean premium, boolean online){
        this.owner = owner;
        this.userName = userName;
        this.currentSong = currentSong;
        this.favoriteArtist = favoriteArtist;
        this.followers = followers;
        this.following = following;
        this.playlists = playlists;
        this.premium = premium;
        this.online = online;

    }

    @Override
    public String toString() {
        if(premium == true){
            if(online == true) {

                return owner + "'s Spotify premium account. Currently online and playing " + currentSong + ".\n"
                        + owner + "'s favorite artist is " + favoriteArtist + ". \n"
                        + followers + " followers and is following " + following + ".";
            }
            else{
                return owner + "'s Spotify premium account. Currently offline and was playing " + currentSong + ".\n"
                        + owner + "'s favorite artist is " + favoriteArtist + ". \n"
                        + followers + " followers and is following " + following + ".";
            }

        }
        else{
            if(online == true){
                return owner + "'s Spotify account. Currently online and playing " + currentSong + ".\n"
                        + owner + "'s favorite artist is " + favoriteArtist + ". \n"
                        + followers + " followers and is following " + following + ".";
            }
            else{
                return owner + "'s Spotify account. Currently offline and was playing " + currentSong + ".\n"
                        + owner + "'s favorite artist is " + favoriteArtist + ". \n"
                        + followers + " followers and is following " + following + ".";
            }
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getUserName() {
        return userName;
    }


    public String getCurrentSong() {
        return currentSong;
    }

    public void play(String currentSong) {
        this.currentSong = currentSong;
    }

    public String getFavoriteArtist() {
        return favoriteArtist;
    }

    public void setFavoriteArtist(String favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
    }

    public int getFollowers() {
        return followers;
    }

    public void newFollower() {
        followers++;
    }

    public void loseFollower() {
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

    public int getPlaylists() {
        return playlists;
    }

    public void newPlaylist() {
        playlists++;
    }

    public void deletePlaylist() {
        playlists--;
    }

    public boolean isPremium() {
        return premium;
    }

    public void buyPremium() {
        premium = true;
    }

    public void stopPremium() {
        premium = false;
    }
    public boolean isOnline() {
        return online;
    }

    public void goOnline() {
        online = true;
    }

    public void goOffline(){
        online = false;
    }



}
