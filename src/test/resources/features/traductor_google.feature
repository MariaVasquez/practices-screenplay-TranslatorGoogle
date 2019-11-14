#language: es

Característica: Traductor google

  Esquema del escenario: Traducir de Inglés a Español
    Dado que <nombre> se encuentra en el traductor de google
    Cuando ella traduce la palabra "<palabraInicial>" del español al inglés
    Entonces  ella puede ver la palabra "<palabraFinal>" en la pantalla

    Ejemplos:
      | palabraInicial | palabraFinal |
      | queso          | cheese       |

@TestModels

Escenario: Modelos y Builders

Cuando el usuario puede ejecutar un modelo