import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionMenu = 0;
        int areaActual = 1;
        int opcionCarrusel = 0;

        String contactoNombre = "";
        String contactoCorreo = "";
        String contactoTelefono = "";
        String contactoMotivo = "";

        while (opcionMenu != 6) {
            System.out.println("\n--- GYM LOS MAKIAS ---");
            System.out.println("1. Inicio e informacion de la marca");
            System.out.println("2. Carrusel de areas de entrenamiento");
            System.out.println("3. Ubicacion, horarios y mapa");
            System.out.println("4. Planes de suscripcion");
            System.out.println("5. Formulario de contacto y dudas");
            System.out.println("6. Salir");
            System.out.println("---");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = sc.nextInt();
            sc.nextLine();

            if (opcionMenu == 1) {
                System.out.println("\n=== INICIO: GYM LOS MAKIAS ===");
                System.out.println("Slogan: Fuerza, Disciplina y Berraquera!");
                System.out.println("Instalaciones: Contamos con sala de musculacion, zona de peso libre, banca de pecho, zona cardiovascular y salon de entrenamiento funcional y clases grupales.");
                System.out.println("Ubicacion principal: Calle 52 # 48-35, Sector El Prado (Bello, Antioquia).");
                System.out.println("Canal de atencion WhatsApp: +57 300 123 4567");
                System.out.println("--------------------");
            } else if (opcionMenu == 2) {
                opcionCarrusel = 0;
                while (opcionCarrusel != 3) {
                    System.out.println("\n=== CARRUSEL DE AREAS DE ENTRENAMIENTO ===");
                    if (areaActual == 1) {
                        System.out.println("Area [1/3]: Interior - Zona de Peso Muerto y Fuerza");
                        System.out.println("Descripcion: Espacio amplio equipado con plataformas y barras olimpicas para levantamiento pesado.");
                    } else if (areaActual == 2) {
                        System.out.println("Area [2/3]: Fuerza - Zona de Banca de Pecho y Musculacion");
                        System.out.println("Descripcion: Bancos planos, inclinados y maquinas de musculacion de alto rendimiento.");
                    } else if (areaActual == 3) {
                        System.out.println("Area [3/3]: Clases - Zona de Entrenamiento Funcional y Grupal");
                        System.out.println("Descripcion: Salon dotado para clases grupales de Spinning, Rumba y CrossFit.");
                    }
                    System.out.println("---");
                    System.out.println("1. Siguiente area");
                    System.out.println("2. Area anterior");
                    System.out.println("3. Volver al menu principal");
                    System.out.println("---");
                    System.out.print("Seleccione una opcion: ");
                    opcionCarrusel = sc.nextInt();
                    sc.nextLine();

                    if (opcionCarrusel == 1) {
                        if (areaActual == 3) {
                            areaActual = 1;
                        } else {
                            areaActual = areaActual + 1;
                        }
                    } else if (opcionCarrusel == 2) {
                        if (areaActual == 1) {
                            areaActual = 3;
                        } else {
                            areaActual = areaActual - 1;
                        }
                    } else if (opcionCarrusel != 3) {
                        System.out.println("Opcion no valida.");
                    }
                }
            } else if (opcionMenu == 3) {
                System.out.println("\n=== UBICACION Y MAPA DE LA SEDE ===");
                System.out.println("Direccion: Calle 52 # 48-35, Sector El Prado (Bello), cerca de la Choza de Marco Fidel Suarez.");
                System.out.println("Horarios de atencion:");
                System.out.println("- Lunes a Viernes: 5:00 AM - 10:00 PM");
                System.out.println("- Sabados y Festivos: 6:00 AM - 6:00 PM");
                System.out.println("- Domingos: 7:00 AM - 2:00 PM");
                System.out.println("WhatsApp: +57 300 123 4567");
                System.out.println("---");
                System.out.println("MAPA DE UBICACION (Vista de terminal):");
                System.out.println("Coordenadas GPS: Latitud 6.3352516, Longitud -75.5575966");
                System.out.println("Referencia: Sector El Prado, Bello - Antioquia");
                System.out.println("Enlace Google Maps: https://www.google.com/maps?q=6.3352516,-75.5575966");
                System.out.println("--------------------");
            } else if (opcionMenu == 4) {
                System.out.println("\n=== PLANES DE SUSCRIPCION ===");
                System.out.println("1. Plan Basico (Bronce)");
                System.out.println("   Costo: $65.000 / Mes");
                System.out.println("   Beneficios: Acceso a sala de musculacion, Zona cardiovascular, Valoracion fisica inicial.");
                System.out.println("---");
                System.out.println("2. Plan Makia (Plata) [OFERTA: MAS POPULAR]");
                System.out.println("   Costo: $95.000 / Mes");
                System.out.println("   Beneficios: Todo lo del Plan Basico, Clases grupales (Spinning, Rumba, CrossFit), Casillero asignado.");
                System.out.println("---");
                System.out.println("3. Plan Elite (Oro)");
                System.out.println("   Costo: $150.000 / Mes");
                System.out.println("   Beneficios: Todo lo del Plan Makia, 4 sesiones al mes con entrenador personalizado, Asesoria nutricional.");
                System.out.println("---");
                System.out.println("4. Plan Anual Makia VIP");
                System.out.println("   Costo: $900.000 / Anual");
                System.out.println("   Beneficios: Acceso total sin restricciones, Kit deportivo de bienvenida, 1 mes congelable al ano.");
                System.out.println("--------------------");
            } else if (opcionMenu == 5) {
                System.out.println("\n=== FORMULARIO DE CONTACTO ===");
                System.out.print("Ingrese su nombre: ");
                contactoNombre = sc.nextLine();
                System.out.print("Ingrese su correo electronico: ");
                contactoCorreo = sc.nextLine();
                System.out.print("Ingrese su telefono: ");
                contactoTelefono = sc.nextLine();
                System.out.print("Ingrese el motivo de su consulta: ");
                contactoMotivo = sc.nextLine();

                System.out.println("---");
                System.out.println("ALERTA: Envio exitoso, " + contactoNombre + ". Hemos recibido tu consulta desde el correo " + contactoCorreo + " y telefono " + contactoTelefono + ".");
                System.out.println("Motivo registrado: " + contactoMotivo);

                contactoNombre = "";
                contactoCorreo = "";
                contactoTelefono = "";
                contactoMotivo = "";
                System.out.println("Estado del formulario: Nuestro equipo se estara comunicando con usted lo antes posible.");
                System.out.println("--------------------");
            } else if (opcionMenu == 6) {
                System.out.println("\nGracias por visitar Gym Los Makias. Hasta pronto.");
            } else {
                System.out.println("\nOpcion no valida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
