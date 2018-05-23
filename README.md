# AndroidCircleProgressBar
Android 环形进度条。

### 本应用的示例

![image](https://github.com/iWay7/AndroidCircleProgressBar/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
##### 类似这样，在布局文件中声明一个 CircleProgressBar 视图即可：
```
<site.iway.androidhelpers.CircleProgressBar
    android:id="@+id/progressBar"
    android:layout_width="200dp"
    android:layout_height="200dp"
    android:layout_gravity="center"
    app:circleDiameter="100dp"
    app:progress="10"
    app:progressBackColor="#EDD0BE"
    app:progressFrontColor="#E03636"
    app:progressWidth="15dp"
    app:startAngleOffset="0" />
```

##### 可配置的视图属性：
```
app:circleDiameter 圆环直径
app:progress 初始进度
app:progressBackColor 圆环背景色
app:progressFrontColor 圆环前景色
app:progressWidth 圆环宽度
app:startAngleOffset 进度起始角度
```

##### 可以通过以下代码更改进度：
```
CircleProgressBar progressBar = (CircleProgressBar) findViewById(R.id.progressBar);
progressBar.setProgress(30, true); // 第一个参数代表进度，第二个参数代表是否进行动画过渡
```
