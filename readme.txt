#Steps:

#Pre condition:
Better if port 9999 is free, as winium default run on 9999

To kill process in window
netstat -ano | findstr :9999
taskkill /PID 7024 /F        	7024: is task associated with 9999
taskkill //PID typeyour_task_id_here //F 				 This will do forcefully



#Steps:
1. Unzip Winium Desktop Server and run exe, it will take some time
Winium.Desktop.Driver.zip  | https://github.com/2gis/Winium.Desktop/releases
Winium.Desktop.Driver.exe

2. check http://localhost:9999/ once Winium is up and running

3. Get jars from maven | http://mvnrepository.com/artifact/com.github.2gis.winium/winium-elements-desktop

4. Download Selenium, TestNG etc if required





