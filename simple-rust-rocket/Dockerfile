from frolvlad/alpine-glibc

EXPOSE 8070

## Add nice to haves
RUN apk add nano
RUN apk add bash
RUN apk add curl

RUN mkdir /opt/

COPY target/release/simple-rust-rocket  /opt/
COPY Rocket.toml   /opt/
WORKDIR /opt

CMD bash -c "./simple-rust-rocket"



