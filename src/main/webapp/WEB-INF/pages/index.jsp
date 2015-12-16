<!doctype html>
<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>美团</title>
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<link href="favicon.ico" type="image/x-icon" rel="icon">
</head>
<body>
<div class="m_side_btns" id="m_side_btns">
	<a class="side_btn toTopBtn" href="javascript:;" id="returnToTop" style="display:none;">回 到顶 部</a>
	<%--<a class="side_btn surveyBtn" href="javascript:;">问 卷调 查</a>
	<a class="side_btn helpBtn" href="javascript:;">帮 助中 心</a>
	<a class="side_btn fbBtn" href="javascript:;">意 见反 馈</a>--%>
</div>
<!--顶部-->
<div class="g_header">
	<div class="topbg">
		<div class="wrap1200 clearFix">
			<ul class="hd_l fl">
				<li> <a class="collection" href="javascript:;">收藏美团</a> <a class="login" href="login.html">登录</a> <a class="register" href="register.html">注册</a>
					<div class="app_box fl">
						<a class="app" href="javascript:;">手机美团 <span class="phone"></span> <span class="arrow"></span> </a>
						<div class="app_pos">
							<a class="app_pos_one" href="javascript:;"> <p>免费下载美团手机版</p> <img src="images/app_down.png" alt=""> <span class="app_pos_r"></span> </a>
							<a href="javascript:;"> <p>免费下载美团手机版</p> <img src="images/app_down.png" alt=""> <span class="app_pos_r"></span> </a>
						</div>
					</div> </li>
			</ul>
			<a class="order fl" href="javascript:;">我的订单</a>
			<ul class="hd_r fr clearFix">
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text" href="javascript:;">我的美团 <span class="line_r"></span> <span class="arrow_r"></span> </a>
					</div>
					<ul class="admin_pos">
						<li> <a href="javascript:;">我的订单</a> <a href="javascript:;">我的评价</a> <a href="javascript:;">我的收藏</a> <a href="javascript:;">我的积分</a> <a href="javascript:;">抵用劵</a> <a href="javascript:;">美团余额</a> <a href="javascript:;">账户充值</a> <a href="javascript:;">账户设置</a> </li>
					</ul> </li>
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text" href="javascript:;">最近浏览 <span class="line_r"></span> <span class="arrow_r"></span> </a>
					</div>
					<div class="browse_pos">
						<div class="browse_pos_t">
							<a href="javascript:;"> <img src="images/l_hoom.png" alt=""> </a>
							<a class="tit" href="javascript:;">润光格林酒店大床入住1晚</a>
							<a class="money" href="javascript:;">￥138<b>219</b></a>
						</div>
						<a class="clear" href="javascript:;">清楚最近浏览记录</a>
					</div> </li>
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text cart" href="javascript:;">购物车<span> 0 </span>件 <span class="line_r"></span> <span class="arrow_r"></span> <span class="cart_r"></span> </a>
					</div>
					<div class="cart_pos">
						<p>暂时没有商品</p>
					</div> </li>
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text" href="javascript:;">联系客服 <span class="line_r"></span> <span class="arrow_r"></span> </a>
					</div>
					<ul class="admin_pos wid92">
						<li> <a href="javascript:;">申请退款</a> <a href="javascript:;">申请退换货</a> <a href="javascript:;">查看美团劵</a> <a href="javascript:;">换绑手机号</a> <a href="javascript:;">常见问题</a> </li>
					</ul> </li>
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text" href="javascript:;">我是商家 <span class="line_r"></span> <span class="arrow_r"></span> </a>
					</div>
					<ul class="admin_pos wid97">
						<li> <a href="javascript:;">登录商家中心</a> <a href="javascript:;">我想合作</a> <a href="javascript:;">商家营销平台</a> </li>
					</ul> </li>
				<li class="fl hd_r_list">
					<div class="text_limit">
						<a class="text" href="javascript:;">更多 <span class="arrow_r"></span> </a>
					</div>
					<ul class="admin_pos wid92">
						<li> <a href="javascript:;">手机版</a> <a href="javascript:;">邮件订阅</a> <a href="javascript:;">邀请好友</a> </li>
					</ul> </li>
			</ul>
		</div>
	</div>
	<div class="hd_line"></div>
	<div class="hd_ad wrap1200">
		<a href="javascript:;" alt=""> <img class="show" src="images/hd_ad2.jpg" alt=""> </a>
		<a href="javascript:;" alt=""> <img src="images/hd_ad1.jpg" alt=""> </a>
		<a href="javascript:;" alt=""> <img src="images/hd_ad3.jpg" alt=""> </a>
		<a class="ad_clear" href="javascript:;"></a>
		<div class="switch clearFix">
			<a class="active" href="javascript:;"></a>
			<a href="javascript:;"></a>
			<a href="javascript:;"></a>
		</div>
	</div>
	<div class="wrap1200 hd_cont clearFix">
		<div class="hd_cont_l fl clearFix">
			<a class="fl" href="javascript:;"> <h1>美团</h1> </a>
			<a class="fl city" href="javascript:;">北京<span>切换城市</span></a>
		</div>
		<div class="hd_cont_c fl clearFix">
			<input class="text fl" id="key" type="text" placeholder="请输入商品名称、地址等">
			<input class="submit fl" id="search" type="submit" value="搜索">
			<div class="tuan_pos">
				<a class="c_tuan" href="javascript:;">团购</a>
				<a class="c_Business" href="javascript:;">商家</a>
			</div>
			<ul class="clearFix">
				<li><a href="javascript:;">电影</a></li>
				<li><a href="javascript:;">自助餐</a></li>
				<li><a href="javascript:;">KTV</a></li>
				<li><a href="javascript:;">生日蛋糕</a></li>
				<li><a href="javascript:;">烤肉</a></li>
				<li><a href="javascript:;">烤鱼</a></li>
				<li><a href="javascript:;">按摩</a></li>
				<li><a href="javascript:;">汉丽轩</a></li>
				<li><a href="javascript:;">电影票</a></li>
				<li><a href="javascript:;">蛋糕</a></li>
			</ul>
		</div>
		<div class="hd_cont_r fr">
			<a href="javascript:;"></a>
		</div>
		<div class="hd_cont_b fl clearFix">
			<dl class="hd_cont_b_l fl clearFix">
				<dt>
					<a href="javascript:;">全部分类</a>
				</dt>
				<dd>
					<a href="index.html">首页</a>
				</dd>
				<dd>
					<a href="list.html">身边团购</a>
				</dd>
				<dd>
					<a href="list.html">身边外卖</a>
				</dd>
				<dd>
					<a href="list.html">今日新单</a>
				</dd>
				<dd>
					<a href="list.html">购物</a>
				</dd>
				<dd>
					<a href="list.html">商家点评</a>
				</dd>
				<dd>
					<a href="list.html">大牌街</a>
				</dd>
				<dd>
					<a class="buy" href="list.html">名店抢购</a>
				</dd>
			</dl>
			<ul class="hd_cont_b_r fl clearFix">
				<a class="fl" href="javascript:;">下载美团手机版</a>
			</ul>
		</div>
	</div>
