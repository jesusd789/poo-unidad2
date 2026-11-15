#!/bin/bash
# Compila y ejecuta: Taller 5 - Ejercicio 1: Producto
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in ejercicio1.PruebaProducto; do
  echo "################ $c"; java -cp out $c; echo
done
