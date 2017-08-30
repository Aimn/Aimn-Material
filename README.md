# Aimn-Material
这是Aimn的Material Design，喜欢请加星  
# 为什么要写这篇文章？  
作为一个中年开发者，每年还能以3~4个上线项目也不容易，踩的坑也够多的，于是想开源一部分能帮助到大家的东西避免大家采坑。  
# 为什么要采用material Desgin？  
虽然material已经提出快3年多了，但是不知道大家是否有这样的感觉，每做一个新的app，UI都会设计一套新的UI图，左右边距，用户交互都是新的，并且五花八门，说好看也不是很满意，反正萝卜青菜各有所爱，这都依照了UI自己的设计习惯了，特别对于小公司和新公司来说，自定义view或者高炫的控件是必不可少的，但是做多了app以后反而发现真正的研发并不是应该用在这些无聊的东西上面，比如我想要button点击起来很炫丽，我要绘制整个点击事件，何必花费整个时间了，既然google给出的button水波纹效果，何必有自己写，还不统一。你应该花费的时间是在一些技术难点上面，比如我研发的pdf，可以记录当前页面，可以搜索当前页面，可以在当前页面绘制涂鸦等技术难点上面，而花费在交互上的，如果google官方给出了，何必不用了。  
总而言之，如果UI不能制定一套通用且漂亮的规范，那每次都花费时间去修改，那我们不如采用google官方提出的material desgin，既符合美观，又提高了用户体验。  
# 这个开源项目有些什么？  
项目分为两个部分  
第一个部分，色彩和间距：  
根据Material Design官方文档提炼出来的颜色部分和常用间距，文件在colortemplate和dimens  
第二个部分，控件：  
首先框架是Navigation drawer和Navigation bottom组成的  
然后包括主流的Material Design控件  
Button，FloatingButton，CardView，Dialog，InputLayout，Pickers，Snack，Toolbar，Menus，Progress，Steppers，Switch等  
这个demo仅供参考了解认识Material规范，可以使用部分规范约束条件  
