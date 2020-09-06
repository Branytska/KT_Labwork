echo off
set path=C:\Program Files\Java\jdk-14.0.2\bin
set include=C:\Program Files\Java\jdk-14.0.2\include
set lib=C:\Program Files\Java\jdk-14.0.2\lib
set link=C:\Program Files\Java\jdk-14.0.2\bin
javac -version KT_lr1.java
java KT_lr1
javap -c KT_lr1 > 1.txt
javadoc KT_lr1.java -d 1
pause
