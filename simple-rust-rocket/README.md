Installing RUST
===============
$ curl https://sh.rustup.rs -sSf | sh

Add RUST to path
================

Add line in ~/.bashrc
export PATH=$PATH:~/.cargo/bin

Update to nightly builds of RUST(required by rocket framework)
=============================================================
$ rustup default nightly
$ rustup update && cargo update

Build rocket webservice
=======================

$ cargo build --release

$ ./target/release/simple-rust-rocket

Testing backend
===============

$ curl localhost:8070/api/pi

Benchmarking
============
$ ab -k -c 1 -n 1000 localhost:8070/api/pi
