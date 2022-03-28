# Elemento GWT Sample

[TodoMVC](http://todomvc.com/) implementation based on GWT.com 

The sample uses a mixture of GWT dev mode and NPM / Parcel: 

- GWT dev mode is used to start a dev server and support re-compilation of modified Java source code.
- NPM / Parcel is used to 
  - get the latest [TodoMVC](https://www.npmjs.com/package/todomvc-app-css) CSS styles,
  - watch and rebuild modified HTML and CSS sources in dev mode and
  - bundle and minimize them for production mode.

## Get Started

### Development Mode

Run 

```shell
mvn gwt:devmode
```

in one shell, and

```shell
npm run watch
```

in another shell. Then open http://localhost:8888/todo/index.html. Any modifications to your Java, HTML and CSS code will be visible after a browser refresh.  

### Production mode

Run 

```shell
mvn package -P prod
```

The compiled web app is packaged in `target/elemento-samples-gwt-<version>-resources.jar`
