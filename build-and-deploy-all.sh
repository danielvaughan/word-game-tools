#!/usr/bin/env bash
cd dictionary
gradle clean build
cd ../scorer/
gradle clean build
cd ..
cf push
