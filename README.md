# Gatling setup CI and Docker

This is repo running load test with gattling and generate reports. It does following things

 * Get Gatling Setup into your WORKSPACE or local directory

 * Take your config and simulations(scenario class) and runs load tests against it

 * Reports results with Jenkins Gatling plugin

 * Generate report in HTML. Default gatling

 * We can run it locally or on CI



# USAGE

 * Download this repo

 * Record your load test simulations and put your class in the 'user-files/simulations'

 * Running it locally

         sh gatling_local.sh {scala_class}

  Example:

         sh gatling_local.sh GoogleLoadTEST


This will set GATLING into current directory and run load test against your Scala class.

At the end you will see link to HTML report. Open it into browser and enjoy !!

 * Running it on CI

Same principal but it will do everything on Jenkins WORKSPACE. Get Jenkins Gatling plugin and configure report


# Docker

It's not a great idea to run Load Test in the Docker Container but many of people fancy about it so adding Docker file to run it.
