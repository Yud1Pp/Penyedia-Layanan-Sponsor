public class Event {
    private String namaAcara;
    private String periode;
    private Perusahaan[] penyedia;
    private Penyelenggara eventOrganizer;
    private String proposal;
    private String mou;
    private int jumlahSponsor;

    public Event() {
        this.penyedia = new Perusahaan[5];
    }

    public void setNamaAcara(String namaAcara) {
        this.namaAcara = namaAcara;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setPenyedia(Perusahaan penyedia) {
        this.penyedia[jumlahSponsor] = penyedia;
        jumlahSponsor++;
    }

    public void setEventOrganizer(Penyelenggara eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public void setMou(String mou) {
        this.mou = mou;
    }
    
    public String getNamaAcara() {
        return namaAcara;
    }

    public String getPeriode() {
        return periode;
    }

    public Perusahaan[] getPenyedia() {
        return penyedia;
    }

    public Penyelenggara getEventOrganizer() {
        return eventOrganizer;
    }

    public String getProposal() {
        return proposal;
    }

    public String getMou() {
        return mou;
    }

   
    
    
}