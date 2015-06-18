# Estructura de Datos - Colas

Una cola es una estructura de datos que permite ingresar los datos en nodos, estructurados en forma de una cola.   

El primer nodo en entrar es el primero en salir (FIFO: _First In First Out_)   

Para implementarlo en Java, se crea una clase Cola y una clase Nodo, en donde nodo tiene un Nodo siguiente y un Objeto dato. La clase Cola tiene base(Nodo) = ultimo y cima(Nodo) = primero, y los métodos: push(insertar al final), pop(sacar primero) y peek(mostar primero).  

Insertar a la cola:

1.  Se crea un nuevo nodo con el dato.
2.  Si primero esta vacío entonces primero y último es igual nuevo nodo y continuar con paso 4.
3.  Si la cola no esta vacía entonces el siguiente del último es igual al nuevo nodo y nuevo último es igual al nuevo nodo.
4.  Fin.

Sacar primero:

1.  Nodo auxiliar es igual a primero.
2.  Primero es igual al siguiente del primero.
3.  Retornar primero.
4.  Fin.
