import java.security.SecureRandom;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom generadorAleatorio = new SecureRandom();

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
        boolean clienteRegistrado = false;
        String estadoCliente = "Sin registro";
        boolean[] clasesReservadas = new boolean[3];
        String[] nombresClases = {
            "Ciclismo indoor - Lunes, 6:00 p. m.",
            "Entrenamiento funcional - Miercoles, 7:00 a. m.",
            "Movilidad y estiramiento - Viernes, 5:30 p. m."
        };

        int opcionPlan = 0;
        int opcionPago = 0;
        int opcionCliente = 0;
        int claseCliente = 0;
        String planSeleccionado = "";
        String metodoPagoSeleccionado = "";
        String numeroMedioPago = "";
        String nombreBanco = "";
        int valorPlanSeleccionado = 0;
        boolean planConfirmado = false;
        int opcionEntrenador = 0;
        int alumnoElegido = 0;
        int claseElegida = 0;
        int opcionAdmin = 0;

                int usuariosActivos = 126;
        String busqueda = "";
        int filaElegida = 0;
        int numeroPlan = 0;
        String confirmar = "";
        boolean hayResultados = false;
        String[][] clientes = {
            {"Mariana Gomez", "mariana.gomez@correo.com", "Plan Makia (Plata)", "Activo"},
            {"Valentina Restrepo", "valentina.restrepo@ejemplo.com", "Plan Elite (Oro)", "Activo"},
            {"Juan David Gomez", "juan.gomez@ejemplo.com", "Plan Basico (Bronce)", "Vencido"},
            {"Camila Arango", "camila.arango@ejemplo.com", "Plan Makia (Plata)", "Activo"},
            {"Mateo Castano", "mateo.castano@ejemplo.com", "Plan Anual Makia VIP", "Activo"},
            {"Sara Jimenez", "sara.jimenez@ejemplo.com", "Plan Basico (Bronce)", "Vencido"}
        };

        while (opcionMenu != 10) {
            System.out.println("\n--- GYM LOS MAKIAS ---");
            System.out.println("1. Inicio e informacion de la marca");
            System.out.println("2. Carrusel de areas de entrenamiento");
            System.out.println("3. Ubicacion, horarios y mapa");
            System.out.println("4. Planes de suscripcion");
            System.out.println("5. Formulario de contacto y dudas");
            System.out.println("6. Registrarse y seleccionar plan (!PONTE VIGA!)");
            System.out.println("7. Modulo entrenador");
            System.out.println("8. Modulo administracion");
            System.out.println("9. Modulo cliente");
            System.out.println("10. Salir");
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
                metodoPagoSeleccionado = "";
                numeroMedioPago = "";
                nombreBanco = "";
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
                            while (metodoPagoSeleccionado.equals("")) {
                                System.out.println("\n=== METODO DE PAGO ===");
                                System.out.println("1. Tarjeta de credito");
                                System.out.println("2. PSE");
                                System.out.println("3. Efectivo");
                                System.out.print("Seleccione un metodo de pago: ");
                                opcionPago = sc.nextInt();
                                sc.nextLine();

                                if (opcionPago == 1) {
                                    metodoPagoSeleccionado = "Tarjeta de credito";
                                } else if (opcionPago == 2) {
                                    metodoPagoSeleccionado = "PSE";
                                } else if (opcionPago == 3) {
                                    metodoPagoSeleccionado = "Efectivo";
                                } else {
                                    System.out.println("Opcion no valida. Seleccione 1, 2 o 3.");
                                }
                            }

                            if (opcionPago == 1 || opcionPago == 2) {
                                boolean numeroMedioPagoValido = false;
                                while (!numeroMedioPagoValido) {
                                    System.out.print("Ingrese el numero de tarjeta o cuenta: ");
                                    numeroMedioPago = sc.nextLine().trim();
                                    if (!numeroMedioPago.matches("\\d{4,}")) {
                                        System.out.println("ALERTA: Ingrese un numero valido de al menos 4 digitos.");
                                    } else {
                                        numeroMedioPagoValido = true;
                                    }
                                }

                                while (nombreBanco.trim().equals("")) {
                                    System.out.print("Ingrese el nombre del banco: ");
                                    nombreBanco = sc.nextLine();
                                    if (nombreBanco.trim().equals("")) {
                                        System.out.println("ALERTA: El nombre del banco es obligatorio.");
                                    }
                                }
                            }

                            String caracteresRecibo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                            String numeroRecibo = "";
                            for (int i = 0; i < 4; i++) {
                                numeroRecibo += caracteresRecibo.charAt(
                                    generadorAleatorio.nextInt(caracteresRecibo.length()));
                            }

                            planConfirmado = true;
                            clienteRegistrado = true;
                            estadoCliente = "Activo";
                            System.out.println("---");
                            System.out.println("RESUMEN DE ALTA Y SELECCION:");
                            System.out.println("Numero de recibo: " + numeroRecibo);
                            System.out.println("Cliente: " + usuarioNombre + " (Doc: " + usuarioDocumento + ")");
                            System.out.println("Correo: " + usuarioCorreo + " | Telefono: " + usuarioTelefono);
                            System.out.println("Plan seleccionado: " + planSeleccionado);
                            System.out.println("Metodo de pago: " + metodoPagoSeleccionado);
                            if (!numeroMedioPago.equals("")) {
                                System.out.println("Numero registrado: ****" + numeroMedioPago.substring(numeroMedioPago.length() - 4));
                                System.out.println("Banco: " + nombreBanco.trim());
                            }
                            System.out.println("Valor a cobrar en el proceso de pago: $" + valorPlanSeleccionado);
                            System.out.println("--------------------");
                            numeroMedioPago = "";
                        }
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                }
                } else if (opcionMenu == 9) {
                    opcionCliente = -1;
                    while (opcionCliente != 0) {
                        System.out.println("\n=== MODULO CLIENTE ===");
                        System.out.println("1. Ver informacion de registro");
                        System.out.println("2. Reservar clase");
                        System.out.println("3. Ver clases reservadas");
                        System.out.println("4. Cancelar reserva");
                        System.out.println("0. Volver al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        opcionCliente = sc.nextInt();
                        sc.nextLine();

                        if (opcionCliente == 1) {
                            if (clienteRegistrado) {
                                System.out.println("\nInformacion de registro:");
                                System.out.println("Nombre: " + usuarioNombre);
                                System.out.println("Documento: " + usuarioDocumento);
                                System.out.println("Correo: " + usuarioCorreo);
                                System.out.println("Telefono: " + usuarioTelefono);
                                System.out.println("Plan: " + planSeleccionado);
                                System.out.println("Estado del plan: " + estadoCliente);
                            } else {
                                System.out.println("No hay un registro confirmado. Seleccione la opcion 6 para registrarse.");
                            }
                        } else if (opcionCliente == 2) {
                            if (!clienteRegistrado || !estadoCliente.equals("Activo")) {
                                System.out.println("Debe tener un registro activo para reservar clases.");
                            } else {
                                System.out.println("\n=== CLASES DISPONIBLES ===");
                                System.out.println("1. Ciclismo indoor - Lunes, 6:00 p. m.");
                                System.out.println("2. Entrenamiento funcional - Miercoles, 7:00 a. m.");
                                System.out.println("3. Movilidad y estiramiento - Viernes, 5:30 p. m.");
                                System.out.println("0. Volver");
                                System.out.print("Seleccione la clase que desea reservar: ");
                                claseCliente = sc.nextInt();
                                sc.nextLine();

                                if (claseCliente >= 1 && claseCliente <= clasesReservadas.length) {
                                    if (clasesReservadas[claseCliente - 1]) {
                                        System.out.println("Ya tiene una reserva para esa clase.");
                                    } else {
                                        clasesReservadas[claseCliente - 1] = true;
                                        System.out.println("Reserva confirmada.");
                                    }
                                } else if (claseCliente != 0) {
                                    System.out.println("Opcion no valida.");
                                }
                            }
                        } else if (opcionCliente == 3) {
                            boolean tieneReservas = false;
                            System.out.println("\n=== CLASES RESERVADAS ===");
                            for (int i = 0; i < clasesReservadas.length; i++) {
                                if (clasesReservadas[i]) {
                                    System.out.println("- " + nombresClases[i]);
                                    tieneReservas = true;
                                }
                            }
                            if (!tieneReservas) {
                                System.out.println("Aun no tiene clases reservadas.");
                            }
                        } else if (opcionCliente == 4) {
                            boolean tieneReservas = false;
                            System.out.println("\n=== CANCELAR RESERVA ===");
                            for (int i = 0; i < clasesReservadas.length; i++) {
                                if (clasesReservadas[i]) {
                                    System.out.println((i + 1) + ". " + nombresClases[i]);
                                    tieneReservas = true;
                                }
                            }
                            if (tieneReservas) {
                                System.out.println("0. Volver");
                                System.out.print("Seleccione la reserva que desea cancelar: ");
                                claseCliente = sc.nextInt();
                                sc.nextLine();

                                if (claseCliente >= 1 && claseCliente <= clasesReservadas.length
                                    && clasesReservadas[claseCliente - 1]) {
                                    clasesReservadas[claseCliente - 1] = false;
                                    System.out.println("Reserva cancelada correctamente.");
                                } else if (claseCliente != 0) {
                                    System.out.println("Opcion no valida o no corresponde a una reserva activa.");
                                }
                            } else {
                                System.out.println("No tiene reservas para cancelar.");
                            }
                        } else if (opcionCliente != 0) {
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
                    opcionAdmin = -1;
                    while (opcionAdmin != 0) {
                    System.out.println("\n=== MODULO ADMINISTRACION ===");
                    System.out.println("1. Usuarios activos");
                    System.out.println("2. Indicador semanal de reservas");
                    System.out.println("3. Graficos de finanzas y planes");
                    System.out.println("4. Tabla general de clientes");
                    System.out.println("5. Buscar cliente por nombre");
                    System.out.println("6. Directorio de entrenadores");
                    System.out.println("7. Editar plan de un cliente");
                    System.out.println("8. Dar de baja a un cliente");
                    System.out.println("0. Volver al menu principal");
                    System.out.println("---");
                    System.out.print("Seleccione una opcion: ");
                    opcionAdmin = sc.nextInt();
                    sc.nextLine();

                    if (opcionAdmin == 1) {
                        // HU028: usuarios activos
                        System.out.println("\n=== DASHBOARD: USUARIOS ACTIVOS ===");
                        System.out.println("+------------------------------+");
                        System.out.println("| Clientes activos             |");
                        System.out.println("|           " + usuariosActivos + "                |");
                        System.out.println("| (dato de demostracion)       |");
                        System.out.println("+------------------------------+");
                    } else if (opcionAdmin == 2) {
                        // HU029: indicador semanal de reservas
                        String[] clasesNombre = {"Ciclismo indoor", "Entrenamiento funcional", "Yoga", "Zumba"};
                        int[] clasesReservas = {38, 29, 22, 37};
                        int[] clasesCupos = {40, 36, 30, 42};
                        System.out.println("\n=== INDICADOR SEMANAL DE RESERVAS ===");
                        for (int i = 0; i < clasesNombre.length; i++) {
                            int porcentaje = clasesReservas[i] * 100 / clasesCupos[i];
                            String barra = "";
                            for (int j = 0; j < porcentaje / 5; j++) {
                                barra = barra + "#";
                            }
                            System.out.println(clasesNombre[i] + " (" + clasesReservas[i] + " de " + clasesCupos[i] + " cupos)");
                            System.out.println("[" + barra + "] " + porcentaje + "%");
                        }
                    } else if (opcionAdmin == 3) {
                        // HU030: graficos simulados (porcentajes fijos)
                        String[] planesNombre = {"Plan Basico (Bronce)", "Plan Makia (Plata)", "Plan Elite (Oro)", "Plan Anual VIP"};
                        int[] planesPorcentaje = {20, 45, 25, 10};
                        String[] pagosNombre = {"Tarjeta de credito", "PSE", "Efectivo"};
                        int[] pagosPorcentaje = {40, 35, 25};

                        System.out.println("\n=== PLANES MAS VENDIDOS ===");
                        for (int i = 0; i < planesNombre.length; i++) {
                            String barra = "";
                            for (int j = 0; j < planesPorcentaje[i] / 2; j++) {
                                barra = barra + "#";
                            }
                            System.out.println(planesNombre[i] + ": " + barra + " " + planesPorcentaje[i] + "%");
                        }

                        System.out.println("\n=== METODOS DE PAGO USADOS ===");
                        for (int i = 0; i < pagosNombre.length; i++) {
                            String barra = "";
                            for (int j = 0; j < pagosPorcentaje[i] / 2; j++) {
                                barra = barra + "#";
                            }
                            System.out.println(pagosNombre[i] + ": " + barra + " " + pagosPorcentaje[i] + "%");
                        }
                        System.out.println("(datos de demostracion)");
                    } else if (opcionAdmin == 4) {
                        // HU031: tabla general de clientes
                        System.out.println("\n=== TABLA GENERAL DE CLIENTES ===");
                        System.out.println("N | Nombre | Correo | Plan | Estado");
                        for (int i = 0; i < clientes.length; i++) {
                            if (!clientes[i][3].equals("Baja")) {
                                System.out.println((i + 1) + " | " + clientes[i][0] + " | " + clientes[i][1] + " | " + clientes[i][2] + " | " + clientes[i][3]);
                            }
                        }
                    } else if (opcionAdmin == 5) {
                        // HU032: busqueda de clientes
                        System.out.print("\nEscriba el nombre a buscar: ");
                        busqueda = sc.nextLine().toLowerCase();
                        hayResultados = false;
                        System.out.println("=== RESULTADOS ===");
                        for (int i = 0; i < clientes.length; i++) {
                            if (!clientes[i][3].equals("Baja") && clientes[i][0].toLowerCase().contains(busqueda)) {
                                System.out.println((i + 1) + " | " + clientes[i][0] + " | " + clientes[i][1] + " | " + clientes[i][2] + " | " + clientes[i][3]);
                                hayResultados = true;
                            }
                        }
                        if (!hayResultados) {
                            System.out.println("No se encontraron clientes con ese nombre.");
                        }
                    } else if (opcionAdmin == 6) {
                        // HU033: directorio de entrenadores
                        System.out.println("\n=== DIRECTORIO DEL PERSONAL TECNICO ===");
                        System.out.println("1. Andres Londono - Entrenador personal");
                        System.out.println("   Cuenta: andres.londono@gymmakias.ejemplo");
                        System.out.println("   Especialidad: Fuerza e hipertrofia");
                        System.out.println("   Horario: Lunes a viernes, 6:00 a. m. a 2:00 p. m.");
                        System.out.println("2. Laura Restrepo - Instructora grupal");
                        System.out.println("   Cuenta: laura.restrepo@gymmakias.ejemplo");
                        System.out.println("   Especialidad: Ciclismo indoor y resistencia");
                        System.out.println("   Horario: Lunes a jueves, 2:00 p. m. a 8:00 p. m.");
                        System.out.println("3. Julian Cardenas - Entrenador funcional");
                        System.out.println("   Cuenta: julian.cardenas@gymmakias.ejemplo");
                        System.out.println("   Especialidad: Acondicionamiento y entrenamiento funcional");
                        System.out.println("   Horario: Martes a sabado, 7:00 a. m. a 3:00 p. m.");
                        System.out.println("4. Mariana Velez - Instructora grupal");
                        System.out.println("   Cuenta: mariana.velez@gymmakias.ejemplo");
                        System.out.println("   Especialidad: Yoga y movilidad");
                        System.out.println("   Horario: Miercoles a domingo, 8:00 a. m. a 4:00 p. m.");
                        System.out.println("---");
                        System.out.println("[Crear nuevo perfil] (boton inactivo: solo gerencia)");
                    } else if (opcionAdmin == 7) {
                        // HU034: editar plan de un cliente (solo en memoria)
                        System.out.println("\n=== EDITAR PLAN DE UN CLIENTE ===");
                        for (int i = 0; i < clientes.length; i++) {
                            if (!clientes[i][3].equals("Baja")) {
                                System.out.println((i + 1) + ". " + clientes[i][0] + " - " + clientes[i][2]);
                            }
                        }
                        System.out.print("Numero del cliente a editar (0 para cancelar): ");
                        filaElegida = sc.nextInt();
                        sc.nextLine();

                        if (filaElegida >= 1 && filaElegida <= clientes.length && !clientes[filaElegida - 1][3].equals("Baja")) {
                            System.out.println("Nuevo plan:");
                            System.out.println("1. Plan Basico (Bronce)");
                            System.out.println("2. Plan Makia (Plata)");
                            System.out.println("3. Plan Elite (Oro)");
                            System.out.println("4. Plan Anual Makia VIP");
                            System.out.print("Seleccione el plan: ");
                            numeroPlan = sc.nextInt();
                            sc.nextLine();

                            if (numeroPlan == 1) {
                                clientes[filaElegida - 1][2] = "Plan Basico (Bronce)";
                            } else if (numeroPlan == 2) {
                                clientes[filaElegida - 1][2] = "Plan Makia (Plata)";
                            } else if (numeroPlan == 3) {
                                clientes[filaElegida - 1][2] = "Plan Elite (Oro)";
                            } else if (numeroPlan == 4) {
                                clientes[filaElegida - 1][2] = "Plan Anual Makia VIP";
                            } else {
                                System.out.println("Opcion no valida. No se hicieron cambios.");
                            }
                            if (numeroPlan >= 1 && numeroPlan <= 4) {
                                System.out.println("Plan actualizado: " + clientes[filaElegida - 1][0] + " ahora tiene " + clientes[filaElegida - 1][2]);
                                System.out.println("(el cambio dura hasta cerrar el programa)");
                            }
                        } else if (filaElegida != 0) {
                            System.out.println("Cliente no valido.");
                        }
                    } else if (opcionAdmin == 8) {
                        // HU035: dar de baja con confirmacion (solo en memoria)
                        System.out.println("\n=== DAR DE BAJA A UN CLIENTE ===");
                        for (int i = 0; i < clientes.length; i++) {
                            if (!clientes[i][3].equals("Baja")) {
                                System.out.println((i + 1) + ". " + clientes[i][0] + " - " + clientes[i][3]);
                            }
                        }
                        System.out.print("Numero del cliente a dar de baja (0 para cancelar): ");
                        filaElegida = sc.nextInt();
                        sc.nextLine();

                        if (filaElegida >= 1 && filaElegida <= clientes.length && !clientes[filaElegida - 1][3].equals("Baja")) {
                            System.out.print("ALERTA - Gerencia: confirma dar de baja a " + clientes[filaElegida - 1][0] + "? (s/n): ");
                            confirmar = sc.nextLine();
                            if (confirmar.equals("s")) {
                                if (clientes[filaElegida - 1][3].equals("Activo")) {
                                    usuariosActivos = usuariosActivos - 1;
                                }
                                clientes[filaElegida - 1][3] = "Baja";
                                System.out.println("Cliente dado de baja. Ya no aparece en el listado.");
                            } else {
                                System.out.println("Baja cancelada.");
                            }
                        } else if (filaElegida != 0) {
                            System.out.println("Cliente no valido.");
                        }
                    } else if (opcionAdmin != 0) {
                        System.out.println("Opcion no valida.");
                    }
                }
            } else if (opcionMenu == 9) {
                System.out.println("\nGracias por visitar Gym Los Makias. Hasta pronto.");
            } else {
                System.out.println("\nOpcion no valida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
