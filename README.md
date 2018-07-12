# Performance test lab between different frameworks

## Scala Akka
```bash
$ ab -k -c 1000 -n 90000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 9000 requests
Completed 18000 requests
Completed 27000 requests
Completed 36000 requests
Completed 45000 requests
Completed 54000 requests
Completed 63000 requests
Completed 72000 requests
Completed 81000 requests
Completed 90000 requests
Finished 90000 requests


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        29 bytes

Concurrency Level:      1000
Time taken for tests:   1.001 seconds
Complete requests:      90000
Failed requests:        0
Keep-Alive requests:    90000
Total transferred:      17730000 bytes
HTML transferred:       2610000 bytes
Requests per second:    89907.04 [#/sec] (mean)
Time per request:       11.123 [ms] (mean)
Time per request:       0.011 [ms] (mean, across all concurrent requests)
Transfer rate:          17296.57 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.6      0      14
Processing:     0    3   2.5      2     101
Waiting:        0    3   2.5      2     101
Total:          0    3   2.7      2     115

Percentage of the requests served within a certain time (ms)
  50%      2
  66%      3
  75%      3
  80%      3
  90%      4
  95%      6
  98%     11
  99%     15
 100%    115 (longest request)

```

## Java Spring boot
```bash
$ ab -k -c 1000 -n 90000 localhost:8080/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 9000 requests
Completed 18000 requests
Completed 27000 requests
Completed 36000 requests
Completed 45000 requests
Completed 54000 requests
Completed 63000 requests
Completed 72000 requests
Completed 81000 requests
Completed 90000 requests
Finished 90000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8080

Document Path:          /api/pi
Document Length:        29 bytes

Concurrency Level:      1000
Time taken for tests:   32.441 seconds
Complete requests:      90000
Failed requests:        0
Keep-Alive requests:    89451
Total transferred:      15027255 bytes
HTML transferred:       2610000 bytes
Requests per second:    2774.27 [#/sec] (mean)
Time per request:       360.455 [ms] (mean)
Time per request:       0.360 [ms] (mean, across all concurrent requests)
Transfer rate:          452.36 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    9  97.2      0    1037
Processing:     2  349 1737.8      8   14785
Waiting:        2  349 1737.8      8   14785
Total:          2  359 1781.0      8   15810

Percentage of the requests served within a certain time (ms)
  50%      8
  66%     23
  75%     44
  80%     79
  90%    382
  95%    548
  98%   8129
  99%  12555
 100%  15810 (longest request)
```

## Java vertx.io
```bash
$ ab -k -c 1000 -n 90000 localhost:8090/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 9000 requests
Completed 18000 requests
Completed 27000 requests
Completed 36000 requests
Completed 45000 requests
Completed 54000 requests
Completed 63000 requests
Completed 72000 requests
Completed 81000 requests
Completed 90000 requests
Finished 90000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        29 bytes

Concurrency Level:      1000
Time taken for tests:   15.154 seconds
Complete requests:      90000
Failed requests:        0
Keep-Alive requests:    90000
Total transferred:      8280000 bytes
HTML transferred:       2610000 bytes
Requests per second:    5938.84 [#/sec] (mean)
Time per request:       168.383 [ms] (mean)
Time per request:       0.168 [ms] (mean, across all concurrent requests)
Transfer rate:          533.57 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0   10  98.5      0    1024
Processing:    24  158 270.8     60    4236
Waiting:       24  158 270.8     60    4236
Total:         24  168 325.8     60    5256

Percentage of the requests served within a certain time (ms)
  50%     60
  66%     66
  75%     73
  80%     87
  90%    673
  95%    737
  98%    838
  99%    943
 100%   5256 (longest request)
```

