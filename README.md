# MyTasksManager

Proyecto de gestión de tareas basado en tecnología Spring Boot.

Objetivos : Aumentar mis competancias en Spring Boot con la creación de una APIRest.

Pongo como eje central en mi trabajo las iteraciones para refinar y añadir nuevas características en cada iteración.

   Primera iteración
   
1. Inicialización de proyecto Spring Boot.
2. Creo base de datos y la conecto al proyecto.
3. Creo modelo /entidad section. @Entity
4. Creo repositorio section a través de uso de interfaces y su implementación. extend Data JPA.  @Repository
5. Creo servicio section a través de uso de interfaces y su implementación. @Service
6. Creo endpoints para recursos de section. @RestController, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @RequestBody, @PathVariable
7. Verifico funcionamiento correcto con Postman.

   Segunda iteración

1. Validacion de datos de entrada.
2. Añado excepciones NOT_FOUND para solicitudes get ,en caso de no ser encontradas en base de datos.
