package org
package object geoscript {
  import feature._
  import geometry._
  import layer._
  import workspace._

  implicit def enrichGeometry(g: Geometry): RichGeometry =
    new RichGeometry(g)

  implicit def enrichPoint(p: Point): RichPoint = new RichPoint(p)

  implicit def enrichEnvelope(e: Envelope) = new RichEnvelope(e)

  implicit def enrichField(f: Field) = new RichField(f)

  implicit def enrichFeature(f: Feature) = new RichFeature(f)

  implicit def enrichGeoField(f: GeoField) = new RichGeoField(f)

  implicit def enrichSchema(s: Schema) = new RichSchema(s)

  implicit def enrichLayer(layer: Layer): RichLayer = new RichLayer(layer)

  implicit def enrichWorkspace(workspace: Workspace): RichWorkspace =
    new RichWorkspace(workspace)

  implicit def enrichConnector(connector: Connector): RichConnector =
    new RichConnector(connector)
}
