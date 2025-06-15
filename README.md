# MTDataFilesProvider

[![](https://jitpack.io/v/L-JINBIN/MTDataFilesProvider.svg)](https://jitpack.io/#L-JINBIN/MTDataFilesProvider)

为您自己开发的应用快速注入 MT 的文件提供器，无需 ROOT 即可在手机上管理此应用的私有目录文件。

## 使用方法

### ① 添加 jitpack.io 仓库地址

在项目根目录的 settings.gradle 文件中添加 jitpack.io 的地址：

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

有一些项目可能是在根目录的 build.gradle 文件中添加：

```groovy
allprojects {
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

### ② 添加 MTDataFilesProvider 依赖

在模块的 build.gradle 中添加依赖：

```groovy
dependencies {
    debugImplementation 'com.github.L-JINBIN:MTDataFilesProvider:v1.0.0'
}
```

这里 `debugImplementation` 表示仅在 debug 版中注入
MTDataFilesProvider，编译正式版后会自动去除，如果希望在正式版中也注入则改为 `implementation`

### ③ 在 MT 管理器中添加本地存储

- 下载安装 [MT 管理器](https://mt2.cn/download/)
- 进入主界面后打开侧拉栏，点击右上角的「添加本地存储菜单」
- 在新弹出的界面的侧拉栏中找到并选中你的应用，点击底部的「选择」
- 返回 MT 管理器，就会看到刚刚添加的本地存储，点击即可访问

具体步骤可参考 [MT 管理器 - 注入文件提供器](https://mt2.cn/guide/reverse/inject-documents-provider.html)
