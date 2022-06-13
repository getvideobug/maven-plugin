# videobug-maven-plugin

maven plugin for videobug for jvm projects

## Use

Add dependency in your `pom.xml`

```
        <dependency>
            <groupId>bug.video</groupId>
            <artifactId>maven-plugin</artifactId>
            <version>1.0.0</version>
        </dependency>

```

Execute target

`mvn package`

Run jar

`java -javaagent target/app.jar`
