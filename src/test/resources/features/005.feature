Feature: crear una dieta personalizada
  Scenario: El nutricionista desea agregar una dieta

    Given El nutricionista se dirigirá a la página de Diets

    When El nutricionista hará click en el ícono de añadir

    Then El sistema mostrará el formulario para poder crear una dieta personalizada

  Scenario: El nutricionista agrega una dieta correctamente

    Given El nutricionista se encuentra en la página de Diets

    When El nutricionista hará click en el ícono de añadir

  And Completa todos los campos necesarios para la dieta

    Then El sistema añadirá la dieta al usuario que el Nutricionista asigne

  Scenario: El nutricionista agrega una dieta incorrectamente

    Given El nutricionista se encuentra en la página de Diets

    When El nutricionista hará click en el ícono de añadir

  And Completa todos los campos necesarios para la dieta y no selecciona un usuario

    Then El sistema no le permitirá añadir la dieta a un usuario con campo vacío.