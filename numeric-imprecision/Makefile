APP=secdim.lab.java

all: build

test:
	docker build --target build --build-arg GRADLETASK=test --rm .

securitytest:
	docker build --target build --build-arg GRADLETASK=securitytest --rm .

build:
	docker build --rm --tag=$(APP) .

run:
	docker run -i -t --rm $(APP)

clean:
	docker image rm $(APP)
	docker system prune
	docker image prune -f

.PHONY: all test securitytest clean
