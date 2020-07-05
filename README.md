# code-with-quarkus project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Benchmar tests

Using JAX-RS:

```shell script
$ ab -n 1000 -c 25 http://localhost:8080/jaxrs
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
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

Document Path:          /jaxrs
Document Length:        9 bytes

Concurrency Level:      25
Time taken for tests:   0.105 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      87000 bytes
HTML transferred:       9000 bytes
Requests per second:    9568.55 [#/sec] (mean)
Time per request:       2.613 [ms] (mean)
Time per request:       0.105 [ms] (mean, across all concurrent requests)
Transfer rate:          812.95 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   0.5      1       4
Processing:     0    2   1.0      1      10
Waiting:        0    1   0.9      1       8
Total:          1    2   1.3      2      12

Percentage of the requests served within a certain time (ms)
  50%      2
  66%      2
  75%      2
  80%      3
  90%      4
  95%      5
  98%      7
  99%      8
 100%     12 (longest request)
```
Using Spring:
```shell script
$ ab -n 1000 -c 25 http://localhost:8080/spring
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
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

Document Path:          /spring
Document Length:        10 bytes

Concurrency Level:      25
Time taken for tests:   0.076 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      89000 bytes
HTML transferred:       10000 bytes
Requests per second:    13167.25 [#/sec] (mean)
Time per request:       1.899 [ms] (mean)
Time per request:       0.076 [ms] (mean, across all concurrent requests)
Transfer rate:          1144.42 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   0.2      1       2
Processing:     0    1   1.1      1      10
Waiting:        0    1   1.1      1      10
Total:          1    2   1.1      2      10

Percentage of the requests served within a certain time (ms)
  50%      2
  66%      2
  75%      2
  80%      2
  90%      2
  95%      3
  98%      6
  99%      7
 100%     10 (longest request)
```

Using Vert.x:

```shell script
$ ab -n 1000 -c 25 http://localhost:8080/vertx
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
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

Document Path:          /vertx
Document Length:        9 bytes

Concurrency Level:      25
Time taken for tests:   0.055 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      47000 bytes
HTML transferred:       9000 bytes
Requests per second:    18079.59 [#/sec] (mean)
Time per request:       1.383 [ms] (mean)
Time per request:       0.055 [ms] (mean, across all concurrent requests)
Transfer rate:          829.82 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   0.1      1       1
Processing:     0    1   0.2      1       3
Waiting:        0    1   0.2      0       2
Total:          1    1   0.3      1       3
ERROR: The median and mean for the waiting time are more than twice the standard
       deviation apart. These results are NOT reliable.

Percentage of the requests served within a certain time (ms)
  50%      1
  66%      1
  75%      1
  80%      1
  90%      2
  95%      2
  98%      2
  99%      2
 100%      3 (longest request)
``` 

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

