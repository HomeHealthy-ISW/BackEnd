Feature: visualizar mi dieta
  Scenario: El usuario HomeHealthy desea visualizar su dieta

    Given El usuario HomeHealthy se encuentra en la página de Diets

    When El usuario haga click en Ver Detalle de las dietas que tiene preparadas

    Then el sistema mostrará todo el detalle de las comidas que debe realizar durante la semana.

  Scenario: El usuario HomeHealthy no puede visualizar su dieta

    Given El usuario HomeHealthy se encuentra en la página de Diets

    When El usuario no visualiza ninguna dieta

    Then El usuario no tiene agendada ninguna dieta

  Scenario: El usuario HomeHealthy no puede visualizar sus dietas por problemas de conexión.

    Given El usuario HomeHealthy se encuentra en la página de Diets

    When La página no cargue y se quedé en estado congelado

    Then El usuario deberá de esperar a tener una buena conexión a la red para visualizar sus dietas en caso tenga una agendada.