node {
	stage 'Run JMeter Test'
	bat D:\apache-jmeter-5.1\bin\jmeter.jar -n -t D:\JMeterPractice\TC003.jmx -l test1.jtl
}
