# Gym Los Makias

Proyecto completo de la marca Gym Los Makias, pensado para un gimnasio urbano con identidad de barrio, fuerza y comunidad. El repositorio incluye la interfaz web del negocio y un backend Java básico que simula flujos de atención del gimnasio en consola.

## Descripción general

La parte web está desarrollada en HTML, CSS y una integración ligera de Tailwind para algunos elementos visuales. La experiencia incluye una landing page principal, navegación entre módulos del negocio, formularios de registro y pago, paneles para cliente, entrenador y administrador, así como una propuesta visual adaptable a móvil y escritorio.

La parte de backend se encuentra en `back/src/App.java` y funciona como un prototipo de consola para gestionar procesos del gimnasio, como:

- información institucional y planes
- registro de cliente
- carrito/selección de plan y pago
- módulo de entrenador
- módulo de administración
- módulo de cliente
- gestión de clases y reservas

## Estructura del proyecto

```text
gym-los-makias/
├── README.md
├── back/
│   └── src/
│       └── App.java
├── front/
│   ├── index.html
│   ├── css/
│   │   ├── admin.css
│   │   ├── clases.css
│   │   ├── cliente.css
│   │   ├── entrenador.css
│   │   ├── pago.css
│   │   ├── registro.css
│   │   ├── rutinas.css
│   │   ├── sesion.css
│   │   ├── style.css
│   │   └── usuarios.css
│   ├── images/
│   │   ├── bench_zone.jpg
│   │   ├── fondo_lateral.jpeg
│   │   ├── instalaciones_exteriores.jpg
│   │   ├── interior_dl.jpg
│   │   ├── logo.png
│   │   └── training_zone.jpg
│   └── pages/
│       ├── admin.html
│       ├── clases.html
│       ├── cliente.html
│       ├── entrenador.html
│       ├── pago.html
│       ├── registro.html
│       ├── rutinas.html
│       ├── sesion.html
│       └── usuarios.html
├── slang/
│   └── certificados de curso
└── .git
```

## Funcionalidades principales

### Frontend

- Landing page con presentación de la marca, carrusel de instalaciones, ubicación, horarios, planes y contacto.
- Registro de usuarios con validación visual y flujo de inscripción.
- Pantalla de pago con simulación de selección de plan y método de pago.
- Panel de cliente con horarios, rutinas y vista del estado de su membresía.
- Panel de entrenador con clientes asignados y clases del día.
- Panel de administración con indicadores de asistencia, métricas y gestión de usuarios.
- Páginas de clases, sesiones, rutinas y usuarios con diseño consistente.

### Backend Java

- Menú principal interactivo por consola.
- Simulación de comunicación con la marca, planes de suscripción y atención comercial.
- Registro de usuarios y selección de planes.
- Módulos de cliente, entrenador y administración.
- Datos de ejemplo en memoria para ilustrar el flujo del negocio.

## Cómo ejecutar el proyecto

### Frontend

1. Dirígete a la carpeta `front/`.
2. Abre `index.html` directamente en el navegador, o usa una extensión como Live Server para visualizarlo de forma más cómoda.
3. Para navegar entre las páginas, usa los enlaces internos del sitio o la navegación localizada en cada documento HTML.

### Backend Java

Desde la carpeta `back/src`, ejecuta:

```bash
javac App.java
java App
```

Si prefieres compilar desde la raíz del proyecto:

```bash
cd back/src
javac App.java
java App
```

## Estado del proyecto

Este repositorio ya contempla la versión final del proyecto en su estado actual:

- La interfaz web está completa y con navegación entre módulos.
- El diseño es responsive y conserva la identidad visual del gimnasio.
- El backend Java es funcional como demostración interactiva de consola.
- No se implementa persistencia real de datos ni pagos en línea; los formularios y flujos están orientados a una experiencia de prototipo o demostración.

## Relación entre frontend y backend

La arquitectura propuesta es la siguiente:

- El frontend HTML/CSS actúa como la capa visible del negocio y presenta la experiencia del cliente.
- El backend Java representa la lógica de negocio del gimnasio en un entorno de consola para validar la estructura del flujo de operación.
- En una versión futura, este backend podría conectarse con un servicio web o base de datos para procesar registros, pagos y datos de usuarios reales.

## Integrantes del grupo

- Johan Esteban Rojo Ramirez
- Jhon Daniel Quintero Cortes
- Jordan Restrepo Zapata

## Proyecto académico

Este proyecto fue desarrollado como parte del programa de estudio:

Tecnico Laboral En Asistente De Derrollo De Software

Somos estudiantes del CESDE y presentamos esta solución como evidencia del trabajo realizado en la formación técnica.

## Notas importantes

- Los archivos HTML usan rutas relativas y están organizados para funcionar dentro de la estructura de `front/`.
- El contenido visual y la información del negocio están orientados a la ciudad de Medellín y al estilo urbano del gimnasio.
- El proyecto mantiene una propuesta de marca cercana, enérgica y auténtica, con enfoque en la disciplina y la comunidad.
