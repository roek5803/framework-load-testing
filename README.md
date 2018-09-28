# Performance test lab between different frameworks

## Scala Akka
```bash
$ ab -k -c 1000 -n 90000 localhost:8085/api/pi


```

## Java Spring boot
```bash
$ ab -k -c 1000 -n 90000 localhost:8080/api/pi

```

## Java vertx.io
```bash
$ ab -k -c 1000 -n 90000 localhost:8090/api/pi

```

