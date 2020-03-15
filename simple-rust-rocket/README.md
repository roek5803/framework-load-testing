Installing RUST
===============
```bash
$ curl https://sh.rustup.rs -sSf | sh
```

Add RUST to path
================


Add line in $(HOME)/.bashrc:
```bash
export PATH=$PATH:~/.cargo/bin
```

Update to nightly builds of RUST(required by rocket framework)
=============================================================
```bash
$ rustup default nightly
$ rustup update && cargo update
```
Build and run rust rocket webservice
=======================

```bash
$ cargo build --release
$ ./target/release/simple-rust-rocket
```

Testing backend
===============

```bash
$ curl localhost:8070/api/pi
```

Run in container
================
```bash

$ docker build -t simple-rust-image:latest .

$ docker run --rm --name simple-rust-container -d -p 8070:8070 simple-rust-image:latest

```

Run with docker-compose
=======================

```bash
$ docker-compose build

$ docker-compose up -d

$ docker-compose scale web=5

```



REPORT
============
```bash
$ ab -k -c 1 -n 1000 localhost:8070/api/pi

ab -k -c 1 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      1
Time taken for tests:   11.458 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    87.28 [#/sec] (mean)
Time per request:       11.458 [ms] (mean)
Time per request:       11.458 [ms] (mean, across all concurrent requests)
Transfer rate:          16.02 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    10   11   1.0     11      16
Waiting:       10   11   1.0     11      16
Total:         10   11   1.0     11      16

Percentage of the requests served within a certain time (ms)
  50%     11
  66%     11
  75%     11
  80%     11
  90%     12
  95%     14
  98%     14
  99%     16
 100%     16 (longest request)
 
 ```
 
 ```bash
$ ab -k -c 2 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      2
Time taken for tests:   6.265 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    159.61 [#/sec] (mean)
Time per request:       12.530 [ms] (mean)
Time per request:       6.265 [ms] (mean, across all concurrent requests)
Transfer rate:          29.30 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    11   12   3.1     11      23
Waiting:       11   12   3.1     11      23
Total:         11   13   3.1     11      23

Percentage of the requests served within a certain time (ms)
  50%     11
  66%     11
  75%     12
  80%     12
  90%     20
  95%     21
  98%     22
  99%     22
 100%     23 (longest request)
```

```bash
$ ab -k -c 4 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      4
Time taken for tests:   3.656 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    273.56 [#/sec] (mean)
Time per request:       14.622 [ms] (mean)
Time per request:       3.656 [ms] (mean, across all concurrent requests)
Transfer rate:          50.22 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    11   15   4.0     12      24
Waiting:       11   15   4.0     12      24
Total:         11   15   4.0     12      24

Percentage of the requests served within a certain time (ms)
  50%     12
  66%     15
  75%     17
  80%     19
  90%     22
  95%     23
  98%     23
  99%     23
 100%     24 (longest request)
```

```bash
$ ab -k -c 8 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      8
Time taken for tests:   2.876 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    347.67 [#/sec] (mean)
Time per request:       23.010 [ms] (mean)
Time per request:       2.876 [ms] (mean, across all concurrent requests)
Transfer rate:          63.83 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    14   23   1.5     23      32
Waiting:        9   23   1.6     23      32
Total:         14   23   1.5     23      32

Percentage of the requests served within a certain time (ms)
  50%     23
  66%     23
  75%     23
  80%     23
  90%     24
  95%     25
  98%     27
  99%     28
 100%     32 (longest request)
```

```bash
$ ab -k -c 16 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      16
Time taken for tests:   2.874 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    347.92 [#/sec] (mean)
Time per request:       45.987 [ms] (mean)
Time per request:       2.874 [ms] (mean, across all concurrent requests)
Transfer rate:          63.88 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   2.2      0      28
Processing:    15   46  17.3     46     103
Waiting:        9   40  15.3     39      96
Total:         15   46  17.2     46     104

Percentage of the requests served within a certain time (ms)
  50%     46
  66%     50
  75%     54
  80%     60
  90%     69
  95%     78
  98%     86
  99%     91
 100%    104 (longest request)
```

```bash
$ ab -k -c 32 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      32
Time taken for tests:   2.874 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    347.96 [#/sec] (mean)
Time per request:       91.964 [ms] (mean)
Time per request:       2.874 [ms] (mean, across all concurrent requests)
Transfer rate:          63.88 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   8.1      0      77
Processing:    24   90  15.6     92     196
Waiting:       14   84  15.1     85     184
Total:         27   91  13.3     92     207

Percentage of the requests served within a certain time (ms)
  50%     92
  66%     93
  75%     95
  80%     96
  90%     99
  95%    102
  98%    111
  99%    145
 100%    207 (longest request)
```

```bash
$ ab -k -c 64 -n 1000 http://localhost:8070/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1796539 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Rocket
Server Hostname:        localhost
Server Port:            8070

Document Path:          /api/pi
Document Length:        55 bytes

Concurrency Level:      64
Time taken for tests:   2.875 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    0
Total transferred:      188000 bytes
HTML transferred:       55000 bytes
Requests per second:    347.85 [#/sec] (mean)
Time per request:       183.987 [ms] (mean)
Time per request:       2.875 [ms] (mean, across all concurrent requests)
Transfer rate:          63.86 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    6  24.0      0     168
Processing:    23  174  32.7    183     234
Waiting:       18  168  32.2    176     223
Total:         24  179  21.5    183     234

Percentage of the requests served within a certain time (ms)
  50%    183
  66%    185
  75%    186
  80%    187
  90%    190
  95%    193
  98%    200
  99%    212
 100%    234 (longest request)
```

