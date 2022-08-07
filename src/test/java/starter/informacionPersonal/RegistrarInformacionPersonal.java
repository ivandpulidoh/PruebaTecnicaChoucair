package starter.informacionPersonal;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.utils.FormatoFechas;
import starter.utils.RandomNumber;


public class RegistrarInformacionPersonal {
    public static Performable ingresarInformacion(String nombre, String apellido, String email, String fechaDeNacimiento){
        return Task.where("{0} registra la informacion personal",
                Click.on(InformacionPersonalForm.BOTON_JOINTODAY),
                Enter.theValue(nombre).into(InformacionPersonalForm.CAMPO_NOMBRE),
                Enter.theValue(apellido).into(InformacionPersonalForm.CAMPO_APELLIDO),
                Enter.theValue(RandomNumber.generateNumber() + email).into(InformacionPersonalForm.CAMPO_CORREO),
                Click.on(InformacionPersonalForm.CAMPO_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(FormatoFechas.extraerMes(fechaDeNacimiento)).from(InformacionPersonalForm.CAMPO_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText((FormatoFechas.extraerDia(fechaDeNacimiento))).from(InformacionPersonalForm.CAMPO_DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(FormatoFechas.extraerAnio(fechaDeNacimiento)).from(InformacionPersonalForm.CAMPO_ANIO_NACIMIENTO)
        );

    }
}
