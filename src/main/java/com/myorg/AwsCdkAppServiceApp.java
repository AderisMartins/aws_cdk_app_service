package com.myorg;

import software.amazon.awscdk.core.App;

public class AwsCdkAppServiceApp {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStk(app, "Vpc");

        app.synth();
    }
}

