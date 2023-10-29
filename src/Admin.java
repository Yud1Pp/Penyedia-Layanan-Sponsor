public class Admin extends User{
    private String nama;
    private Event acara;
    private Penyelenggara eventOrganizer;
    private Perusahaan perusahaan;

    public Admin() {
    }
    
    

    public Admin(String nama, Event acara, Penyelenggara eventOrganizer, Perusahaan perusahaan, String username, String password, String email) {
        super(username, password, email);
        this.nama = nama;
        this.acara = acara;
        this.eventOrganizer = eventOrganizer;
        this.perusahaan = perusahaan;
    }
    
}
