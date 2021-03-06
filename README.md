# Performance test lab between different frameworks

## [Java Spring boot](simple-spring-boot/)

| concurrency | total_time | 50%    | 66%      | 75%      | 80%      | 90%      | 95%      | 98%      | 99%      | 100%     |
|-------------|------------|--------|----------|----------|----------|----------|----------|----------|----------|----------|
| 1           | 40,95      | 40,00  | 41,00    | 42,00    | 42,00    | 44,00    | 46,00    | 46,00    | 47,00    | 70,00    |
| 2           | 21,04      | 41,00  | 42,00    | 42,00    | 42,00    | 44,00    | 46,00    | 48,00    | 56,00    | 83,00    |
| 4           | 10,66      | 42,00  | 42,00    | 42,00    | 42,00    | 43,00    | 43,00    | 51,00    | 83,00    | 90,00    |
| 8           | 5,60       | 43,00  | 43,00    | 43,00    | 43,00    | 44,00    | 49,00    | 82,00    | 90,00    | 208,00   |
| 16          | 5,56       | 88,00  | 101,00   | 110,00   | 114,00   | 129,00   | 140,00   | 154,00   | 171,00   | 224,00   |
| 32          | 5,77       | 175,00 | 186,00   | 197,00   | 204,00   | 231,00   | 284,00   | 340,00   | 378,00   | 566,00   |
| 64          | 5,45       | 344,00 | 356,00   | 366,00   | 373,00   | 391,00   | 419,00   | 568,00   | 745,00   | 1.176,00 |
| 128         | 5,44       | 650,00 | 698,00   | 728,00   | 754,00   | 885,00   | 1.163,00 | 1.751,00 | 2.366,00 | 2.503,00 |
| 256         | 5,50       | 980,00 | 1.047,00 | 1.111,00 | 1.236,00 | 2.550,00 | 4.725,00 | 5.398,00 | 5.444,00 | 5.490,00 |

## [Scala Akka](simple-akka/)

| concurrency | total_time | 50%    | 66%    | 75%    | 80%      | 90%      | 95%      | 98%      | 99%      | 100%     |
|-------------|------------|--------|--------|--------|----------|----------|----------|----------|----------|----------|
| 1           | 47,41      | 47,00  | 48,00  | 48,00  | 48,00    | 49,00    | 50,00    | 52,00    | 53,00    | 181,00   |
| 2           | 24,63      | 48,00  | 49,00  | 49,00  | 50,00    | 53,00    | 54,00    | 56,00    | 64,00    | 128,00   |
| 4           | 12,26      | 48,00  | 48,00  | 49,00  | 49,00    | 49,00    | 50,00    | 51,00    | 55,00    | 254,00   |
| 8           | 7,23       | 49,00  | 53,00  | 57,00  | 59,00    | 71,00    | 87,00    | 102,00   | 143,00   | 612,00   |
| 16          | 6,26       | 99,00  | 110,00 | 119,00 | 124,00   | 138,00   | 148,00   | 162,00   | 169,00   | 202,00   |
| 32          | 6,34       | 194,00 | 216,00 | 231,00 | 239,00   | 268,00   | 294,00   | 328,00   | 386,00   | 621,00   |
| 64          | 5,66       | 297,00 | 346,00 | 374,00 | 392,00   | 477,00   | 566,00   | 1.487,00 | 2.497,00 | 4.111,00 |
| 128         | 5,58       | 283,00 | 330,00 | 371,00 | 403,00   | 645,00   | 5.344,00 | 5.526,00 | 5.551,00 | 5.574,00 |
| 256         | 8,23       | 291,00 | 360,00 | 447,00 | 3.678,00 | 5.437,00 | 8.009,00 | 8.155,00 | 8.191,00 | 8.222,00 |

## [Java vertx.io](simple-vertx/)

