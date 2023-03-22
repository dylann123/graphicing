@rem manifest.txt contents:

@rem Main-Class: MainClassName

@rem You dont need the package in the manifest

@echo compiling classes for java 1.8 
@"C:\Program Files (x86)\jGRASP\bundled\java\bin\javac.exe" -source 1.8 -target 1.8 *.java
@echo building jar file using created classes at application.jar
@"C:\Program Files (x86)\jGRASP\bundled\java\bin\jar.exe" cfmv application.jar manifest.txt *.class
@echo removing all created class Files
@del *.class
@echo we ball
@pause