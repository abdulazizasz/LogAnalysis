# LogAnalysis

Using Hadoop to analyze the access_log.

1- mvn clean install

2. hadoop jar LogAnalysisFunctions.jar AddressCount access_log.txt output /assets/img/home-logo.png

3. hadoop jar LogAnalysisFunctions.jar IPCount access_log.txt output2 10.153.239.5

3. hadoop jar LogAnalysisFunctions.jar AddressMax access_log.txt output1

4. hadoop jar LogAnalysisFunctions.jar IPMax access_log.txt output3  
