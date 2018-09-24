#Steps:

#Pre condition:
Better if port 9999 is free, as winium default run on 9999

To kill process in window
netstat -ano | findstr :9999
taskkill /PID 7024 /F        	7024: is task associated with 9999
taskkill //PID typeyour_task_id_here //F 				 This will do forcefully


#Steps:
1. Download and unzip Winium Desktop Server 
Winium.Desktop.Driver.zip  | https://github.com/2gis/Winium.Desktop/releases
Winium.Desktop.Driver.exe
2. Get jars from maven | http://mvnrepository.com/artifact/com.github.2gis.winium/winium-elements-desktop
3. Download Selenium, TestNG etc if required


#How to run
1. Double click Winium.Desktop.Driver.exe
2. Msg will appear "Starting Windows Desktop Driver on port 9999"
3. Now execute test cases


#Note
foll exception comes if exe has not been started properly
java.net.ConnectException: Failed to connect to localhost/0:0:0:0:0:0:0:1:9999