</div>
<!--顶部结束-->
<div class="wrap1200">
	<div class="g_nav fl clearFix">
		<div class="snav fl">
			<div class="snav_item ">
				<dl class="unusual">
					<dt class="sort">
						<a href="javascript:;"> 美食 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 自助餐 </a>
						<a href="javascript:;"> 火锅 </a>
						<a href="javascript:;"> 烤肉 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 酒店 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 经济型酒店 </a>
						<a href="javascript:;"> 主题酒店 </a>
						<a href="javascript:;"> 豪华酒店 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
			</div>
			<div class="snav_item ">
				<dl class="snav_special">
					<dt class="sort">
						<a href="javascript:;"> 电影/在线选座 </a>
					</dt>
				</dl>
				<span class="more_pos"></span>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 休闲娱乐 </a>
					</dt>
					<dd>
						<a href="javascript:;"> KTV </a>
						<a href="javascript:;"> 足疗按摩 </a>
						<a href="javascript:;"> 水上世界 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 旅游 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 景点门票 </a>
						<a href="javascript:;"> 本地/周边游 </a>
						<a href="javascript:;"> 国内游 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
				<div class="m_pos">
					热门漂流
				</div>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 生活服务 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 婚纱摄影 </a>
						<a href="javascript:;"> 个性写真 </a>
						<a href="javascript:;"> 儿童摄影 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
				<div class="m_pos life_pos">
					品质婚纱照
				</div>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 购物 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 电器/数码 </a>
						<a href="javascript:;"> 女装 </a>
						<a href="javascript:;"> 男装 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
			</div>
			<div class="snav_item">
				<dl>
					<dt class="sort">
						<a href="javascript:;"> 丽人 </a>
					</dt>
					<dd>
						<a href="javascript:;"> 美发 </a>
						<a href="javascript:;"> 美容美体 </a>
						<a href="javascript:;"> 美甲 </a>
					</dd>
				</dl>
				<span class="more_pos"></span>
				<div class="m_pos">
					七夕送好礼
				</div>
			</div>
			<div class="snav_item ">
				<dl class="snav_particular">
					<dt class="sort">
						<a href="javascript:;"> 抽奖 </a>
					</dt>
				</dl>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">美食</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> <a href="javascript:;"> 代金券 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">酒店</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 经济型酒店 </a> <a href="javascript:;"> 豪华酒店 </a> <a href="javascript:;"> 公寓式酒店 </a> <a href="javascript:;"> 主题酒店 </a> <a href="javascript:;"> 度假酒店 </a> <a href="javascript:;"> 温泉酒店 </a> <a href="javascript:;"> 客栈 </a> <a href="javascript:;"> 青年旅舍 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">当前热映</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 捉妖记 </a> <a href="javascript:;"> 煎饼侠 </a> <a href="javascript:;"> 西游记之大圣归来 </a> <a href="javascript:;"> 命中注定 </a> <a href="javascript:;"> 小羊肖恩 </a> <a href="javascript:;"> 通灵之六世古宅 </a> <a href="javascript:;"> 谜城 </a> <a href="javascript:;"> 模仿游戏 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">休闲娱乐</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 足疗按摩 </a> <a href="javascript:;"> 温泉 </a> <a href="javascript:;"> 洗浴/汗蒸 </a> <a href="javascript:;"> 运动健身 </a> <a href="javascript:;"> 咖啡/酒吧 </a> <a href="javascript:;"> 桌游/电玩 </a> <a href="javascript:;"> 景点郊游 </a> <a href="javascript:;"> 主题公园/游乐园 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">旅游</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 景点门票 </a> <a href="javascript:;"> 跟团游 </a> <a href="javascript:;"> 自由行 </a> <a href="javascript:;"> 签证 </a> <a href="javascript:;"> 国内游 </a> <a href="javascript:;"> 桌游/电玩 </a> <a href="javascript:;"> 境外游 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">生活服务</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 婚纱摄影 </a> <a href="javascript:;"> 个性写真 </a> <a href="javascript:;"> 儿童摄影 </a> <a href="javascript:;"> 其他摄影 </a> <a href="javascript:;"> 照片冲印 </a> <a href="javascript:;"> 汽车服务 </a> <a href="javascript:;"> 体检保健 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">购物</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 女装 </a> <a href="javascript:;"> 男装 </a> <a href="javascript:;"> 内衣 </a> <a href="javascript:;"> 女士鞋包 </a> <a href="javascript:;"> 男士鞋包 </a> <a href="javascript:;"> 运动户外 </a> <a href="javascript:;"> 配饰手表 </a> </li>
				</ul>
			</div>
			<div class="snav_pos">
				<h3> <a href="javascript:;">美发</a> </h3>
				<ul>
					<li class="food"> <a href="javascript:;"> 美容美体 </a> <a href="javascript:;"> 美甲 </a> <a href="javascript:;"> 瑜伽/舞蹈 </a> <a href="javascript:;">个性写真</a> </li>
				</ul>
			</div>
			<div class="snav_pos"></div>
		</div>
		<div class="main fl">
			<div class="main_tp">
				<div class="main_tp_con">
					<h3 class="hot fl"> <i class="hot_icon"></i> <span class="">热门团购</span> </h3>
					<div class="hot_all clearFix">
						<ul class=" fl ">
							<li class="hot_all_item fl"> <a class="col_f76120" href="javascript:;">代金券</a> </li>
							<li class="hot_all_item fl"> <a class="col_f76120" href="javascript:;">电影</a> </li>
							<li class="hot_all_item fl"> <a class="col_f76120" href="javascript:;">经济型酒店</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">KTV</a> </li>
							<li class="hot_all_item fl"> <a class="col_f76120" href="javascript:;">火锅</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">烤肉</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">足底按摩</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">游泳/上水乐园</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">景点门票</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">本地/周边游</a> </li>
						</ul>
					</div>
				</div>
				<div class="main_tp_con" id="area_list_con">
					<h3 class="hot fl"> <i class="hot_address"></i> <span class="">全部区域</span> </h3>
					<div class="hot_all fl clearFix">
						<ul class="area_list clearFix fl ">
							<li class="hot_all_item fl"> <a href="javascript:;">朝阳区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">海淀区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">丰台区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">西城区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">东城区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">昌平区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">石景山</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">大兴区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">通州区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">顺义区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">朝阳区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">海淀区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">丰台区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">西城区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">东城区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">昌平区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">石景山</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">大兴区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">通州区</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">顺义区</a> </li>
						</ul>
					</div>
					<a class="even_more fr" href="javascript:;" id="more_btn">更多</a>
				</div>
				<div class="main_tp_con">
					<h3 class="hot fl"> <i class="hot_business"></i> <span class="">热门商圈</span> </h3>
					<div class="hot_all clearFix">
						<ul class=" fl ">
							<li class="hot_all_item fl"> <a href="javascript:;">代金券</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">电影</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">经济型酒店</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">KTV</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">火锅</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">烤肉</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">足底按摩</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">游泳/上水乐园</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">景点门票</a> </li>
							<li class="hot_all_item fl"> <a href="javascript:;">本地/周边游</a> </li>
						</ul>
					</div>
				</div>
			</div>
			<div class="main_bt_con">
				<div class="slide_wrapper" id="nav_slide">
					<div class="clearFix">
						<h2 class="week_chosen fl"> <i class="star"></i> <span>本周精选</span> </h2>
						<div class="btn fr" id="nav_btns">
							<span class="tb active"></span>
							<span class="tb"></span>
							<span class="tb"></span>
							<span class="tb"></span>
							<span class="tb"></span>
							<span class="tb"></span>
						</div>
					</div>
					<ul class="main_bt_con_banner" style="left:0;">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/01.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">17</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/02.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<ul class="main_bt_con_banner">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/03.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">18</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/04.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<ul class="main_bt_con_banner">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/05.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">19</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/06.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<ul class="main_bt_con_banner">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/07.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">20</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/08.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<ul class="main_bt_con_banner">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/09.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">21</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/10.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<ul class="main_bt_con_banner">
						<li class="main_bt_con_item"> <a class="eat clearFix" href="javascript:;"> <i class="black_tr"></i> <img class="sweetie fl" src="images/nav_slide/11.jpg" alt=""> </a>
							<div class="txt clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">代金券一张，可叠加使用，藏在面包里的美味,赶快抢购吧！！！</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">22</span> </span>
							</div> </li>
						<li class="main_bt_con_item main_bt_con_item_9"> <a class="eat clearFix" href="javascript:;"> <img class="sweetie fl" src="images/nav_slide/12.jpg" alt=""> <i class="black_tr black_trl"></i> </a>
							<div class="txt txt_9 clearFix">
								<div class="introduction fl">
									<strong class="type">巴黎贝甜</strong>
									<p class="point">九毛九山西面馆</p>
								</div>
								<span class=" price fl"> <span>¥</span> <span class="digital">89.99</span> </span>
							</div> </li>
					</ul>
					<a href="javascript:;" class="slide_btn btnL"></a>
					<a href="javascript:;" class="slide_btn btnRLarge">
						<div class="bg"></div><span class="crt_slide">1</span><span class="total_slides">/6</span></a>
				</div>
			</div>
		</div>
	</div>
	<div class="g_side fr">
		<div class="top clearFix">
			<p class="top_left fl"><span>美</span>梦成真</p>
			<a class="top_right fr" href="javascript:;">更多</a>
		</div>
		<ul>
			<li class="raffle slide_wrapper" id="raffle_slide">
				<ul>
					<li style="left:0;"> <a href="javascript:;">
						<div class="img">
							<img src="images/side1.jpg" alt="">
						</div></a> </li>
					<li> <a href="javascript:;">
						<div class="img">
							<img src="images/side1.jpg" alt="">
						</div></a> </li>
					<li> <a href="javascript:;">
						<div class="img">
							<img src="images/side1.jpg" alt="">
						</div></a> </li>
				</ul>
				<div class="change clearFix" id="raffle_tabs">
					<span class="btn fl active"></span>
					<span class="btn fl"></span>
					<span class="btn fl"></span>
				</div> <a href="javascript:;" class="slide_btn btnL"></a> <a href="javascript:;" class="slide_btn btnR"></a> </li>
			<li class="center">
				<div class="clearFix">
					<p class="fl">《闺蜜》观影礼包</p>
					<a class="fr" href="javascript:;">进行中</a>
				</div>
				<div class="clearFix">
					<p class="fl">素乐移动电源</p>
					<a class="fr" href="javascript:;">进行中</a>
				</div>
				<div class="clearFix">
					<p class="fl">TCL么么哒4G手机</p>
					<a class="fr" href="javascript:;">进行中</a>
				</div> </li>
			<li class="skill slide_wrapper" id="kill_slide">
				<ul class="mini_slide">
					<li style="left:0;"><a href="javascript:;"><img src="images/side3.jpg" alt=""></a></li>
					<li><a href="javascript:;"><img src="images/side3.jpg" alt=""></a></li>
					<li><a href="javascript:;"><img src="images/side3.jpg" alt=""></a></li>
				</ul>
				<div class="change clearFix" id="kill_tabs">
					<span class="btn fl active"></span>
					<span class="btn fl"></span>
					<span class="btn fl"></span>
				</div> <a href="javascript:;" class="slide_btn btnL"></a> <a href="javascript:;" class="slide_btn btnR"></a> </li>
		</ul>
	</div>
	<div class="g_shop fl">
		<div class="top clearFix">
			<div class="top_left clearfix fl">
				<div class="img fl">
					<a href="javascript:;"><img src="images/shop5.jpg" alt=""></a>
				</div>
				<p class="fl">距开始</p>
				<div class="time fl">
					02
				</div>
				<div class="colon fl"></div>
				<div class="time fl">
					01
				</div>
				<div class="colon fl"></div>
				<div class="time fl">
					15
				</div>
			</div>
			<a href="javascript:;">
				<div class="top_right fr">
					全部特价
					<span>&gt;</span>
				</div></a>
		</div>
		<div class="slide_wrapper" id="shop_slide">
			<ul class="clearFix" style="left:0;">
				<li class="fl"> <a href="javascript:;"><img src="images/shop/01.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">2人餐，滋味鲜美，邀您品鉴</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/02.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">药参鸡汤，免费WiFi，免费赠小菜，赠人参酒1盅</p></a> <p class="price">￥53<span>手机购买立减￥10</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/03.webp" alt=""><i class="tags"><i class="tag tag_multi"></i></i></a> <a href="javascript:;"><p class="introduce">代金券1张，全场通用，可叠加使用</p></a> <p class="price">￥23.8<span>手机购买立减￥5</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/04.webp" alt=""><i class="tags"><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">开心农场自助烧烤 日游一位，提供，免费WiFi</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
			</ul>
			<ul class="clearFix">
				<li class="fl"> <a href="javascript:;"><img src="images/shop/05.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">2人餐，滋味鲜美，邀您品鉴</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/06.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">药参鸡汤，免费WiFi，免费赠小菜，赠人参酒1盅</p></a> <p class="price">￥53<span>手机购买立减￥10</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/07.webp" alt=""><i class="tags"><i class="tag tag_multi"></i></i></a> <a href="javascript:;"><p class="introduce">代金券1张，全场通用，可叠加使用</p></a> <p class="price">￥23.8<span>手机购买立减￥5</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/08.webp" alt=""><i class="tags"><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">开心农场自助烧烤 日游一位，提供，免费WiFi</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
			</ul>
			<ul class="clearFix">
				<li class="fl"> <a href="javascript:;"><img src="images/shop/09.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">2人餐，滋味鲜美，邀您品鉴</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/10.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">药参鸡汤，免费WiFi，免费赠小菜，赠人参酒1盅</p></a> <p class="price">￥53<span>手机购买立减￥10</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/11.webp" alt=""><i class="tags"><i class="tag tag_multi"></i></i></a> <a href="javascript:;"><p class="introduce">代金券1张，全场通用，可叠加使用</p></a> <p class="price">￥23.8<span>手机购买立减￥5</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/12.webp" alt=""><i class="tags"><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">开心农场自助烧烤 日游一位，提供，免费WiFi</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
			</ul>
			<ul class="clearFix">
				<li class="fl"> <a href="javascript:;"><img src="images/shop/13.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">2人餐，滋味鲜美，邀您品鉴</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/14.webp" alt=""><i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">药参鸡汤，免费WiFi，免费赠小菜，赠人参酒1盅</p></a> <p class="price">￥53<span>手机购买立减￥10</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/15.webp" alt=""><i class="tags"><i class="tag tag_multi"></i></i></a> <a href="javascript:;"><p class="introduce">代金券1张，全场通用，可叠加使用</p></a> <p class="price">￥23.8<span>手机购买立减￥5</span></p> </li>
				<li class="fl"> <a href="javascript:;"><img src="images/shop/16.webp" alt=""><i class="tags"><i class="tag tag_coupon"></i></i></a> <a href="javascript:;"><p class="introduce">开心农场自助烧烤 日游一位，提供，免费WiFi</p></a> <p class="price">￥138<span>手机购买立减￥20</span></p> </li>
			</ul>
			<a href="javascript:;" class="slide_btn btnL"></a>
			<a href="javascript:;" class="slide_btn btnRLarge">
				<div class="bg"></div><span class="crt_slide">1</span><span class="total_slides">/4</span></a>
		</div>
	</div>
	<ol class="g_banner fr">
		<li class="meituan"> <p class="phone">美团手机版</p> <a href="javascript:;"><p class="down">免费下载</p></a> </li>
		<li class="maoyan"> <p class="phone">猫眼电影手机版</p> <a href="javascript:;"><p class="down">免费下载</p></a> </li>
		<li class="buy"> <p class="phone">美团外卖手机版</p> <a href="javascript:;"><p class="down">免费下载</p></a> </li>
	</ol>
	<div class="g_hot" id="g_hot">
		<ul class="elevator" id="elevator">
			<li> <a href="javascript:;" class="floor crt_floor"> <i class="sublogo floor_food"></i>美食 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_ent"></i>休闲娱乐 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_mov"></i>电影 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_hotel"></i>酒店 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_life"></i>生活服务 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_shop"></i>购物 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_beauty"></i>丽人 </a> </li>
			<li> <a href="javascript:;" class="floor"> <i class="sublogo floor_trav"></i>旅游 </a> </li>
		</ul>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_food"></i>美食</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">代金券</a></li>
					<li><a href="list.html" class="filter">自助餐</a></li>
					<li><a href="list.html" class="filter">火锅</a></li>
					<li><a href="list.html" class="filter">烧烤烤肉</a></li>
					<li><a href="list.html" class="filter">香锅烤鱼</a></li>
					<li><a href="list.html" class="filter">西餐</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/01.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/02.webp" alt=""> <i class="tags"><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/03.webp" alt=""> <i class="tags"><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/04.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/05.webp" alt=""> <i class="tags"><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/06.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/07.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/08.webp" alt=""> <i class="tags"><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/09.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/10.webp" alt=""> <i class="tags"></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/11.webp" alt=""> <i class="tags"><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/12.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/13.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/14.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/15.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/16.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/17.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/18.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/19.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/20.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多美食团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_ent"></i>休闲娱乐</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">游泳/水上乐园</a></li>
					<li><a href="list.html" class="filter">运动健身</a></li>
					<li><a href="list.html" class="filter">火锅</a></li>
					<li><a href="list.html" class="filter">足疗按摩</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/21.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/22.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/23.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/24.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/25.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/26.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/27.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/28.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/29.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/30.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/31.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/32.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多休闲娱乐团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_mov"></i>电影</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">电影票团购</a></li>
					<li><a href="list.html" class="filter">电影院</a></li>
					<li><a href="list.html" class="filter">在线选座</a></li>
					<li><a href="list.html" class="filter">最新电影</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/33.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/34.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/35.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/36.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/37.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/38.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/39.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/40.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多休闲娱乐团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_hotel"></i>酒店</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">经济型酒店</a></li>
					<li><a href="list.html" class="filter">主题酒店</a></li>
					<li><a href="list.html" class="filter">豪华酒店</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/41.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/42.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/43.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/44.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/45.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/46.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/47.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/48.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多酒店团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_life"></i>生活服务</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">其他摄影</a></li>
					<li><a href="list.html" class="filter">汽车服务</a></li>
					<li><a href="list.html" class="filter">培训课程</a></li>
					<li><a href="list.html" class="filter">母婴亲子</a></li>
					<li><a href="list.html" class="filter">体检保健</a></li>
					<li><a href="list.html" class="filter">配镜</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/49.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/50.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/51.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/52.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/53.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/54.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/55.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/56.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多生活服务团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_shop"></i>购物</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">女装</a></li>
					<li><a href="list.html" class="filter">男装</a></li>
					<li><a href="list.html" class="filter">内衣</a></li>
					<li><a href="list.html" class="filter">女士鞋包</a></li>
					<li><a href="list.html" class="filter">食品</a></li>
					<li><a href="list.html" class="filter">家居日用</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/57.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/58.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/59.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/60.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/61.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/62.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/63.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/64.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多购物团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_beauty"></i>丽人</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">美发</a></li>
					<li><a href="list.html" class="filter">美容美体</a></li>
					<li><a href="list.html" class="filter">美甲</a></li>
					<li><a href="list.html" class="filter">瑜伽/舞蹈</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/65.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/66.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/67.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/68.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/69.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/70.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/71.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/72.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多丽人团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="m_category">
			<div class="m_tit">
				<h3 class="fl"><a href="list.html" class="cate_a"><i class="sublogo logo_trav"></i>旅游</a></h3>
				<ul class="m_filters">
					<li><a href="list.html" class="filter">景点门票</a></li>
					<li><a href="list.html" class="filter">周边游</a></li>
					<li><a href="list.html" class="filter">国内游</a></li>
					<li><a href="list.html" class="filter">境外游</a></li>
					<li><a href="list.html" class="filter more">全部<i class="icon arr"></i></a></li>
				</ul>
			</div>
			<div class="m_list">
				<ul class="list_inner_wrap">
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/73.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/74.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/75.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/76.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/77.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/78.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/79.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
					<li class="tile"> <a href="detail.html" class="deal_pic"> <img src="images/hot/80.webp" alt=""> <i class="tags"><i class="tag tag_multi"></i><i class="tag tag_nobooking"></i><i class="tag tag_coupon"></i></i> </a> <a href="detail.html" class="shop_info"> <p class="shop_name">【远大路】 玫瑰花园自助烤肉</p> <p class="shop_brief">周一至周五自助烤肉，细品悠闲自在的时光</p> </a> <p class="deal_info"> <span class="price">￥59.9</span> <span class="ori_price">￥118</span> <span class="sold">已售12365</span> </p>
						<div class="rating_wrap">
							<a href="detail.html" class="rating"> <i class="stars star_empty"><i class="stars" style="width:40%"></i></i> 1342人评价 </a>
							<span class="discount">立减20</span>
						</div> </li>
				</ul>
			</div>
			<a href="list.html" class="m_cate_ft">更多旅游团购，请点击查看<i class="icon arr arr_act"></i></a>
		</div>
		<div class="all_cate" id="m_all_cate">
			<div class="tabs" id="all_cate_tabs">
				<a href="javscript:;" class="tab tab_act">团购分类</a>
				<a href="javscript:;" class="tab">热门地标</a>
				<a href="javscript:;" class="tab">热门团购</a>
				<a href="javscript:;" class="tab">精品推荐</a>
				<a href="javscript:;" class="tab">历史团购</a>
				<a href="javscript:;" class="tab">热门城市</a>
				<a href="javscript:;" class="tab">周边城市</a>
				<a href="javscript:;" class="tab">美团推荐</a>
			</div>
			<ul class="cate_list active">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
			</ul>
			<ul class="cate_list">
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">电影团购</a></li>
				<li><a href="list.html">休闲娱乐团购</a></li>
				<li><a href="list.html">旅游团购</a></li>
				<li><a href="list.html">生活服务团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
				<li><a href="list.html">美食团购</a></li>
			</ul>
		</div>
	</div>
