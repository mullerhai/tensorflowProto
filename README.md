# tensorflowProto

git clone  
sbt compile
### install local m2 repository
sbt  publishM2
###### --- /Users/***/.m2/repository/org/tensorflow/tensorflowproto_2.12/0.1
### import to project build.sbt
libraryDependencies += "org.tensorflow" %% "tensorflowproto" % "0.1"


### dependency

```
resolvers += "tensorflow-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
lazy val deps = new {
  val main = new {
    val tensorflow = "0.5.0-SNAPSHOT" //"0.4.0"
  }
  val test = new {
    val junitInterface = "0.13.2"
    val junitJupiter = "5.8.2"
  }
}

lazy val loggingSettings = Seq(
  libraryDependencies ++= Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2" ,
    "ch.qos.logback" % "logback-classic" % "1.2.3"  ))
lazy val commonSettings = loggingSettings ++ Seq(
  // Plugin that prints better implicit resolution errors.
  addCompilerPlugin("io.tryp" % "splain" % "0.5.5" cross CrossVersion.patch),
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.6",
  )
)
lazy val publishSettings = Seq(
  publishMavenStyle := true,
  Test / publishArtifact := false,
  pomIncludeRepository := { _ => false },
  developers := List(
    Developer(
      id = "muller",
      name = "helen",
      email = "z@.com",
      url = url("http://****.git")
    ),

  )
)



lazy val root = project.in(file("."))
  .settings(publishSettings)
  .settings(
    name := baseName,
    licenses := Seq("LGPL v2.1+" -> url("http://www.gnu.org/licenses/lgpl-2.1.txt")),
    scalaVersion := "2.13.7",
    crossScalaVersions := Seq("3.1.0", "2.13.7","2.11.12", "2.12.15"),
    scalacOptions ++= Seq("-deprecation"),
    javacOptions := basicJavaOpts ++ Seq("-Xlint:unchecked", "-target", "1.8"),
    Compile / doc / javacOptions := basicJavaOpts,
    libraryDependencies ++= Seq(
      "org.tensorflow" % "tensorflow-core-api" % deps.main.tensorflow ,
      "org.tensorflow" % "tensorflow-core-api" % deps.main.tensorflow classifier tfClassifier, // "linux-x86_64-mkl",
      "org.tensorflow" % "tensorflow-framework" % deps.main.tensorflow ,
      "org.tensorflow" % "tensorflow-core-platform" % deps.main.tensorflow ,
//      "org.tensorflow" % "tensorflow-core-platform-gpu" % deps.main.tensorflow ,
      "org.junit.jupiter" % "junit-jupiter-engine" % deps.test.junitJupiter , //% Test
      "org.junit.jupiter" % "junit-jupiter-api" % "5.8.2" //, //% Test
//      "com.github.sbt" % "junit-interface" % deps.test.junitInterface , //% Test //这个会影响到打包

    )
  )

```
