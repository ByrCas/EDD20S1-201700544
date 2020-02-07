
#include <iostream>
#include <cstdlib>
#include <string>

//Clases:
#include "ListaSimple.h"

using namespace std;



int main(){
    ListaSimple* ListaEstudiantes = new ListaSimple();
    ListaEstudiantes->insertar_elemento(1, "Byron");
    ListaEstudiantes->insertar_elemento(2, "Gerardo");
    ListaEstudiantes->insertar_elemento(3, "Jesus");
    ListaEstudiantes->insertar_elemento(4, "Ron");
    ListaEstudiantes->insertar_elemento(5, "Suset");
    //Se agregan 5 estudiantes y se imprime la cantidad de elemntos actuales:
    cout << "La cuenta es: " << ListaEstudiantes->obtenerCuenta_Nodos() << endl;
    
    //Se eliminan elementos desde el estudiante con carnet 4, utlizando de parámetro el mismo método de busqueda
    ListaEstudiantes->eliminar_desde(ListaEstudiantes->buscar_elemento_carnet(4));
    cout << "La cuenta es: " << ListaEstudiantes->obtenerCuenta_Nodos() << endl;
    
    //Se agregan 3 nuevos estudiantes
    ListaEstudiantes->insertar_elemento(23, "Emma");
    ListaEstudiantes->insertar_elemento(100, "Eva");
    ListaEstudiantes->insertar_elemento(111, "Anggelo");
    cout << "La cuenta es: " << ListaEstudiantes->obtenerCuenta_Nodos() << endl;
    
    //Se elimina desde el estudiante con carnet 1, al ser el primero deja vacia la lista
    ListaEstudiantes->eliminar_desde(ListaEstudiantes->buscar_elemento_carnet(1));
    cout << "La cuenta es: " << ListaEstudiantes->obtenerCuenta_Nodos() << endl;


}