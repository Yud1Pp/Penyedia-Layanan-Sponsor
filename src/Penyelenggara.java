
import java.util.Arrays;

public class Penyelenggara extends User{
    private String nama;
    private String institusi;
    private Event acara;
    private Event history;
    private int jumlahSponsor;

    public Penyelenggara() {
    }

    
    public Penyelenggara(String nama, String institusi, String username, String password, String email) {
        super(username, password, email);
        this.nama = nama;
        this.institusi = institusi;
    }
    
    public void isiEvent(Event acara, String namaAcara, String periode){
        this.acara = acara;
        this.acara.setNamaAcara(namaAcara);
        this.acara.setPeriode(periode);
    }
    
    public void setSponsor(Perusahaan penyedia, String proposal){
        this.acara.setPenyedia(penyedia);
        this.acara.setProposal(proposal);
    }
    
    public void cekMou(){
        System.out.println(Arrays.toString(this.acara.getPenyedia()));
    }

    public String getNama() {
        return nama;
    }

    public String getInstitusi() {
        return institusi;
    }

    public Event getAcara() {
        return acara;
    }

    public Event getHistory() {
        return history;
    }

    public int getJumlahSponsor() {
        return jumlahSponsor;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setInstitusi(String institusi) {
        this.institusi = institusi;
    }

}
