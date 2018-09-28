# Simple nodejs express Application

## RUN

```bash
npm install
node app.js
# go to: localhost:8095/api/pi
```

```bash
ab -k -c 1 -n 1000 localhost:8095/api/pi
```

## Report

```bash
ab -k -c 1 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      1
Time taken for tests:   11.632 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    85.97 [#/sec] (mean)
Time per request:       11.632 [ms] (mean)
Time per request:       11.632 [ms] (mean, across all concurrent requests)
Transfer rate:          21.74 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    11   12   0.8     11      23
Waiting:       11   12   0.8     11      23
Total:         11   12   0.8     11      23
WARNING: The median and mean for the processing time are not within a normal deviation
        These results are probably not that reliable.
WARNING: The median and mean for the waiting time are not within a normal deviation
        These results are probably not that reliable.
WARNING: The median and mean for the total time are not within a normal deviation
        These results are probably not that reliable.

Percentage of the requests served within a certain time (ms)
  50%     11
  66%     12
  75%     12
  80%     12
  90%     12
  95%     12
  98%     14
  99%     14
 100%     23 (longest request)
```

```bash
ab -k -c 2 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      2
Time taken for tests:   11.860 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    84.32 [#/sec] (mean)
Time per request:       23.720 [ms] (mean)
Time per request:       11.860 [ms] (mean, across all concurrent requests)
Transfer rate:          21.33 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    11   24   4.2     24      39
Waiting:       11   24   4.2     24      39
Total:         11   24   4.2     24      39

Percentage of the requests served within a certain time (ms)
  50%     24
  66%     24
  75%     24
  80%     25
  90%     26
  95%     34
  98%     36
  99%     37
 100%     39 (longest request)
```

```bash
ab -k -c 4 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      4
Time taken for tests:   11.413 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    87.62 [#/sec] (mean)
Time per request:       45.651 [ms] (mean)
Time per request:       11.413 [ms] (mean, across all concurrent requests)
Transfer rate:          22.16 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:    20   46  15.3     35      84
Waiting:       20   46  15.3     35      84
Total:         20   46  15.3     35      84

Percentage of the requests served within a certain time (ms)
  50%     35
  66%     46
  75%     67
  80%     67
  90%     68
  95%     70
  98%     80
  99%     82
 100%     84 (longest request)
```

```bash
ab -k -c 8 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      8
Time taken for tests:   11.211 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    89.20 [#/sec] (mean)
Time per request:       89.691 [ms] (mean)
Time per request:       11.211 [ms] (mean, across all concurrent requests)
Transfer rate:          22.56 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       1
Processing:    19   89  26.2     79     171
Waiting:       19   89  26.2     79     171
Total:         19   89  26.2     79     171

Percentage of the requests served within a certain time (ms)
  50%     79
  66%     79
  75%     81
  80%     89
  90%    156
  95%    157
  98%    160
  99%    168
 100%    171 (longest request)
```

```bash
ab -k -c 16 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      16
Time taken for tests:   11.310 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    88.41 [#/sec] (mean)
Time per request:       180.967 [ms] (mean)
Time per request:       11.310 [ms] (mean, across all concurrent requests)
Transfer rate:          22.36 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.1      0       1
Processing:    18  180  36.8    171     358
Waiting:       18  180  36.8    171     358
Total:         19  180  36.8    171     358

Percentage of the requests served within a certain time (ms)
  50%    171
  66%    178
  75%    180
  80%    181
  90%    183
  95%    188
  98%    342
  99%    350
 100%    358 (longest request)
```

```bash
ab -k -c 32 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      32
Time taken for tests:   11.281 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    88.64 [#/sec] (mean)
Time per request:       361.001 [ms] (mean)
Time per request:       11.281 [ms] (mean, across all concurrent requests)
Transfer rate:          22.42 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       2
Processing:    16  355  45.9    359     723
Waiting:       16  355  45.9    359     723
Total:         17  355  45.8    359     723

Percentage of the requests served within a certain time (ms)
  50%    359
  66%    360
  75%    361
  80%    362
  90%    365
  95%    367
  98%    375
  99%    375
 100%    723 (longest request)
```

```bash
ab -k -c 64 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      64
Time taken for tests:   11.418 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    87.58 [#/sec] (mean)
Time per request:       730.756 [ms] (mean)
Time per request:       11.418 [ms] (mean, across all concurrent requests)
Transfer rate:          22.15 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       1
Processing:    15  708 102.9    728     756
Waiting:       15  708 102.9    728     756
Total:         16  708 102.7    728     756

Percentage of the requests served within a certain time (ms)
  50%    728
  66%    729
  75%    731
  80%    732
  90%    748
  95%    753
  98%    755
  99%    755
 100%    756 (longest request)
```

```bash
ab -k -c 128 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      128
Time taken for tests:   11.468 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    87.20 [#/sec] (mean)
Time per request:       1467.882 [ms] (mean)
Time per request:       11.468 [ms] (mean, across all concurrent requests)
Transfer rate:          22.06 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.4      0       2
Processing:    13 1375 291.6   1449    1535
Waiting:       13 1375 291.6   1449    1535
Total:         15 1375 291.2   1449    1535

Percentage of the requests served within a certain time (ms)
  50%   1449
  66%   1478
  75%   1509
  80%   1519
  90%   1527
  95%   1528
  98%   1532
  99%   1534
 100%   1535 (longest request)
```

```bash
ab -k -c 256 -n 1000 localhost:8095/api/pi
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
Server Port:            8095

Document Path:          /api/pi
Document Length:        54 bytes

Concurrency Level:      256
Time taken for tests:   11.671 seconds
Complete requests:      1000
Failed requests:        0
Keep-Alive requests:    1000
Total transferred:      259000 bytes
HTML transferred:       54000 bytes
Requests per second:    85.68 [#/sec] (mean)
Time per request:       2987.831 [ms] (mean)
Time per request:       11.671 [ms] (mean, across all concurrent requests)
Transfer rate:          21.67 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   2.1      0       9
Processing:    67 2605 769.8   2974    3004
Waiting:       67 2605 769.8   2974    3004
Total:         76 2606 767.7   2974    3004

Percentage of the requests served within a certain time (ms)
  50%   2974
  66%   2986
  75%   2990
  80%   2991
  90%   2994
  95%   2997
  98%   3001
  99%   3003
 100%   3004 (longest request)
```
