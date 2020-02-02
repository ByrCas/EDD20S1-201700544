# Especificación Informal:

## Cabeceras :moneybag:
* **Moneda**: crear, nombrar, simbolizar, delimitar, agregar, trasladar, transferir, detallar.

## Descripción :page_with_curl:
* El TDA Moneda maneja valores enteros, asi como procesos de traslado y transferencias entre distintos usuarios en base al monedero de la Moneda, asimismo puede adquir un nombre y una simbología representativa.

## Métodos / Operaciones 🛠️

* **crear(nombre,simbolo_r:Caracteres) devuelve(moneda_nueva:Moneda)**
    * Requerimiento: El nombre y simbolo no deben ser nulos.
    * Efecto: Se retorna una Moneda con su respectivo nombre y símbolo representativo.

* **nombrar(elemento:Moneda)**
    * Modifica: nombre.
    * Efecto: El nombre de la moneda es asignado o cambiado si ya posee uno.

* **simbolizar(elemento:Moneda)** 
    * Modifica: El símbolo representativo.
    * Efecto: El simbolo representativo es asignado o cambiado si ya posee uno.

* **delimitar(cantidad:entero)** 
    * Requerimiento: La cantidad debe ser mayor a 0, de tipo entero.
    * Efecto: Asigna la cantidad que podrá manejar el monedero de la Moneda, una vez asignada no podrá ser alterada.

* **agregar(usuario_nuevo:Usuario)**
    * Modifica: Lista de usuarios.
    * Efecto: incorpora un nuevo usuario o dueño.

* **trasladar(cantidad:entero, id_usuario:Caracteres)** 
    * Requerimiento: La cantidad debe ser mayor a 0, de tipo entero.
    * Modifica: Monedero y la cantidad de Monedas al respectivo usuario.
    * Efecto: Se reduce la cantidad del monedero y aumenta la del respectivo usuario.

* **transferir(id_usuario_1, id_usuario_2:Caracteres, cantidad:entero)** 
    * Requerimiento: El usuario que transfiere debe contar con esa cantidad, ambos usuarios deben existir.
    * Modifica: la cantidad de monedas de ambos usuarios.
    * Efecto: Se reduce la cantidad del usuario que transfiere y se aumenta la cantidad al usuario destino.

* **detallar() retorna(detalle)** 
    * Efecto: Muestra un detalle de todos los usuarios con sus respectivas cantidades de monedas e identificador.


