const path = require('path');
const gulp = require('gulp');
const jasmine = require('gulp-jasmine');

function test() {
  return gulp.src(path.join(__dirname, '*.spec.js')).pipe(jasmine());
}

function tdd() {
  gulp.watch(path.join(__dirname, '**', '*.js'), test);
}

module.exports = {
  test,
  tdd,
};
