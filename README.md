----- Appium Setup -----


1. Download and install Java (JDK) and set a path of JDK and bin folder

Environment setup of Java ---->
Go to this PC and right click >> "Advanced system settings" >> "Environment Variables" >> New (System Variables & User Variables) >> 

Variable name: JAVA_HOME   
Variable value: JDK path (C:\Program Files\Java\jdk1.8.0_202)
click "OK"

Find variable's "Path" and select & click "Edit" then "New" and paste "bin" path (C:\Program Files\Java\jdk1.8.0_202\bin)

To make sure that the system can recognize the Java that is installed, go to the command prompt and type "java –version".
This should return the latest version of the JDK installed in the system.

2. Download and install Node.js (LTS) and set a path of nodejs and bin folder

Environment setup of Nodejs ---->
Go to this PC and right click >> "Advanced system settings" >> "Environment Variables" >> New (System Variables & User Variables) >> 

Variable name: NODE_HOME   
Variable value: Nodejs path (C:\Program Files\nodejs)
click "OK"

Find variable's "Path" and select & click "Edit" then "New" and paste "bin" path (C:\Program Files\nodejs\node_modules\npm\bin)

//3. Install Appium

Run cmd: npm install -g appium (install)
Run cmd: appium (check successfully installed?)

4. Download and install Android studio for SDK and set up SDK & SDK's platform-tools and tools 

Environment setup of Android ---->
Go to this PC and right click >> "Advanced system settings" >> "Environment Variables" >> New (System Variables & User Variables) >> 

Variable name: ANDRIOD_HOME   
Variable value: JDK path (C:\Users\Asus\AppData\Local\Android\Sdk) [find it from android studio]
click "OK"

Find variable's "Path" and select & click "Edit" then "New" and paste "platform-tools" path (C:\Users\Asus\AppData\Local\Android\Sdk\platform-tools)
Find variable's "Path" and select & click "Edit" then "New" and paste "tools" path (C:\Users\Asus\AppData\Local\Android\Sdk\tools)

Run cmd: adb (check successfully setup?)

5. Download and install "Appium Studio" & "Appium GUI" (From Github)

 
* connect your mobile with pc ("must be do usb debugging" enable & ["Disable permission monitoring" enable] from your mobile)
* Run cmd: adb devices (find UDID)
* For Package and activity name 
--> Run cmd: adb shell >> dumpsys window | grep -E "mCurrentFocus|mFocusedApp" [Search Google "mfocus adb"]

* Search "Pointer Location" from your mobile for "TouchAction" point

 ***Session Not created exception [Original error: The instrumentation process cannot be initialized]

Run cmd: adb uninstall io.appium.settings

adb uninstall io.appium.uiautomator2.server

adb uninstall io.appium.uiautomator2.server.test
