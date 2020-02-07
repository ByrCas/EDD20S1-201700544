
/* 
 * File:   ListaDoble.h
 * Author: Byron Gerardo
 *
 */

//ifndef LISTADOBLE_H
#define LISTADOBLE_H
#include <iostream>
#include <string>

using namespace std;

class NodoSimple{
    private:
            NodoSimple* siguiente;
            int carnet_estudiante;
            string nombre_estudiante;
    public:

            NodoSimple(int parCarnet, string parNombre, NodoSimple* parSiguiente){
                carnet_estudiante = parCarnet;
                nombre_estudiante = parNombre;
                siguiente = parSiguiente;
            }

            int obtener_carnet(){
                return carnet_estudiante;
            }

            void asignar_carnet(int parCarnet){
                carnet_estudiante = parCarnet; 
            }

            string obtener_nombre(){
                return nombre_estudiante;
            }

            void asignar_nombre(string parNombre){
                nombre_estudiante = parNombre;
            }

            NodoSimple* obtener_siguiente(){
                return siguiente;
            }

            void asignar_siguiente(NodoSimple* parSiguiente){
                siguiente = parSiguiente;
            }

};

class ListaSimple{
    private:
            NodoSimple* encabezador;
            int contador_nodos;
    public:

            ListaSimple(void) {
                encabezador = NULL;
                contador_nodos=0;
            }

            int obtenerCuenta_Nodos(){
                return contador_nodos;
            }

            void incrementar_cuenta(){
                contador_nodos = contador_nodos + 1;
            }

            void reducir_cuenta(){
                contador_nodos = contador_nodos - 1;
            }

            //Métodos mínimos:

            void insertar_elemento(int parCarnet, string parNombre){
                NodoSimple* nuevo_elemento = new NodoSimple(parCarnet, parNombre, NULL);
                //Si el encabezado es nulo significa que no hay elementos
                if(encabezador == NULL){
                     encabezador = nuevo_elemento;
                     incrementar_cuenta();
                }else{
                    /*se desplaza desde el encabezado hasta la última posición,
                     añadiendo el nuevo elemento a su siguiente*/
                    NodoSimple* momentaneo = encabezador;
                     for(int recorredor=0; recorredor< contador_nodos -1; recorredor++){
                         momentaneo = momentaneo->obtener_siguiente();
                     }
                     momentaneo->asignar_siguiente(nuevo_elemento);
                     incrementar_cuenta();
                }
            }

            void vaciar_lista(){
                NodoSimple* momentaneo = encabezador;
                //Si el encaezado es nulo la lista ya esta vacia
                if(encabezador == NULL){
                    cout << "La lista ya está vacia" << endl;
                }else{
                /*desplaza el encabezado y adquiere el nodo de su siguiente, 
                y asi hasta llegar a la última, dandole un valor nulo  
                */
                    for(int recorredor=0; recorredor< contador_nodos -1; recorredor++){
                         encabezador = encabezador->obtener_siguiente();
                     }
                     encabezador = NULL;
                     contador_nodos  = 0;
                }
                     
            }

            void eliminar_desde(NodoSimple* parNodo){
                 NodoSimple* momentaneo;
                 /*Si el nodo es igual al encabezado significa que
                  hay que vaciar toda la lista*/
                 if(encabezador == parNodo){
                     vaciar_lista();
                }else{
                /* se desplazará por toda la lista hasta el penúltimo nodo
                   y a su siguiente se asignará un valor nulo,
                   eso hasta que el nodo equivalga al del parámetro
                */
                    NodoSimple* momentaneo = encabezador;
                    while(momentaneo != parNodo){
                        for(int recorredor=0; recorredor< (contador_nodos -1)-1; recorredor++){
                         momentaneo = momentaneo->obtener_siguiente();
                        }
                        momentaneo->asignar_siguiente(NULL);
                        reducir_cuenta();
                    }
                    momentaneo->asignar_siguiente(NULL);
                    reducir_cuenta();
                    /*Dado que dentro del while solo se eliminan
                      los nodos posteriores al del parámetro, se 
                      asigna un nulo al nodo del parametro
                    */
                }
            }

            NodoSimple* buscar_elemento_carnet(int parCarnet){
             //si el carnet equivale al del encabezado de devuelve.
                   if(encabezador->obtener_carnet() == parCarnet){
                       return encabezador;
                   }else{
            /*se irá desplazando por toda la lista hasta que
             encuentre el valor euivalente del carnet, y finalmente quiebra*/
                        NodoSimple* momentaneo = encabezador;
                      for(int recorredor=0; recorredor< contador_nodos - 1; recorredor++){
                         momentaneo = momentaneo->obtener_siguiente();
                         if(momentaneo->obtener_carnet() == parCarnet){
                             return momentaneo;
                             break;
                         }
                      }  
                   }
            }


};



