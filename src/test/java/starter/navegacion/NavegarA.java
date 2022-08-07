package starter.navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {
    public static Performable paginaDeInicioUtest(){
        return Task.where("{0} abrir la pagina principal de UTest",
                Open.browserOn().the(UTestPaginaPrincipal.class));
    }
}
