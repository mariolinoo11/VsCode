//
//  Tinfo.c
//  Esercizio 030
//
//  Created by Mario Ripesi on 29/08/21.
//

#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include "Tinfo.h"

void print_info(TInfo info) {
    printf("%d ", info);
}

/* a e b sono equivalenti */
bool equal(TInfo a, TInfo b) {
    return a == b;
};

/* a precede b */
bool less(TInfo a, TInfo b) {
    return a < b;
};

/* a segue b */
bool greater(TInfo a, TInfo b) {
    return a > b;
};
