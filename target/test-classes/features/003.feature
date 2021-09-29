Feature: visualizar mi rutina de la semana

Scenario: El usuario HomeHealthy desea visualizar su rutina semanal
  Given El usuario HomeHealthy se encuentra en la página de Routines
  When El usuario haga click en Ver Detalle de las rutinas que tiene preparadas
  Then el sistema mostrará el horario con la rutina semanal del usuario.

Scenario: El usuario HomeHealthy no puede visualizar sus rutinas semanales
  Given El usuario HomeHealthy se encuentra en la página de Routines
  When El usuario no visualice ninguna rutina
  Then El usuario no tiene agendada ninguna rutina

Scenario: El usuario HomeHealthy no puede visualizar sus rutinas semanales por problemas de conexión.
  Given El usuario HomeHealthy se encuentra en la página de Routines
  When La página no cargue y se quedé en estado congelado
  Then El usuario deberá de esperar a tener una buena conexión a la red para visualizar sus rutinas.