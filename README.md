Quick Force Java
----------------

The quickest and easiest way to start a Java web app that uses the Force.com REST APIs.

This application has everything you need to start building web apps that use the Force.com REST APIs.  How it works:
* Instant deployment on the cloud with Heroku
* Everything for local development including: Play Framework & the Atom code editor
* Super easy deployment of changes using Atom (no git or command lines necessary)

Go for it:

1. [![Deploy on Heroku](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)
2. View the newly deployed application and follow the instructions to setup an OAuth Connected App in Salesforce and then set the config in your Heroku app
3. Setup a local development environment by downloading your app's source: https://download-heroku-source.herokuapp.com/
4. Unzip the archive and launch `sbt` - this will launch Atom and the Play Framework server
5. Check out the local app at: [http://localhost:9000](http://localhost:9000)
6. Again follow the instructions in your local app to setup another OAuth Connected App for local development
7. Make and test some local changes to the app
8. Deploy those changes from Atom using the Heroku menu (Login, then Deploy)
