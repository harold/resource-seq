# resource-seq

[![Clojars Project](https://img.shields.io/clojars/v/resource-seq.svg)](https://clojars.org/resource-seq)

A Clojure library for unifying resource access between repl and jar.

## Rationale

In the repl `clojure.java.io/resource` often helpfully returns a File object.

In a jar `clojure.java.io/reources` can unhelpfully return a URL object.

This might not be that bad, until you want to call `file-seq`.

## Usage

Clojars: `[resource-seq "0.2.0"]`

Then call `(resource-seq.core/resource-seq)`.

The return value is a sequence of pairs where each first element is a string "path" that can be used for filtering, and each second element is a function of no arguments that when called returns a `java.io.InputStream` that can be used to get the contents of the resource.

See [the simple example](examples/simple/src/simple/core.clj).

## License

Copyright © 2017 Harold

Released into the public domain.
