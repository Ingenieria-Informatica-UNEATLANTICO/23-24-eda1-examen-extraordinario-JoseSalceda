Refactorización del Sistema de Gestión de Hamburguesas



Commit 1: Planificación inicial


He añadido todas las clases para poder realizar los cambios necesarios.

Después de mirar el código existente, he decidido usar las listas para poder realizar las operaciones de CRUD y asi poder "editar" la hamburguesa.

Tengo pensado :

-Usar una clase (hamburguesamanager) como manager del resto.

-Refactorizar las clases necesarias para que funcionen las listas.

-Implementar operaciones CRUD.



Commit 2: Creación de HamburgesaManager


He creado una nueva clase llamada HamburgesaManager. Esta clase utiliza una List para almacenar múltiples hamburguesas. He implementado métodos CRUD directamente:

-crearHamburguesa: Para añadir una nueva hamburguesa a la lista.

-obtenerHamburguesa y obtenerTodasLasHamburguesas: Para leer hamburguesas.

-actualizarHamburguesa: Para actualizar una hamburguesa existente.

-eliminarHamburguesa: Para eliminar una hamburguesa de la lista.



Commit 3: Modificación de la clase Cocinero


He actualizado la clase Cocinero para que utilice el HamburguesaManager. En lugar de crear directamente una Hamburguesa, el Cocinero ahora usa el HamburguesaManager para crear y cambiar las hamburguesas.
