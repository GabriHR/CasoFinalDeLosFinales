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

1) Debemos diseñar un programa para un s i stema de dispositivos portables aplicados  en  telemedicina  que  contienen  una  cantidad  de  memoria  muy limitada ( 4 KB). Tenemos diferentes alternativas que hacen diferente uso de la computación y la memoria.

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
  
## PREGUNTAS DE DEASARROLLO HOJA 5/17

3)  Explica las diferencias entre un a pila y una cola. ¿ Cuándo conviene utilizar cada una de estas estructuras? ¿ Cuál es el orden de complejidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

__SOLUCIÓN:__
- __Pila (Stack):  Una pila es una estructura de datos que sigue el principio de LIFO (Last In, First Out), lo que significa que el último elemento que se agrega a la pila es el primero en ser eliminado. Las operaciones principales que se pueden realizar en una pila son push (para agregar un elemento a la pila) y pop (para eliminar un elemento de la pila).__
- __Cola (Queue):  Una cola es una estructura de datos que sigue el principio de FIFO (First In, First Out), lo que significa que el primer elemento que se agrega a la cola es el primero en ser eliminado. Las operaciones principales que se pueden realizar en una cola son enqueue (para agregar un elemento al final de la cola) y dequeue (para eliminar un elemento del frente de la cola).__

__¿Cuándo conviene utilizar cada una de estas estructuras?__

- __Use una pila cuando necesite acceso al elemento más recientemente agregado.__
- __Use una cola cuando necesite acceso al elemento más antiguo.__
__¿Cuál es el orden de complejidad computacional de estas estructuras?__
__Para ambas estructuras, las operaciones de agregar y eliminar elementos son de tiempo constante (O(1)), ya que no dependen del número de elementos en la estructura. Sin embargo, la operación de búsqueda (encontrar un elemento específico) es de tiempo lineal (O(n)), ya que en el peor de los casos, puede requerir recorrer todos los elementos de la estructura.__

## PREGUNTAS DE DESARROLLO HOJA 7/17

5) Dadas dos funciones y su número de operaciones:
- A = 1024 n
- B = 16 n 3
Calcular a partir de qué tamaño de entrada n A es más eficiente que B.

__SOLUCIÓN:__
- __Para determinar a partir de qué tamaño de entrada n la función A es más eficiente que B, necesitamos encontrar el valor de n para el cual A(n) < B(n).__ 
- __Esto se puede hacer resolviendo la desigualdad 1024n < 16n^3.__
- __Dividimos ambos lados de la desigualdad por 16n para simplificarla:  64 < n^2.__
- __Finalmente, tomamos la raíz cuadrada de ambos lados para resolver para n:  n > sqrt(64)  Por lo tanto, A es más eficiente que B para n > 8.__

## PREGUNTAS DE DESARROLLO HOJA 8/17

3) Dado el siguiente algoritmo recursivo:

![image](https://github.com/GabriHR/CasoFinalDeLosFinales/assets/146011181/a53d4627-0136-4caf-b476-1e3ad1ad9302)

Preguntas:
a) ¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programa
como considere conveniente. Explique su solución de manera concisa.
b) Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando.

__SOLUCIÓN:__
__El código que proporcionaste compilará y se ejecutará correctamente. Sin embargo, el resultado puede no ser el esperado.  La función recursive parece estar implementando una operación de potencia (a^b), pero hay un problema con la forma en que se manejan los exponentes negativos. En matemáticas, cualquier número (excepto cero) elevado a la potencia de -n es igual a 1 dividido por ese número elevado a la potencia de n. Pero en tu implementación, simplemente estás multiplicando a por sí mismo b veces, lo que no dará el resultado correcto para exponentes negativos.  Además, estás intentando imprimir el resultado como un int, pero cualquier número (excepto cero) elevado a la potencia de -n dará como resultado un número decimal. En tu caso, 1 elevado a la potencia de -2 debería dar como resultado 0.25, pero como estás intentando imprimir el resultado como un int, se truncará a 0.__

__Para corregir este error el codigo se podría modificar para que maneje exponentes negativos correctamente y que devuelva un double para permitir resultados decimales.__
__Aquí está el código con dicho error solucionado. El código imprimirá 1, ya que 1 elevado a -2 tiene como resultado 1.__

![image](https://github.com/GabriHR/CasoFinalDeLosFinales/assets/146011181/25847f2f-4f2e-49cd-9094-31d7384b71d7)

__¿Qué cáculo está haciendo el código y que tipo de recursividad está utilizando?__
__El código proporcionado está calculando la potencia de un número utilizando recursividad. La función recursive toma dos argumentos: la base a y el exponente b.  La recursividad que se utiliza es la recursividad lineal. En este tipo de recursividad, la función se llama a sí misma una vez en cada paso de la recursión.  El cálculo se realiza de la siguiente manera:__
- __Si el exponente b es 0, la función devuelve 1. Esto se debe a que cualquier número elevado a la potencia de 0 es 1.__
- __Si la base a es 0, la función devuelve 0. Esto se debe a que 0 elevado a cualquier potencia es 0.__
- __Si el exponente b es negativo, la función devuelve el recíproco de a multiplicado por la función recursive llamada con a y -b - 1 como argumentos. Esto se debe a que un número elevado a una potencia negativa es igual al recíproco del número elevado a esa potencia en positivo.__
- __Si el exponente b es positivo, la función devuelve a multiplicado por la función recursive llamada con a y b - 1 como argumentos. Esto se debe a que un número elevado a una potencia positiva es igual al número multiplicado por sí mismo esa cantidad de veces.__
__En el método main, la función recursive se llama con a igual a 1 y b igual a -2. Por lo tanto, el resultado que se imprime es 1, ya que 1 elevado a cualquier potencia es siempre 1.__

## PREGUNTAS DE DESARROLLO HOJA 9/17

4) Calcular de forma recursiva la suma de los dígitos de un número siendo un ejemplo el número 102 -> 1 + 0 + 2 = 3. Recuerde que puede realizar los cambios de tipo que crea necesarios para facilitar la
resolución:
¿Qué tipo de recursividad se está empleando? ¿ Qué complejidad computacional
tiene el algoritmo?

__SOLUCIÓN:__

__Para calcular la suma de los dígitos de un número de forma recursiva, se puede utilizar la recursividad lineal.__
__En este tipo de recursividad, la función se llama a sí misma una vez en cada paso de la recursión.  El algoritmo para calcular la suma de los dígitos de un número de forma recursiva se puede describir de la siguiente manera:__ 
- __Si el número es menor que 10, devolver el número (ya que es un solo dígito).__
- __Si no, calcular el módulo de 10 del número (esto da el último dígito) y sumarlo a la suma de los dígitos del número dividido por 10 (esto elimina el último dígito).__

__Aquí proporciono el código que cumple con lo requerido y lo que imprime dicho código:__
![image](https://github.com/GabriHR/CasoFinalDeLosFinales/assets/146011181/adf22536-de1f-44c3-95f9-10dd698b915e)
