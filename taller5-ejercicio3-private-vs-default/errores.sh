#!/bin/bash
# Muestra los errores de compilacion INTENCIONALES de: Taller 5 - Ejercicio 3: private vs default
cd "$(dirname "$0")"
rm -rf out && mkdir out && javac -encoding UTF-8 -d out $(find src -name '*.java')
TMP="$(mktemp -d)"
echo "################ Ejercicio 3 (private vs default)"
javac -encoding UTF-8 -cp out -d "$TMP" errores_intencionales/ejercicio3/ErrorPersona.java 2>&1 | grep -v JAVA_TOOL_OPTIONS
echo
