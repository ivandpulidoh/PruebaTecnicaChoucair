package starter.InformacionSeguridad;


import net.serenitybdd.screenplay.targets.Target;

public class SeguridadForm {
    public static Target BOTON_SIGUIENTE_SEGURIDAD = Target.the("Boton para continuar con la paguina de seguridad").locatedBy("//a[@aria-label='Next - final step']");
    public static Target CAMPO_PASSWORD = Target.the("Campo para ingresar la contraseña").locatedBy("#password");
    public static Target CAMPO_CONFIRM_PASSWORD = Target.the("Campo para confirmar la contraseña").locatedBy("#confirmPassword");
    public static Target CHECK_BOX_UTEST_TERMS = Target.the("Check box para la aceptar los terminos").locatedBy("//span[@ng-class='{error: userForm.termOfUse.$error.required}']");
    public static Target CHECK_BOX_PRIVACY = Target.the("Check box para aceptar lo privacidad").locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static Target BOTON_FINALIZAR = Target.the("Botón para finalizar el registro").locatedBy("#laddaBtn");
}
