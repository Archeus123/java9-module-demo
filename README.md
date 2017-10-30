## compile
```shell
> javac -d target/j.nine src/*.java src/com/test/*.java
```

## link
```shell
> jlink --module-path %JAVA_HOME%/jmods;target --add-modules j.nine --output dist --launcher launch=j.nine/com.test.Main
```

## run
```shell
> cd dist/bin

> launch
```
