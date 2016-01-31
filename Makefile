DEPLOY_DIR='/var/lib/tomcat-7-test/webapps/servidor'


all: build deploy

build:
	mvn package

deploy:
	rm -rfv $(DEPLOY_DIR)
	cp -rfv target/web-1.0-SNAPSHOT $(DEPLOY_DIR)

clean:
	mvn clean
	rm -rfv $(DEPLOY_DIR)
