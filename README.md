# Roman-Numeral-App

[![Coverage Status](https://coveralls.io/repos/github/Gabbendorf/Roman-Numeral-App/badge.svg?branch=master)](https://coveralls.io/github/Gabbendorf/Roman-Numeral-App?branch=master)

Simple application that allows the user to choose a number from 1 to 3999 and converts it into the corresponding Roman number.
Currently the application can be only run on the command line.

## How to run the application
You need to have Gradle installed:

```
git clone git@github.com:Gabbendorf/Roman-Numeral-App.git

cd RomanNumeralApp

gradle clean

gradle jar

java -jar build/libs/RomanNumeralApp.jar
```