package Pregs;

import java.util.*;

/**
 *
 * @author Alberto Ayete Ramos
 */
public class Fechas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean resp1 = true, resp2 = true, resp3 = true;
        boolean isBisiesto1 = false, isBisiesto2 = false;
        int sumarDias = 0;
        int anio1 = 0, anio2 = 0, mes1 = 0, mes2 = 0, dia1 = 0, dia2 = 0;
        int eleccion = 0;
        int sepbarra1 = 0, seppunto1 = 0, sepdoble1 = 0, sepgion1 = 0;
        int sepbarra2 = 0, seppunto2 = 0, sepdoble2 = 0, sepgion2 = 0;
        int aux1, aux2;
        int sumaAnio = 0, sumaMes = 0, sumaDias = 0;
        String fecha1;
        String fecha2;
        String[] array;
        array = new String[4];
        array[0] = "/";
        array[1] = ".";
        array[2] = ":";
        array[3] = "-";

//        int[] dias = new int[13];
//        dias[0] = 29;
//        dias[1] = 30;
//        dias[2] = 28;
//        dias[3] = 31;
//        dias[4] = 30;
//        dias[5] = 31;
//        dias[6] = 30;
//        dias[7] = 31;
//        dias[8] = 31;
//        dias[9] = 30;
//        dias[10] = 31;
//        dias[11] = 30;
//        dias[12] = 31;
// MENU PARA PEDIR UNA OPCION U OTRA Y COMPROBAMOS QUE SOLO SE PUEDAN METER ESAS DOS OPCIONES
        while (eleccion != 1 && eleccion != 2) {
            System.out.println("Si deseas calcular los dias entre una fecha y otra introduce un 1, si deseas sumar dias a una fecha introducida introduce un 2: ");
            eleccion = teclado.nextInt();

// PRIMERA ELECCION QUE DICE CUANTOS DIAS HAY ENTRE DOS FECHAS
            if (eleccion == 1) {
                do {
// NO COJE BIEN CON EL nextLine por eso esta con next(generico)
                    System.out.println("Introduce la primera fecha: ");
                    fecha1 = teclado.next();
                    System.out.println("Introduce la segunda fecha: ");
                    fecha2 = teclado.next();

// COMPROBAMOS CON EL ARRAY QUE EXISTA CUALQUIERA DE LOS SEPARADORES                    
                    for (int i = 0; i <= 3; i++) {
                        aux1 = fecha1.indexOf(array[i]);
                        aux2 = fecha2.indexOf(array[i]);
                        if (aux1 == -1) {
                            resp1 = false;
                        } else {
                            resp1 = true;
                            if (aux2 == -1) {
                                resp2 = false;
                            } else {
                                resp2 = true;
                                break;
                            }
                        }
                    }
// COJEMOS LA PRIMERA POSICION QUE ENCUENTRA DE CUALQUIERA DE LOS SEPARADORES
                    sepbarra1 = fecha1.indexOf("/", 0);
                    sepbarra2 = fecha2.indexOf("/", 0);
                    sepdoble1 = fecha1.indexOf(":", 0);
                    sepdoble2 = fecha2.indexOf(":", 0);
                    sepgion1 = fecha1.indexOf("-", 0);
                    sepgion2 = fecha2.indexOf("-", 0);
                    seppunto1 = fecha1.indexOf(".", 0);
                    seppunto2 = fecha2.indexOf(".", 0);

                    // ANO MES DIA
//HE INVESTIGADO UN POCO Y HE USADO EL METODO "split" ME QUEDA MUCHO MAS LIMPIO QUE SI TUVIERA QUE IR COMPROBANDO TODAS LAS POSIBILIDADES
                    if (fecha1.contains("/") && fecha2.contains("/")) {
                        List<String> sepaFec1 = Arrays.asList(fecha1.split("/"));
                        List<String> sepaFec2 = Arrays.asList(fecha2.split("/"));
                        if (sepbarra1 == 2) {
                            dia1 = Integer.parseInt(sepaFec1.get(0));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(2));
                        } else {
                            dia1 = Integer.parseInt(sepaFec1.get(2));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(0));
                        }
                        if (sepbarra2 == 2) {
                            dia2 = Integer.parseInt(sepaFec2.get(0));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(2));
                        } else {
                            dia2 = Integer.parseInt(sepaFec2.get(2));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(0));
                        }

                    }
                    if (fecha1.contains("-") && fecha2.contains("-")) {

                        List<String> sepaFec1 = Arrays.asList(fecha1.split("-"));
                        List<String> sepaFec2 = Arrays.asList(fecha2.split("-"));
                        if (sepgion1 == 2) {
                            dia1 = Integer.parseInt(sepaFec1.get(0));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(2));
                        } else {
                            dia1 = Integer.parseInt(sepaFec1.get(2));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(0));
                        }
                        if (sepgion2 == 2) {
                            dia2 = Integer.parseInt(sepaFec2.get(0));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(2));
                        } else {
                            dia2 = Integer.parseInt(sepaFec2.get(2));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(0));
                        }

                    }
                    if (fecha1.contains(".") && fecha2.contains(".")) {

                        List<String> sepaFec1 = Arrays.asList(fecha1.split("\\."));
                        List<String> sepaFec2 = Arrays.asList(fecha2.split("\\."));
                        if (seppunto1 == 2) {
                            dia1 = Integer.parseInt(sepaFec1.get(0));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(2));
                        } else {
                            dia1 = Integer.parseInt(sepaFec1.get(2));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(0));
                        }
                        if (seppunto2 == 2) {
                            dia2 = Integer.parseInt(sepaFec2.get(0));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(2));
                        } else {
                            dia2 = Integer.parseInt(sepaFec2.get(2));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(0));
                        }

                    }
                    if (fecha1.contains(":") && fecha2.contains(":")) {

                        List<String> sepaFec1 = Arrays.asList(fecha1.split(":"));
                        List<String> sepaFec2 = Arrays.asList(fecha2.split(":"));
                        if (sepdoble1 == 2) {
                            dia1 = Integer.parseInt(sepaFec1.get(0));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(2));
                        } else {
                            dia1 = Integer.parseInt(sepaFec1.get(2));
                            mes1 = Integer.parseInt(sepaFec1.get(1));
                            anio1 = Integer.parseInt(sepaFec1.get(0));
                        }
                        if (sepdoble2 == 2) {
                            dia2 = Integer.parseInt(sepaFec2.get(0));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(2));
                        } else {
                            dia2 = Integer.parseInt(sepaFec2.get(2));
                            mes2 = Integer.parseInt(sepaFec2.get(1));
                            anio2 = Integer.parseInt(sepaFec2.get(0));
                        }
                    }

                    resp3 = true;
