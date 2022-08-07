package starter.informacionUbicacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.utils.WaitTime;

public class RegistrarInformacionUbicacion {

    public static Performable continuarSiguientePagina(){
        WaitTime.explicitWait(1500);
    return Task.where("Cargar información y dar clic en Siguiente",
            Click.on(InformacionUbicacionForm.BOTON_SIGUIENTE));
    }
}
