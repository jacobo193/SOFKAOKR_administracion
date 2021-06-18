Feature: Login
  As un usuario
  I want logearme al sistema

  Scenario: login exitoso
    Given un usuario en la pagina de login
    When quiere logearse usando su cuenta google
    Then se logea exitosamente