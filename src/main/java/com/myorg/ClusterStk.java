package com.myorg;

import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ecs.Cluster;
import software.constructs.Construct;

public class ClusterStk extends Stack {
    private Cluster cluster;
    public ClusterStk(final Construct scope, final String id, Vpc vpc) {
        this(scope, id, null, vpc);
    }

    public ClusterStk(final Construct scope, final String id, final StackProps props, Vpc vpc) {
        super(scope, id, props);

        cluster = Cluster.Builder.create(this, id)
                    .clusterName("cluster1")
                    .vpc(vpc)
                .build();
    }

    public Cluster getCluster() {
        return cluster;
    }
}
