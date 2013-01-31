resolvers += "kiji main" at "https://repo.wibidata.com/artifactory/kiji"

resolvers += "kiji nightly" at "https://repo.wibidata.com/artifactory/kiji-nightly"

libraryDependencies += "org.kiji.schema" % "kiji-schema" % "1.0.0-rc3"

libraryDependencies += "org.kiji.platforms" % "kiji-cdh4-platform" % "1.0.0-rc3"
