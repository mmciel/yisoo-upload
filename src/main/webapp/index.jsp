<%--
  Created by IntelliJ IDEA.
  User: mmciel
  Date: 2019/8/8
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YiSoo</title>
    <!--    引入zui-->
    <link rel="stylesheet" href="${APP_PATH }/css/zui.min.css">
    <!--	引入字体-->
    <link href="https://fonts.googleapis.com/css?family=Oxygen:400,700|Arimo:400,700" rel="stylesheet">
    <!--	主页样式-->
    <link rel="stylesheet" href="${APP_PATH }/css/home.css">
    <!--	js动画加载-->
    <script src="https://unpkg.com/scrollreveal@4.0.0/dist/scrollreveal.min.js"></script>
    <!--    引入buttons -->
    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">
    <!-- 	自定义样式 -->
    <link href="${APP_PATH}/css/style.css" rel="stylesheet">
</head>
<body class="is-boxed has-animations">
<div class="body-wrap boxed-container">
    <!-- 头部导航条 -->
    <header class="site-header">
        <div class="container">
            <nav class="navbar-fixed navbar " role="navigation">
                <div class="container-fluid">
                    <!-- 导航头部 -->
                    <div class="navbar-header">
                        <!-- 移动设备上的导航切换按钮 -->
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse-example">
                            <span class="sr-only">切换导航</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!-- logo -->
                        <a class="navbar-brand navbar-brand-text" href="#">YISOO</a>
                    </div>
                    <!-- 导航项目 -->
                    <div class="collapse navbar-collapse navbar-collapse-example">
                        <!-- 一般导航项目 -->
                        <ul class="nav navbar-nav nav-secondary">
                            <li class="active"><a href="#">主页</a></li>
                            <li><a href="your/nice/url">文件采集</a></li>
                            <li><a href="./air.jsp">文件空投</a></li>
                            <li><a href="your/nice/url">更新</a></li>
                            <li><a href="your/nice/url">开源</a></li>
                            <li><a href="your/nice/url">关于</a></li>
                        </ul>
                        <!-- 右侧的导航项目 -->
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="./login.jsp"
                            class="button button-glow button-border button-rounded button-highlight"
                            >登录·注册</a></li>
                        </ul>
                    </div><!-- END .navbar-collapse -->
                </div>
            </nav>
        </div>
    </header>
    <!-- END头部导航条  -->
    <main>
        <section class="hero">
            <div class="hero-left-decoration is-revealing">
            </div>
            <div class="hero-right-decoration is-revealing">

            </div>

            <div class="container">
                <div class="hero-inner">
                    <div class="hero-copy">
                        <h1 class="hero-title mt-0 is-revealing">YiSoo云文件服务</h1>
                        <p class="hero-paragraph is-revealing">
							在线文件采集、在线文件处理、在线文件分发、文件打包下载
                        </p>
                        <p class="hero-cta mb-0 is-revealing">
                            <a class="button button-primary button-shadow" href="#">现在开始</a>
                        </p>
                    </div>
                    <div class="hero-illustration">
                    </div>
                </div>
            </div>
        </section>

        <section class="clients section">
            <div class="container">
                <div class="clients-inner section-inner has-top-divider">
                    <div class="container-sm">
                        <ul class="list-reset mb-0">
                            <li class="is-revealing">
                                <img src="${APP_PATH }/img/home/facebook-logo.svg" alt="Facebook logo">
                            </li>
                            <li class="is-revealing">
                                <img src="${APP_PATH }/img/home/tinder-logo.svg" alt="Tinder logo">
                            </li>
                            <li class="is-revealing">
                                <img src="${APP_PATH }/img/home/airbnb-logo.svg" alt="Airbnb logo">
                            </li>
                            <li class="is-revealing">
                                <img src="${APP_PATH }/img/home/microsoft-logo.svg" alt="Microsoft logo">
                            </li>
                            <li class="is-revealing">
                                <img src="${APP_PATH }/img/home/hubspot-logo.svg" alt="Hubspot logo">
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>

        <section class="features section text-center">
            <div class="container">
                <div class="features-inner section-inner has-top-divider">
                    <div class="features-header text-center">
                        <div class="container-sm">
                            <h2 class="section-title mt-0">YiSoo云文件</h2>
                            <p class="section-paragraph mb-0">致力于解决高校文件收集与分发的难题</p>
                        </div>
                    </div>
                    <div class="features-wrap">
                        <div class="feature is-revealing">
                            <div class="feature-inner">
                                <div class="feature-icon">
                                    <img src="${APP_PATH }/img/home/feature-icon-01.svg" alt="Feature 01">
                                </div>
                                <h4 class="feature-title">文件采集</h4>
                                <p class="text-sm">管理员创建采集项目，分享链接，用户一键提交文件</p>
                            </div>
                        </div>
                        <div class="feature is-revealing">
                            <div class="feature-inner">
                                <div class="feature-icon">
                                    <img src="${APP_PATH }/img/home/feature-icon-02.svg" alt="Feature 02">
                                </div>
                                <h4 class="feature-title">文件处理</h4>
                                <p class="text-sm">文件提交监控、批量重命名、文件分发、打包下载</p>
                            </div>
                        </div>
                        <div class="feature is-revealing">
                            <div class="feature-inner">
                                <div class="feature-icon">
                                    <img src="${APP_PATH }/img/home/feature-icon-03.svg" alt="Feature 03">
                                </div>
                                <h4 class="feature-title">文件空投</h4>
                                <p class="text-sm">无需注册账号，随时随地利用YiSoo存取文件</p>
                            </div>
                        </div>
                        <div class="feature is-revealing">
                            <div class="feature-inner">
                                <div class="feature-icon">
                                    <img src="${APP_PATH }/img/home/feature-icon-04.svg" alt="Feature 04">
                                </div>
                                <h4 class="feature-title">敬请期待</h4>
                                <p class="text-sm">更多激动人心的功能正在开发中...</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="features-tabs section">
            <div class="container">
                <div class="features-tabs-inner section-inner has-top-divider">
                    <div class="tabs-container">
                        <ul class="tabs-links">
                            <li class="is-revealing">
                                <a href="#tab-1" class="tab-link is-active">
                                    <img src="${APP_PATH }/img/home/tabs-icon-01.svg" alt="Tabs icon 01">
                                    <span class="h4 m-0">创建采集项目</span>
                                </a>
                            </li>
                            <li class="is-revealing">
                                <a href="#tab-2" class="tab-link">
                                    <img src="${APP_PATH }/img/home/tabs-icon-02.svg" alt="Tabs icon 02">
                                    <span class="h4 m-0">分享并启动项目</span>
                                </a>
                            </li>
                            <li class="is-revealing">
                                <a href="#tab-3" class="tab-link">
                                    <img src="${APP_PATH }/img/home/tabs-icon-03.svg" alt="Tabs icon 03">
                                    <span class="h4 m-0">在线处理并保存</span>
                                </a>
                            </li>
                        </ul>
                        <div class="tabs-content">
                            <div id="tab-1" class="tab-panel is-active">
                                <h2>创建项目</h2>
                                <p>用户首次注册账号并登陆到控制台</p>
                                <p class="mb-0">创建一个采集项目，可选的导入名单，完成一些基础配置。</p>
                            </div>
                            <div id="tab-2" class="tab-panel">
                                <h2>发布项目</h2>
                                <p>发布项目，并分享项目链接到其他人。</p>
                                <p class="mb-0">控制台可监控当前提交状况。</p>
                            </div>
                            <div id="tab-3" class="tab-panel">
                                <h2>文件处理</h2>
                                <p>可完成自动重命名，必要的文件校验，文件对比。</p>
                                <p class="mb-0">可把收集的文件进行文件分发，可以打包下载，可以在线存储。</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="testimonials section">
            <div class="container">
                <div class="testimonials-inner section-inner">
                    <div class="testimonials-header text-center text-light">
                        <h2 class="section-title mt-0">文件空投</h2>
                    </div>
                    <div class="testimonials-wrap">
                        <div class="testimonial text-sm is-revealing">
                            <div class="testimonial-inner">
                                <div class="testimonial-main">
                                    <div class="testimonial-body">
                                        <p>随时随地分享文件</p>
                                    </div>
                                </div>
                                <div class="testimonial-footer">
                                    <div class="testimonial-name"><a href="#">@mmciel</a></div>
                                </div>
                            </div>
                        </div>
                        <div class="testimonial text-sm is-revealing">
                            <div class="testimonial-inner">
                                <div class="testimonial-main">
                                    <div class="testimonial-body">
                                        <p>分享码保证文件的安全性</p>
                                    </div>
                                </div>
                                <div class="testimonial-footer">
                                    <div class="testimonial-name"><a href="#">@mmciel</a></div>
                                </div>
                            </div>
                        </div>
                        <div class="testimonial text-sm is-revealing">
                            <div class="testimonial-inner">
                                <div class="testimonial-main">
                                    <div class="testimonial-body">
                                        <p>无需注册账号</p>
                                    </div>
                                </div>
                                <div class="testimonial-footer">
                                    <div class="testimonial-name"><a href="#">@mmciel</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="pricing section">
            <div class="container">
                <div class="pricing-inner section-inner">
                    <h2 class="section-title mt-0 text-center">云文件功能增强</h2>
                    <div>
                        <div class="pricing-tables-wrap">
                            <div class="pricing-table is-revealing">
                                <div class="pricing-table-inner">
                                    <div class="pricing-table-main">
                                        <div class="pricing-table-header mb-24 pb-24">
                                            <div class="pricing-table-title h4 mt-0 mb-16">标准版</div>
                                            <div class="pricing-table-price"><span class="pricing-table-price-currency">￥</span><span
                                                    class="pricing-table-price-amount h1">0</span>/月
                                            </div>
                                        </div>
                                        <ul class="pricing-table-features list-reset text-xs">
                                            <li>
                                                <span>1G的云文件存储</span>
                                            </li>
                                            <li>
                                                <span>1M的带宽</span>
                                            </li>
                                            <li>
                                                <span>采集项目小于10个</span>
                                            </li>
                                            <li>
                                                <span>在线处理受限</span>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="pricing-table-cta">
                                        <a class="button button-secondary button-shadow button-block" href="#">捐赠</a>
                                    </div>
                                </div>
                            </div>
                            <div class="pricing-table is-revealing">
                                <div class="pricing-table-inner">
                                    <div class="pricing-table-main">
                                        <div class="pricing-table-header mb-24 pb-24">
                                            <div class="pricing-table-title h4 mt-0 mb-16">增强版</div>
                                            <div class="pricing-table-price"><span class="pricing-table-price-currency">￥</span><span
                                                    class="pricing-table-price-amount h1">好多好多钱</span>/月
                                            </div>
                                        </div>
                                        <ul class="pricing-table-features list-reset text-xs">
                                            <li>
                                                <span>存储空间不限</span>
                                            </li>
                                            <li>
                                                <span>速度不限</span>
                                            </li>
                                            <li>
                                                <span>采集项目个数不限</span>
                                            </li>
                                            <li>
                                                <span>全部的在线处理功能</span>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="pricing-table-cta">
                                        <a class="button button-primary button-shadow button-block" href="#">开通</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="pricing-faqs container-sm is-revealing">
                        <h4 class="mt-40 mb-32">FAQs</h4>
                        <ul class="accordion">
                            <li>
                                <div class="accordion-title">
                                    <span>用户需要注册账号吗？</span>
                                    <div class="accordion-icon"></div>
                                </div>
                                <div class="accordion-body">
                                    <p>不创建采集文件项目的用户无需注册账户，点击分享链接直接提交文件即可。</p>
                                </div>
                            </li>
                            <li>
                                <div class="accordion-title">
                                    <span>空投文件功能由数量限制吗？</span>
                                    <div class="accordion-icon"></div>
                                </div>
                                <div class="accordion-body">
                                    <p>没有数量限制，但是由于服务器压力，会定期清除冗余文件</p>
                                </div>
                            </li>
                            <li>
                                <div class="accordion-title">
                                    <span>文件处理功能离线使用吗?</span>
                                    <div class="accordion-icon"></div>
                                </div>
                                <div class="accordion-body">
                                    <p>处理逻辑位于服务器端，无法离线使用。</p>
                                </div>
                            </li>
                            <li>
                                <div class="accordion-title">
                                    <span>为什么打包下载那么慢？</span>
                                    <div class="accordion-icon"></div>
                                </div>
                                <div class="accordion-body">
                                    <p>因为服务器带宽只有1M，目前还没有办法解决。</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>

        <section class="cta section">
            <div class="container">
                <div class="cta-inner section-inner is-revealing">
                    <h3 class="section-title mt-0">了解更多？</h3>
                    <div class="cta-cta">
                        <a class="button button-primary button-shadow" href="#">GitHub项目托管</a>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <footer class="site-footer">
        <div class="container">
            <div class="site-footer-inner">
                <div class="brand footer-brand">
                    <a href="#">
                        <img src="${APP_PATH }/img/home/logo.svg" alt="Blue logo">
                    </a>
                </div>
                <ul class="footer-links list-reset">
                    <li>
                        <a href="#">Contact</a>
                    </li>
                    <li>
                        <a href="#">About us</a>
                    </li>
                    <li>
                        <a href="#">FAQ's</a>
                    </li>
                    <li>
                        <a href="#">Support</a>
                    </li>
                </ul>
                <ul class="footer-social-links list-reset">
                    <li>
                        <a href="#">
                            <span class="screen-reader-text">Facebook</span>
                            <svg width="16" height="16" xmlns="http://www.w3.org/2000/svg">
                                <path d="M6.023 16L6 9H3V6h3V4c0-2.7 1.672-4 4.08-4 1.153 0 2.144.086 2.433.124v2.821h-1.67c-1.31 0-1.563.623-1.563 1.536V6H13l-1 3H9.28v7H6.023z"
                                      fill="#FFF"/>
                            </svg>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="screen-reader-text">Twitter</span>
                            <svg width="16" height="16" xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 3c-.6.3-1.2.4-1.9.5.7-.4 1.2-1 1.4-1.8-.6.4-1.3.6-2.1.8-.6-.6-1.5-1-2.4-1-1.7 0-3.2 1.5-3.2 3.3 0 .3 0 .5.1.7-2.7-.1-5.2-1.4-6.8-3.4-.3.5-.4 1-.4 1.7 0 1.1.6 2.1 1.5 2.7-.5 0-1-.2-1.5-.4C.7 7.7 1.8 9 3.3 9.3c-.3.1-.6.1-.9.1-.2 0-.4 0-.6-.1.4 1.3 1.6 2.3 3.1 2.3-1.1.9-2.5 1.4-4.1 1.4H0c1.5.9 3.2 1.5 5 1.5 6 0 9.3-5 9.3-9.3v-.4C15 4.3 15.6 3.7 16 3z"
                                      fill="#FFF"/>
                            </svg>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="screen-reader-text">Google</span>
                            <svg width="16" height="16" xmlns="http://www.w3.org/2000/svg">
                                <path d="M7.9 7v2.4H12c-.2 1-1.2 3-4 3-2.4 0-4.3-2-4.3-4.4 0-2.4 2-4.4 4.3-4.4 1.4 0 2.3.6 2.8 1.1l1.9-1.8C11.5 1.7 9.9 1 8 1 4.1 1 1 4.1 1 8s3.1 7 7 7c4 0 6.7-2.8 6.7-6.8 0-.5 0-.8-.1-1.2H7.9z"
                                      fill="#FFF"/>
                            </svg>
                        </a>
                    </li>
                </ul>
                <div class="footer-copyright">&copy; 2019 YiSoo, test project <a
                        href="#" target="_blank" title="mmciel"> mmciel</a> - from <a
                        href="#" title="YiSoo" target="_blank"> YiSoo</a></div>
            </div>
        </div>
    </footer>
</div>


<!--    引入jQuery支持-->
<script src="${APP_PATH }/js/jquery.min.js"></script>
<!--    引入zui-->
<script src="${APP_PATH }/js/zui.min.js"></script>
<!--    引入主页必要js -->
<script src="${APP_PATH }/js/home.js"></script>

</body>
</html>
