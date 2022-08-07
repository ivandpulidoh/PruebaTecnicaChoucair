package starter.informacionDispotivo;

import net.serenitybdd.screenplay.targets.Target;

public class InformacionDispotivoForm {
    public static Target BOTON_SIGUIENTE = Target.the("Boton Siguiente Hacia la Pagina de Dispotivo").locatedBy("//a[@aria-label='Next step - select your devices']");
    public static Target LISTA_MARCAS = Target.the("Lista de marcas").locatedBy("//span[@aria-label='Select Brand']");
    public static Target CAMPO_MARCA = Target.the("Campo para ingresar la marca").locatedBy("//input[@placeholder='Select Brand']");
}
