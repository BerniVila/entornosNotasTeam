# entornosNotasTeam
Proyecto de la 3ª evaluación de la asignatura Entornos de desarrollo del CFGS Desarrollo de Aplicaciones Web en el IES Juan de Garay en Valencia.
Diseñado y programado por Bernardo Vila Ferrer y Zupan Teng utilizando Java con Swing, en el IDE Eclipse.
Completamente funcional en Windows 10, MacOS (únicamente probado en MacOS versión 10.14.6 Mojave) y Linux (probado en distribuciones Ubuntu y Arch).

El proyecto consta de 4 aplicaciones:
  -CalculaNotaGlobal.java  es la más básica, en modo texto para consola.
  -CalculaNotasGlobalGUI.java es la aplicación básica con interfaz gráfica.
  -CalculaNotasGlobalGUI_comboBox es una versión alternativa de la anterior utilizando una comboBox para introducir los datos del alumno, para así minimizar
  posibles errores y únicamente para este ejemplo, pues no es tan escalable al resultar incómoda si hubiera un número mayor de alumnos.
  
  
  -PantallaInicioGUIConBBDD es la aplicación principal evolucionada a partir de las anteriores e integrando acceso a base de datos y sistemas para crear grupos, alumnos, exámenes    y trabajos.
  Para que funcione d forma correcta hay que crear una base de datos en el propio sistema con el script incluido y comentar la línea 24 después del primer inicio.
  (Es código que introduce datos en la base de datos para que no esté vacía)

