sbt compile
sbt "project mysql" docker
sbt "project oracle" docker
sbt "project mysql" dockerComposeUp
sbt test
sbt alldbs:test
sbt "project mysql" dockerComposeStop