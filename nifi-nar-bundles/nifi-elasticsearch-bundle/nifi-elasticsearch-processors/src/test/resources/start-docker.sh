docker pull elasticsearch:2.1.0
docker pull sameersbn/squid:3.5.27-2
echo docker run --name ES_NIFI_01 --network $8 --ip $5 -v $7/es1.yml:/usr/share/elasticsearch/config/elasticsearch.yml  -v es_nifi_01:/usr/share/elasticsearch/data -d -p $1:9200 -p "${10}":9300 elasticsearch:2.1.0  -Des.network.bind_host=$5 -Des.network.publish_host=$5 -Des.discovery.zen.ping.unicast.hosts=$9
echo docker run --name ES_NIFI_02 --network $8 --ip $6 -v $7/es2.yml:/usr/share/elasticsearch/config/elasticsearch.yml  -v es_nifi_02:/usr/share/elasticsearch/data -d -p $2:9200 -p "${11}":9300 elasticsearch:2.1.0  -Des.network.bind_host=$6 -Des.network.publish_host=$6 -Des.discovery.zen.ping.unicast.hosts=$9
docker run --name ES_NIFI_01 --network $8 --ip $5 -v $7/es1.yml:/usr/share/elasticsearch/config/elasticsearch.yml  -v es_nifi_01:/usr/share/elasticsearch/data -d -p $1:9200 -p "${10}":9300 elasticsearch:2.1.0  -Des.network.bind_host=$5 -Des.network.publish_host=$5 -Des.discovery.zen.ping.unicast.hosts=$9
docker run --name ES_NIFI_02 --network $8 --ip $6 -v $7/es2.yml:/usr/share/elasticsearch/config/elasticsearch.yml  -v es_nifi_02:/usr/share/elasticsearch/data -d -p $2:9200 -p "${11}":9300 elasticsearch:2.1.0  -Des.network.bind_host=$6 -Des.network.publish_host=$6 -Des.discovery.zen.ping.unicast.hosts=$9
docker run --name SQUID_NIFI -d --restart=always --publish $3:3228 --volume $7/squid.conf:/etc/squid/squid.conf  --volume /srv/docker/squid/cache:/var/spool/squid --network=$8 sameersbn/squid:3.5.27-2
docker run --name SQUID_NIFI_AUTH -d --restart=always --publish $4:3328 --volume $7/squid-auth.conf:/etc/squid/squid.conf  --volume /srv/docker/squid/cache:/var/spool/squid --network=$8 sameersbn/squid:3.5.27-2
