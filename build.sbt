name := "knolDeploy"

version := "0.1"

scalaVersion := "2.12.7"

updateOptions := updateOptions.value.withCachedResolution(true)

concurrentRestrictions in Global += Tags.limit(Tags.Test, 2)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test

useGpg := true

publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
