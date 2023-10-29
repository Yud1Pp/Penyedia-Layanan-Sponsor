public class User {
    int id;
    private String username = " ";
    private String password = " ";
    private String email;

    public User() {
    }

    
    public User(String username, String password, String email) {
        this.id++;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public boolean login(String username, String password){
        String usn = this.username;
        String pw = this.password;
        return usn.equals(username) && pw.equals(password);
    }
    
    public void cekEvent(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
