#!/bin/bash
# Muestra los errores de compilacion INTENCIONALES de: Taller 4 - Ejercicio 2: Coche
cd "$(dirname "$0")"
rm -rf out && mkdir out && javac -encoding UTF-8 -d out $(find src -name '*.java')
TMP="$(mktemp -d)"
echo "################ ErrorCoche.java"
javac -encoding UTF-8 -cp out -d "$TMP" errores_intencionales/ErrorCoche.java 2>&1 | grep -v JAVA_TOOL_OPTIONS
echo
