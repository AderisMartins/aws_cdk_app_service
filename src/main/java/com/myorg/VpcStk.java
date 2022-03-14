package com.myorg;

import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;

public class VpcStk extends Stack{
    private Vpc vpc;

    public VpcStk(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public VpcStk(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        vpc = Vpc.Builder.create(this, "Vpc1")
                .maxAzs(3)
                .natGateways(0)
                .build();
    }

    public Vpc getVpc() {
        return vpc;
    }
}
