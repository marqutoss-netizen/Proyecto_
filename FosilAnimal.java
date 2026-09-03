public class FosilAnimal extends ArtefactoAntiguo  {

    private String especieEstimada;
    private int antiguedadMillonesAnos;
    private double longitudMetros;
    private char estadoConservacion;

    
    public FosilAnimal(String codigoRegistro, int anoDescubrimiento, double pesoGramos, boolean esOrganico,
                       String especieEstimada, int antiguedadMillonesAnos, double longitudMetros, char estadoConservacion) {
        super(codigoRegistro, anoDescubrimiento, pesoGramos, esOrganico);
        this.especieEstimada = especieEstimada;
        this.antiguedadMillonesAnos = antiguedadMillonesAnos;
        this.longitudMetros = longitudMetros;
        this.estadoConservacion = estadoConservacion;
    }


}
