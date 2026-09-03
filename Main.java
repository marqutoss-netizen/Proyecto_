public class Main {
    public static void main(String[] args) {


        //INSTANCIACIÓN DE OBJETOS DE LA SUPER CLASE Y DE CADA SUBCLASE CON SUS RESPECTIVOS CONSTRUCTORES

        // Se usa el constructor de 4 parámetros porque la ficha arqueológica inicial cuenta con toda la información técnica.
        ArtefactoAntiguo objeto1 = new ArtefactoAntiguo("ART-001", 1998, 450.2, false);
        
        // Se usa el constructor de 2 parámetros porque solo se dispone del identificador y el peso registrado en el campo de excavación.
        ArtefactoAntiguo objeto2 = new ArtefactoAntiguo("ART-002", 1250.0);

        // Se usa el constructor completo de la subclase 1 para registrar todos los detalles biológicos de la especie encontrada.
        FosilAnimal objeto3 = new FosilAnimal("FOS-101", 2010, 8500.0, true, "Tyrannosaurus", 68, 12.3, 'E');
        
        // Se usa el constructor de 2 parámetros de la subclase 1 ya que se trata de un hallazgo superficial y solo se conoce el nombre sugerido.
        FosilAnimal objeto4 = new FosilAnimal("FOS-102", "Trilobite");

        // Se usa el constructor completo de la subclase 2 para especificar tanto los parámetros generales del artefacto como los mecánicos de la herramienta.
        HerramientaPrehistorica objeto5 = new HerramientaPrehistorica("HER-201", 1923, 320.0, false, "Obsidiana", 80, 8.5, false);
        
        // Se usa el constructor de 4 parámetros de la subclase 2 porque la herramienta carece de indicadores de peso o mangos compuestos.
        HerramientaPrehistorica objeto6 = new HerramientaPrehistorica("HER-202", 12.0, "Sílex", 45);

        // Se usa el constructor completo de la subclase 3 para delimitar con exactitud las dimensiones de la tabla y la cantidad de texto identificada.
        TextoInscrito objeto7 = new TextoInscrito("TXT-301", 1947, 1500.0, false, "Latín Antiguo", 450, 30.5, 120L);
        
        // Se usa el constructor de 4 parámetros de la subclase 3 orientándolo exclusivamente a registrar las métricas de espacio físicas de la pieza texturizada.
        TextoInscrito objeto8 = new TextoInscrito("TXT-302", 950.0, 80, 18.2);





    }
}
