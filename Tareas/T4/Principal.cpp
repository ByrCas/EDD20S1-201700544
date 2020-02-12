
#include <iostream>
#include <cstdlib>
#include <string>

//Clases:
#include "ListaDoble.h"

using namespace std;



int main(){
    ListaDoble* ListaCaracteres = new ListaDoble();
    //inserción de mi nombre:
    ListaCaracteres->InsertarPrimero('y');
    ListaCaracteres->InsertarUltimo('r');
    ListaCaracteres->InsertarUltimo('o');
    ListaCaracteres->InsertarPrimero('b');
    ListaCaracteres->InsertarUltimo('n');
    //impresión de lista actual:
    ListaCaracteres->imprimirLista();
    //se verifica quién es el último y se elimina
    ListaCaracteres->imprimirUltimo();
    ListaCaracteres->EliminarUltimo();
    ListaCaracteres->imprimirUltimo();
    //se verifica quién es el primero y se elimina
    ListaCaracteres->imprimirPrimero();
    ListaCaracteres->EliminarPrimero();
    ListaCaracteres->imprimirPrimero();
    //impresión de lista actual:
    ListaCaracteres->imprimirLista();
    //busqueda:
    ListaCaracteres->imprimirNodo(ListaCaracteres->Buscar("oso"));
    ListaCaracteres->imprimirNodo(ListaCaracteres->Buscar("estructura"));
    ListaCaracteres->imprimirNodo(ListaCaracteres->Buscar("yate"));
}