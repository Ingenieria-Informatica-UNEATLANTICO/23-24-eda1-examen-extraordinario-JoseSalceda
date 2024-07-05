## Refactorización del Sistema de Gestión de Hamburguesas

### Commit 1: Planificación inicial


He añadido todas las clases para poder realizar los cambios necesarios.

Después de mirar el código existente, he decidido usar las listas para poder realizar las operaciones de CRUD y asi poder "editar" la hamburguesa.

Tengo pensado :

-Usar una clase (hamburguesamanager) como manager del resto.

-Refactorizar las clases necesarias para que funcionen las listas.

-Implementar operaciones CRUD.



### Commit 2: Creación de HamburgesaManager


He creado una nueva clase llamada HamburgesaManager. Esta clase utiliza una List para almacenar múltiples hamburguesas. He implementado métodos CRUD directamente:

- crearHamburguesa: Para añadir una nueva hamburguesa a la lista.

- obtenerHamburguesa y obtenerTodasLasHamburguesas: Para leer hamburguesas.

- actualizarHamburguesa: Para actualizar una hamburguesa existente.

- eliminarHamburguesa: Para eliminar una hamburguesa de la lista.



### Commit 3: Modificación de la clase Cocinero


He actualizado la clase Cocinero para que utilice el HamburguesaManager. En lugar de crear directamente una Hamburguesa, el Cocinero ahora usa el HamburguesaManager para crear y cambiar las hamburguesas.



### Commit 4: Actualización de la clase Restaurante


He modificado la clase Restaurante para que sea el punto central de interacción del sistema. Los cambios incluyen:

- Iniciar HamburguesaManager.

- Pasar el HamburguesaManager hacia Cocinero.

- Implementar métodos para usa las operaciones CRUD en HamburguesaManager.



### Commit 5: Modificacion del programa (Listas a Nodos)


Borrado el plantuml anterior, que se me habia olvidado mencionar antes que había creado

Como estaba usando listas, que no hemos dado EDA1, he decidido cambiar el funcionamiento del programa para que use nodos. 

- Añadido node.java
  
- Editado hamburguesaManager para que funcione con nodos y eliminadas las listas
  
- Editado tambien restaurante para cumplir con los cambios en hamburguesaManager



### Commit 6: Añadidas pruebas de que funciona el programa


En la clase restaurante se demuestra que el CRUD esta bien implementado
