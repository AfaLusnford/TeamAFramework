     #!/bin/sh  (for mac only shell script)
    mvn test -DxmlFile=smoke-test.xml -Dbrowser=chrome
    mvn test -DxmlFile=smoke-test.xml -Dbrowser=firefox
    mvn test -DxmlFile=smoke-test.xml -Dbrowser=edge