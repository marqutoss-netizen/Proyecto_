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
        public FosilAnimal(String codigoRegistro, double pesoGramos, String especieEstimada, int antiguedadMillonesAnos, double longitudMetros, char estadoConservacion) {
        super(codigoRegistro, pesoGramos);
        this.especieEstimada = especieEstimada;
        this.antiguedadMillonesAnos = antiguedadMillonesAnos;
        this.longitudMetros = longitudMetros;
        this.estadoConservacion = estadoConservacion;
    }
        public FosilAnimal(String codigoRegistro, String especieEstimada) {
        super(codigoRegistro);
        this.especieEstimada = especieEstimada;
        this.antiguedadMillonesAnos = 1;
        this.longitudMetros = 0.5;
        this.estadoConservacion = 'B';
    }

    @Override
    public String toString() {
        return "[Fósil Animal] " + super.toString() + " -> Especie: " + especieEstimada + ", Antigüedad: " + antiguedadMillonesAnos + "M de años, Longitud: " + longitudMetros + "m, Conservación: " + estadoConservacion;
    }


}
