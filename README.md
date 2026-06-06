# EJEMPLOS REALIZADOS EN EL LABORATORIO DE IPC1

---

### Tipos de Datos y Operaciones Básicas
Las variables son espacios de memoria con un tipo de dato definido (como enteros, decimales o texto) que almacenan información. En este archivo se explora cómo declarar estas variables y cómo utilizar clases de utilidad como `Scanner` para leer datos ingresados por el usuario desde la consola, permitiendo la interacción básica con el programa.
**Ruta del archivo:** [Ver Main.java](IntroduccionJava/src/principal/Main.java)

**Código del archivo:**
```java
int edad = 20;
double promedio = 85.3;
char letra = 'A';
boolean aprobado = true;
String nombre = "Carlos";
```

### EstructuraIF - Lógica Booleana Compleja
La estructura `if` es la base de la toma de decisiones en programación. Evalúa expresiones booleanas para determinar qué camino debe tomar el flujo del programa. Permite manejar escenarios complejos combinando operadores lógicos (AND, OR, NOT) para ejecutar bloques de código aislados solo cuando se cumplen condiciones específicas.
Ruta del archivo: [Ver EstructuraIF.java](IntroduccionJava/src/principal/EstructuraIF.java)


**Código del archivo:**

```java
boolean valor1 = true;
boolean valor2 = true;
boolean valor3 = false;

if(!((valor1 && valor2) || valor3)){
    System.out.println("Es verdadero");
} else if(valor1){
    System.out.println("INTERMEDIO");
} else {
    System.out.println("Es falso");
}
```

### EstructuraSwitch - Evaluación de Cadenas
La declaración `switch` proporciona una forma más limpia y legible de evaluar el valor de una sola variable contra una lista de casos posibles. Funciona como una alternativa estructurada a tener múltiples bloques `if-else` anidados, especialmente útil para evaluar entradas de teclado, estados o selecciones de menús.
Ruta del archivo: [Ver EstructuraSwitch.java](IntroduccionJava/src/principal/EstructuraSwitch.java)


**Código del archivo:**

```java
System.out.println("Ingrese una opcion");
opcion = consola.nextLine();
switch (opcion) {
    case "A":
        System.out.println("INGRESO LA LETRA: A");
        break;
    case "B":
        System.out.println("INGRESO LA LETRA B");
        break;
    default:
        System.out.println("OPCION INVALIDA");   
}
```

### EstructuraTry - Manejo de Excepciones
Las excepciones son errores que ocurren durante la ejecución del programa (tiempo de ejecución). El bloque `try-catch` sirve para anticipar, capturar y manejar estos errores de forma controlada, evitando que la aplicación se cierre de forma abrupta e inesperada, permitiendo mostrar mensajes amigables al usuario.
Ruta del archivo: [Ver EstructuraTry.java](IntroduccionJava/src/principal/EstructuraTry.java)


**Código del archivo:**
```java
try {
    Scanner consola = new Scanner(System.in);
    System.out.println("Ingrese un numero....");
    int numero = Integer.parseInt(consola.nextLine());
    System.out.println("El numero es: "+numero);
} catch (Exception e){
    System.out.println("Ingreso un dato no numerico");
    System.out.println("Error: "+ e.getMessage());
}
```

### CicloFor - Estructuras de Control Iterativas
La estructura `for` es un ciclo de control que permite ejecutar un bloque de código un número específico de veces. Es ideal para recorrer colecciones de datos o ejecutar rutinas matemáticas repetitivas. Adicionalmente, incluye mecanismos para alterar su flujo normal: la instrucción `continue` sirve para omitir la iteración actual y saltar a la siguiente, mientras que la instrucción `break` se utiliza para interrumpir y salir completamente del ciclo antes de que termine su conteo natural.
Ruta del archivo: [Ver CicloFor.java](IntroduccionJava/src/principal/CicloFor.java)

**Código del archivo:**
```java
for(int i = 1;i<=10;i++){
    if(i==5){
        continue;
    }
    System.out.println(contador + " x "+ i +" = " + (i*contador));
}
```

### CicloWhile - Menú Interactivo
El ciclo while ejecuta un bloque de instrucciones repetidamente mientras una condición lógica sea verdadera (true). A diferencia del for, se utiliza cuando no se sabe de antemano cuántas veces se repetirá el ciclo, siendo la herramienta estándar para mantener interfaces, menús interactivos o procesos en ejecución hasta que ocurra un evento específico.
Ruta del archivo: [Ver CicloWhile.java](IntroduccionJava/src/principal/CicloWhile.java)

