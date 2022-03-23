# Elemento J2CL Sample

[TodoMVC](http://todomvc.com/) implementation based on J2CL.

The sample uses a mixture of J2CL dev mode and NPM / Parcel:

- J2CL watch is used to support re-compilation of modified Java source code.
- NPM / Parcel is used to
  - get the latest [TodoMVC](https://www.npmjs.com/package/todomvc-app-css) CSS styles,
  - start a dev server, watch and rebuild modified HTML and CSS sources in dev mode and
  - bundle and minimize them for production mode.

## Get Started

### Development Mode

Run

```shell
mvn j2cl:watch
```

in one shell, and

```shell
npm run watch
```

in another shell. The last command will open http://localhost:1234 in the default browser. Any modifications to your Java, HTML and CSS code will be visible after a browser refresh.

### Production mode

Run

```shell
mvn package -P prod
```

The compiled web app is packaged in `target/elemento-samples-j2cl-<version>-resources.jar`
