Feature: agregar un horario
  Scenario: El nutricionista desea agregar un horario disponible

    Given El nutricionista se encuentra en su perfil

    When El nutricionista haga click en el date picker podrá seleccionar una fecha y hora

  And haga click en el ícono de añadir

    Then el sistema añadirá el horario para que los usuarios puedan agendarlo

  Scenario: El entrenador desea agregar un horario disponible

    Given El entrenador se encuentra en su perfil

    When El entrenador haga click en el date picker podrá seleccionar una fecha y hora

  And haga click en el ícono de añadir

    Then el sistema añadirá el horario para que los usuarios puedan agendarlo