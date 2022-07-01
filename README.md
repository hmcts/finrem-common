## finrem-common

This is the common code library for financial remedy services. It currently contains:

- CCD domain objects

### Working local

In order to create a local library version and add it to your service as a dependency, run:

```shell
./gradlew publishToMavenLocal
```

and change the version to DEV-SNAPSHOT .

### in QA

When your changes are ready to be pushed and tested by a QA, tag your branch with the following patter:

nextVersion-RC-ticketNumber

e.g. consider the current version of the lib is 1.0.0

```shell
git tag 1.0.1-RC-DFR-1102

git push --tags
```

Then wait a few minutes for the git/jitpack build/release process to finish 
and update the version to the service you will put to test. 

### Release process

To release a lib version, after the PR has been approved and the service change tested and signed off, 
merge the changes to master on github, pull the changes on your local, and tag the lib again, now with a standard version

DISCUSS WITH THE TEAM AND/OR TECH LEAD WHAT VERSION NUMBER IS APPROPRIATE

In general x.x.Y should be minor bug fixes, x.Y.0 for non-breaking new features, 
and Y.0.0 for big breaking releases/refactors.

e.g.

```shell
git tag 1.0.1

git push --tags
```

Then once again, wait a few minutes for the git/jitpack build/release process to finish
and update the version to the service you will merge into master. 