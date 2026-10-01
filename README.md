# Pulso

Primera entrega de una interfaz Android de salud con datos ficticios e interacciones locales.

La identidad utiliza verde petróleo (#146C60), fondo claro (#F5F8F7), superficies blancas y acento menta. Los títulos son de 24 sp, el cuerpo de 16 sp, el espaciado de 8/16/24 dp y las tarjetas tienen esquinas de 20 dp.

La pantalla organiza saludo, tarjeta de reserva, servicios y próxima cita, con navegación inferior fija. La tarjeta tiene relleno de 24 dp y una ilustración vectorial propia de círculos y cruz médica, marcada como decorativa. El texto dispone de una columna independiente para evitar solapamientos.

«Reservar cita» abre una selección de Consulta general o Especialista. Ambas opciones muestran una confirmación explícita de simulación: no se reserva ninguna cita real. Cancelar cierra la selección.

## Comprobación manual

- Comprobar la tarjeta en pantalla estrecha y con tamaño de fuente ampliado: textos completos, ilustración separada y contenido desplazable.
- Abrir «Reservar cita», elegir cada opción y comprobar la confirmación de simulación.
- Cancelar o volver atrás y comprobar que no aparece una confirmación.
- Con TalkBack, comprobar que se anuncia el botón y se omite la ilustración.
