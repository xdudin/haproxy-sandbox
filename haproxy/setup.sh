#!/bin/bash

docker compose --project-name "proxy" down --rmi all;

docker compose --project-name "proxy" up -d;
