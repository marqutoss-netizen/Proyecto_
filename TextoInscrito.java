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

}
