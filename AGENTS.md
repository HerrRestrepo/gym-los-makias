# Instrucciones del proyecto

## Alcance y estructura

- La interfaz actual es un sitio estático construido con HTML y CSS, pero el alcance previsto del proyecto también incluye un backend. No interpretes que la ausencia actual de código de servidor significa que el proyecto deba permanecer sin backend.
- La pila tecnológica permitida para nuevas implementaciones es HTML y CSS para la interfaz, y Java básico procedural para el backend. No agregues otros lenguajes, runtimes ni frameworks de aplicación salvo autorización explícita del usuario. Tailwind CSS está permitido únicamente como herramienta de estilos según los criterios de este documento.
- Implementa la lógica de servidor con Java básico y enfoque procedural, sin diseño orientado a objetos: no crees modelos de dominio como clases, instancias, jerarquías de herencia ni soluciones basadas en encapsulación o polimorfismo. Como Java requiere una clase contenedora para compilar programas ejecutables, limita esa estructura al mínimo técnico requerido y no la uses para introducir arquitectura orientada a objetos.
- El backend forma parte de la arquitectura prevista, aunque todavía no esté implementado en el repositorio. Distingue con claridad las funciones ya implementadas de las planeadas y no afirmes que hay procesamiento real hasta que exista.
- `index.html` contiene un script JavaScript existente para simular el envío del formulario de contacto. Considéralo una excepción heredada: no agregues ni amplíes JavaScript; para nueva funcionalidad utiliza HTML/CSS en la interfaz o Java en el backend. No retires el script existente como parte de cambios no relacionados.
- La página principal es `index.html`; las demás páginas HTML están en `pages/`.
- Los archivos CSS están en `css/`. Reutiliza las hojas de estilo, clases y patrones existentes.
- Mantén los cambios dentro de las funcionalidades implementadas o del alcance previsto y solicitado, incluido el backend Java.
- Puedes crear archivos cuando sean necesarios, ubicándolos en las carpetas existentes. No muevas ni renombres carpetas ni reorganices la estructura del proyecto.
- Antes de borrar cualquier archivo, pide permiso explícito. Si se autoriza el borrado, revisa y actualiza primero todas las referencias afectadas, incluidos enlaces `href`, rutas `src` e importaciones CSS, para no dejar recursos rotos.

## HTML, idioma y accesibilidad

- Conserva todo el contenido visible en español y usa `lang="es"` en las páginas HTML.
- El objetivo es que ningún archivo HTML del proyecto contenga elementos `<div>`. No los agregues; cuando modifiques una página que todavía los tenga, reemplázalos todos en esa página por elementos HTML semánticos adecuados, sin asignar roles engañosos. Avanza por página para mantener los cambios manejables.
- Elige cada elemento según la función y el significado de su contenido, no solo por su apariencia: por ejemplo, `nav` para grupos de navegación, `main` para el contenido principal, `article` para contenido independiente, `section` para un tema con encabezado y `ul`/`li` para listas.
- Usa `header`, `footer`, `form` y `fieldset` cuando correspondan a encabezados, pies de página y agrupaciones de formularios. No uses `section`, `article` u otro elemento semántico como contenedor genérico si su significado no aplica.
- Si no hay un elemento semántico apropiado para una agrupación visual, no inventes significado ni agregues un `<div>` para resolverlo: conserva una estructura válida con los elementos adecuados y resuelve la presentación con CSS. Si esto no permite mantener la estructura o accesibilidad, explica el conflicto y pide una decisión antes de introducir una excepción.
- Al reemplazar elementos existentes, conserva las clases necesarias o adapta el CSS para mantener la presentación y el comportamiento. Revisa las reglas de diseño, pues los elementos semánticos pueden tener comportamientos distintos. Al completar una reorganización global, verifica que no queden elementos `<div>` en ninguna página HTML.
- Usa etiquetas asociadas a los campos de formulario, texto alternativo descriptivo para imágenes informativas y controles accesibles por teclado.
- No agregues estilos en línea con el atributo `style`; define los estilos en la hoja CSS correspondiente.
- El uso de emojis está completamente prohibido en el proyecto: no los incluyas en contenido, interfaz, documentación, comentarios ni otros textos.

## Criterios de HTML y CSS 