// COMPROBAMOS QUE EL MES ESTE ENTRE 1 Y 12
                    if ((mes1 < 1) || (mes1 > 12) || (mes2 < 1) || (mes2 > 12)) {
                        resp3 = false;
                    }
// COMPROBAMOS EL RANGO DE DIAS EN CADA MES
                    switch (mes1) {
                        case 1:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 2:

                            if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {

                                if (dia1 < 1 || dia1 > 29) {
                                    resp3 = false;
                                    isBisiesto1 = true;

                                }
                            } else {
                                if (dia1 < 1 || dia1 > 28) {
                                    resp3 = false;
                                }
                            }
                            break;
                        case 3:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 4:
                            if (dia1 < 1 || dia1 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 5:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 6:
                            if (dia1 < 1 || dia1 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 7:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 8:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 9:
                            if (dia1 < 1 || dia1 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 10:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 11:
                            if (dia1 < 1 || dia1 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 12:
                            if (dia1 < 1 || dia1 > 31) {
                                resp3 = false;
                            }
                            break;
                    }

                    switch (mes2) {

                        case 1:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 2:
                            if ((anio2 % 4 == 0) && ((anio2 % 100 != 0) || (anio2 % 400 == 0))) {
                                if (dia2 < 2 || dia2 > 29) {
                                    resp3 = false;
                                    isBisiesto2 = true;

                                }
                            } else {
                                if (dia2 < 2 || dia2 > 28) {
                                    resp3 = false;
                                }
                            }
                            break;
                        case 3:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 4:
                            if (dia2 < 1 || dia2 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 5:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 6:
                            if (dia2 < 1 || dia2 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 7:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 8:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 9:
                            if (dia2 < 1 || dia2 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 10:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                        case 11:
                            if (dia2 < 1 || dia2 > 30) {
                                resp3 = false;
                            }
                            break;
                        case 12:
                            if (dia2 < 1 || dia2 > 31) {
                                resp3 = false;
                            }
                            break;
                    }
                    if (resp3 == false) {
                        System.out.println("Fecha incorrecta.");
                    }
                } while ((fecha1.isEmpty() && fecha2.isEmpty()) || (fecha1.length() != 10 && fecha2.length() != 10) || (resp1 == false || resp2 == false || resp3 == false));
// SUMAMOS LOS DIAS DE LOS AÑOS DE DIFERENCIA
                if (anio1 > anio2) {
                    for (int i = anio2; i < anio1; i++) {
                        if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
                            sumaAnio = sumaAnio + 366;
                        } else {
                            sumaAnio = sumaAnio + 365;
                        }
                    }
                } else {
                    for (int i = anio1; i < anio2; i++) {
                        if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
                            sumaAnio = sumaAnio + 366;
                        } else {
                            sumaAnio = sumaAnio + 365;
                        }
                    }
                }
                if (mes1 > mes2) {
                    for (int i = mes2; i < mes1; i++) {
                        /**
                         * 30
                         */
                        if (i == 4 || i == 6 || i == 9 || i == 11) {
                            sumaMes = sumaMes + 30;
                        }
                        /**
                         * 31
                         */

                        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                            sumaMes = sumaMes + 31;
                        }
                        if (i == 2) {
                            if (isBisiesto2) {
                                sumaMes = sumaMes + 29;
                            } else {
                                sumaMes = sumaMes + 28;
                            }
                        }

                    }
                } else {
                    for (int i = mes1; i < mes2; i++) {
                        /**
                         * 30
                         */
                        if (i == 4 || i == 6 || i == 9 || i == 11) {
                            sumaMes = sumaMes + 30;
                        }
                        /**
                         * 31
                         */
                        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                            sumaMes = sumaMes + 31;
                        }
                        if (i == 2) {
                            if (isBisiesto2) {
                                sumaMes = sumaMes + 29;
                            } else {
                                sumaMes = sumaMes + 28;
                            }
                        }

                    }
                }

                if (dia1 > dia2) {
                    for (int i = dia2; i < dia1; i++) {
                        sumaDias = sumaDias + 1;
                    }
                } else {
                    for (int i = dia1; i < dia2; i++) {
                        sumaDias = sumaDias + 1;
                    }
                }

                int total = sumaAnio + sumaMes + sumaDias;
                System.out.println("Total=" + total);
            }

        }
