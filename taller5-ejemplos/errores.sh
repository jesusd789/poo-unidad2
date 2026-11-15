#!/bin/bash
# Muestra los errores de compilacion INTENCIONALES de: Taller 5 - Ejemplos (default)
cd "$(dirname "$0")"
rm -rf out && mkdir out && javac -encoding UTF-8 -d out $(find src -name '*.java')
TMP="$(mktemp -d)"
echo "################ Ejemplo incorrecto 1 (paqueteA / paqueteB)"
javac -encoding UTF-8 -d "$TMP" $(find errores_intencionales/ejemplo1 -name '*.java') 2>&1 | grep -v JAVA_TOOL_OPTIONS
echo
