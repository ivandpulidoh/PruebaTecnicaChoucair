package starter.informacionPersonal;

import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonalForm {
    static Target BOTON_JOINTODAY = Target.the("Botón Join To Day").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    static Target CAMPO_NOMBRE = Target.the("Campo Nombre").locatedBy("#firstName");
    static Target CAMPO_APELLIDO = Target.the("Campo Apellido").locatedBy("#lastName");
    static Target CAMPO_CORREO = Target.the("Campo Correo").locatedBy("#email");
    static Target CAMPO_MES_NACIMIENTO = Target.the("Campo Mes de Nacimiento").locatedBy("#birthMonth");
    static Target CAMPO_DIA_NACIMIENTO = Target.the("Campo Dia de Nacimiento").locatedBy("#birthDay");
    static Target CAMPO_ANIO_NACIMIENTO = Target.the("Campo Año de Nacimiento").locatedBy("#birthYear");
}
