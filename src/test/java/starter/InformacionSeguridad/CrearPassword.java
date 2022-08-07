package starter.InformacionSeguridad;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearPassword {
    public static Performable ingresarInformacion(){
        return Task.where("Ingresar la contraseña",
                Click.on(SeguridadForm.BOTON_SIGUIENTE_SEGURIDAD),
                Enter.theValue(InformacionSeguridad.getDefaultPassword()).into(SeguridadForm.CAMPO_PASSWORD),
                Enter.theValue(InformacionSeguridad.getDefaultPassword()).into(SeguridadForm.CAMPO_CONFIRM_PASSWORD),
                Click.on(SeguridadForm.CHECK_BOX_UTEST_TERMS),
                Click.on(SeguridadForm.CHECK_BOX_PRIVACY),
                Click.on(SeguridadForm.BOTON_FINALIZAR)
        );
    }
}
