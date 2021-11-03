Feature: visualizar el historial de mis sesiones
  Scenario: El Entrenador desea visualizar su historial de sesiones

    Given El entrenador se encuentra en la página de Inicio

    When El entrenador haga click en Sessions

    Then el sistema mostrará todo el historial de sesiones realizadas y agendadas.

  Scenario: El nutricionista desea visualizar su historial de sesiones

    Given El nutricionista se encuentra en la página de Inicio

    When El nutricionista haga click en Sessions

    Then el sistema mostrará todo el historial de sesiones realizadas y agendadas.

  Scenario: El nutricionista no puede visualizar su historial de sesiones porque es nuevo

    Given El nutricionista se encuentra en la página de Inicio

    When El nutricionista haga click en Sessions

    Then el sistema no muestra las sesiones registradas debido a que es nuevo y no ha tenido ninguna