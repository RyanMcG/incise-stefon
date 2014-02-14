# incise-stefon
An extension to [incise][] which adds [stefon][] support.
This includes an asset fixture and a middleware.

## Configuration

There are some default configuration values set for the once fixture and middleware.
You may add stefon configuration to your incise config file (`resources/incise.edn` by default).
See what [options stefon provides](https://github.com/circleci/stefon#configuration-options).

```clojure
;; Tell stefon the locations of assets it should precompile
:stefon {:precompiles ["javascripts/app.js.stefon"
                       "stylesheets/app.css.stefon"]}
```

## License

Copyright © 2013 Ryan McGowan

Distributed under the Eclipse Public License, the same as Clojure.

[incise]: http://www.ryanmcg.com/incise/
[stefon]: https://github.com/circleci/stefon
