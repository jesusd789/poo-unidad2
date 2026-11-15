#!/bin/bash
# Compila y ejecuta: Taller 5 - Ejercicio 3: private vs default
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
for c in ejercicio3.PruebaPersona; do
  echo "################ $c"; java -cp out $c; echo
done
