Feature: visualizar el historial de mis sesiones
  Scenario: El Usuario Homehealthy desea visualizar su historial de sesiones

    Given El Usuario Homehealthy se encuentra en la página de Inicio

    When El Usuario Homehealthy haga click en Sessions

    Then el sistema mostrará todo el historial de sesiones realizadas.

  Scenario: El Usuario Homehealthy desea visualizar su historial de sesiones

    Given El Usuario Homehealthy se encuentra en la página de Inicio

    When El Usuario Homehealthy haga click en Sessions

    Then el sistema mostrará todo el historial de sesiones realizadas.

  Scenario: El Usuario Homehealthy no puede visualizar su historial de sesiones porque es nuevo

    Given El Usuario Homehealthy se encuentra en la página de Inicio

    When El Usuario Homehealthy haga click en Sessions

    Then el sistema no muestra las sesiones registradas debido a que es nuevo y no ha tenido ninguna