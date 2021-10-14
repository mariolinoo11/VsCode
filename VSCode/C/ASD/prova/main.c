//
//  main.c
//  Esercizio 030
//
//  Created by Mario Ripesi on 29/08/21.
//

#include <stdio.h>
#include "list.h"

TList scambiaElementiDuplica(TList a);

int main(int argc, const char * argv[]) {
    TList a = list_create();
    a=list_insert_end(a, 4);
    a=list_insert_end(a, 6);
    a=list_insert_end(a, 2);
    a=list_insert_end(a, 3);
    a=list_insert_end(a, 9);
    printf("la lista inserita è:\n");
    list_print(a);
    a=scambiaElementiDuplica(a);
    printf("\n");
    list_print(a);

    
    return 0;
}

/*TList scambiaElementiDuplica(TList a){
    if (a == NULL)
            return NULL;
    if(a->link == NULL){
        a->link=node_create(a->info);
        return a;
    }
    TList temp;
    temp=a->link;
    
    
    return a;
}
    */
TList scambiaElementiDuplica(TList lista) {
    if (lista == NULL)
        return NULL;

    if (lista->link == NULL) {
        lista->link = node_create(lista->info);
        return lista;
    }

    TList temp;
    temp = lista->link;
    lista->link = scambiaElementiDuplica(temp->link);
    temp->link = lista;

    return temp;
}
