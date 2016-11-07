sbtPlugin := true
organization := "org.typelevel"
name := "sbt-catalysts"
description := "SBT plugin for Catalysts"

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.10"

addSbtPlugin("com.eed3si9n"        %  "sbt-unidoc"             % "0.3.3")
addSbtPlugin("com.github.gseitz"   %  "sbt-release"            % "1.0.3")
addSbtPlugin("com.github.tkawachi" %  "sbt-doctest"            % "0.4.1")
addSbtPlugin("org.xerial.sbt"      %  "sbt-sonatype"           % "0.5.1")
addSbtPlugin("com.jsuereth"        %  "sbt-pgp"                % "1.0.0")
addSbtPlugin("com.typesafe.sbt"    %  "sbt-ghpages"            % "0.5.4")
addSbtPlugin("com.typesafe.sbt"    %  "sbt-site"               % "0.8.1")
addSbtPlugin("org.tpolecat"        %  "tut-plugin"             % "0.4.6")
addSbtPlugin("pl.project13.scala"  %  "sbt-jmh"                % "0.2.16")
addSbtPlugin("org.scalastyle"      %% "scalastyle-sbt-plugin"  % "0.8.0")
addSbtPlugin("org.scoverage"       %  "sbt-scoverage"          % "1.5.0")
addSbtPlugin("com.typesafe.sbt"    %  "sbt-git"                % "0.8.5")
addSbtPlugin("org.scala-js"        %  "sbt-scalajs"            % "0.6.13")

scalacOptions ++= Seq(Opts.compile.deprecation, "-feature")

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scmInfo := Some(ScmInfo(url("https://github.com/inthenow/sbt-catalysts"), "git@github.com:inthenow/sbt-catalysts.git"))

publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization := Some("typelevel")
