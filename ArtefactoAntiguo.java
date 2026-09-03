public class ArtefactoAntiguo {

    private String codigoRegistro;
    private int anoDescubrimiento;
    private double pesoGramos;
    private boolean esOrganico;


    public ArtefactoAntiguo(String codigoRegistro, int anoDescubrimiento, double pesoGramos, boolean esOrganico) {
        this.codigoRegistro = codigoRegistro;
        this.anoDescubrimiento = anoDescubrimiento;
        this.pesoGramos = pesoGramos;
        this.esOrganico = esOrganico;
    }
    public ArtefactoAntiguo(String codigoRegistro, double pesoGramos) {
        this(codigoRegistro, 2026, pesoGramos, false);
    }
        public ArtefactoAntiguo(String codigoRegistro) {
        this(codigoRegistro, 0.0);
    }

    

    public String getCodigoRegistro() { return codigoRegistro; }
    public void setCodigoRegistro(String codigoRegistro) { this.codigoRegistro = codigoRegistro; }

    public int getAnoDescubrimiento() { return anoDescubrimiento; }
    public void setAnoDescubrimiento(int anoDescubrimiento) { this.anoDescubrimiento = anoDescubrimiento; }

    public double getPesoGramos() { return pesoGramos; }
    public void setPesoGramos(double pesoGramos) { this.pesoGramos = pesoGramos; }

    public boolean isEsOrganico() { return esOrganico; }
    public void setEsOrganico(boolean esOrganico) { this.esOrganico = esOrganico; }


     @Override
    public String toString() {
        return "Código: " + codigoRegistro + ", Año: " + anoDescubrimiento + ", Peso(g): " + pesoGramos + ", Orgánico: " + esOrganico;
    }

    }