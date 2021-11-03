Feature:  crear una rutina
  Scenario: El entrenador desea agregar una rutina de ejercicios

    Given El entrenador se dirigirá a la página de Routines

    When El entrenador hará click en el ícono de añadir

    Then El sistema mostrará el formulario para poder crear una rutina de ejercicios personalizada

  Scenario: El entrenador agrega una rutina de ejercicios correctamente

    Given El entrenador se encuentra en la página de Routines

    When El entrenador hará click en el ícono de añadir

  And Completa todos los campos necesarios para la rutina

    Then El sistema añadirá la rutina al usuario que el Entrenador asigne

  Scenario: El entrenador agrega una rutina incorrectamente

    Given El entrenador se encuentra en la página de Routine

    When El entrenador hará click en el ícono de añadir

  And Completa todos los campos necesarios para la rutina y no selecciona un usuario

    Then El sistema no le permitirá añadir la dieta a un usuario con campo vacío.