package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class AwsCdkAppServiceStk extends Stack {
    public AwsCdkAppServiceStk(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsCdkAppServiceStk(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

    }
}
