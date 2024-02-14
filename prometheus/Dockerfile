FROM ubuntu:latest

COPY ./prometheus-2.49.1.linux-amd64 /app

WORKDIR /app

RUN ["apt-get","update"]

CMD ["./prometheus"]