package com.oneentropy;

import com.oneentropy.common.Constants;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = Constants.GENERATE_SEQUENCE_PDF, defaultPhase = LifecyclePhase.COMPILE)
public class SequenceGeneratorPlugin {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject mavenProject;




}
