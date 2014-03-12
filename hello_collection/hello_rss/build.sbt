name := "Hello RSS"

version := "1.0"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"

libraryDependencies ++= Seq(
  "uk.co.bigbeeconsultants" %% "bee-client" % "0.21.+",
  "org.slf4j" % "slf4j-api" % "1.7.+",
  "ch.qos.logback" % "logback-core"    % "1.0.+",
  "ch.qos.logback" % "logback-classic" % "1.0.+"
)

resolvers += "Big Bee Consultants" at "http://repo.bigbeeconsultants.co.uk/repo"