package video.bug.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Add an argument to the jvm args when executing the project jar
 *
 * @author Parth Mudgal
 * @since 0.0.1
 */
@Mojo(name = "videobug", requiresDirectInvocation = true, threadSafe = true)
public class CommitMojo
        extends AbstractMojo {
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    public void execute() {
    }
}