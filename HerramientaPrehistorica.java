public class HerramientaPrehistorica extends ArtefactoAntiguo {
    
    private String materialPrincipal;
    private int filoEstimadoNewton;
    private double grosorMm;
    private boolean tieneMango;



    public HerramientaPrehistorica(String codigoRegistro, int anoDescubrimiento, double pesoGramos, boolean esOrganico,
                                   String materialPrincipal, int filoEstimadoNewton, double grosorMm, boolean tieneMango) {
        super(codigoRegistro, anoDescubrimiento, pesoGramos, esOrganico);
        this.materialPrincipal = materialPrincipal;
        this.filoEstimadoNewton = filoEstimadoNewton;
        this.grosorMm = grosorMm;
        this.tieneMango = tieneMango;
    }
    public HerramientaPrehistorica(String codigoRegistro, double pesoGramos, String materialPrincipal, int filoEstimadoNewton) {
        super(codigoRegistro, pesoGramos);
        this.materialPrincipal = materialPrincipal;
        this.filoEstimadoNewton = filoEstimadoNewton;
        this.grosorMm = 10.0;
        this.tieneMango = false;
    }
    public HerramientaPrehistorica(String codigoRegistro, String materialPrincipal, int filoEstimadoNewton) {
        super(codigoRegistro);
        this.materialPrincipal = materialPrincipal;
        this.filoEstimadoNewton = filoEstimadoNewton;
        this.grosorMm = 5.0;
        this.tieneMango = true;
    }

    
    @Override
    public String toString() {
        return "[Herramienta] " + super.toString() + " -> Material: " + materialPrincipal + ", Filo: " + filoEstimadoNewton + "N, Grosor: " + grosorMm + "mm, Mango: " + tieneMango;
    }
}
