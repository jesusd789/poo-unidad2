#!/bin/bash
# Muestra los errores de compilacion INTENCIONALES de: Taller 5 - Ejercicio 2: Vehiculo y Moto
cd "$(dirname "$0")"
rm -rf out && mkdir out && javac -encoding UTF-8 -d out $(find src -name '*.java')
TMP="$(mktemp -d)"
echo "################ Ejercicio 2 (prueba en otro paquete)"
javac -encoding UTF-8 -cp out -d "$TMP" errores_intencionales/prueba/PruebaVehiculos.java 2>&1 | grep -v JAVA_TOOL_OPTIONS
echo
