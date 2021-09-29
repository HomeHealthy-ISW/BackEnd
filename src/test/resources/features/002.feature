Feature: Encontrar un entrenador
Scenario: El usuario HomeHealthy es nuevo en la plataforma
  Given El usuario HomeHealthy nuevo desee buscar un especialista
  When El usuario hace click en Collaborators
  Then el sistema deberá mostrar un formulario con todos los especialistas actuales de la aplicación.

Scenario: El usuario HomeHealthy busca un especialsta filtrando por nombre de manera incorrecta
  Given El usuario HomeHealthy se encuentra en la página de Collaborators
  When El usuario escribe el nombre de manera incorrecta
  Then el sistema no mostrará ningún dato por la mala digitación

Scenario: El usuario HomeHealthy busca un especialsta filtrando por nombre de manera correcta
  Given El usuario HomeHealthy se encuentra en la página de Collaborators
  When El usuario escribe el nombre de manera correcta
  Then el sistema mostrará los resultados que coincidan con los datos ingresados