//
//  Tinfo.h
//  Esercizio 030
//
//  Created by Mario Ripesi on 29/08/21.
//

#ifndef Tinfo_h
#define Tinfo_h

#include<stdio.h>
#include<stdbool.h>

typedef int TInfo;

void print_info(TInfo info); /* Stampa un elemento */
bool equal(TInfo a, TInfo b); /* a e b sono equivalenti */
bool less(TInfo a, TInfo b); /* a precede b */
bool greater(TInfo a, TInfo b); /* a segue b */

#endif /* Tinfo_h */
