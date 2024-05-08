# CasoFinalDeLosFinales: Caso Final de los Finales Integrador 2023-2024

## PREGUNTAS TIPO TEST HOJA 2/17

1) En relación al estado de un objeto, para preservar el principio de encapsulación:

a)    Los atributos de nuestra clase deben permanecer públicos, para permitir un acceso total a la información que almacenamos en los objetos. Sin embargo, aquellos métodos que realicen operaciones internas (y no deban ser utilizados), deben establecerse como privados.

b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

__OPCIÓN CORRECTA: b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.__

2) Los métodos de una clase no pueden devolver objetos:

a) Verdadero

b) Falso

__OPCIÓN CORRECTA: b) Falso__

3) ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?

a) Abstracción

b) Herencia

__OPCIÓN CORRECTA: b) Herencia__

4) El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:

a) O(n)

b) O(1)

__OPCIÓN CORRECTA: b) O(1)__

5) Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:

a) Verdadero

b) Falso

__OPCIÓN CORRECTA:b) Falso__

## PREGUNTAS TIPO TEST HOJA 3/17

1) Debemos diseñar un programa para un s i stema de dispositivos portables aplicados  en  telemedicina  que  contienen  una  cantidad  de  memoria  muy l imitada ( 4 KB). Tenemos diferentes alternativ as que hacen diferente uso de la computación y la memoria.

a) La primera de ellas t iene un orden de complejidad computacional O( n) y va a ocupar un espacio S( 1 ).

b) La segunda de ellas t iene un orden de complejidad computacional O( 1 ) pero lo hace mediante una técnica denominada para guardar muchos datos en memoria, por lo que ocupa un espacio de S( N 2 ).

c) La tercera y última t iene una complejidad computacional de O( log 2 ( N)) y ocupa un poco más de espacio en memoria S( O( log 2 ( N))).

__OPCIÓN CORRECTA: c) La tercera y última t iene una complejidad computacional de O( log 2 ( N)) y ocupa un poco más de espacio en memoria S( O( log 2 ( N))). 
Debido a que tenemos una limitación de memoria y el tamaño de los datos de entrada es relativamente grande (64 KB), la opción correcta sería la opción c). Esta opción ofrece un uso de la memoria más eficientes, lo cual es fundamental para nuestro sistema de dispositivos portables aplicados en telemedicina (con memoria limitada).__

## PREGUNTAS DE DESARROLLO HOJA 4/17

2) Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

__SOLUCIÓN:__

__Ventajas de una tabla Hash:__ 
- __Acceso, inserción y eliminación de tiempo constante O(1) en el caso promedio.__
- __Muy eficiente cuando la clave de acceso a los datos es conocida.__
__Desventajas de una tabla Hash:__
- __El rendimiento depende en gran medida de la calidad de la función hash.__
- __No mantiene ningún orden de las claves o valores.__
- __Puede tener colisiones donde diferentes claves tienen el mismo valor hash.__

__Ventajas de un árbol:__
- __Mantiene los datos ordenados, lo que permite operaciones de búsqueda eficientes.__
- __Los árboles como los árboles AVL y los árboles B están equilibrados, lo que garantiza una búsqueda, inserción y eliminación de tiempo logarítmico O(log n).__
__Desventajas de un árbol:__
- __Las operaciones de inserción y eliminación pueden ser complejas ya que pueden requerir el reequilibrio del árbol.__
- __Utiliza más memoria que las tablas hash ya que necesita almacenar información adicional (como los punteros a nodos hijos).__

__¿Cuándo conviene utilizar cada una de estas estructuras?__

- __Use una tabla hash cuando necesite búsquedas rápidas y la inserción y eliminación de datos, y no le importe el orden de los datos.__
- __Use un árbol cuando necesite mantener los datos ordenados y realizar operaciones de búsqueda eficientes, y no le importe el uso adicional de memoria y la complejidad de las operaciones de inserción y eliminación.__
