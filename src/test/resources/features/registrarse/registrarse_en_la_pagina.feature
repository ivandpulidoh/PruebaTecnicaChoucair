Feature: Registrarse en la pagina web Utest

  Scenario: Crear correctamente un nuevo usuario
    Given El usuario ingresa a la pagina Utest
    When El usuario da clic en el boton JoinToDay y diligencia la siguiente informacion personal "Jose", "torres", "L0RENZ3@gmail.com", "12-August-2000"
    And El usuario da clic en Siguiente y diligencia la informacion de su ubicacion en el step2
    And El usuario da clic en Siguiente y diligencia la informacion de su dispositivo en el step3
    And El usuario da clic en Siguiente y establece una contrasena segura en el step4
    Then El usuario deberia ser redireccionado a la pagina de bienvenida con el siguiente msj "Welcome to the world's largest community of freelance software testers!"