</div>
<!--底部-->
<div class="g_ft" id="g_ft">
	<div class="wrap1200">
		<div class="list_box clearFix">
			<dl class="list fl clearFix">
				<dt>
					获取更新
				</dt>
				<dd>
					<a href="javascript:;">邮件订阅</a>
				</dd>
				<dd>
					<a href="javascript:;">iPhone/Android</a>
				</dd>
				<dd>
					<a href="javascript:;">美团QQ空间</a>
				</dd>
				<dd>
					<a href="javascript:;">美团新浪微博</a>
				</dd>
				<dd>
					<a href="javascript:;">sitemap</a>
				</dd>
				<dd>
					<a href="javascript:;">RSS订阅</a>
				</dd>
			</dl>
			<dl class="list fl clearFix">
				<dt>
					获取更新
				</dt>
				<dd>
					<a href="javascript:;">邮件订阅</a>
				</dd>
				<dd>
					<a href="javascript:;">iPhone/Android</a>
				</dd>
				<dd>
					<a href="javascript:;">美团QQ空间</a>
				</dd>
				<dd>
					<a href="javascript:;">美团新浪微博</a>
				</dd>
				<dd>
					<a href="javascript:;">sitemap</a>
				</dd>
				<dd>
					<a href="javascript:;">RSS订阅</a>
				</dd>
			</dl>
			<dl class="list fl clearFix">
				<dt>
					获取更新
				</dt>
				<dd>
					<a href="javascript:;">邮件订阅</a>
				</dd>
				<dd>
					<a href="javascript:;">iPhone/Android</a>
				</dd>
				<dd>
					<a href="javascript:;">美团QQ空间</a>
				</dd>
				<dd>
					<a href="javascript:;">美团新浪微博</a>
				</dd>
				<dd>
					<a href="javascript:;">sitemap</a>
				</dd>
				<dd>
					<a href="javascript:;">RSS订阅</a>
				</dd>
			</dl>
			<dl class="list fl clearFix">
				<dt>
					获取更新
				</dt>
				<dd>
					<a href="javascript:;">邮件订阅</a>
				</dd>
				<dd>
					<a href="javascript:;">iPhone/Android</a>
				</dd>
				<dd>
					<a href="javascript:;">美团QQ空间</a>
				</dd>
				<dd>
					<a href="javascript:;">美团新浪微博</a>
				</dd>
				<dd>
					<a href="javascript:;">sitemap</a>
				</dd>
				<dd>
					<a href="javascript:;">RSS订阅</a>
				</dd>
			</dl>
			<dl class="service fl clearFix">
				<dt></dt>
				<dd class="txt">
					退款、退换货、查看美团券
				</dd>
				<dd>
					<a href="javascript:;">参考教程，轻松搞定 »</a>
				</dd>
				<dd>
					客服电话：400-660-5335
				</dd>
				<dd>
					服务时间：每天 9:00 - 22:00
				</dd>
			</dl>
		</div>
		<p>©2015<a href="javascript:;">美团网团购</a> meituan.com <a href="javascript:;">京ICP证070791号</a> 京公网安备11010502025545号 <a href="javascript:;">电子公告服务规则</a></p>
		<div class="ft_log clearFix">
			<a class="fl" href="javascript:;"> <img src="images/l_ft_1.jpg" alt=""> </a>
			<a class="fl" href="javascript:;"> <img src="images/l_ft_2.jpg" alt=""> </a>
			<a class="fl" href="javascript:;"> <img src="images/l_ft_3.jpg" alt=""> </a>
			<a class="fl" href="javascript:;"> <img src="images/l_ft_4.jpg" alt=""> </a>
			<a class="fl" href="javascript:;"> <img src="images/l_ft_5.jpg" alt=""> </a>
		</div>
	</div>
