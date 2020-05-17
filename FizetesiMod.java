package progtech_szalloda;

class FizetesiMod implements Fizetes {
    Fizetes hogyan;

    public FizetesiMod(Fizetes hogyan){
        this.hogyan=hogyan;
    }
    public void Fizetes(){
        hogyan.Fizetes();
    }
    public void setFizetes(Fizetes hogyan){
        this.hogyan=hogyan;
    }
            
}