// SEGUNDA ELLECCION QUE DICE LA FECHA AL SUMARLE O RESTARLE UN NUMERO
        if (eleccion == 2) {
            do {
                System.out.println("Introduce fecha: ");
                fecha1 = teclado.next();
                System.out.println("Introduce dias a sumar a la fecha: ");
                sumarDias = teclado.nextInt();

                for (int i = 0; i <= 3; i++) {
                    aux1 = fecha1.indexOf(array[i]);
                    if (aux1 == -1) {
                        resp1 = false;
                    } else {
                        resp1 = true;
                        break;
                    }
                }

                sepbarra1 = fecha1.indexOf("/", 0);
                sepdoble1 = fecha1.indexOf(":", 0);
                sepgion1 = fecha1.indexOf("-", 0);
                seppunto1 = fecha1.indexOf(".", 0);

// ANO MES DIA
                if (fecha1.contains("/")) {
                    List<String> sepaFec1 = Arrays.asList(fecha1.split("/"));
                    if (sepbarra1 == 2) {
                        dia1 = Integer.parseInt(sepaFec1.get(0));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(2));
                    } else {
                        dia1 = Integer.parseInt(sepaFec1.get(2));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(0));
                    }

                }
                if (fecha1.contains("-")) {

                    List<String> sepaFec1 = Arrays.asList(fecha1.split("-"));
                    if (sepgion1 == 2) {
                        dia1 = Integer.parseInt(sepaFec1.get(0));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(2));
                    } else {
                        dia1 = Integer.parseInt(sepaFec1.get(2));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(0));
                    }

                }
                if (fecha1.contains(".")) {

                    List<String> sepaFec1 = Arrays.asList(fecha1.split("\\."));
                    if (seppunto1 == 2) {
                        dia1 = Integer.parseInt(sepaFec1.get(0));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(2));
                    } else {
                        dia1 = Integer.parseInt(sepaFec1.get(2));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(0));
                    }

                }
                if (fecha1.contains(":")) {

                    List<String> sepaFec1 = Arrays.asList(fecha1.split(":"));
                    if (sepdoble1 == 2) {
                        dia1 = Integer.parseInt(sepaFec1.get(0));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(2));
                    } else {
                        dia1 = Integer.parseInt(sepaFec1.get(2));
                        mes1 = Integer.parseInt(sepaFec1.get(1));
                        anio1 = Integer.parseInt(sepaFec1.get(0));
                    }
                }
                resp3 = true;
                // COMPROBAMOS QUE EL MES ESTE ENTRE 1 Y 12
                if ((mes1 < 1) || (mes1 > 12)) {
                    resp3 = false;
                }
