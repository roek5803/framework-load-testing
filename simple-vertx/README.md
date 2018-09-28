# Simple Vertx.io Application

## RUN

```bash
mvn clean package
java -jar target/simple-vertx-1.0-SNAPSHOT-fat.jar
# go to: localhost:8090/api/pi
```

```bash
ab -k -c 1 -n 1000 localhost:8090/api/pi
```

## Report

```bash
ab -k -c 1 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      1
Time taken for tests:   45.323 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    22.06 [#/sec] (mean)
Time per request:       45.323 [ms] (mean)
Time per request:       45.323 [ms] (mean, across all concurrent requests)
Transfer rate:          2.52 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    43   45   1.0     45      58
Waiting:       43   45   1.0     45      58
Total:         43   45   1.0     45      58

Percentage of the requests served within a certain time (ms)
  50%     45
  66%     46
  75%     46
  80%     46
  90%     47
  95%     47
  98%     47
  99%     48
 100%     58 (longest request)
```

```bash
ab -k -c 2 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      2
Time taken for tests:   23.431 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    42.68 [#/sec] (mean)
Time per request:       46.862 [ms] (mean)
Time per request:       23.431 [ms] (mean, across all concurrent requests)
Transfer rate:          4.88 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    45   47   1.8     47      83
Waiting:       45   47   1.8     47      83
Total:         45   47   1.8     47      84

Percentage of the requests served within a certain time (ms)
  50%     47
  66%     47
  75%     47
  80%     47
  90%     48
  95%     48
  98%     48
  99%     49
 100%     84 (longest request)
```

```bash
ab -k -c 4 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      4
Time taken for tests:   12.025 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    83.16 [#/sec] (mean)
Time per request:       48.102 [ms] (mean)
Time per request:       12.025 [ms] (mean, across all concurrent requests)
Transfer rate:          9.50 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    47   48   2.1     48      78
Waiting:       47   48   2.1     48      78
Total:         47   48   2.1     48      79

Percentage of the requests served within a certain time (ms)
  50%     48
  66%     48
  75%     48
  80%     48
  90%     48
  95%     49
  98%     50
  99%     56
 100%     79 (longest request)
```

```bash
ab -k -c 8 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      8
Time taken for tests:   6.689 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    149.50 [#/sec] (mean)
Time per request:       53.512 [ms] (mean)
Time per request:       6.689 [ms] (mean, across all concurrent requests)
Transfer rate:          17.08 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    46   53   7.8     50     114
Waiting:       46   53   7.8     50     114
Total:         46   53   7.8     50     114

Percentage of the requests served within a certain time (ms)
  50%     50
  66%     53
  75%     56
  80%     57
  90%     63
  95%     69
  98%     77
  99%     83
 100%    114 (longest request)
```

```bash
ab -k -c 16 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      16
Time taken for tests:   6.409 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    156.04 [#/sec] (mean)
Time per request:       102.538 [ms] (mean)
Time per request:       6.409 [ms] (mean, across all concurrent requests)
Transfer rate:          17.83 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    42  102  32.2    101     238
Waiting:       42  102  32.2    101     238
Total:         42  102  32.2    101     238

Percentage of the requests served within a certain time (ms)
  50%    101
  66%    113
  75%    123
  80%    129
  90%    144
  95%    159
  98%    175
  99%    186
 100%    238 (longest request)
```

```bash
ab -k -c 32 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      32
Time taken for tests:   5.799 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    172.46 [#/sec] (mean)
Time per request:       185.554 [ms] (mean)
Time per request:       5.799 [ms] (mean, across all concurrent requests)
Transfer rate:          19.70 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       2
Processing:    85  184  51.7    176     575
Waiting:       85  184  51.7    176     574
Total:         85  184  51.7    176     575

Percentage of the requests served within a certain time (ms)
  50%    176
  66%    190
  75%    199
  80%    205
  90%    219
  95%    251
  98%    370
  99%    424
 100%    575 (longest request)
```

```bash
ab -k -c 64 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      64
Time taken for tests:   5.758 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    173.69 [#/sec] (mean)
Time per request:       368.482 [ms] (mean)
Time per request:       5.758 [ms] (mean, across all concurrent requests)
Transfer rate:          19.84 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.3      0       1
Processing:   126  360  71.7    348     756
Waiting:      126  360  71.7    348     756
Total:        128  360  71.7    348     757

Percentage of the requests served within a certain time (ms)
  50%    348
  66%    366
  75%    376
  80%    382
  90%    421
  95%    506
  98%    581
  99%    738
 100%    757 (longest request)
```

```bash
ab -k -c 128 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      128
Time taken for tests:   5.506 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    181.63 [#/sec] (mean)
Time per request:       704.736 [ms] (mean)
Time per request:       5.506 [ms] (mean, across all concurrent requests)
Transfer rate:          20.75 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.8      0       3
Processing:   201  665 113.8    694     819
Waiting:      201  665 113.8    694     819
Total:        204  665 113.1    694     819

Percentage of the requests served within a certain time (ms)
  50%    694
  66%    709
  75%    718
  80%    724
  90%    738
  95%    750
  98%    771
  99%    787
 100%    819 (longest request)
```

```bash
ab -k -c 256 -n 1000 localhost:8090/api/pi
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


Server Software:        
Server Hostname:        localhost
Server Port:            8090

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      256
Time taken for tests:   5.479 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      117000 bytes
HTML transferred:       54000 bytes
Requests per second:    182.50 [#/sec] (mean)
Time per request:       1402.750 [ms] (mean)
Time per request:       5.479 [ms] (mean, across all concurrent requests)
Transfer rate:          20.85 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0   79 272.7      0    1024
Processing:   176 1158 341.5   1358    1519
Waiting:      176 1158 341.5   1358    1519
Total:        180 1237 450.2   1373    2519

Percentage of the requests served within a certain time (ms)
  50%   1373
  66%   1397
  75%   1411
  80%   1423
  90%   1457
  95%   2186
  98%   2370
  99%   2421
 100%   2519 (longest request)
```
