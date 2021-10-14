//
//  list.c
//  Esercizio 030
//
//  Created by Mario Ripesi on 29/08/21.
//

#include <stdlib.h>
#include "list.h"

/* Crea ed alloca un nodo
 * PRE: nessuna
 */
TNode *node_create(TInfo info) {
    TNode *new;
    new = (TNode *) malloc(sizeof (TNode));
    if (new == NULL)
        return NULL;
    new->info = info;
    new->link = NULL;
    return new;
}

/* Distrugge e dealloca un nodo
 * PRE: nessuna
 */
void node_destroy(TNode *node) {
    free(node);
}

/* Crea e restituisce una lista vuota
 * PRE: nessuna
 */
TList list_create() {
    return NULL;
}

/* Distrugge la lista list, deallocandone tutti gli elementi
 * PRE: nessuna
 * NOTA: consuma il parametro list
 */
TList list_destroy(TList list) {
    TNode *curr, *succ;
    curr = list;

    while (curr != NULL) {
        succ = curr->link;
        node_destroy(curr);
        curr = succ;
    }
    return NULL;
}

/* Visita la lista list dalla testa alla coda stampando gli elementi
 * PRE: nessuna
 */
void list_print(TList list) {
    TNode *curr;
    curr = list;

    while (curr != NULL) {
        print_info(curr->info);
        curr = curr->link;
    }
}

/* Ricerca l'elemento di valore info nella lista list, preservando
 * l'ordinamento; restituisce la lista risultante.
 * PRE: list e' ordinata
 * NOTA: consuma il parametro list; inoltre se l'elemento da inserire e' gia' presente, esso viene duplicato.
 */
TNode *list_search(TList list, TInfo info) {
    /* PRE: la lista list e' ordinata */
    TNode * curr;
    curr = list;

    /* P1: l'elemento da cercare ha un valore info inferiore a quello
     * dell'elemento di testa della lista
     *P2: l'elemento da cercare ha un valore info compreso tra quello
     * della testa e quello della coda della lista
     *P3: l'elemento da cercare ha un valore info maggiore di tutti
     * quelli degli elementi della lista
     */
    while ((curr != NULL) && greater(info, curr->info)) {
        curr = curr->link;
    }
    /* Analisi delle post - condizioni
    C1: valore da cercare piu' piccolo della Testa
    C2: valore da cercare maggiore della Coda
    C3: valore da cercare compreso tra quello di Testa e quello di
    Coda
     */
    if ((curr != NULL) && equal(curr->info, info))
        /* Elemento trovato */
        return curr;
    else
        return NULL;
}

/* Inserisce l'elemento di valore info nella lista list, preservando
 * l'ordinamento; restituisce la lista risultante.
 * PRE: list e' ordinata
 * NOTA: consuma il parametro list; inoltre se l'elemento da inserire
 * e' gia' presente, esso viene duplicato.
 */
TList list_insert(TList list, TInfo info) {
    TNode *prec, *succ, *new;
    prec = NULL;
    succ = list;
    /* P1: prec == NULL e succ == NULL, la lista e' vuota */
    /* P2: prec == NULL e succ != NULL, l’elemento da inserire e’ non
     * maggiore del primo elemento della lista */
    /* P3: prec != NULL e succ == NULL, l’elemento da inserire e’ maggiore
     * dell’ultimo elemento della lista */
    /* P4: prec != NULL e succ != NULL, l’elemento da inserire e’ maggiore
     * del nodo di testa e minore di quello di coda.*/


    /* F1: ricerca della posizione di inserimento */
    while ((succ != NULL) && greater(info, succ ->info)) {
        prec = succ;
        succ = succ->link;
    }
    /* F2: allocazione del nuovo nodo */
    new = node_create(info);

    if (new == NULL) { /* Errore: allocazione fallita */
        printf("Errore di allocazione della memoria");
        exit(1);
    }

    /* F3: aggiornamento della catena dei collegamenti */
    if (prec == NULL) {
        /* C1: inserimento in Testa */
        new->link = list;
        return new;
    } else {
        /* C2: inserimento in posizione centrale o in coda */
        new->link = succ;
        prec->link = new;
        return list;
    }
}

/* Inserisce l’elemento di valore info nella lista list, preservando
 * l’ordinamento; restituisce la lista risultante.
 * PRE: list e’ ordinata
 * NOTA: consuma il parametro list; inoltre se l’elemento da inserire
 * e’ gia’ presente , esso viene duplicato.
 */
TList list_insert_recursive(TList list, TInfo info) {

    if (list == NULL || greater(list->info, info)) {
        TNode* newnode;
        newnode = node_create(info);

        if (newnode == NULL) {
            printf("Errore di allocazione della memoria\n");
            exit(1);
        }
        newnode->link = list;
        return newnode;
    } else {
        TList l2;
        l2 = list_insert_recursive(list->link, info);
        list->link = l2;
        return list;
    }
}

/* Inserisce l’elemento di valore info alla fine della lista list, non preservando
 * l’ordinamento; restituisce la lista risultante.
 * NOTA: consuma il parametro list; inoltre se l’elemento da inserire e' gia' presente, esso viene duplicato.
 */
TList list_insert_end(TList list, TInfo info) {
    TNode *ptr, *prec, *succ, *new;
    prec = NULL;
    succ = list;

    /* F1: allocazione del nuovo nodo */
    new = node_create(info);

    if (new == NULL) { /* Errore: allocazione fallita */
        printf("Errore di allocazione della memoria");
        exit(1);
    }

    /* F2: controllo se la lista è vuota  */
    if (list == NULL) {
        /* C1: restituisco il nuovo nodo */
        return new;
    } else {
        /* F3: ricerca della posizione di inserimento */
        ptr = list;
        while (ptr->link != NULL) {
            ptr = ptr->link;
        }
        /* C2: inserimento in coda */
        ptr->link = new;
        return list;
    }
}

/* Cancella un elemento di valore info dalla lista list, preservando
 * l'ordinamento; restituisce la lista risultante.
 * PRE: list e' ordinata
 * NOTA: consuma il parametro list; inoltre se l'elemento da inserire
 * e' duplicato cancella la prima occorrenza.*/
TList list_delete(TList list, TInfo info) {
    TNode *prec, *curr, *alias;
    prec = NULL;
    curr = list;
    /* P1: curr == NULL o info != curr->info, l'elemento da cancellare
     * non e' presente
     * P2: la condizione P1 non e' verificata, e prec == NULL va
     * cancellato l'elemento di testa
     * P3: la condizione P1 non e' verificata, e prec != NULL e
     * curr != NULL va cancellato un elemento in posizione
     * intermedia della lista */

    /* F1: ricerca dell'elemento da cancellare */
    while ((curr != NULL)) {
        prec = curr;
        curr = curr->link;
    }

    /* Analisi delle post - condizioni */
    if ((curr != NULL) && equal(curr->info, info)) {
        /* Elemento trovato */

        /* F2: aggiornamento della catena dei collegamenti */
        if (prec == NULL) {
            /* CASO C2: Cancellazione della Testa */
            list = curr->link;
        } else {
            /* CASO C3: Cancellazione da una posizione intermedia */
            alias = curr->link;
            prec->link = alias;
        }
        /* F3: Deallocazione del Nodo cancellato logicamente */
        node_destroy(curr);
        return list;
    }
    return list;
}

/* Ritorna il valore TRUE se la lista non contiene elementi
 * PRE: nessuna
 */
int list_is_empty(TList list) {
    return (list == NULL);
}
