# 项目介绍

> [![](https://jitpack.io/v/948655206/XuiDemo.svg)](https://jitpack.io/#948655206/XuiDemo)
>
> - fork了`xui`项目，对该项目进行更符合我的需求的更改，
> - 目的是加强自己的学习，方便工作，也加强自己对`gradle`的使用，增加自己开源的经验
> - 后续想慢慢完善该库，变成一个总和库

# 使用说明

> 1. 在`gradle.properties`中添加
>
>    ```groovy
>    # 表示针对主工程中使用到的三方库，也会自动执行AndroidX的替换过程。
>    android.enableJetifier=true
>    ```
>
> 2. `settings.gradle`中
>
>    ```groovy
>    dependencyResolutionManagement {
>    	...
>        repositories {
>    		...
>            maven { url 'https://jitpack.io' }
>        }
>    }
>    ```
>
> 3. 在`build.gradle（Module:app）`中添加
>
>    ```groovy
>        dependencies {
>            implementation 'com.github.948655206:XuiDemo:1.0.8'
>        }
>    ```