# Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-
**Esta va hacer una aplicación de registro de tickets  para parqueadero publico tomando en cuenta el tiempo que se mantiene hospedado**

**Objetivos de la Practica**

**•	Crear una aplicación en la IDE NetBeans que resuelva un problema de registro de clientes junto a su o sus vehículos en el mismo.**

**•	Aplicar los teoremas de MVC y DAO dentro de la aplicación para que tenga un mejor manejo de datos dentro de la misma y no sea un problema el registro de datos y la obtención de los mismos.**

**•	Crear interfaces graficas dentro de NetBeans y a la vez utilizar estándares de internacionalización que puedan ser entendidos por usuario dependiendo del idioma que mayor manejen.**

**Items a desarrollar**

**1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 05: Gestión de Tickets (Parqueadero)”.**

![screan del respositorio](

**2. Desarrollar una aplicación que permita la gestión de Tickets de un parqueadero de vehículos según los requerimientos planteados en las instrucciones de la práctica.**

*2.1 Paquetes de la practica*

[paquetes](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/tree/master/src/ec/edu/ups)

*2.1.1 Clases del paquete controlador*

[clase ControladorCliente](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/controlador/ControladorCliente.java)

[clase ControladorTicket](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/controlador/ControladorTicket.java)

[clase ControladorVehiculo](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/controlador/ControladorVehiculo.java)

*2.1.1 Clases del paquete DAO*

[clase ClienteDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/dao/ClienteDao.java)

[clase TicketDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/dao/TicketDao.java)

[clase VehiculoDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/dao/VehiculoDao.java)

*2.1.1 Clases del paquete IDAO*

[clase IClienteDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/idao/IClienteDao.java)

[clase ITicketDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/idao/ITicketDao.java)

[clase IVehiculoDAO](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/idao/IVehiculoDao.java)

*2.1.1 Clases del paquete modelo*

[clase Cliente](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/modelo/Cliente.java)

[clase Ticket](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/modelo/Ticket.java)

[clase Vehiculo](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/modelo/Vehiculo.java)

*2.1.1 Clases del paquete vista*

[clase VentanaPrincipal](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaPrincipal.java)

[clase VentanaCliente](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaCliente.java)

[clase VentanaVehiculo](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaVehiculo.java)

[clase VentanaIngresoTicket](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaIngresoTicket.java)

[clase VentanaSalida](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaSalida.java)

[clase VentanaListar](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-05-Gesti-n-de-Tickets-Parqueadero-/blob/master/src/ec/edu/ups/vista/VentanaListar.java)

**3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin. Los commits deben ser realizados por todos los integrantes del grupo.**

**Resultados obtenidos de la Practica**

**•	Creación de una mini aplicación que resolvió un problema de registro de datos de clientes en un parqueadero que hospeda sus vehículos durante un tiempo determinado y a la vez la creación del cálculo del total que debe pagar mientras estuvo hospedado.**

**•	Aplicación de las arquitecturas MVC y DAO dentro del código de programación para la obtención de datos y el listado de los mismos que fueron registrados durante la ejecución del programa.**

**Conclusiones de la Practica**

**•	La aplicación de patrones de diseño y arquitecturas dentro de la aplicación creada son fundamentales y facilitan el trabajo a la vez que simplifican el código para que no venga a ser muy pesado y tenga una mayor aceptabilidad dentro de los ámbitos en los que se deseen proyectar su respectivo uso.**

**•	Realizar este tipo de aplicaciones viene bien de vez en cuando para que las aplicaciones dentro del ámbito informático no sean olvidadas y sean más aprovechadas en el uso de creaciones de sistemas o aplicaciones que tengan el fin de no tener mucho peso en el sistema y más en la compra del mismo.**

**Recomendaciones de la practica**

**•	Utilizar la ID NetBeans para este tipo de aplicaciones es muy recomendable, puesto que su variedad de diccionarios, métodos, patrones, nos ahorran mucho tiempo en cuanto a el desarrollo de la interfaz del mismo, o más bien el entorno que será visualizado por el usuario.**

**•	Dentro del programa se debe validar los fallos que pueda tener el cliente al ingresar sus datos, como por ejemplo que no deba dejar los campos vacíos o que la comparación entre las placas sea correcta, etc.**

**Nombre de los estudiantes**

**Juan Jose Cordova Calle - Paul Alexander Guapucal Cardenas**

**Firma de los estudiantes**

![firma del estudiante](
