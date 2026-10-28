# Gym Los Makias

Sitio web estático de presentación para Gym Los Makias, un gimnasio de Bello, Antioquia. El proyecto está construido con HTML y CSS, con una pequeña simulación de interacción en el formulario de contacto.

## Contenido del sitio

- `index.html`: página principal con información del gimnasio, ubicación, horarios, planes y formulario de contacto.
- `pages/registro.html`: formulario de registro de ejemplo.
- `pages/pago.html`: presentación y selección de planes y método de pago en una interfaz demostrativa.
- `pages/cliente.html`: vista estática de perfil y horario de clases grupales.

## Estructura

```text
.
├── index.html
├── AGENTS.md
├── css/
│   └── style.css
├── images/
└── pages/
    ├── cliente.html
    ├── pago.html
    └── registro.html
```

Actualmente, las páginas enlazan la hoja de estilos compartida `css/style.css`. Las imágenes del sitio están en `images/`.

## Cómo abrir el sitio

Abre `index.html` directamente en un navegador. También puedes usar una extensión de servidor local, como Live Server en Visual Studio Code, si está instalada.

No se requiere un proceso de compilación ni instalación de dependencias para visualizar las páginas.

## Alcance actual

Este proyecto es una demostración estática y no cuenta con un backend:

- El formulario de contacto muestra una confirmación simulada; no envía ni guarda los datos.
- Los formularios de registro y pago no procesan registros ni transacciones reales.
- La información del perfil y las clases de `cliente.html` es contenido estático.
- Los controles de reserva no realizan reservas reales.

## Desarrollo

Consulta [AGENTS.md](./AGENTS.md) para las convenciones del proyecto, incluidas las pautas de HTML, estilos, rutas, diseño adaptable y verificación.

