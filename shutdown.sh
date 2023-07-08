#!/bin/bash

docker compose --project-name "one" down --rmi all;
docker compose --project-name "two" down --rmi all;
