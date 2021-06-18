Feature: Close session
  As sofkiano
  I Want que la sesion se cierre despues de un periodo de inactividad

  Scenario: Cerrar sesion
    Given : Estoy en la home page
    When  : Dejo la pagina inactiva por dos minutos
    Then  : La sesion se cerrara