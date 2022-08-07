package starter.informacionDispotivo;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.Keys;

public class RegistrarInformacionDispotivo {

    public static Performable ingresarInformacion(){
        return Task.where("Ingresar la información del dispostivo",
                Click.on(InformacionDispotivoForm.BOTON_SIGUIENTE)
        );
    }
}

