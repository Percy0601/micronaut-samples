
// 在ubuntu 1904 中报错缺少库，安装以下组件
sudo apt-get install libz-dev

native-image --no-server -cp target/micronaut-sample-native-image-0.1.jar

