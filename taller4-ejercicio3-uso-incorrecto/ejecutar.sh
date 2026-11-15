#!/bin/bash
# Compila y ejecuta: Taller 4 - Ejercicio 3: uso incorrecto de private
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in ejercicios.PruebaMascota; do
  echo "################ $c"; java -cp out $c; echo
done
