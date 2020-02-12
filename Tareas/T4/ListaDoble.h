
#define LISTADOBLE_H
#include <iostream>
#include <string>

using namespace std;

class NodoDoble{

        private:
            NodoDoble* anterior;
            char elemento;
            NodoDoble* siguiente;

        public:

            NodoDoble( NodoDoble *parAnterior, char parElemento, NodoDoble *parSiguiente){
                anterior = parAnterior;
                elemento = parElemento;
                siguiente = parSiguiente;
            }

            NodoDoble* obtenerAnterior(){
                return anterior;
            }

            void asignarAnterior(NodoDoble* parAnterior){
                anterior = parAnterior;
            }
            
            char obtenerElemento(){
                return elemento;
            }

            void asignarElemento(char parElemento){
                elemento = parElemento;
            }

            NodoDoble* obtenerSiguiente(){
                return siguiente;
            }

            void asignarSiguiente(NodoDoble* parSiguiente){
                siguiente = parSiguiente;
            }



};

class ListaDoble{

        private:
            NodoDoble* encabezador;
            int contador_nodos;
            NodoDoble* finalizador;

        public:

            ListaDoble(void){
                contador_nodos = 0;
            }

            NodoDoble* obtenerEncabezador(){
                return encabezador;
            }

            char obtenerDatoEncabezador(){
                return encabezador->obtenerElemento();
            }

            NodoDoble* obtenerFinalizador(){
                return finalizador;
            }

            char obtenerDatoFinalizador(){
                return finalizador->obtenerElemento();
            }   

            int obtenerCuentaNodos(){
                return contador_nodos;
            } 

            void InsertarPrimero(char parElemento){
                NodoDoble* nuevo_elemento = new NodoDoble(NULL, parElemento, NULL);
                if(encabezador == NULL){
                        encabezador = nuevo_elemento;
                        finalizador = nuevo_elemento;
                        contador_nodos = contador_nodos +1;
                        //tanto el primero como el último serán el nuevo elemento
                }else{
                        NodoDoble* momentaneo = encabezador;
                        nuevo_elemento->asignarSiguiente(encabezador);
                        encabezador->asignarAnterior(nuevo_elemento);
                        encabezador = nuevo_elemento; 
                        contador_nodos = contador_nodos +1;
                        //pendiente de analizar
                }
            }

            void InsertarUltimo(char parElemento){
                NodoDoble* nuevo_elemento = new NodoDoble(NULL, parElemento, NULL);
                if(encabezador == NULL){
                        encabezador = nuevo_elemento;
                        finalizador = nuevo_elemento;
                        contador_nodos = contador_nodos +1;
                        //el nuevo elemento será el último
                }else{
                        NodoDoble* momentaneo = finalizador;
                        nuevo_elemento->asignarAnterior(finalizador);
                        finalizador->asignarSiguiente(nuevo_elemento);
                        finalizador = nuevo_elemento; 
                        contador_nodos = contador_nodos +1;
                }
            }

            void imprimirLista(){
                NodoDoble* recorredor = encabezador;
                cout << "########"  << " Lista actual:" << endl;
                //representación NULL inical
                cout << " NULL" << endl;
                cout << " /-\\  " << endl;
                cout << "  |  " << endl;
                cout << " \\-/  " << endl;
                for(int desplazador = 0; desplazador < contador_nodos; desplazador++){
                    cout << "-----"<< endl;
                    //contenido
                    cout << " " << recorredor->obtenerElemento() << endl;
                    cout << "-----"<< endl;
                    cout << " /-\\  " << endl;
                    cout << "  |  " << endl;
                    cout << " \\-/  " << endl;
                    recorredor= recorredor->obtenerSiguiente();
                }
                //representación NULL final
                cout << " NULL" << endl;
            }

            void EliminarUltimo(){
            NodoDoble* momentaneo = finalizador->obtenerAnterior();
            finalizador->asignarAnterior(NULL);
            delete(finalizador);
            finalizador = momentaneo;
            contador_nodos = contador_nodos - 1;
            }

            void EliminarPrimero(){
            NodoDoble* momentaneo = encabezador->obtenerSiguiente();
            encabezador->asignarSiguiente(NULL);
            delete(encabezador);
            encabezador = momentaneo;
            contador_nodos = contador_nodos - 1;
            }

            NodoDoble* Buscar(string parPalabra){
                NodoDoble* momentaneo = encabezador;
                for(int desplazador = 0; desplazador < contador_nodos; desplazador++){
                    char elemento = momentaneo->obtenerElemento();
                    if(elemento == parPalabra[0]){
                        return momentaneo;
                        break;
                    }else{
                        momentaneo = momentaneo->obtenerSiguiente();
                    }
                }
            }

            void imprimirUltimo(){
                cout << "########"  << " Último actual:" << endl;
                cout << "-----"<< endl;
                cout << finalizador->obtenerElemento() << endl;
                cout << "-----"<< endl;
            }

            void imprimirPrimero(){
                cout << "########"  << " Primero actual:" << endl;
                cout << "-----"<< endl;
                cout << encabezador->obtenerElemento() << endl;
                cout << "-----"<< endl;
            }

            void imprimirNodo(NodoDoble* parNodo){
                NodoDoble* momentaneo = encabezador;
                cout << "########"  << " Nodo Buscado:" << endl;
                cout << "-----"<< endl;
                for(int desplazador = 0; desplazador < contador_nodos; desplazador++){
                    if(parNodo == momentaneo){
                         cout << momentaneo->obtenerElemento() << endl;
                         cout << "-----"<< endl;
                         break;
                    }else if(momentaneo == finalizador && parNodo != momentaneo){
                         cout << "la lista no posee el elemento " << endl;
                    }else{
                        momentaneo = momentaneo->obtenerSiguiente();
                    }
                }
                
            }


};