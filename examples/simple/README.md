# simple

An application showing the simplest usage of the `resource-seq` lib.

## Usage

`lein repl` -> `(-main)`:
```
simple.core> (-main)
1 items found.
/home/harold/src/resource-seq/examples/simple/resources/testfile.txt
Content: t e s t
```

`lein uberjar` -> `java -jar target/target/uberjar/simple-0.1.0-SNAPSHOT-standalone.jar`:
```
Compiling simple.core
Created /home/harold/src/resource-seq/examples/simple/target/uberjar/simple-0.1.0-SNAPSHOT.jar
Created /home/harold/src/resource-seq/examples/simple/target/uberjar/simple-0.1.0-SNAPSHOT-standalone.jar
1 item(s) found.
/home/harold/src/resource-seq/examples/simple/target/uberjar/simple-0.1.0-SNAPSHOT-standalone.jar/testfile.txt
Content: t e s t
```

## License

Copyright © 2017 Harold

Released into the public domain.
