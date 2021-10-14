//
//  list.h
//  Esercizio 030
//
//  Created by Mario Ripesi on 29/08/21.
//

#ifndef list_h
#define list_h

#include "Tinfo.h"

struct SNode {
    TInfo info;
    struct SNode *link;
};
typedef struct SNode TNode;
typedef TNode *TList;

/* Crea ed alloca un nodo
 * PRE: nessuna
 */
TNode *node_create(TInfo value);

/* Distrugge e dealloca un nodo
 * PRE: nessuna
 */
void node_destroy(TNode *node);

/* Crea e restituisce una lista vuota
 * PRE: nessuna
 */
TList list_create();

/* Distrugge la lista list, deallocandone tutti gli elementi
 * PRE: nessuna
 * NOTA: consuma il parametro list
 */
TList list_destroy(TList list);

/* Visita la lista list dalla testa alla coda stampando gli elementi
 * PRE: nessuna
 */
void list_print(TList list);

/* Cerca l’elemento di valore info nella Lista list. Ritorna il
 * riferimento all’elemento se e ’ presente, altrimenti ritorna NULL.
 * PRE: list e' ordinata
 */
TNode *list_search(TList list, TInfo info);

/* Inserisce l’elemento di valore info nella lista list, preservando
 * l’ordinamento; restituisce la lista risultante.
 * PRE: list e' ordinata
 * NOTA: consuma il parametro list; inoltre se l’elemento da inserire e' gia' presente, esso viene duplicato.
 */
TList list_insert(TList list, TInfo info);

/* Inserisce l’elemento di valore info nella lista list, preservando
 * l’ordinamento; restituisce la lista risultante.
 * PRE: list e’ ordinata
 * NOTA: consuma il parametro list; inoltre se l’elemento da inserire
 * e’ gia’ presente , esso viene duplicato.
 */
TList list_insert_recursive(TList list, TInfo info);

/* Inserisce l’elemento di valore info alla fine della lista list, non preservando
 * l’ordinamento; restituisce la lista risultante.
 * NOTA: consuma il parametro list; inoltre se l’elemento da inserire e' gia' presente, esso viene duplicato.
 */
TList list_insert_end(TList list, TInfo info);

/* Cancella l’elemento di valore info nella lista list, preservando
 * l’ordinamento; restituisce la lista risultante.
 * PRE: list e' ordinata
 * NOTA: consuma il parametro list; se l’elemento da cancellare non e' presente, la lista resta inalterata.
 */
TList list_delete(TList list, TInfo info);

/* Ritorna il valore TRUE se la lista non contiene elementi
 * PRE: nessuna
 */
int list_is_empty(TList list);

#endif /* list_h */
