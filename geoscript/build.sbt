name := "geoscript"

organization := "org.geoscript"

version := "0.7.1"

scalaVersion := "2.9.0-1"

resolvers ++= Seq(
  "OSGeo" at "http://download.osgeo.org/webdav/geotools/",
  "OpenGeo" at "http://repo.opengeo.org/"
)

libraryDependencies ++= {
  val gtVersion = "2.7.0.1"
  Seq(
    "org.geotools" % "gt-main" % gtVersion,
    "org.geotools" % "gt-epsg-hsql" % gtVersion,
    "org.geotools" % "gt-shapefile" % gtVersion,
    "org.geotools" % "gt-render" % gtVersion,
    "org.geotools" % "gt-geojson" % gtVersion,
    "org.geotools" % "gt-xml" % gtVersion,
    "org.geotools.jdbc" % "gt-jdbc-postgis" % gtVersion,
    "org.geotools.jdbc" % "gt-jdbc-spatialite" % gtVersion,
    "javax.media" % "jai_core" % "1.1.3",
    "org.scala-tools.testing" %% "specs" % "[1.6,1.7)" % "test",
    "org.scala-tools.testing" %% "specs" % "[1.6,1.7)" % "test",
    "com.lowagie" % "itext" % "2.1.5"
  )
}

ivyXML :=
  <dependencies>
    <exclude org="xml-apis" name="xml-apis-xerces" rev="2.7.1"/>
  </dependencies>

libraryDependencies <+= scalaVersion { "org.scala-lang" % "scala-swing" % _ }

libraryDependencies <+= (organization, version) apply { _ %% "geocss" % _ }
