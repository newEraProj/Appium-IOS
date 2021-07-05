# Introduction 
Le but du projet est de realiser des tests mobiles.
 Sur différentes plateformes : iOS et android avec le serveur Appium

Doc de référence : https://urlz.fr/cpQc


# Pour démarrer
Suivres les instructions suivantes pour démarrer avec le projet :

### Téléchargement des outils 
- Android studio
- Appium
- NodeJS

### Configuration de l'environement
- telecharger le SDK souhaité (depuis Android studio / SDK manager)
- mettre la variable d'environement "ANDROID_HOME" avec le lien vers le SDK Android

### Demarrer un emulateur Android
- Sur Android studio : lancer AVD Manager
- Créer un devide en fonction des versions/modeles souhaités
- lancer l'emulateur
    
### Lancer un serveur appium 
- apres avoir installé appium
- lancer le serveur sur l'interface graphique


# Lancement du projet
Pour lancer le projet suivre les étapes suivantes

### Demarrer un emulateur Android
- Sur Android studio : lancer AVD Manager
- Créer un device en fonction des versions/modeles souhaités
- lancer l'emulateur
    
### Lancer un serveur appium 
- apres avoir installé appium, lancer le serveur sur l'interface graphique 

### Lancer le projet
- importer le projet via le pom.xml
- Dans le fichier : TestRunner mettre à jours les informations suivantes : 
     - la version du device : *cap.setCapability("platformVersion", "8.0");*
     - le nom du device : *cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3 API 26");*
     - le numero de l'émulateur : *cap.setCapability("udid", "emulator-5554");*
     - l'acces au serveur appium : *driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);*
- clic droit sur TestRunner > Run

=> l'application de démo est lancée sur le mobile dans l'émulateur
