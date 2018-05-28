name := "quick-force"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.6.3",
  "org.webjars" % "bootstrap" % "3.3.6",
  javaCore,
  javaWs,
  guice
)

routesGenerator := InjectedRoutesGenerator

enablePlugins(AtomPlugin)

atomPackages := Seq("heroku-tools")

atomFilesToOpen := Seq("./", "README.md")

TaskKey[Unit]("default") := {
  (run in Compile).toTask("").value
  atom.value
}
