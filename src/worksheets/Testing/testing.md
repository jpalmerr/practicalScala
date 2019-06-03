# Testing

Many available testing libraries, we will look at [*scalatest*.](http://www.scalatest.org/)

Add the dependency to `build.sbt`.
```$xslt
libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
```

or, for automatically scala version

```$xslt
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
```

- Go into test directory
- Use `Spec` naming

```$xslt
it should "blah blah" in {
*new instance*
*apply methods*
*method blah blah* should be ...
}
```

- Right click the class and run 