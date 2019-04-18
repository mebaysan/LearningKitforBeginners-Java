


public class Kelime {

    private int id;
    private String name;
    private String dosyaYolu;
    public Kelime(int id, String name, String dosyaYolu){
        this.id = id;
        this.name = name;
        this.dosyaYolu = dosyaYolu;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dosyaYolu
     */
    public String getDosyaYolu() {
        return dosyaYolu;
    }

    /**
     * @param dosyaYolu the dosyaYolu to set
     */
    public void setDosyaYolu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }
    
    

}