// COMPROBAMOS EL RANGO DE DIAS EN CADA MES
                switch (mes1) {
                    case 1:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 2:

                        if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {

                            if (dia1 < 1 || dia1 > 29) {
                                resp3 = false;
                                isBisiesto1 = true;

                            }
                        } else {
                            if (dia1 < 1 || dia1 > 28) {
                                resp3 = false;
                            }
                        }
                        break;
                    case 3:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 4:
                        if (dia1 < 1 || dia1 > 30) {
                            resp3 = false;
                        }
                        break;
                    case 5:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 6:
                        if (dia1 < 1 || dia1 > 30) {
                            resp3 = false;
                        }
                        break;
                    case 7:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 8:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 9:
                        if (dia1 < 1 || dia1 > 30) {
                            resp3 = false;
                        }
                        break;
                    case 10:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                    case 11:
                        if (dia1 < 1 || dia1 > 30) {
                            resp3 = false;
                        }
                        break;
                    case 12:
                        if (dia1 < 1 || dia1 > 31) {
                            resp3 = false;
                        }
                        break;
                }
                if (resp3 == false) {
                        System.out.println("Fecha incorrecta.");
                    }
            } while (fecha1.isEmpty() && sumarDias != 0 || fecha1.length() != 10 || (resp1 == false || resp3 == false));

// SUMA NUMERO
            if (sumarDias > 0) {
                for (int i = 0; i < sumarDias; i++) {
                    if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                        dia1++;
                        if (dia1 > 30) {
                            mes1++;
                            dia1 = 1;
                            if (mes1 > 12) {
                                anio1++;
                                mes1 = 1;
                                dia1 = 1;
                            }
                        }
                    }

                    if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                        dia1++;
                        if (dia1 > 31) {
                            mes1++;
                            dia1 = 1;
                            if (mes1 > 12) {
                                anio1++;
                                mes1 = 1;
                                dia1 = 1;
                            }
                        }
                    }
                    if (mes1 == 2) {
                        if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
                            dia1++;
                            if (dia1 > 29) {
                                mes1++;
                                dia1 = 1;
                                if (mes1 > 12) {
                                    anio1++;
                                    mes1 = 1;
                                    dia1 = 1;
                                }
                            }
                        } else {
                            dia1++;
                            if (dia1 > 28) {
                                mes1++;
                                dia1 = 1;
                                if (mes1 > 12) {
                                    anio1++;
                                    mes1 = 1;
                                    dia1 = 1;
                                }
                            }
                        }
                    }
                }
                System.out.println("dia " + dia1 + " del mes " + mes1 + " del año " + anio1);
            }

// RESTA NUMERO
            if (sumarDias < 0) {
                for (int i = 0; i > sumarDias; i--) {
                    if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                        dia1 = dia1 - 1;
                        if (dia1 < 1) {
                            mes1 = mes1 - 1;
                            if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                                dia1 = 30;
                            }
                            if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                                dia1 = 31;
                            }
                            if (mes1 == 2) {
                                if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
                                    dia1 = 29;
                                }
                                if ((anio1 % 4 != 0) && ((anio1 % 100 == 0) || (anio1 % 400 != 0))) {
                                    dia1 = 28;
                                }
                            }
                            if (mes1 < 1) {
                                anio1 = anio1 - 1;
                                mes1 = 12;
                                dia1 = 31;
                            }
                        }
                    }

                    if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                        dia1 = dia1 - 1;
                        if (dia1 < 1) {
                            mes1 = mes1 - 1;
                            if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                                dia1 = 30;
                            }
                            if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                                dia1 = 31;
                            }
                            if (mes1 == 2) {
                                if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
                                    dia1 = 29;
                                }
                                if ((anio1 % 4 != 0) && ((anio1 % 100 == 0) || (anio1 % 400 != 0))) {
                                    dia1 = 28;
                                }
                            }
                            if (mes1 < 1) {
                                anio1 = anio1 - 1;
                                mes1 = 12;
                                dia1 = 31;
                            }
                        }
                    }
                    if (mes1 == 2) {
                        if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
                            dia1 = dia1 - 1;
                            if (dia1 < 1) {
                                mes1 = mes1 - 1;
                                if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                                    dia1 = 30;
                                }
                                if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                                    dia1 = 31;
                                }
                                if (mes1 == 2) {
                                    if ((anio1 % 4 == 0) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
                                        dia1 = 29;
                                    }
                                    if ((anio1 % 4 != 0) && ((anio1 % 100 == 0) || (anio1 % 400 != 0))) {
                                        dia1 = 28;
                                    }
                                }
                                if (mes1 < 1) {
                                    anio1 = anio1 - 1;
                                    mes1 = 12;
                                    dia1 = 31;
                                }
                            }
                        }
                    }
                }
                System.out.println("dia " + dia1 + " del mes " + mes1 + " del año " + anio1);
            }
// FALTA QUE MUESTRE EL DIA QUE ES DE LA SEMANA (NOSE COMO).
        }

    }

}
