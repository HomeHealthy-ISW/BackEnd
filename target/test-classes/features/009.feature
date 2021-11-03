Feature: agendar una sesión con un especialista
  Scenario: El Usuario HomeHealthy desea agendar una sesión con un entrenador

    Given El Usuario HomeHealthy se encuentra en la página Collaborators

    When El usuario haga click en Ver perfil del entrenador

  And haga click en Select Schedule

    Then el sistema mostrará todos los horarios disponibles por los especialistas

  Scenario: El Usuario agenda una sesión con un entrenador de manera incorrecta

    Given El Usuario HomeHealthy se encuentra en la página Collaborators

    When El usuario haga click en Ver perfil del entrenador

  And haga click en Select Schedule y no elije ningún un horario
  And haga click en Schedule

    Then el sistema no agendará la sesión con el especialista porque no agenda un valor nulo

  Scenario: El Usuario agenda una sesión con un entrenador de manera correcta

    Given El Usuario HomeHealthy se encuentra en la página Collaborators

    When El usuario haga click en Ver perfil del entrenador

  And haga click en Select Schedule y elije un horario
  And haga click en Schedule

    Then el sistema agendará la sesión con el especialista