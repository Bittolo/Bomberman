public class Player {
    String nickname;
    Avatar avatar;
    Integer playedGames;
    Integer lostGames;
    Integer wonGames;
    Integer playerLevel;

    public Player(String nickname, Avatar avatar) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.wonGames = 0;
        this.lostGames = 0;
        this.playedGames = 0; // calcolare wonGames + lostGames
        this.playerLevel = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public Integer getLostGames() {
        return lostGames;
    }

    public Integer getWonGames() {
        return wonGames;
    }

    public Integer getLevel() {
        return playerLevel;
    }

}
