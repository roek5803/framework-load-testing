# Simple Akka Application

## RUN

```bash
sbt clean pack
./target/pack/bin/simple-akka
# go to: localhost:8085/api/pi
```

```bash
ab -k -c 1 -n 1000 localhost:8085/api/pi
```

## Report

```bash
ab -k -c 1 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      1
Time taken for tests:   47.413 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    21.09 [#/sec] (mean)
Time per request:       47.413 [ms] (mean)
Time per request:       47.413 [ms] (mean, across all concurrent requests)
Transfer rate:          4.57 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    45   47   4.5     47     181
Waiting:       45   47   4.5     47     181
Total:         45   47   4.5     47     181

Percentage of the requests served within a certain time (ms)
  50%     47
  66%     48
  75%     48
  80%     48
  90%     49
  95%     50
  98%     52
  99%     53
 100%    181 (longest request)
```

```bash
ab -k -c 2 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      2
Time taken for tests:   24.629 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    40.60 [#/sec] (mean)
Time per request:       49.257 [ms] (mean)
Time per request:       24.629 [ms] (mean, across all concurrent requests)
Transfer rate:          8.80 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    45   49   4.1     48     128
Waiting:       45   49   4.1     48     128
Total:         45   49   4.1     48     128

Percentage of the requests served within a certain time (ms)
  50%     48
  66%     49
  75%     49
  80%     50
  90%     53
  95%     54
  98%     56
  99%     64
 100%    128 (longest request)
```

```bash
ab -k -c 4 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      4
Time taken for tests:   12.259 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    81.57 [#/sec] (mean)
Time per request:       49.035 [ms] (mean)
Time per request:       12.259 [ms] (mean, across all concurrent requests)
Transfer rate:          17.68 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    47   49   9.1     48     254
Waiting:       47   49   9.1     48     254
Total:         47   49   9.1     48     254

Percentage of the requests served within a certain time (ms)
  50%     48
  66%     48
  75%     49
  80%     49
  90%     49
  95%     50
  98%     51
  99%     55
 100%    254 (longest request)
```

```bash
ab -k -c 8 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      8
Time taken for tests:   7.230 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    138.32 [#/sec] (mean)
Time per request:       57.837 [ms] (mean)
Time per request:       7.230 [ms] (mean, across all concurrent requests)
Transfer rate:          29.99 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    48   58  33.6     49     612
Waiting:       48   58  33.6     49     612
Total:         48   58  33.6     49     612

Percentage of the requests served within a certain time (ms)
  50%     49
  66%     53
  75%     57
  80%     59
  90%     71
  95%     87
  98%    102
  99%    143
 100%    612 (longest request)
```

```bash
ab -k -c 16 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      16
Time taken for tests:   6.264 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    159.63 [#/sec] (mean)
Time per request:       100.229 [ms] (mean)
Time per request:       6.264 [ms] (mean, across all concurrent requests)
Transfer rate:          34.61 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.1      0       1
Processing:    48  100  28.3     99     202
Waiting:       48  100  28.3     99     202
Total:         48  100  28.3     99     202

Percentage of the requests served within a certain time (ms)
  50%     99
  66%    110
  75%    119
  80%    124
  90%    138
  95%    148
  98%    162
  99%    169
 100%    202 (longest request)
```

```bash
ab -k -c 32 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      32
Time taken for tests:   6.340 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    157.72 [#/sec] (mean)
Time per request:       202.894 [ms] (mean)
Time per request:       6.340 [ms] (mean, across all concurrent requests)
Transfer rate:          34.19 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.1      0       1
Processing:    58  201  58.1    194     620
Waiting:       58  201  58.1    194     620
Total:         58  201  58.1    194     621

Percentage of the requests served within a certain time (ms)
  50%    194
  66%    216
  75%    231
  80%    239
  90%    268
  95%    294
  98%    328
  99%    386
 100%    621 (longest request)
```

```bash
ab -k -c 64 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      64
Time taken for tests:   5.658 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    176.73 [#/sec] (mean)
Time per request:       362.141 [ms] (mean)
Time per request:       5.658 [ms] (mean, across all concurrent requests)
Transfer rate:          38.31 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       1
Processing:    43  355 362.1    297    4111
Waiting:       43  355 362.1    297    4111
Total:         43  356 362.1    297    4111

Percentage of the requests served within a certain time (ms)
  50%    297
  66%    346
  75%    374
  80%    392
  90%    477
  95%    566
  98%   1487
  99%   2497
 100%   4111 (longest request)
```

```bash
ab -k -c 128 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      128
Time taken for tests:   5.576 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    179.34 [#/sec] (mean)
Time per request:       713.711 [ms] (mean)
Time per request:       5.576 [ms] (mean, across all concurrent requests)
Transfer rate:          38.88 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0   23 151.0      0    1007
Processing:    50  652 1230.6    283    5496
Waiting:       50  652 1230.6    283    5496
Total:         53  676 1310.7    283    5574

Percentage of the requests served within a certain time (ms)
  50%    283
  66%    330
  75%    371
  80%    403
  90%    645
  95%   5344
  98%   5526
  99%   5551
 100%   5574 (longest request)
```

```bash
ab -k -c 256 -n 1000 localhost:8085/api/pi
This is ApacheBench, Version 2.3 <$Revision: 1706008 $>
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


Server Software:        akka-http/10.0.11
Server Hostname:        localhost
Server Port:            8085

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      256
Time taken for tests:   8.227 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      222000 bytes
HTML transferred:       54000 bytes
Requests per second:    121.55 [#/sec] (mean)
Time per request:       2106.120 [ms] (mean)
Time per request:       8.227 [ms] (mean, across all concurrent requests)
Transfer rate:          26.35 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0  147 354.0      0    1009
Processing:    60 1397 2250.0    291    7213
Waiting:       60 1397 2250.0    291    7213
Total:         70 1544 2557.5    291    8222

Percentage of the requests served within a certain time (ms)
  50%    291
  66%    360
  75%    447
  80%   3678
  90%   5437
  95%   8009
  98%   8155
  99%   8191
 100%   8222 (longest request)
```