| concurrency | total_time | 50%      | 66%      | 75%      | 80%      | 90%      | 95%      | 98%      | 99%      | 100%     |
|-------------|------------|----------|----------|----------|----------|----------|----------|----------|----------|----------|
| 1           | 45,32      | 45,00    | 46,00    | 46,00    | 46,00    | 47,00    | 47,00    | 47,00    | 48,00    | 58,00    |
| 2           | 23,43      | 47,00    | 47,00    | 47,00    | 47,00    | 48,00    | 48,00    | 48,00    | 49,00    | 84,00    |
| 4           | 12,03      | 48,00    | 48,00    | 48,00    | 48,00    | 48,00    | 49,00    | 50,00    | 56,00    | 79,00    |
| 8           | 6,69       | 50,00    | 53,00    | 56,00    | 57,00    | 63,00    | 69,00    | 77,00    | 83,00    | 114,00   |
| 16          | 6,41       | 101,00   | 113,00   | 123,00   | 129,00   | 144,00   | 159,00   | 175,00   | 186,00   | 238,00   |
| 32          | 5,80       | 176,00   | 190,00   | 199,00   | 205,00   | 219,00   | 251,00   | 370,00   | 424,00   | 575,00   |
| 64          | 5,76       | 348,00   | 366,00   | 376,00   | 382,00   | 421,00   | 506,00   | 581,00   | 738,00   | 757,00   |
| 128         | 5,51       | 694,00   | 709,00   | 718,00   | 724,00   | 738,00   | 750,00   | 771,00   | 787,00   | 819,00   |
| 256         | 5,48       | 1.373,00 | 1.397,00 | 1.411,00 | 1.423,00 | 1.457,00 | 2.186,00 | 2.370,00 | 2.421,00 | 2.519,00 |

## [nodejs express](simple-node/)

| concurrency | total_time | 50%      | 66%      | 75%      | 80%      | 90%      | 95%      | 98%      | 99%      | 100%     |
|-------------|------------|----------|----------|----------|----------|----------|----------|----------|----------|----------|
| 1           | 11,63      | 11,00    | 12,00    | 12,00    | 12,00    | 12,00    | 12,00    | 14,00    | 14,00    | 23,00    |
| 2           | 11,86      | 24,00    | 24,00    | 24,00    | 25,00    | 26,00    | 34,00    | 36,00    | 37,00    | 39,00    |
| 4           | 11,41      | 35,00    | 46,00    | 67,00    | 67,00    | 68,00    | 70,00    | 80,00    | 82,00    | 84,00    |
| 8           | 11,21      | 79,00    | 79,00    | 81,00    | 89,00    | 156,00   | 157,00   | 160,00   | 168,00   | 171,00   |
| 16          | 11,31      | 171,00   | 178,00   | 180,00   | 181,00   | 183,00   | 188,00   | 342,00   | 350,00   | 358,00   |
| 32          | 11,28      | 359,00   | 360,00   | 361,00   | 362,00   | 365,00   | 367,00   | 375,00   | 375,00   | 723,00   |
| 64          | 11,42      | 728,00   | 729,00   | 731,00   | 732,00   | 748,00   | 753,00   | 755,00   | 755,00   | 756,00   |
| 128         | 11,47      | 1.449,00 | 1.478,00 | 1.509,00 | 1.519,00 | 1.527,00 | 1.528,00 | 1.532,00 | 1.534,00 | 1.535,00 |
| 256         | 11,67      | 2.974,00 | 2.986,00 | 2.990,00 | 2.991,00 | 2.994,00 | 2.997,00 | 3.001,00 | 3.003,00 | 3.004,00 |


## [rust rocket](simple-rust-rocket/)

| concurrency | total_time | 50%      | 66%      | 75%      | 80%      | 90%      | 95%      | 98%      | 99%      | 100%     |
|-------------|------------|----------|----------|----------|----------|----------|----------|----------|----------|----------|
| 1           | 11,46      | 11,00    | 11,00    | 11,00    | 11,00    | 12,00    | 14,00    | 14,00    | 16,00    | 16,00    |
| 2           | 6,27       | 11,00    | 11,00    | 12,00    | 12,00    | 20,00    | 21,00    | 22,00    | 22,00    | 23,00    |
| 4           | 3,67       | 12,00    | 15,00    | 17,00    | 19,00    | 22,00    | 23,00    | 23,00    | 23,00    | 24,00    |
| 8           | 2,88       | 23,00    | 23,00    | 23,00    | 23,00    | 24,00    | 25,00    | 27,00    | 28,00    | 32,00    |
| 16          | 2,87       | 46,00    | 50,00    | 54,00    | 60,00    | 69,00    | 78,00    | 86,00    | 91,00    | 104,00   |
| 32          | 2,87       | 92,00    | 93,00    | 95,00    | 96,00    | 99,00    | 102,00   | 111,00   | 145,00   | 207,00   |
| 64          | 2,88       | 183,00   | 185,00   | 186,00   | 187,00   | 190,00   | 193,00   | 200,00   | 212,00   | 234,00   |

