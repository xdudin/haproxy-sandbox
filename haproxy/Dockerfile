FROM haproxy:2.8.1-bullseye

USER root

RUN mkdir /tmp/haproxy
COPY haproxy.cfg /usr/local/etc/haproxy/haproxy.cfg

COPY dataplaneapi.yaml /etc/haproxy/dataplaneapi.yaml
COPY dataplaneapi /usr/local/bin/dataplaneapi
