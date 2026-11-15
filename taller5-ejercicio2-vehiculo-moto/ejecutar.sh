#!/bin/bash
# Compila y ejecuta: Taller 5 - Ejercicio 2: Vehiculo y Moto
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in vehiculos.PruebaMismoPaquete; do
  echo "################ $c"; java -cp out $c; echo
done
