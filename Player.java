public class Player{
    private static String username, password;
    private static int score, position;

    Player(){
    }

    Player(String initialName, String initialPassword, int initialPosition, int initialScore){
        username = initialName;
        password = initialPassword;
        position = initialPosition;
        score = initialScore;
    }

    public void setUsername(String newUsername){
        username = newUsername;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }
    public String getPassword(){
        return password;
    }


    public void setPosition(int newPosition){
        position = newPosition;
    }
    public int getPosition(){
        return position;
    }
    public void setScore(int newScore){
        score = newScore;
    }
    public int getScore(){
        return score;
    }

    public void writeOutput()
    {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Position: " + position);
        System.out.println("Score: "+ score);
    }
    public String Write() {
        return "Username:"+ username + "\nPassword: " + password +"\nPosition: "+position+  "\nScore: " + score;
    }

}

