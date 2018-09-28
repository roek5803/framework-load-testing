import sbt._

packSettings

packMain := Map(
  "simple-akka" -> "com.roek5803.simpleakka.Application"
)

packJvmOpts := Map(
  "simple-akka" -> Seq(
    "-Dcom.sun.management.jmxremote",
    "-Dcom.sun.management.jmxremote.authenticate=false",
    "-Dcom.sun.management.jmxremote.ssl=false",
    "-Dcom.sun.management.jmxremote.port=6002",
    "-XX:MaxJavaStackTraceDepth=30",
    "$EXAMPLE_APP_JVM_OPTS"
  )
)

packJarNameConvention := "full"

packGenerateWindowsBatFile := false

javaOptions in Test += "-Xmx4096m"
testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

updateOptions in Global := updateOptions.in(Global).value.withCachedResolution(true)