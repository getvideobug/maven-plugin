# videobug-maven-plugin

maven plugin for videobug for jvm projects

## Use

Add dependency in your `pom.xml`

```
        <dependency>
            <groupId>bug.video</groupId>
            <artifactId>maven-plugin</artifactId>
            <version>0.0.1</version>
        </dependency>

```

Execute target

`mvn package`

Run jar

`java -javaagent target/app.jar`
