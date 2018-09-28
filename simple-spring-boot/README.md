# Simple Spring Boot Application

## RUN

```bash
mvn clean package
java -jar target/simple-spring-boot-0.0.1-SNAPSHOT.jar 
# go to: localhost:8080/api/pi
```

```bash
ab -k -c 1 -n 1000 localhost:8080/api/pi
```

## Report

```bash
ab -k -c 1 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      1
Time taken for tests:   40.950 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    990
Total transferred:      191950 bytes
HTML transferred:       54000 bytes
Requests per second:    24.42 [#/sec] (mean)
Time per request:       40.950 [ms] (mean)
Time per request:       40.950 [ms] (mean, across all concurrent requests)
Transfer rate:          4.58 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    38   41   2.4     40      70
Waiting:       38   41   2.4     40      70
Total:         38   41   2.4     40      70

Percentage of the requests served within a certain time (ms)
  50%     40
  66%     41
  75%     42
  80%     42
  90%     44
  95%     46
  98%     46
  99%     47
 100%     70 (longest request)
```

```bash
ab -k -c 2 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      2
Time taken for tests:   21.037 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    990
Total transferred:      191950 bytes
HTML transferred:       54000 bytes
Requests per second:    47.53 [#/sec] (mean)
Time per request:       42.074 [ms] (mean)
Time per request:       21.037 [ms] (mean, across all concurrent requests)
Transfer rate:          8.91 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    39   42   3.6     41      83
Waiting:       39   42   3.6     41      83
Total:         39   42   3.6     41      83

Percentage of the requests served within a certain time (ms)
  50%     41
  66%     42
  75%     42
  80%     42
  90%     44
  95%     46
  98%     48
  99%     56
 100%     83 (longest request)
```

```bash
ab -k -c 4 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      4
Time taken for tests:   10.660 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    992
Total transferred:      191960 bytes
HTML transferred:       54000 bytes
Requests per second:    93.81 [#/sec] (mean)
Time per request:       42.642 [ms] (mean)
Time per request:       10.660 [ms] (mean, across all concurrent requests)
Transfer rate:          17.58 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    41   43   5.3     42      90
Waiting:       41   43   5.3     42      90
Total:         41   43   5.3     42      90

Percentage of the requests served within a certain time (ms)
  50%     42
  66%     42
  75%     42
  80%     42
  90%     43
  95%     43
  98%     51
  99%     83
 100%     90 (longest request)
```

```bash
ab -k -c 8 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      8
Time taken for tests:   5.600 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    992
Total transferred:      191960 bytes
HTML transferred:       54000 bytes
Requests per second:    178.56 [#/sec] (mean)
Time per request:       44.802 [ms] (mean)
Time per request:       5.600 [ms] (mean, across all concurrent requests)
Transfer rate:          33.47 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    42   45  11.8     43     208
Waiting:       42   45  11.8     43     208
Total:         42   45  11.8     43     208

Percentage of the requests served within a certain time (ms)
  50%     43
  66%     43
  75%     43
  80%     43
  90%     44
  95%     49
  98%     82
  99%     90
 100%    208 (longest request)
```

```bash
ab -k -c 16 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      16
Time taken for tests:   5.561 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      192000 bytes
HTML transferred:       54000 bytes
Requests per second:    179.82 [#/sec] (mean)
Time per request:       88.975 [ms] (mean)
Time per request:       5.561 [ms] (mean, across all concurrent requests)
Transfer rate:          33.72 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    42   89  31.4     88     224
Waiting:       42   89  31.4     88     224
Total:         42   89  31.4     88     224

Percentage of the requests served within a certain time (ms)
  50%     88
  66%    101
  75%    110
  80%    114
  90%    129
  95%    140
  98%    154
  99%    171
 100%    224 (longest request)
```

```bash
ab -k -c 32 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      32
Time taken for tests:   5.767 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      192000 bytes
HTML transferred:       54000 bytes
Requests per second:    173.41 [#/sec] (mean)
Time per request:       184.531 [ms] (mean)
Time per request:       5.767 [ms] (mean, across all concurrent requests)
Transfer rate:          32.51 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       2
Processing:    43  183  53.2    175     565
Waiting:       43  183  53.2    175     565
Total:         43  183  53.2    175     566

Percentage of the requests served within a certain time (ms)
  50%    175
  66%    186
  75%    197
  80%    204
  90%    231
  95%    284
  98%    340
  99%    378
 100%    566 (longest request)
```

```bash
ab -k -c 64 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      64
Time taken for tests:   5.450 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      192000 bytes
HTML transferred:       54000 bytes
Requests per second:    183.48 [#/sec] (mean)
Time per request:       348.805 [ms] (mean)
Time per request:       5.450 [ms] (mean, across all concurrent requests)
Transfer rate:          34.40 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       1
Processing:    54  344  85.7    344    1175
Waiting:       54  344  85.7    344    1175
Total:         54  344  85.7    344    1176

Percentage of the requests served within a certain time (ms)
  50%    344
  66%    356
  75%    366
  80%    373
  90%    391
  95%    419
  98%    568
  99%    745
 100%   1176 (longest request)
```

```bash
ab -k -c 128 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      128
Time taken for tests:   5.441 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      192000 bytes
HTML transferred:       54000 bytes
Requests per second:    183.80 [#/sec] (mean)
Time per request:       696.398 [ms] (mean)
Time per request:       5.441 [ms] (mean, across all concurrent requests)
Transfer rate:          34.46 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   1.2      0       6
Processing:    43  683 302.4    650    2501
Waiting:       43  683 302.4    650    2501
Total:         43  684 302.6    650    2503

Percentage of the requests served within a certain time (ms)
  50%    650
  66%    698
  75%    728
  80%    754
  90%    885
  95%   1163
  98%   1751
  99%   2366
 100%   2503 (longest request)
```

```bash
ab -k -c 256 -n 1000 localhost:8080/api/pi
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
Server Port:            8080

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      256
Time taken for tests:   5.495 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      192000 bytes
HTML transferred:       54000 bytes
Requests per second:    181.98 [#/sec] (mean)
Time per request:       1406.784 [ms] (mean)
Time per request:       5.495 [ms] (mean, across all concurrent requests)
Transfer rate:          34.12 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    3   5.3      0      14
Processing:    43 1318 1090.1    980    5476
Waiting:       43 1318 1090.1    980    5476
Total:         43 1321 1092.5    980    5490

Percentage of the requests served within a certain time (ms)
  50%    980
  66%   1047
  75%   1111
  80%   1236
  90%   2550
  95%   4725
  98%   5398
  99%   5444
 100%   5490 (longest request)
```
