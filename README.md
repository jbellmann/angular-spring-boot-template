### Spring-Angular-Starter

#### Setup

* clone this repo
* change into created directory
* verify the spring-app wit `./mvnw clean verify -P\!ui-dev`
* do `git clone https://github.com/AngularClass/angular2-webpack-starter.git app`
* in `app/src/app/app.module.ts` search for `RouterModule.forRoot(ROUTES, { useHash: true })` and replace `true` with `false`
* in `app/config/webpack.common.js` set `baseUrl: '/app/',` in _METADATA_-section
* in `app/config/webpack.prod.js` and `app/config/webpack.dev.js` add `publicPath: "/js/",` in the _output_-section,
below _path_ seems to be a good place
* in `app/package.json` add the following to the _script_-section `"copyDist": "copyup dist/*.js ../target/classes/static && copyup dist/index.html ../target/classes/templates && copyup dist/assets/**/* ../target/classes/static"`
