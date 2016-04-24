<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>围城博客</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <!--[if lte IE 8]><script src="resources/css/ie/html5shiv.js"></script><![endif]-->
    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/jquery.scrollzer.min.js"></script>
    <script src="resources/js/jquery.scrolly.min.js"></script>
    <script src="resources/js/skel.min.js"></script>
    <script src="resources/js/skel-layers.min.js"></script>
    <script src="resources/js/init.js"></script>
    <noscript>
        <link rel="stylesheet" href="resources/css/skel.css" />
        <link rel="stylesheet" href="resources/css/style.css" />
        <link rel="stylesheet" href="resources/css/style-xlarge.css" />
    </noscript>
    <!--[if lte IE 8]><link rel="stylesheet" href="resources/css/ie/v8.css" /><![endif]-->
</head>
<body>
<div id="wrapper">

    <!-- Header -->
    <section id="header" class="skel-layers-fixed">
        <header>
            <span class="image avatar"><img src="resources/images/123.jpg" alt="" /></span>
            <h1 id="logo"><a href="#">围城丶</a></h1>
            <p>迷恋游戏与技术<br />
                如果闲下来不如我们研究点什么吧</p>
        </header>
        <nav id="nav">
            <ul>
                <li><a href="#one" class="active">了解下我</a></li>
                <li><a href="#two">我的文档</a></li>
                <li><a href="#three">游戏空间</a></li>
                <li><a href="#four">留言板</a></li>
            </ul>
        </nav>
        <footer>
            <ul class="icons">
                <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
                <li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
                <li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
            </ul>
        </footer>
    </section>

    <!-- Main -->
    <div id="main">

        <!-- One -->
        <section id="one">
            <div class="container">
                <header class="major">
                    <h2>低调</h2>
                    <p>围城丶是一个耐得住寂寞的人<br />
                       因为只要闲下来，他就会做一个拯救世界的梦并付诸行动</p>
                </header>
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;围城丶他起于开封，流落过上海，暂居于北京。时至今日，他等级26，双持DELL笔记本，身背仿耐克背包（持久为0），常出没于各种写字楼。他热爱游戏，更热爱游戏开发技术，但是择业不慎，入了咖啡派，目前主攻web服务端开发。<br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;围城丶他志向远大，正义与和平是他的信条。如果你愤青，喜爱游戏与技术，那么交个朋友吧:)</p>
            </div>
        </section>

        <!-- Two -->
        <section id="two">
            <div class="container">
                <h3>围城文库</h3>
                <p>我相信不久的将来，会有的</p>
                <ul class="feature-icons">
                    <li class="fa-code">代码大全</li>
                    <li class="fa-cubes">高人高见</li>
                    <li class="fa-book">读书体会</li>
                    <li class="fa-coffee">闲情雅致</li>
                    <li class="fa-bolt">灵光一现</li>
                    <li class="fa-users">我的组织</li>
                </ul>
            </div>
        </section>
        <!-- Three -->
        <section id="three">
            <div class="container">
                <h3>游戏空间</h3>
                <p>这TM才是重点，谁TM愿意看这个破博客，真当自己是棵葱了，小人不才，自己研究并搭建了热血传奇与传奇世界的免费公益游戏服务器供大家娱乐与交友,试试按下 Ctrl+A</p>
                <div class="features">
                    <article>
                        <a href="#" class="image"><img src="resources/images/rxcq.jpg" alt="" /></a>
                        <div class="inner">
                            <h4>热血传奇</h4>
                            <p>这款游戏陪着我走过了青春岁月，那扇门打开的那一刹那，就像与梦中情人相见般甜蜜。</p>
                            <p><a href="http://pan.baidu.com" target="_blank"><font color="White">请点这里,密码：xxxx </font></a></p>
                        </div>
                    </article>
                    <article>
                        <a href="#" class="image"><img src="resources/images/cqsj.jpg" alt="" /></a>
                        <div class="inner">
                            <h4>传奇世界</h4>
                            <p>这款游戏坑了我100块钱，然而一个水漂都没有起，我就要自己搭建服务器玩个痛快。</p>
                            <p><a href="http://pan.baidu.com" target="_blank"><font color="White">请点这里,密码：xxxx </font></a></p>
                        </div>
                    </article>
                </div>
            </div>
        </section>

        <!-- Four -->
        <section id="four">
            <div class="container">
                <h3>给我留言</h3>
                <p>你想写啥就写啥吧，这里言论自由，但是本网站受美国法律保护哦。</p>
                <form method="post" action="#">
                    <div class="row uniform">
                        <div class="6u 12u(3)"><input type="text" name="name" id="name" placeholder="Name" /></div>
                        <div class="6u 12u(3)"><input type="email" name="email" id="email" placeholder="Email" /></div>
                    </div>
                    <div class="row uniform">
                        <div class="12u"><input type="text" name="subject" id="subject" placeholder="Subject" /></div>
                    </div>
                    <div class="row uniform">
                        <div class="12u"><textarea name="message" id="message" placeholder="Message" rows="6"></textarea></div>
                    </div>
                    <div class="row uniform">
                        <div class="12u">
                            <ul class="actions">
                                <li><input type="button" id="sendMsg" class="special" value="确定" /></li>
                                <li><input type="reset" value="重置" /></li>
                            </ul>
                        </div>
                    </div>
                </form>
            </div>
        </section>
    </div>


    <!-- Footer -->
    <section id="footer">
        <div class="container">
            <ul class="copyright">
                <li>&copy; Untitled. All rights reserved.</li><li>围城博客 - JavaWc</li>
                <li>Email:javawc@sina.com</li>
                <li>QQ群:345531458</li>
            </ul>
        </div>
    </section>

</div>
</body>
<script src="resources/js/jquery.views.index.js"></script>
</html>
