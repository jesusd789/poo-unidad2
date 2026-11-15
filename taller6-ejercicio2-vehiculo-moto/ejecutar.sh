#!/bin/bash
# Compila y ejecuta: Taller 6 - Ejercicio 2: Vehiculo y Moto
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in motos.PruebaMoto; do
  echo "################ $c"; java -cp out $c; echo
done
