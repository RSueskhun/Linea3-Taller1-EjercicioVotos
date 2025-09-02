import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        int votosC1 = 0, votosC2 = 0, votosC3 = 0, votosBlanco = 0;
        int c1Internet = 0, c1Radio = 0, c1Tv = 0;
        int c2Internet = 0, c2Radio = 0, c2Tv = 0;
        int c3Internet = 0, c3Radio = 0, c3Tv = 0;
        final int costoFijoInternet = 700000;
        final int costoFijoRadio = 200000;
        final int costoFijoTv = 600000;

        int opcion = 0;

        do {
            System.out.println("\n=== ELECCIONES MUNICIPIO PREMIER ===\n");
            System.out.println("1. Votar por el candidato de su elección");
            System.out.println("2. Calcular costo de campaña de un candidato");
            System.out.println("3. Vaciar todas las urnas");
            System.out.println("4. Conocer el número total de votos");
            System.out.println("5. Porcentaje de votos por cada candidato (incluye blanco)");
            System.out.println("6. Costo promedio de campaña (solo candidatos)");
            System.out.println("7. Conocer el candidato ganador");
            System.out.println("8. Salir");
            System.out.print("SELECCIONA UNA OPCIÓN: \n");
            if (!ingreso.hasNextInt()) { ingreso.next(); continue; }
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nELIJA SU CANDIDATO:");
                    System.out.println("1) Candidato 1");
                    System.out.println("2) Candidato 2");
                    System.out.println("3) Candidato 3");
                    System.out.println("4) Voto en Blanco\n");
                    int candidato = ingreso.nextInt();

                    if (candidato == 4) {
                        votosBlanco++;
                        System.out.println("Voto en blanco registrado\n");
                    } else if (candidato >= 1 && candidato <= 3) {
                        System.out.println("SELECCIONE EL MEDIO DE INFLUENCIA DE SU VOTO: 1) Internet  2) Radio  3) Televisión");
                        int medio = ingreso.nextInt();

                        if (candidato == 1) {
                            votosC1++;
                            if (medio == 1) c1Internet++;
                            else if (medio == 2) c1Radio++;
                            else if (medio == 3) c1Tv++;
                        } else if (candidato == 2) {
                            votosC2++;
                            if (medio == 1) c2Internet++;
                            else if (medio == 2) c2Radio++;
                            else if (medio == 3) c2Tv++;
                        } else if (candidato == 3) {
                            votosC3++;
                            if (medio == 1) c3Internet++;
                            else if (medio == 2) c3Radio++;
                            else if (medio == 3) c3Tv++;
                        }
                        System.out.println("VOTO REGISTRADO EXITOSAMENTE\n");
                    } else {
                        System.out.println("Candidato no valido\n");
                    }
                }
                case 2 -> {
                        System.out.print("\nINGRESE EL DIGITO ASIGNADO AL CANDIDATO (1, 2, 3) o 4 PARA VOTO EN BLANCO: ");
                        int c = ingreso.nextInt();
                        int costoTotal = 0;
                        int costoxInternetc1 = 0;
                        int costoxInternetc2 = 0;
                        int costoxInternetc3 = 0;
                        int costoxRadioc1 = 0;
                        int costoxRadioc2 = 0;
                        int costoxRadioc3 = 0;
                        int costoxTvc1 = 0;
                        int costoxTvc2 = 0;
                        int costoxTvc3 = 0;

                        if (c == 1) {
                            costoTotal = c1Internet * costoFijoInternet + c1Radio * costoFijoRadio + c1Tv * costoFijoTv;
                            System.out.println("COSTO CAMPAÑA DEL CANDIDATO 1: $" + costoTotal);
                            costoxInternetc1 = c1Internet * costoFijoInternet;
                            System.out.println("COSTO TOTAL INTERNET : $" + costoxInternetc1);
                            costoxRadioc1 = c1Radio * costoFijoRadio;
                            System.out.println("COSTO TOTAL RADIO : $" + costoxRadioc1);
                            costoxTvc1 = c1Tv * costoFijoTv;
                            System.out.println("COSTO TOTAL TV: $" + costoxTvc1);
                        } else if (c == 2) {
                            costoTotal = c2Internet * costoFijoInternet + c2Radio * costoFijoRadio + c2Tv * costoFijoTv;
                            System.out.println("COSTO CAMPAÑA DEL CANDIDATO 2: $" + costoTotal);
                            costoxInternetc2 = c2Internet * costoFijoInternet;
                            System.out.println("COSTO TOTAL INTERNET : $" + costoxInternetc2);
                            costoxRadioc2 = c2Radio * costoFijoRadio;
                            System.out.println("COSTO TOTAL RADIO : $" + costoxRadioc2);
                            costoxTvc2 = c2Tv * costoFijoTv;
                            System.out.println("COSTO TOTAL TV: $" + costoxTvc2);
                        } else if (c == 3) {
                            costoTotal = c3Internet * costoFijoInternet + c3Radio * costoFijoRadio + c3Tv * costoFijoTv;
                            System.out.println("COSTO CAMPAÑA DEL CANDIDATO 3: $" + costoTotal);
                            costoxInternetc3 = c3Internet * costoFijoInternet;
                            System.out.println("COSTO TOTAL INTERNET : $" + costoxInternetc3);
                            costoxRadioc3 = c3Radio * costoFijoRadio;
                            System.out.println("COSTO TOTAL RADIO : $" + costoxRadioc3);
                            costoxTvc3 = c3Tv * costoFijoTv;
                            System.out.println("COSTO TOTAL TV: $" + costoxTvc3);
                        } else if (c == 4) {
                            System.out.println("EL VOTO EN BLANCO NO GENERA COSTOS DE CAMPAÑA: $0");
                        } else {
                            System.out.println("Candidato no valido");
                        }
                    }
                case 3 -> {
                    votosC1 = votosC2 = votosC3 = votosBlanco = 0;
                    c1Internet = c1Radio = c1Tv = 0;
                    c2Internet = c2Radio = c2Tv = 0;
                    c3Internet = c3Radio = c3Tv = 0;
                    System.out.println("URNAS VACIADAS COMPLETAMENTE CON ÉXITO");
                }

                case 4 -> {
                    int totalVotosActuales = 0;
                    System.out.println("ESTE ES EL TOTAL DE VOTOS ACTUALES POR CANDIDATO : \n" + "CANDIDATO 1: "+ votosC1 + "\nCANDIDATO 2: "+ votosC2 + "\nCANDIDATO 3: "+ votosC3 + "\nVOTOS EN BLANCO (4): "+ votosBlanco);
                    totalVotosActuales = votosC1 + votosC2 + votosC3 + votosBlanco;
                    System.out.println("\nTOTAL DE VOTOS ACTUALES: " + totalVotosActuales);
                }

                case 5 -> {
                    int total = votosC1 + votosC2 + votosC3 + votosBlanco;
                    if (total == 0) {
                        System.out.println("NO HAY VOTOS REGISTRADOS ACTUALMENTE");
                    } else {
                        double pc1 = (votosC1 * 100.0) / total;
                        double pc2 = (votosC2 * 100.0) / total;
                        double pc3 = (votosC3 * 100.0) / total;
                        double pvb = (votosBlanco * 100.0) / total;

                        System.out.printf("Candidato 1: %.2f %% (%d votos)\n", pc1, votosC1);
                        System.out.printf("Candidato 2: %.2f %% (%d votos)\n", pc2, votosC2);
                        System.out.printf("Candidato 3: %.2f %% (%d votos)\n", pc3, votosC3);
                        System.out.printf("Voto en Blanco: %.2f %% (%d votos)\n", pvb, votosBlanco);
                    }
                }

                case 6 -> {
                    
                }


                case 7 -> {
                    
                }
                
                case 8 -> System.out.println("SALIENDO DEL SISTEMA DE VOTACIÓN");
                default -> System.out.println("DIGITASTE UNA OPCIÓN NO VALIDA");
            }
        } while (opcion != 8);
    }
}