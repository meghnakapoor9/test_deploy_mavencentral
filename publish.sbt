ThisBuild / organization := "test.maven.deploy"
ThisBuild / organizationName := "shubhamArtifacts"
ThisBuild / organizationHomepage := Some(url("http://www.knoldus.com/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/shubhamknoldus/test_deploy_mavencentral"),
    "scm:git@github.com:shubhamknoldus/test_deploy_mavencentral.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "shubhamartifacts",
    name  = "Shubham Verma",
    email = "shubhamv306@gmail.com  ",
    url   = url("http://www.knoldus.com")
  )
)

ThisBuild / description := "Some descripiton about your project."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/shubhamknoldus/test_deploy_mavencentral"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)