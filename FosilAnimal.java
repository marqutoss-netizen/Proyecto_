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


    public String getEspecieEstimada() { return especieEstimada; }
    public void setEspecieEstimada(String especieEstimada) { this.especieEstimada = especieEstimada; }

    public int getAntiguedadMillonesAnos() { return antiguedadMillonesAnos; }
    public void setAntiguedadMillonesAnos(int antiguedadMillonesAnos) { this.antiguedadMillonesAnos = antiguedadMillonesAnos; }

    public double getLongitudMetros() { return longitudMetros; }
    public void setLongitudMetros(double longitudMetros) { this.longitudMetros = longitudMetros; }

    public char getEstadoConservacion() { return estadoConservacion; }
    public void setEstadoConservacion(char estadoConservacion) { this.estadoConservacion = estadoConservacion; }

    
    @Override
    public String toString() {
        return "[Fósil Animal] " + super.toString() + " -> Especie: " + especieEstimada + ", Antigüedad: " + antiguedadMillonesAnos + "M de años, Longitud: " + longitudMetros + "m, Conservación: " + estadoConservacion;
    }


}
