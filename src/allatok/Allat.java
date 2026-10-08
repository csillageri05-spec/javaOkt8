package allatok;

public abstract class Allat {
    private String nev;

    public Allat(String nev) {
        this.nev = nev;
    }
    
    public void eszik(){
        System.out.printf("%s nyam nyam\n",nev);
    }

    public String getNev() {
        return nev;
    }
    
    public abstract void hangotAd(); 
}