**Código del archivo:**
```java
boolean sale = false;
// ... (código del menú)
while(!sale){
    System.out.println(menu);
    opcion = Integer.parseInt(consola.next());
    switch(opcion){
        // ... otros casos
        case 3:
            System.out.println("ADIOS........");
            sale = true;
            break;
    }
}
```

### Arreglo - Estructuras de Datos Estáticas (Arrays)
Los arreglos o "arrays" sirven para almacenar múltiples valores del mismo tipo de dato bajo un solo nombre de variable, ubicados en posiciones de memoria contiguas. Son útiles cuando se necesita manejar colecciones de datos de tamaño fijo sin tener que declarar variables individuales para cada valor.
Ruta del archivo: [Ver Arreglo.java](IntroduccionJava/src/principal/Arreglo.java)

**Código del archivo:**
```java
int[] miArreglo = new int[5];
int size = miArreglo.length;
System.out.println("size = " + size);

for(int i=0;i<5;i++){
    System.out.println("Ingrese el valor del espacio: "+ (i+1));
    miArreglo[i]= Integer.parseInt(consola.next());
}
```

### Matrices - Estructuras de Datos Multidimensionales
Las matrices o arreglos bidimensionales son estructuras que almacenan datos en dos dimensiones (filas y columnas), funcionando como una tabla o cuadrícula. Para poder acceder, llenar o leer todos sus espacios en memoria, es necesario implementar ciclos iterativos anidados (un ciclo dentro de otro), donde el bucle externo suele controlar las filas y el interno las columnas.
Ruta del archivo: [Ver Matrices.java](IntroduccionJava/src/principal/Matrices.java)

**Código del archivo:**
```java
int[][] miMatriz = new int[5][3];
        
// Ciclos anidados para recorrer la matriz
for(int f =0;f<5;f++){
    for(int c =0;c<3;c++){
        System.out.println("Ingrese el valor del espacio de la matriz: fila: "+ (f+1) + ", columna: " +(c+1));
        miMatriz[f][c]= Integer.parseInt(consola.next());
    }
}
```

### Metodos - Procedimientos sin Retorno (void) y Variables de Clase
Los métodos declarados con la palabra reservada void actúan como procedimientos: ejecutan un conjunto de instrucciones (como cálculos o impresiones en pantalla) pero no devuelven ningún valor al finalizar. Adicionalmente, se introduce el concepto de variables estáticas de clase (como el Scanner), las cuales pueden ser compartidas y utilizadas por todos los métodos dentro del mismo archivo sin necesidad de pasarlas como parámetros.
Ruta del archivo: [Ver Metodos.java](IntroduccionJava/src/principal/Metodos.java)

**Código del archivo:**
```java
// Variable de clase compartida por todos los métodos (Global)
static Scanner consola = new Scanner(System.in);

// Método sin retorno (void) llamado desde el main
public static void calculoPromedio(){
    System.out.println("INGRESE LA CANTIDAD DE NOTAS A SUMAR");
    int n = Integer.parseInt(consola.next());
    int totalSuma = 0;
    for(int i = 1; i<=n;i++){
        System.out.print("Ingrese la nota " + i +": ");
        int valor =Integer.parseInt(consola.next());
        totalSuma+=valor;            
    }
    double promedio = totalSuma / n;
    System.out.println("............El promedio final es: " + promedio);
}
```

### Funciones - Modularidad y Reutilización de Código (Métodos)
Las funciones (o métodos en programación orientada a objetos) sirven para agrupar y encapsular un bloque de código que realiza una tarea específica. Esto permite dividir problemas complejos en partes más pequeñas y reutilizar la misma lógica en diferentes partes del programa simplemente llamando a la función por su nombre, evitando la duplicidad de código.
Ruta del archivo: [Ver Funciones.java](IntroduccionJava/src/principal/Funciones.java)

**Código del archivo:**
```java
// Dentro del switch en el main:
case 1:
    resultado = sumarCantidad(resultado);
    break;

// Método separado:
public static int sumarCantidad(int valorActual){
    return valorActual + 10;
}
```