</div>
<!--底部结束-->
<script src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/functions.js"></script>
<script type="text/javascript" src="js/nav.js"></script>
<script>
	/* tune stars */
	var stars = getElementsByClassName(document,'stars'),
			starsLen = stars.length;
	for(var i = 0;i<starsLen;i++){
		var star = stars[i];
		if(star.className === 'stars')
			star.style.width = Math.random()*100 + '%';
	}

	$(function (){
		var areaListCon = $('#area_list_con');
		$('#more_btn').mouseenter(function(){
			if(!areaListCon.hasClass('main_tp_con_show'))
				areaListCon.addClass("main_tp_con_show");
		});
		areaListCon.mouseleave(function(){
			areaListCon.removeClass('main_tp_con_show');
		});
		$('.switch a').click(function (){
			$('.switch a').removeClass('active');
			$(this).addClass('active');

			$('.hd_ad img').hide();
			$('.hd_ad img').eq($(this).index()).fadeIn();
		});

		$('.ad_clear').click(function (){
			$('.hd_ad').hide();
		});
	});
	/* elevator */
	var floors = elevator.getElementsByTagName('a'),
			hotToTop = g_hot.offsetTop,
			floorToTops = [],
			hotTitles = getElementsByClassName(g_hot,'m_tit');
	for(i = 0;i<floors.length;i++){
		floorToTops.push(hotToTop + hotTitles[i].offsetTop);
	}
	window.addEventListener('scroll',(function(){
		var isFixed = false,
				isSet = [true],
				scrollTop,
				toTops = floorToTops,
				floors = window.floors,
				crtFloor = 0;
		function setFloor(floor){
			floors[crtFloor].className = 'floor';
			floors[floor].className += ' crt_floor';
			isSet[crtFloor] = false;
			isSet[floor] = true;
			crtFloor = floor;
		}
		return function(){
			scrollTop = scrollElement.scrollTop;
			if(scrollTop>=toTops[0]){
				if(!isFixed){
					elevator.className += ' elevator_follow';
					isFixed = true;
				}
				if(scrollTop<toTops[1]){
					if(!isSet[0])
						setFloor(0);
				}else if(scrollTop<toTops[2]){
					if(!isSet[1])
						setFloor(1);
				}else if(scrollTop<toTops[3]){
					if(!isSet[2])
						setFloor(2);
				}else if(scrollTop<toTops[4]){
					if(!isSet[3])
						setFloor(3);
				}else if(scrollTop<toTops[5]){
					if(!isSet[4])
						setFloor(4);
				}else if(scrollTop<toTops[6]){
					if(!isSet[5])
						setFloor(5);
				}else if(scrollTop<toTops[7]){
					if(!isSet[6])
						setFloor(6);
				}else{
					if(!isSet[7])
						setFloor(7);
				}
			}else{
				if(isFixed){
					elevator.className = 'elevator';
					isFixed = false;
				}
			}
		}
	})(),false);
	for(i = 0;i<floors.length;i++){
		floors[i].index = i;
		floors[i].onclick = function(){
			$(scrollElement).stop().animate({scrollTop:floorToTops[this.index]});
		}
	}
	/* slides */
	function tabSwitch(tabsId,tabTag,baseClass,activeClass){
		var tabs = document.getElementById(tabsId).getElementsByTagName(tabTag);
		return function(prev,crt){
			tabs[prev.value].className = baseClass;
			tabs[crt].className += ' '+activeClass;
		}
	}
	function updatePage(){
		return function(prev,crt,btns){
			var spans = btns[1].getElementsByTagName('span');
			spans[0].innerHTML = crt+1;
		}
	}
	function slideByTab(tabsId,tabTag,baseClass,activeClass){
		var tabs = document.getElementById(tabsId).getElementsByTagName(tabTag);
		return function(slides,crtIdx,slide,duration){
			for(var i = 0;i<tabs.length;i++){
				tabs[i].index = i;
				tabs[i].onclick = function(){
					var crt = crtIdx.value,
							index = this.index;
					if(crt!==index){
						tabs[crt].className = baseClass;
						this.className += ' '+activeClass;
						if(crt>index){
							slide('100%','-100%',index,duration);
						}else{
							slide('-100%','100%',index,duration);
						}
						crtIdx.value = index;
					}
				}
			}
		}
	}
	initSlide('nav_slide','ul','slide_btn',300,2500,slideByTab('nav_btns','span','tb','active'),tabSwitch('nav_btns','span','tb','active'),updatePage());
	initSlide('shop_slide','ul','slide_btn',300,4000,null,updatePage());
	initSlide('raffle_slide','li','slide_btn',300,3500,slideByTab('raffle_tabs','span','btn fl','active'),tabSwitch('raffle_tabs','span','btn fl','active'));
	initSlide('kill_slide','li','slide_btn',300,3000,slideByTab('kill_tabs','span','btn fl','active'),tabSwitch('kill_tabs','span','btn fl','active'));

	$("#search").click(function(){
		var key = $("#key").val();
		//跳转到搜索结果页面
		window.location.href="/s?key=" + key;
	});

</script>
</body>
</html>