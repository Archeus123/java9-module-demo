```shell
> javac -d target/j.nine src/*.java src/com/test/*.java

> jlink --module-path %JAVA_HOME%/jmods;target --add-modules j.nine --output dist --launcher launch=j.nine/com.test.Main

> cd dist/bin

> launch
```
