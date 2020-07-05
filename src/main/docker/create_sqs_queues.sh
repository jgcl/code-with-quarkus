#!/bin/sh

awslocal --endpoint-url=http://localhost:4566 sqs create-queue --queue-name testQueue
#awslocal --endpoint-url=http://localhost:4566 sqs send-message --queue-url http://localhost:4566/queue/testQueue --message-body "test"