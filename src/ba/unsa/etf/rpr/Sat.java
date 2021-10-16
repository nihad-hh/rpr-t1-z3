package ba.unsa.etf.rpr;

public class Sat {

    private int sati,minute,sekunde;

    private void Postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
    public Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }

    private void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    private void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    private void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		else for (int i=0; i<-pomak; i++) Prethodni();
    }
    int DajSate() { return this.sati; } //removing const
    int DajMinute() { return minute; }
    int DajSekunde() { return sekunde; }
    void Ispisi() {
        System.out.println(this.sati + ":" + this.minute + ":" + this.sekunde);}

    public static void main(String[] args) {
        Sat s = new Sat(14, 20, 14);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}


