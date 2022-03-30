var createError = require("http-errors");
var express = require("express");
var path = require("path");
var cookieParser = require("cookie-parser");
var logger = require("morgan");

var indexRouter = require("./routes/index");
var usersRouter = require("./routes/users");

// 1 start
// express 패키지를 호출하여 app 변수 객체를 만든다. 이제 이 변수에 각종 기능을 연결한다.
var app = express();
// 1 end

// 2 start
// app.set 메서드로 익스프레스 앱을 설정할 수 있다.
// view engine setup
app.set("views", path.join(__dirname, "views"));
app.set("view engine", "pug");

app.use(function (req, res, next) {
  console.log(req.url, "저도 미들웨어입니다.");
  //next();
});
// 2 end

// 3 start
// 중간 부분에 app.use로 시작하는 코드가 많은데, 미들웨어를 연결하는 부분이다.
app.use(logger("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, "public")));

app.use("/", indexRouter);
app.use("/users", usersRouter);

// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use(function (err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get("env") === "development" ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render("error");
});
// 3 end

// 4 start
// 마지막에는 app 객체를 모듈로 만든다. 이것이 bin/www에서 사용된 app 모듈이다.
module.exports = app;
// 4 end
