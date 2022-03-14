package com.myorg;

import software.amazon.awscdk.core.App;

public class AwsCdkAppServiceApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStk vpcStk = new VpcStk(app, "Vpc");

        ClusterStk clusterStk =  new ClusterStk(app, "Cluster", vpcStk.getVpc());
        clusterStk.addDependency(vpcStk);

        Service01Stk service01Stk = new Service01Stk(app, "Service1", clusterStk.getCluster());
        service01Stk.addDependency(clusterStk);

        app.synth();
    }
}

