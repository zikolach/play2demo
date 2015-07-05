Update JDK
----------

```
cd $OPENSHIFT_DATA_DIR
wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u5-b13/jdk-8u5-linux-x64.tar.gz
tar -zxf jdk-8u5-linux-x64.tar.gz
export PATH=$OPENSHIFT_DATA_DIR/jdk1.8.0_05/bin:$PATH
export JAVA_HOME="$OPENSHIFT_DATA_DIR/jdk/jdk1.8.0_05"
```

Add to .openshift/action_hooks/start

```
export JAVA_HOME="$OPENSHIFT_DATA_DIR/jdk/jdk1.8.0_05"
export PATH=$JDK8_PATH:$PATH
```
