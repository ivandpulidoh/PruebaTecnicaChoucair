package starter.paginaBienvenida;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;
import org.openqa.selenium.By;
import starter.utils.WaitTime;

import java.util.List;


public class MensajePaginaBienvenida implements Question<String>{

    public static Question<String> paginaBienvenida(){
        return new MensajePaginaBienvenida();
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitTime.explicitWait(1500);
        return BrowseTheWeb.as(actor).find(PaginaBienvenidaForm.MENSAJE_PAGINA_BIENVENIDA).getText();
    }
}
