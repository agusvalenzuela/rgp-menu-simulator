# **Descripción General**

Vas a construir un programa de consola llamado:

```
RPGMenuSimulator.java
```

Este programa simula un **juego de rol básico**, pero enfocado 100% en el aprendizaje técnico:

✔ Uso correcto de los 4 loops

✔ Menú principal + submenús

✔ Variables y operadores

✔ Condiciones

✔ Interacción real con el usuario

✔ Uso de arrays (solo para foreach)

No necesitas clases, funciones ni POO.

<aside>

**Todo va dentro de `main`**, usando sólo lo que ya aprendiste.

</aside>

---

# 🧩 **Objetivos del Challenger**

El programa debe permitir al jugador:

1. **Crear un personaje**
2. **Entrenar y mejorar sus estadísticas**
3. **Pelear contra un enemigo**
4. **Ver inventario**
5. **Ver estado del personaje**
6. **Salir del juego**

Cada sección debe usar un tipo diferente de **bucle** o **control de flujo**.

---

# 🧨 **Requerimiento CRÍTICO: GRAN MENÚ + SUBMENÚS**

El sistema debe tener:

### 🟦 **1. Menú principal — usando `do-while`**

Se repite hasta que el usuario elija salir.

Ejemplo:

```
=== RPG SIMULATOR ===
1. Crear personaje
2. Entrenar
3. Batalla
4. Inventario
5. Estado del personaje
6. Salir
```

---

# 🧩 **2. Crear personaje**

Usar:

- Variables (`String`, `int`, `double`, `boolean`)
- Scanner
- If/else para validar

Debe pedir:

- nombre
- tipo (mago, guerrero, arquero)
- puntos de vida
- fuerza base

---

# 🔥 **3. Entrenamiento — usar `while`**

El jugador entrena hasta que decida detenerse.

Ejemplo:

```
Entrenar:
1. +5 fuerza
2. +10 vida
0. Terminar entrenamiento
```

Mientras elija 1 o 2 → actualizar stats.

Si elige 0 → salir del while.

---

# ⚔️ **4. Batalla — usar `for`**

Simular una pelea de 5 turnos contra un enemigo:

- En cada turno, ambos pierden vida
- Mostrar daño causado
- Mostrar vida restante

Forzado con:

```java
for (int turno = 1; turno <= 5; turno++)
```

Extra opcional:

Si la vida llega a 0 antes del turno 5 → mensaje “Has sido derrotado”.

---

# 🎒 **5. Inventario — usar `foreach`**

Crear un arreglo simple:

```java
String[] inventario = {"Poción", "Hierro", "Pergamino", "Llave Antigua"};
```

Mostrarlo con:

```java
for (String item : inventario)
```

---

# 📊 **6. Estado del personaje — usar `if / else` y operadores**

Mostrar:

- nombre
- clase
- vida
- fuerza

Y aplicar reglas como:

```
si vida > 80 → "Estás en excelente estado"
si vida > 40 → "Estado moderado"
si vida <= 40 → "Cuidado, estás herido"
```

---

# ❌ **7. Salir del juego**

Opción 6 del menú principal.

Finaliza el `do-while`.

---

# ⚠️ **Reglas de Validación**

1. Ningún valor numérico debe ser negativo.
2. Las opciones deben ser válidas → caso contrario, usar:

```
System.out.println("Opción inválida");
```

1. El menú debe funcionar sin caerse.
2. No se permite usar funciones ni POO.
