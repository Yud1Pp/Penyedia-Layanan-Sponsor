public class Perusahaan extends User{
    private String namaPt;
    private String namaCp;
    private String alamat;
    private Event history;
    private Penyelenggara eventOrganizer;

    public Perusahaan() {
    }

    public Perusahaan(String namaPt,  String namaCp, String alamat, String username, String password, String email) {
        super(username, password, email);
        this.namaPt = namaPt;
        this.namaCp = namaCp;
        this.alamat = alamat;
    }

    public void setEventOrganizer(Penyelenggara eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }
    
    public void cekAcara(){
        System.out.println(this.eventOrganizer.getInstitusi());
        System.out.println(this.eventOrganizer.getNama());
        System.out.println(this.eventOrganizer.getAcara().getNamaAcara());
        System.out.println(this.eventOrganizer.getAcara().getPeriode());
        System.out.println(this.eventOrganizer.getAcara().getProposal());
    }
    
    public void formPerjanjian(String mou){
        this.eventOrganizer.getAcara().setMou(mou);
    }

    public String getNamaPt() {
        return namaPt;
    }

    public String getNamaCp() {
        return namaCp;
    }

    public String getAlamat() {
        return alamat;
    }

    public Event getHistory() {
        return history;
    }

    public Penyelenggara getEventOrganizer() {
        return eventOrganizer;
    }

    public void setNamaPt(String namaPt) {
        this.namaPt = namaPt;
    }

    public void setNamaCp(String namaCp) {
        this.namaCp = namaCp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
