#!/bin/sh
yum update && yum -y install epel-release && yum install python-pip && pip install shadowsocks && echo '{"server":"0.0.0.0","server_port":9007,"local_address":"127.0.0.1","local_port":1080,"password":"unblock","timeout":300,"method":"aes-256-cfb","fast_open":false}'