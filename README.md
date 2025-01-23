Inorder to run elastic search. You need to install Elastic server on host machine or alternatively on docker.
Below is the docker compose for the same -
                version: '3'
                services:
                  elasticsearch:
                    image: elasticsearch:8.8.0
                    ports:
                      - 9200:9200
                      - 9300:9300
                    environment:
                      - discovery.type=single-node
                      - xpack.security.enabled=false
