Installing RUST
===============
$ curl https://sh.rustup.rs -sSf | sh

Add RUST to path
================

Add line in $(HOME)/.bashrc:
export PATH=$PATH:~/.cargo/bin

Update to nightly builds of RUST(required by rocket framework)
=============================================================
$ rustup default nightly
$ rustup update && cargo update

Build rocket webservice
=======================

$ cargo build --release

$ ./target/release/simple-rust-rocket

Testing backend
===============

$ curl localhost:8070/api/pi

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
 

