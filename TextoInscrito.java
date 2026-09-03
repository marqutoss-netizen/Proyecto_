public class TextoInscrito extends ArtefactoAntiguo {
    
    private String idiomaOriginal;
    private int cantidadCaracteres;
    private double anchoTablaCm;
    private long caracteresDescifrados;


    public TextoInscrito(String codigoRegistro, int anoDescubrimiento, double pesoGramos, boolean esOrganico,
                         String idiomaOriginal, int cantidadCaracteres, double anchoTablaCm, long caracteresDescifrados) {
        super(codigoRegistro, anoDescubrimiento, pesoGramos, esOrganico);
        this.idiomaOriginal = idiomaOriginal;
        this.cantidadCaracteres = cantidadCaracteres;
        this.anchoTablaCm = anchoTablaCm;
        this.caracteresDescifrados = caracteresDescifrados;
    }

    public TextoInscrito(String codigoRegistro, String idiomaOriginal, long caracteresDescifrados) {
        super(codigoRegistro);
        this.idiomaOriginal = idiomaOriginal;
        this.cantidadCaracteres = 100;
        this.anchoTablaCm = 15.5;
        this.caracteresDescifrados = caracteresDescifrados;
    }
    public TextoInscrito(String codigoRegistro, double pesoGramos, int cantidadCaracteres, double anchoTablaCm) {
        super(codigoRegistro, pesoGramos);
        this.idiomaOriginal = "Desconocido";
        this.cantidadCaracteres = cantidadCaracteres;
        this.anchoTablaCm = anchoTablaCm;
        this.caracteresDescifrados = 0L;
    }


    public String getIdiomaOriginal() { return idiomaOriginal; }
    public void setIdiomaOriginal(String idiomaOriginal) { this.idiomaOriginal = idiomaOriginal; }

    public int getCantidadCaracteres() { return cantidadCaracteres; }
    public void setCantidadCaracteres(int cantidadCaracteres) { this.cantidadCaracteres = cantidadCaracteres; }

    public double getAnchoTablaCm() { return anchoTablaCm; }
    public void setAnchoTablaCm(double anchoTablaCm) { this.anchoTablaCm = anchoTablaCm; }

    public long getCaracteresDescifrados() { return caracteresDescifrados; }
    public void setCaracteresDescifrados(long caracteresDescifrados) { this.caracteresDescifrados = caracteresDescifrados; }



    @Override
    public String toString() {
        return "[Texto Inscrito] " + super.toString() + " -> Idioma: " + idiomaOriginal + ", Caracteres: " + cantidadCaracteres + ", Ancho: " + anchoTablaCm + "cm, Descifrados: " + caracteresDescifrados;
    }

}
