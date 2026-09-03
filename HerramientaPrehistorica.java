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


}