- El proyecto debe conservar más de un documento HTML, con páginas que representen sus funcionalidades actuales.
- Depura el CSS para evitar errores graves de visualización y conservar una presentación utilizable en pantallas móviles y de escritorio.
- Implementa al menos dos microinteracciones visuales en CSS puro. Usa recursos apropiados como pseudo-clases (`:hover`, `:focus-visible`), pseudo-elementos, transiciones o animaciones, sin sacrificar la accesibilidad ni añadir efectos que contradigan la identidad visual del proyecto.
- Demuestra el uso de Flexbox o Grid en la distribución de los componentes. Incluye media queries explícitas (`@media`) en el CSS propio para realizar ajustes finos en distintos anchos de pantalla.
- Inicia una integración parcial y progresiva de Tailwind CSS en la presentación, sin reemplazar todo el CSS propio ni introducir dependencias, lenguajes adicionales o procesos de compilación sin necesidad. Conserva CSS propio para ajustes finos y componentes existentes; comprueba que el método de integración no amplíe la pila tecnológica antes de añadirlo.
- Al documentar la integración entre módulos, explica cómo se relacionan las páginas con el backend Java previsto y los datos que intercambiarían. Distingue esa arquitectura acordada del comportamiento que ya está implementado.

## Rutas y recursos

- Comprueba las rutas relativas de hojas de estilo, imágenes y enlaces al crear o cambiar páginas.
- Desde `index.html`, los recursos suelen estar en `css/` e `images/`; desde `pages/`, las rutas a esas carpetas deben subir un nivel.
- No cambies rutas ni nombres de archivos sin actualizar todas las referencias afectadas.

## Identidad y coherencia visual

- La marca debe sentirse enérgica y motivar a hacer actividad física; cercana, como amigos de infancia que ahora entrenan juntos; y urbana, auténtica y orgullosa de los barrios de Medellín, como Aranjuez, Manrique y otros.
- Transmite un estilo urbano crudo y marcado con respeto y autenticidad, sin caricaturizar a los barrios ni a sus habitantes.
- Mantén esa personalidad sin alejarte de los colores y recursos visuales que ya utiliza el sitio.
- Reutiliza la paleta, tipografías, espaciados, botones y estilos de tarjetas existentes. Da continuidad a las páginas con jerarquías claras, alineaciones y espacios equilibrados.
- Antes de crear estilos, revisa las reglas disponibles y evita duplicarlas. Adapta los componentes nuevos a los patrones visuales existentes.
- No uses degradados ni efectos de glassmorphism. Evita sombras muy difusas o apiladas; define la profundidad con moderación y prioriza color, contraste, bordes y formas claras.
- Usa imágenes con proporciones y recortes adecuados al diseño, y comprueba su coherencia en pantallas móviles y de escritorio.

## Organización de CSS

- Usa `css/style.css` como hoja compartida para las reglas y clases utilizadas en más de una página HTML. Mantén una hoja CSS específica por página para las clases, los ID y las reglas exclusivas de esa página.
- Nombra las hojas específicas según su página, por ejemplo `css/index.css`, `css/cliente.css`, `css/registro.css` y `css/pago.css`.
- Cada página debe enlazar `css/style.css` y su hoja específica mediante rutas relativas correctas: desde `index.html`, los enlaces apuntan a `css/`; desde `pages/`, deben subir un nivel antes de entrar a `css/`.
- Antes de agregar reglas, revisa la hoja compartida y la específica de la página. Evita duplicar reglas; si un componente pasa a usarse en varias páginas, mueve sus estilos comunes a `css/style.css` y conserva las variaciones propias en las hojas específicas.
- La hoja compartida también contiene los estilos base y globales que afectan a las páginas aunque no pertenezcan a una clase reutilizada, como el reinicio de estilos y las reglas generales de `body`. Las reglas exclusivas de una página van en su hoja específica; las excepciones locales a estilos globales también pueden ir allí.
- Enlaza primero `css/style.css` y después la hoja específica de la página, para que los estilos propios puedan complementar o sobrescribir los compartidos cuando sea necesario.
- Conserva la organización existente al hacer cambios puntuales; migra o divide estilos entre hojas como parte de una reorganización coherente, actualizando todos los enlaces afectados.

## Formularios y funcionalidad

- No afirmes ni implementes procesamiento de pagos, persistencia de datos o envío real si el proyecto no lo proporciona.
- Mantén formularios y controles alineados con el comportamiento que existe en el sitio; no simules operaciones completadas.

## Diseño adaptable y verificación

- Conserva un diseño usable en resoluciones móviles y de escritorio. El contenido, los controles y las imágenes no deben desbordar sus contenedores ni provocar desplazamiento horizontal de la página; ajusta distribuciones y media queries cuando sea necesario.
- Comprueba que textos largos, listas, formularios, tarjetas e imágenes sigan siendo legibles y utilizables en distintos anchos de pantalla, sin recortes ni solapamientos.
- Después de los cambios, revisa enlaces, rutas de imágenes y hojas de estilo, así como etiquetas y controles de los formularios afectados.
- Al terminar, resume qué archivos cambiaste y qué verificaciones realizaste. Comprueba visualmente la página en tamaños móviles y de escritorio cuando sea posible. Si no hay herramientas de pruebas o build configuradas, no inventes comandos: informa qué verificaciones manuales realizaste y cuáles no pudiste ejecutar.
