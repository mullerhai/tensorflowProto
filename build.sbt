import sbt.url

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.12.11"

lazy val baseName = "tensorflowProto"
lazy val projectVersion = "0.1.0-SNAPSHOT"
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

def basicJavaOpts = Seq("-source", "1.8")
val sparkVersion = "3.1.1" // "2.3.2" //
val bigDLVersion = "0.12.1"
val flinkVersion = "1.12.0"
val tfClassifier = "linux-x86_64"
val hadoopVersion =  "3.3.2" //  "3.0.0"  //"2.7.3" //
val jacksonVersion="2.13.2"
val hiveVersion ="3.1.2" //"2.3.7"
//ThisBuild / version := projectVersion
ThisBuild / organization := "org.tensorflow"
ThisBuild / versionScheme := Some("pvp")
val protobufVersion ="3.19.4"

//lazy val root = (project in file("."))
//  .settings(
//    name := "tensorflowProto"
//  )

lazy val root = project.in(file("."))
  .settings(publishSettings)
  .settings(
    name := baseName,
    licenses := Seq("LGPL v2.1+" -> url("http://www.gnu.org/licenses/lgpl-2.1.txt")),
    scalaVersion := "2.12.11",
    crossScalaVersions := Seq("3.1.0", "2.13.7","2.11.12", "2.12.15"),
    scalacOptions ++= Seq("-deprecation"),
    javacOptions := basicJavaOpts ++ Seq("-Xlint:unchecked", "-target", "1.8"),
    Compile / doc / javacOptions := basicJavaOpts,
    libraryDependencies ++= Seq(
      "org.tensorflow" % "tensorflow-core-api" % deps.main.tensorflow ,
      "org.tensorflow" % "tensorflow-core-api" % deps.main.tensorflow classifier tfClassifier, // "linux-x86_64-mkl",
      "org.tensorflow" % "tensorflow-framework" % deps.main.tensorflow ,
      "org.tensorflow" % "tensorflow-core-platform" % deps.main.tensorflow ,
      "org.junit.jupiter" % "junit-jupiter-engine" % deps.test.junitJupiter , //% Test
      "org.junit.jupiter" % "junit-jupiter-api" % "5.8.2" //, //% Test
      //      "com.github.sbt" % "junit-interface" % deps.test.junitInterface , //% Test //这个会影响到打包

    )
  )
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
      email = "zhanghaining1@hqwx.com",
      url = url("http://hq-deployer-204:7010/external-algorithm/hwdeepfm.git")
    ),

  )
)


//libraryDependencies += "com.thesamet.scalapb" %% "sparksql31-scalapb0_10" % "1.0.0-M1"   //spark 3

// https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime-grpc
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion
libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion,  //% "protobuf"
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion  % "protobuf"
)




assemblyMergeStrategy in assembly := {
  case "META-INF/services/org.apache.spark.sql.sources.DataSourceRegister" => MergeStrategy.concat
  case n if n.startsWith("META-INF/eclipse.inf") => MergeStrategy.discard
  case n if n.startsWith("META-INF/ECLIPSEF.RSA") => MergeStrategy.discard
  case n if n.startsWith("META-INF/ECLIPSE_.RSA") => MergeStrategy.discard
  case n if n.startsWith("META-INF/ECLIPSEF.SF") => MergeStrategy.discard
  case n if n.startsWith("META-INF/ECLIPSE_.SF") => MergeStrategy.discard
  case n if n.startsWith("META-INF/MANIFEST.MF") => MergeStrategy.discard
  case n if n.startsWith("META-INF/NOTICE.txt") => MergeStrategy.discard
  case n if n.startsWith("META-INF/NOTICE") => MergeStrategy.discard
  case n if n.startsWith("META-INF/LICENSE.txt") =>
    MergeStrategy.discard
  case n if n.startsWith("META-INF/LICENSE") => MergeStrategy.discard
  case n if n.startsWith("rootdoc.txt") => MergeStrategy.discard
  case n if n.startsWith("readme.html") => MergeStrategy.discard
  case n if n.startsWith("readme.txt") => MergeStrategy.discard
  case n if n.startsWith("library.properties") => MergeStrategy.discard
  case n if n.startsWith("license.html") => MergeStrategy.discard
  case n if n.startsWith("about.html") => MergeStrategy.discard

  case PathList("META-INF", xs@_*) => MergeStrategy.discard

  case x => MergeStrategy.first
}

