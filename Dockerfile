# Start with a base image containing Java runtime
FROM  ubuntu_java11_git_mvn2

# Add Maintainer Info
LABEL maintainer="solmaz.oskouie@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

COPY ./target/bankcardmanagement-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR  /usr/app/

#expose these ports on the docker virtual network, you still need to use -p or -P to open/forward thses port on host
EXPOSE 6060 3306



CMD java -jar bankcardmanagement-0.0.1-SNAPSHOT.jar