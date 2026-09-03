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




}
