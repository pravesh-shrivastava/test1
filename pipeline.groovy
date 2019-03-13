node {
	stage 'Run JMeter Test'
	java -jar D:\apache-jmeter-5.1\bin\ApacheJMeter.jar -n -t D:\JMeterPractice\TC003.jmx -l test1.jtl
}
