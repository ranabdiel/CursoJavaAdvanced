
### **NetWorking**
---

Es un concepto de conectividad entre 2 o más dispositivos juntos, que comparten recusos.

Programación de sockets proporciona la facilidad de compartir datos entre diferentes dispositivos.

Ventajas del networking JAVA
* Compartir recursos
* centralizar la gstion del software

Conceptos clave:

**DireccionIp:** Número dinámico asignado a un nodo de una red, compuesto por enteros que van del 0 al 255.
Es una dirección logica que puede ser cambiada.

**Protocolo:** Conjunto de reglas para establecer la comunicación: Ej. FTP, TCP, Telnet, SMTP, POP.

**Puerto:** Esta asociado a la dirección ip para la comunicación entre aplicaciones.

**MAC (Media access control):** Identificador único de NIC (Network Interface Controller).
Un nodo de una red puede tener múltiples NIC pero solo una MAC. Dirección física estática.

**Oriented Connection Protocol:** Es un protocolo de tipo TCP, TCP/IP, confiable pero lento. El acuse de recibo es enviado por el receptor.

**Connection Less Protocol:** El receptor no envia el acuse de recibo. Es rápido, sin embargo no es confiable, pueden o no llegar a los paquetes. *Ej. UDP.*

**CSocket:** Punto final en una conexión bidireccional.

La programación de sockets se utiliza para la comunicación entre aplicaciones que se ejecutan en diferentes JREs (Java Runtime Enviroment).

La programación de Java Socket puede estar bajo ambos protocolos (OCP, OCL).
Las clases Java Socket y ServerSocket se utilizan para la programación orientada a la conexión.

Las clases ***DatagramSocket*** y ***DatagramPacket*** son usadas para la programación de Socket sin conexión.

El cliente en la programación necesita saber:
* Ip Address del server.
* Port Number
* Socket Class


### **Socket Class**
---

El socket es un punto final para las comunicaciones entre dispositivos.

**Métodos:**

**public inputStream getInpútStream():** Regresa el is adjunto con el socket.
**public OutputStream getOutputStream:** Regresa el os adjunto al socket.

**public syncronized void close():** Cierra el socket.

### **Server Socket**
---

**Métodos:**

**public Socket accept():** Establece la conexión entrante.

**public synchronized void close():** Cierra la conexión del servidor.
