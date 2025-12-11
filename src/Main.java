import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable personaje
        String name = "";
        String claseTipo = "";
        int vida = 0;
        int fuerza = 0;
        boolean personajeCreado = false;

        //Inventario
        String[] inventario = {"Poción", "Hierro", "Pergamino", "Llave Antigua"};

        //Menu Principal
        int opcion = 0;

        do {

            System.out.println("\n === RPG MENU SIMULATOR === ");
            System.out.println("1. Crear personaje ");
            System.out.println("2. Entrenar");
            System.out.println("3. Batalla");
            System.out.println("4. Inventario");
            System.out.println("5. Estado del personaje");
            System.out.println("6. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.print("Ingresa el nombre del personaje: ");
                    name = sc.nextLine();

                    System.out.println("Ingresa la clase del personaje: guerrero, arquero, mago  ");
                    claseTipo = sc.nextLine();
                    if (claseTipo.equals("guerrero") || claseTipo.equals("arquero") || claseTipo.equals("mago")) {
                        System.out.println("Ingreso válido");
                        personajeCreado = true;
                        System.out.println("Ingresa puntos de vida");
                        vida = sc.nextInt();
                        System.out.println("Ingresa puntos de fuerza");
                        fuerza = sc.nextInt();
                        if (vida > 0 && fuerza > 0) {
                            personajeCreado = true;
                            System.out.println("Ingreso válido");
                        } else {
                            System.out.println("Ingreso inválido, vida o fuerza no pueden ser negativos");
                        }
                    } else {
                        System.out.println("Ingreso invalido");
                    }
                    break;
                case 2:
                    if (!personajeCreado) {
                        System.out.println("Debes crear un personaje");
                        break;
                    }

                    int opcionEntreno = -1;
                    while (opcionEntreno != 0) {
                        System.out.println("Comenzar Entrenamiento ");
                        System.out.println("1. Entrenar fuerza (+5)");
                        System.out.println("2. Aumentar vida (+10)");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese opción: ");
                        opcionEntreno = sc.nextInt();

                        if (opcionEntreno == 1) {
                            System.out.println("Gana +5 de fuerza: ");
                            fuerza += 5;
                            System.out.println("Fuerza actual: " + fuerza);
                        } else if (opcionEntreno == 2) {
                            System.out.println("Gana +10 de vida: ");
                            vida += 10;
                            System.out.println("Vida actual: " + vida);
                        } else if (opcionEntreno == 0) {
                            System.out.println("Entrenamiento finalizado");
                        } else {
                            System.out.println("Ingreso inválido");
                        }

                    }
                    break;
                case 3:
                    if (personajeCreado == false) {
                        System.out.println("Debes crear un personaje");
                        break;
                    }
                    if (vida <= 0) {
                        System.out.println("Falta vida");
                        break;
                    }
                    System.out.println("Que comience la batalla");

                    int vidaEnemigo = 40;
                    int fuerzaEnemigo;
                    int danoNuestro;

                    for (int turno = 1; turno <= 5; turno++) {
                        System.out.println("Comienza " + turno);
                        danoNuestro = fuerza / 2;
                        if (danoNuestro < 1) {
                            danoNuestro = 1;

                        }
                        fuerzaEnemigo = 5;

                        //Daños
                        vidaEnemigo -= danoNuestro;
                        vida -= fuerzaEnemigo;
                        if (vidaEnemigo < 0) {
                            vidaEnemigo = 0;
                        }
                        if (vida < 0) {
                            vida = 0;
                        }
                        System.out.println(name + " hace " + danoNuestro + " puntos de daño al enemigo");
                        System.out.println("El enemigo hace " + fuerzaEnemigo + " puntos de daño");
                        System.out.println("Vida restante de " + name + " es " + vida);
                        System.out.println("Fuerza restante del enemigo es " + vidaEnemigo);

                        //Comprobación
                        if (vida <= 0) {
                            System.out.println("Falta vida. Te derrotaron.");
                            break;
                        }
                        if (vidaEnemigo <= 0) {
                            System.out.println("Ganaste.");
                            break;
                        }
                    }// Se terminó la batalla
                    System.out.println("La batalla ha terminado");
                    break;
                /// Inventario
                case 4:
                    System.out.println("Objetos en inventario");
                    for (String item : inventario) {
                        System.out.println(" - " + item);
                    }
                    break;
                case 5:
                    System.out.println("Estado del personaje");
                    if (personajeCreado == false) {
                        System.out.println("Debes crear un personaje");
                    } else {
                        System.out.println("Nombre:" + name);
                        System.out.println("Clase:" + claseTipo);
                        System.out.println("Vida:" + vida);
                        System.out.println("Fuerza:" + fuerza);
                        // Evaluación del estado del jugador
                        if (vida <= 80) {
                            System.out.println("Estás excelente");
                        } else if (vida <= 50) {
                            System.out.println("Estás reguleque");
                        } else {
                            System.out.println("Estás herido");
                        }

                    }
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        } while (opcion != 6);
            sc.close();
    }
}
