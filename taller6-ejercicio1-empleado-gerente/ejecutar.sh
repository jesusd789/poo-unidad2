#!/bin/bash
# Compila y ejecuta: Taller 6 - Ejercicio 1: Empleado y Gerente
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in ejercicio1.PruebaEmpleados; do
  echo "################ $c"; java -cp out $c; echo
done
