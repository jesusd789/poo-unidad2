#!/bin/bash
# Compila y ejecuta: Taller 6 - Ejemplos (protected)
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in vehiculos.MainVehiculos animales.MainAnimales seguridad.MainSeguridad; do
  echo "################ $c"; java -cp out $c; echo
done
