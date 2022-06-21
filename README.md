# tensorflowProto

git clone  
sbt compile
### install local m2 repository
sbt  publishM2
--- /Users/***/.m2/repository/org/tensorflow/tensorflowproto_2.12/0.1
### import to project build.sbt
libraryDependencies += "org.tensorflow" %% "tensorflowproto" % "0.1"
