# AlloPito

Ce projet a été réalisé dans le cadre des Évaluations en Cours de Formation (ECF) de ma formation Concepteur Développeur d'Applications (CDA).

## Contexte du projet

L'objectif de ce projet est de développer une application de gestion des séjours des patients. Cette application doit permettre d'effectuer les actions suivantes :

* Ajouter un nouveau patient ou modifier des patients existants.
* Prendre en compte l'arrivée d'un patient dans un service.
* Prendre en compte la sortie d'un patient d'un service.
* Affecter un patient à un lit, qui est lui-même situé dans une chambre.
* Contraintes

Pour mener à bien ce projet, plusieurs tâches ont été définies :

* Mise en place des outils d'organisation de travail.
* Conception MERISE.
* Conception UML, comprenant au minimum un diagramme de cas d'utilisation et un diagramme de classes.
* Création de la base de données.
* Développement de la partie back-end de l'application.
* Réalisation d'au moins un test unitaire et un test d'intégration.
* Mise en place d'une architecture multi-couches.
* Réalisation de requêtes SQL spécifiques, telles que l'affichage des patients affectés au * service "Urgences" et des lits actuellement libres.

## Points d'entrées de l'application

### Patient

| Point d'entrée                 | Description                                                         |
|--------------------------------|---------------------------------------------------------------------|
| GET /patients                  | Récupère la liste de tous les patients                              |
| GET /patients/{id}             | Récupère les détails d'un patient spécifique                        |
| POST /patients                 | Ajoute un nouveau patient                                           |
| PUT /patients                  | Met à jour les informations d'un patient existant                   |
| DELETE /patients               | Supprime un patient                                                 |

### Service

| Point d'entrée                 | Description                                                         |
|--------------------------------|---------------------------------------------------------------------|
| GET /services                  | Récupère la liste de tous les services                              |
| GET /services/{id}             | Récupère les détails d'un service spécifique                        |
| POST /services                 | Ajoute un nouveau service                                           |
| PUT /services                  | Met à jour les informations d'un service existant                   |
| DELETE /services               | Supprime un service                                                 |
| POST /services/affect/{idService}| Affecte un patient à un service                                   |

### Rooms

| Point d'entrée                 | Description                                                         |
|--------------------------------|---------------------------------------------------------------------|
| GET /rooms                     | Récupère la liste de toutes les chambres                            |
| GET /rooms/{id}                | Récupère les détails d'une chambre spécifique                       |
| POST /rooms                    | Ajoute une nouvelle chambre                                         |
| PUT /rooms                     | Met à jour les informations d'une chambre existante                 |
| DELETE /rooms                  | Supprime une chambre                                                |

### Beds

| Point d'entrée                 | Description                                                         |
|--------------------------------|---------------------------------------------------------------------|
| GET /beds                      | Récupère la liste de tous les lits                                  |
| GET /beds/{id}                 | Récupère les détails d'un lit spécifique                            |
| POST /beds                     | Ajoute un nouveau lit                                               |
| PUT /beds                      | Met à jour les informations d'un lit existant                       |
| DELETE /beds                   | Supprime un lit                                                     |
| GET /beds/empty/{idService}    | Récupère les lits disponible par service                            |

### Users

| Point d'entrée                 | Description                                                         |
|--------------------------------|---------------------------------------------------------------------|
| GET /users                     | Récupère la liste de tous les utilisateurs                          |
| GET /users/{id}                | Récupère les détails d'un utilisateur spécifique                    |
| POST /users                    | Ajoute un nouvel utilisateur                                        |
| PUT /users                     | Met à jour les informations d'un utilisateur existant               |
| DELETE /users                  | Supprime un utilisateur                                             |
| POST /login                    | Renvoi un token                                                     |

## Requetes

Les deux requêtes SQL demandées étaient:

afficher les noms et prénoms de tous les patients affectés au service "Urgences"

``` SELECT patient.lastname_patient,patient.firstname_patient FROM allopito.patient inner join bed on patient.id_patient =bed.id_bed inner join room on bed.id_room = room.id_room inner join service on room.id_service =service.id_service where name_service = "Urgences"; ```

afficher tous les lits actuellement libres

``` SELECT * FROM allopito.bed WHERE id_patient IS NULL; ```
