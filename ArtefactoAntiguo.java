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






}