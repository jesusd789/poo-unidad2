#!/bin/bash
# Muestra los errores de compilacion INTENCIONALES de: Taller 4 - Ejercicio 3: uso incorrecto de private
cd "$(dirname "$0")"
rm -rf out && mkdir out && javac -encoding UTF-8 -d out $(find src -name '*.java')
TMP="$(mktemp -d)"
echo "################ ErrorEjercicio3.java"
javac -encoding UTF-8 -cp out -d "$TMP" errores_intencionales/ErrorEjercicio3.java 2>&1 | grep -v JAVA_TOOL_OPTIONS
echo
