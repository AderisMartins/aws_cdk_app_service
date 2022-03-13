package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class AwsCdkAppServiceStack extends Stack {
    public AwsCdkAppServiceStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsCdkAppServiceStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

    }
}
