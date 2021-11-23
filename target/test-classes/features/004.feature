Feature: visualizar el perfil del especialista

  Scenario: El usuario HomeHealthy desea visualizar el perfil del entrenador

    Given El usuario HomeHealthy se encuentra en la página de Collaboratorsp

    When El usuario haga click en Ver perfil

    Then el sistema mostrará el perfil del especialista

  Scenario: El usuario HomeHealthy no pueda visualizar el perfil del entrenador

    Given El usuario HomeHealthy se encuentra en la página de Collaborators

    When Ningún especialista esté registrado en la aplicaicón

    Then El usuario no observará ningún especialista

  Scenario: El usuario HomeHealthy no pueda visualizar el perfil del nutricionista

    Given El usuario HomeHealthy se encuentra en la página de Collaborators

    When Ningún especialista esté registrado en la aplicaicón

    Then El usuario no observará ningún especialista