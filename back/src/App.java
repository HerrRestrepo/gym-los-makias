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

        String usuarioNombre = "";
        String usuarioDocumento = "";
        String usuarioCorreo = "";
        String usuarioTelefono = "";
        String usuarioContrasena = "";
        boolean registroValido = false;
        boolean correoValido = false;

        int opcionPlan = 0;
        String planSeleccionado = "";
        int valorPlanSeleccionado = 0;
        boolean planConfirmado = false;
        int opcionEntrenador = 0;
        int alumnoElegido = 0;
        int claseElegida = 0;
        int opcionAdmin = 0;

        while (opcionMenu != 9) {
            System.out.println("\n--- GYM LOS MAKIAS ---");
            System.out.println("1. Inicio e informacion de la marca");
            System.out.println("2. Carrusel de areas de entrenamiento");
            System.out.println("3. Ubicacion, horarios y mapa");
            System.out.println("4. Planes de suscripcion");
            System.out.println("5. Formulario de contacto y dudas");
            System.out.println("6. Registrarse y seleccionar plan (!PONTE VIGA!)");
            System.out.println("7. Modulo entrenador");
            System.out.println("8. Modulo administracion");
            System.out.println("9. Salir");
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
                registroValido = false;
                while (!registroValido) {
                    System.out.println("\n=== FORMULARIO DE REGISTRO DE NUEVO USUARIO ===");
                    System.out.print("Ingrese su nombre completo: ");
                    usuarioNombre = sc.nextLine();
                    System.out.print("Ingrese su documento de identificacion: ");
                    usuarioDocumento = sc.nextLine();
                    correoValido = false;
                    while (!correoValido) {
                        System.out.print("Ingrese su correo electronico: ");
                        usuarioCorreo = sc.nextLine();
                        if (!usuarioCorreo.contains("@")) {
                            System.out.println("ALERTA: El correo electronico ingresado no es valido (debe incluir '@'). Corrija el campo para continuar.");
                        } else {
                            correoValido = true;
                        }
                    }

                    System.out.print("Ingrese su telefono: ");
                    usuarioTelefono = sc.nextLine();
                    System.out.print("Ingrese su contrasena: ");
                    usuarioContrasena = sc.nextLine();

                    System.out.println("---");
                    if (usuarioNombre.equals("") || usuarioDocumento.equals("") || usuarioCorreo.equals("") || usuarioTelefono.equals("") || usuarioContrasena.equals("")) {
                        System.out.println("ALERTA: Todos los campos obligatorios deben estar completos. Registro bloqueado temporalmente.");
                    } else {
                        registroValido = true;
                        System.out.println("Datos validados correctamente. Bienvenido, " + usuarioNombre + ".");
                    }
                }

                planConfirmado = false;
                while (!planConfirmado) {
                    System.out.println("\n=== SELECCION DINAMICA DE PLAN ===");
                    if (planSeleccionado.equals("Plan Basico (Bronce)")) {
                        System.out.println("1. [SELECCIONADO] Plan Basico (Bronce) - $65.000 / Mes");
                    } else {
                        System.out.println("1. Plan Basico (Bronce) - $65.000 / Mes");
                    }
                    if (planSeleccionado.equals("Plan Makia (Plata)")) {
                        System.out.println("2. [SELECCIONADO] Plan Makia (Plata) - $95.000 / Mes");
                    } else {
                        System.out.println("2. Plan Makia (Plata) - $95.000 / Mes");
                    }
                    if (planSeleccionado.equals("Plan Elite (Oro)")) {
                        System.out.println("3. [SELECCIONADO] Plan Elite (Oro) - $150.000 / Mes");
                    } else {
                        System.out.println("3. Plan Elite (Oro) - $150.000 / Mes");
                    }
                    if (planSeleccionado.equals("Plan Anual Makia VIP")) {
                        System.out.println("4. [SELECCIONADO] Plan Anual Makia VIP - $900.000 / Anual");
                    } else {
                        System.out.println("4. Plan Anual Makia VIP - $900.000 / Anual");
                    }
                    System.out.println("5. Confirmar plan elegido y guardar seleccion");
                    System.out.println("---");
                    System.out.print("Seleccione una opcion: ");
                    opcionPlan = sc.nextInt();
                    sc.nextLine();

                    if (opcionPlan == 1) {
                        planSeleccionado = "Plan Basico (Bronce)";
                        valorPlanSeleccionado = 65000;
                        System.out.println("Plan resaltado: " + planSeleccionado + " | Valor a cobrar: $" + valorPlanSeleccionado);
                    } else if (opcionPlan == 2) {
                        planSeleccionado = "Plan Makia (Plata)";
                        valorPlanSeleccionado = 95000;
                        System.out.println("Plan resaltado: " + planSeleccionado + " | Valor a cobrar: $" + valorPlanSeleccionado);
                    } else if (opcionPlan == 3) {
                        planSeleccionado = "Plan Elite (Oro)";
                        valorPlanSeleccionado = 150000;
                        System.out.println("Plan resaltado: " + planSeleccionado + " | Valor a cobrar: $" + valorPlanSeleccionado);
                    } else if (opcionPlan == 4) {
                        planSeleccionado = "Plan Anual Makia VIP";
                        valorPlanSeleccionado = 900000;
                        System.out.println("Plan resaltado: " + planSeleccionado + " | Valor a cobrar: $" + valorPlanSeleccionado);
                    } else if (opcionPlan == 5) {
                        if (planSeleccionado.equals("")) {
                            System.out.println("ALERTA: Debe seleccionar un plan antes de confirmar.");
                        } else {
                            planConfirmado = true;
                            System.out.println("---");
                            System.out.println("RESUMEN DE ALTA Y SELECCION:");
                            System.out.println("Cliente: " + usuarioNombre + " (Doc: " + usuarioDocumento + ")");
                            System.out.println("Correo: " + usuarioCorreo + " | Telefono: " + usuarioTelefono);
                            System.out.println("Plan seleccionado: " + planSeleccionado);
                            System.out.println("Valor a cobrar en el proceso de pago: $" + valorPlanSeleccionado);
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                }
                } else if (opcionMenu == 7) {
                opcionEntrenador = -1;
                while (opcionEntrenador != 0) {
                    System.out.println("\n=== MODULO ENTRENADOR ===");
                    System.out.println("1. Fichas tecnicas de alumnos");
                    System.out.println("2. Agenda personal");
                    System.out.println("3. Clases grupales de la semana");
                    System.out.println("4. Asistentes por clase");
                    System.out.println("0. Volver al menu principal");
                    System.out.println("---");
                    System.out.print("Seleccione una opcion: ");
                    opcionEntrenador = sc.nextInt();
                    sc.nextLine();

                    if (opcionEntrenador == 1) {
                        alumnoElegido = -1;
                        while (alumnoElegido != 0) {
                            System.out.println("\n=== FICHAS TECNICAS DE ALUMNOS ===");
                            System.out.println("1. Valentina Restrepo");
                            System.out.println("2. Juan David Gomez");
                            System.out.println("3. Camila Arango");
                            System.out.println("4. Mateo Castano");
                            System.out.println("5. Sara Jimenez");
                            System.out.println("0. Volver");
                            System.out.println("---");
                            System.out.print("Elija un alumno para ver detalles: ");
                            alumnoElegido = sc.nextInt();
                            sc.nextLine();

                            if (alumnoElegido == 1) {
                                System.out.println("\nFICHA: Valentina Restrepo");
                                System.out.println("Plan contratado: Plan Makia (Plata)");
                                System.out.println("Vence: 30 de noviembre de 2026");
                                System.out.println("Rutina asignada: Tren superior y core, 4 dias a la semana");
                                System.out.println("Objetivo: Hipertrofia");
                            } else if (alumnoElegido == 2) {
                                System.out.println("\nFICHA: Juan David Gomez");
                                System.out.println("Plan contratado: Plan Elite (Oro)");
                                System.out.println("Vence: 15 de diciembre de 2026");
                                System.out.println("Rutina asignada: Cardio y circuito funcional, 5 dias a la semana");
                                System.out.println("Objetivo: Perdida de peso");
                            } else if (alumnoElegido == 3) {
                                System.out.println("\nFICHA: Camila Arango");
                                System.out.println("Plan contratado: Plan Basico (Bronce)");
                                System.out.println("Vence: 20 de noviembre de 2026");
                                System.out.println("Rutina asignada: Full body y movilidad, 3 dias a la semana");
                                System.out.println("Objetivo: Acondicionamiento fisico");
                            } else if (alumnoElegido == 4) {
                                System.out.println("\nFICHA: Mateo Castano");
                                System.out.println("Plan contratado: Plan Anual Makia VIP");
                                System.out.println("Vence: 10 de agosto de 2027");
                                System.out.println("Rutina asignada: Empuje, traccion y pierna, 5 dias a la semana");
                                System.out.println("Objetivo: Hipertrofia");
                            } else if (alumnoElegido == 5) {
                                System.out.println("\nFICHA: Sara Jimenez");
                                System.out.println("Plan contratado: Plan Makia (Plata)");
                                System.out.println("Vence: 5 de diciembre de 2026");
                                System.out.println("Rutina asignada: Cardio, fuerza ligera y estiramiento, 4 dias a la semana");
                                System.out.println("Objetivo: Perdida de peso");
                            } else if (alumnoElegido != 0) {
                                System.out.println("Opcion no valida.");
                            }
                        }
                    } else if (opcionEntrenador == 2) {
                        System.out.println("\n=== AGENDA PERSONAL DEL ENTRENADOR ===");
                        System.out.println("LUNES");
                        System.out.println("  [ 7:00 a. m. ] Valentina Restrepo - Fuerza (individual)");
                        System.out.println("  [ 9:00 a. m. ] Libre");
                        System.out.println("  [ 4:00 p. m. ] Camila Arango - Movilidad (individual)");
                        System.out.println("MARTES");
                        System.out.println("  [ 7:00 a. m. ] Libre");
                        System.out.println("  [ 6:00 p. m. ] Juan David Gomez - Cardio (individual)");
                        System.out.println("MIERCOLES");
                        System.out.println("  [ 8:00 a. m. ] Mateo Castano - Hipertrofia (individual)");
                        System.out.println("  [ 5:00 p. m. ] Libre");
                        System.out.println("JUEVES");
                        System.out.println("  [ 7:00 a. m. ] Sara Jimenez - Cardio y fuerza (individual)");
                        System.out.println("  [ 6:00 p. m. ] Libre");
                        System.out.println("VIERNES");
                        System.out.println("  [ 9:00 a. m. ] Libre");
                        System.out.println("  [ 5:30 p. m. ] Valentina Restrepo - Valoracion (individual)");
                        System.out.println("--------------------");
                    } else if (opcionEntrenador == 3) {
                        System.out.println("\n=== CLASES GRUPALES QUE DEBO IMPARTIR ===");
                        System.out.println("- [CICLISMO] Ciclismo indoor");
                        System.out.println("    Lunes, 6:00 p. m. | Aforo: 18 personas");
                        System.out.println("    Enfoque: resistencia cardiovascular");
                        System.out.println("    Preparacion: bicicletas y lista musical");
                        System.out.println("- [FUNCIONAL] Entrenamiento funcional");
                        System.out.println("    Miercoles, 7:00 a. m. | Aforo: 12 personas");
                        System.out.println("    Enfoque: fuerza y coordinacion");
                        System.out.println("    Preparacion: bandas, conos y colchonetas");
                        System.out.println("- [MOVILIDAD] Movilidad y estiramiento");
                        System.out.println("    Viernes, 5:30 p. m. | Aforo: 10 personas");
                        System.out.println("    Enfoque: flexibilidad y recuperacion");
                        System.out.println("    Preparacion: colchonetas y bloques");
                        System.out.println("--------------------");
                    } else if (opcionEntrenador == 4) {
                        claseElegida = -1;
                        while (claseElegida != 0) {
                            System.out.println("\n=== ASISTENTES POR CLASE ===");
                            System.out.println("1. Ciclismo indoor (Lunes) - Reservas: 6");
                            System.out.println("2. Entrenamiento funcional (Miercoles) - Reservas: 5");
                            System.out.println("3. Movilidad y estiramiento (Viernes) - Reservas: 4");
                            System.out.println("0. Volver");
                            System.out.println("---");
                            System.out.print("Elija una clase: ");
                            claseElegida = sc.nextInt();
                            sc.nextLine();

                            if (claseElegida == 1) {
                                System.out.println("\nAsistentes de Ciclismo indoor (6 reservas):");
                                System.out.println("1. Valentina Restrepo | 2. Juan David Gomez | 3. Camila Arango | 4. Mateo Castano | 5. Sara Jimenez | 6. Daniela Ruiz");
                            } else if (claseElegida == 2) {
                                System.out.println("\nAsistentes de Entrenamiento funcional (5 reservas):");
                                System.out.println("1. Andres Salazar | 2. Laura Mejia | 3. Felipe Duque | 4. Mariana Gomez | 5. Santiago Ocampo");
                            } else if (claseElegida == 3) {
                                System.out.println("\nAsistentes de Movilidad y estiramiento (4 reservas):");
                                System.out.println("1. Paula Zapata | 2. Sebastian Velez | 3. Natalia Cardona | 4. Camilo Rios");
                            } else if (claseElegida != 0) {
                                System.out.println("Opcion no valida.");
                            }
                        }
                    } else if (opcionEntrenador != 0) {
                        System.out.println("Opcion no valida.");
                    }
                }
            } else if (opcionMenu == 8) {
                System.out.println("\n=== MODULO ADMINISTRACION ===");
                System.out.println("(proximamente)");
            } else if (opcionMenu == 9) {
                System.out.println("\nGracias por visitar Gym Los Makias. Hasta pronto.");
            } else {
                System.out.println("\nOpcion no valida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
