#!/bin/bash

./mvnw clean package -DskipTests;

docker compose --project-name "one" down --rmi all;
docker compose --project-name "two" down --rmi all;

docker compose --project-name "one" --env-file one.env up -d;
docker compose --project-name "two" --env-file two.env up -d;
