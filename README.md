# ECF Back-End Localib

## Description
Application de location de véhicule.


## Prérequis
- Java 11+
- [docker](https://www.docker.com/products/docker-desktop)
- [docker-compose](https://docs.docker.com/compose/install/)
- Un IDE Java ([Eclipse](https://www.eclipse.org/downloads/), [IntelliJ](https://www.jetbrains.com/fr-fr/idea/))

## Installation

### Base de données :

Lancer la commande :
```
docker-compose up -d
```

### Lancement de l'application sans IDE :
Lancer la commande :
```
./mvn spring-boot:run
```

### Lancement de l'application avec IntelliJ :
Lancer la classe : `LocalibApplication`