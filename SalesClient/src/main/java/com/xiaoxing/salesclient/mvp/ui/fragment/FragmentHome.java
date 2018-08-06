package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jiang.android.indicatordialog.IndicatorBuilder;
import com.jiang.android.indicatordialog.IndicatorDialog;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaoxing.salesclient.di.component.DaggerFragmentHomeComponent;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.presenter.FragmentHomePresenter;
import com.xiaoxing.salesclient.mvp.ui.PaiMaiMainActivity;
import com.xiaoxing.salesclient.mvp.ui.adapter.BaseDialogTipAdapter;
import com.xiaoxing.salesclient.mvp.ui.adapter.WeiPaiTuiGuangHomeAdapter;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
import cn.iwgang.countdownview.CountdownView;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.StatusBarUtil;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentHome extends BaseFragment<FragmentHomePresenter> implements FragmentHomeContract.View {

    //    public static List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>() {{
////        add(new BannerItem("最后的骑士", R.mipmap.banner_001));
////        add(new BannerItem("三生三世十里桃花", R.mipmap.banner_001));
////        add(new BannerItem("豆福传", R.mipmap.banner_001));
////    }};
    public static String JSON_MOVIES = "[" +
            "{\"actors\":\"丹尼斯·威缇可宁|Emma|Nikki|Jiayao|Wang|Maggie|Mao|Gang-yun|Sa\",\"filmName\":\"神灵寨\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3823.jpg\",\"releasedate\":\"2017-07-31\",\"shortinfo\":\"父亲忽病危 新娘真够黑\",\"type\":\"剧情|喜剧\"}," +
            "{\"actors\":\"刘亦菲|杨洋|彭子苏|严屹宽|罗晋\",\"filmName\":\"三生三世十里桃花\",\"grade\":\"9.2\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3566.jpg\",\"releasedate\":\"2017-08-03\",\"shortinfo\":\"虐心姐弟恋 颜值要逆天\",\"type\":\"剧情|爱情|奇幻\"}," +
            "{\"actors\":\"尹航|代旭|李晨浩|衣云鹤|张念骅\",\"filmName\":\"谁是球王\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3750.jpg\",\"releasedate\":\"2017-08-03\",\"shortinfo\":\"足球变人生 再战可辉煌\",\"type\":\"剧情|喜剧\"}," +
            "{\"actors\":null,\"filmName\":\"大象林旺之一夜成名\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3757.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"大象参二战 一生好伙伴\",\"type\":\"动作|动画|战争|冒险\"}," +
            "{\"actors\":\"薛凯琪|陈意涵|张钧甯|迈克·泰森\",\"filmName\":\"闺蜜2：无二不作\",\"grade\":\"8.3\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3776.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"闺蜜团出战 会一会新娘\",\"type\":\"喜剧|爱情\"}," +
            "{\"actors\":\"彭禺厶|王萌|周凯文|曹琦|孟子叶\",\"filmName\":\"诡井\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3824.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"午夜深井中 怨魂欲现形\",\"type\":\"恐怖|惊悚\"}," +
            "{\"actors\":\"旺卓措|刘承宙|高欣生|段楠|来钰\",\"filmName\":\"荒野加油站\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3821.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"夜半拉乘客 结果遇不测\",\"type\":\"惊悚|悬疑\"}," +
            "{\"actors\":\"刘佩琦|曹云金|罗昱焜\",\"filmName\":\"龙之战\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3778.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"持倭刀屹立 抗外敌救国\",\"type\":\"动作|战争|历史\"}," +
            "{\"actors\":\"金巴|曲尼次仁|夏诺.扎西敦珠|索朗尼玛|益西旦增\",\"filmName\":\"皮绳上的魂\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3801.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"走完朝圣路 又上降魔旅\",\"type\":\"剧情\"}," +
            "{\"actors\":\"严丽祯|李晔|王衡|李传缨|李心仪\",\"filmName\":\"玩偶奇兵\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3779.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"玩偶战数码 一头两个大\",\"type\":\"动画|冒险|奇幻\"}," +
            "{\"actors\":\"斯蒂芬·马布里|吴尊|何冰|郑秀妍|王庆祥\",\"filmName\":\"我是马布里\",\"grade\":\"0.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3810.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"吴尊助冠军 热血灌篮魂\",\"type\":\"剧情|运动\"}," +
            "{\"actors\":\"周鹏雨|穆建荣|陈泽帆|鹿露|宋星成\",\"filmName\":\"原罪的羔羊\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3802.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"古镇来戏班 往事不一般\",\"type\":\"悬疑\"}," +
            "{\"actors\":\"王大陆|张天爱|任达华|盛冠森|王迅\",\"filmName\":\"鲛珠传\",\"grade\":\"7.1\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3777.jpg\",\"releasedate\":\"2017-08-04\",\"shortinfo\":\"改编热IP 杠杠号召力\",\"type\":\"喜剧|动作|奇幻\"}," +
            "{\"actors\":\"成龙|罗伯特·雷德福\",\"filmName\":\"地球：神奇的一天\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3803.jpg\",\"releasedate\":\"2017-08-11\",\"shortinfo\":\"史诗纪录片 十年再相见\",\"type\":\"纪录片\"}," +
            "{\"actors\":\"刘德华|舒淇|杨祐宁|张静初|让·雷诺|曾志伟|沙溢\",\"filmName\":\"侠盗联盟\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3592.jpg\",\"releasedate\":\"2017-08-11\",\"shortinfo\":\"侠盗三剑客 越洋逃恐吓\",\"type\":\"动作|冒险\"}," +
            "{\"actors\":\"廖凡|李易峰|万茜|李纯|张国柱\",\"filmName\":\"心理罪\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3795.jpg\",\"releasedate\":\"2017-08-11\",\"shortinfo\":\"侦探两搭档 真相背后藏\",\"type\":\"悬疑|犯罪\"}," +
            "{\"actors\":\"徐瑞阳|赵倩|姜启杨|徐万学|韩靓|韦安\",\"filmName\":\"隐隐惊马槽之绝战女僵尸\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3825.jpg\",\"releasedate\":\"2017-08-11\",\"shortinfo\":\"阴兵来借道 尸占惊马槽\",\"type\":\"惊悚|动作|冒险|悬疑\"}," +
            "{\"actors\":\"宋睿|王良|张佳浩|叶常清\",\"filmName\":\"左眼阴阳\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3804.jpg\",\"releasedate\":\"2017-08-11\",\"shortinfo\":\"左眼见到鬼 是诡还是魅\",\"type\":\"恐怖|惊悚|悬疑\"}," +
            "{\"actors\":null,\"filmName\":\"二十二\",\"grade\":\"10.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3811.jpg\",\"releasedate\":\"2017-08-14\",\"shortinfo\":\"二战女俘虏 讲述心中苦\",\"type\":\"纪录片\"}," +
            "{\"actors\":\"郭富城|王千源|刘涛|余皑磊|冯嘉怡\",\"filmName\":\"破·局\",\"grade\":\"5.0\",\"picaddr\":\"http://app.infunpw.com/commons/images/cinema/cinema_films/3812.jpg\",\"releasedate\":\"2017-08-18\",\"shortinfo\":\"影帝硬碰硬 迷局谁怕谁\",\"type\":\"动作|犯罪\"}" +
            "]";
    @BindView(R2.id.img_1)
    ImageView img1;
    @BindView(R2.id.img_2)
    ImageView img2;
    @BindView(R2.id.img_3)
    ImageView img3;
    @BindView(R2.id.img_4)
    ImageView img4;
    @BindView(R2.id.img_5)
    ImageView img5;
    @BindView(R2.id.img_6)
    ImageView img6;
    @BindView(R2.id.cv_countdownView_zhuan_chang_tui_guang_001)
    CountdownView cv_countdownView_zhuan_chang_tui_guang_001;
    @BindView(R2.id.cv_countdownView_zhuan_chang_tui_guang_002)
    CountdownView cv_countdownView_zhuan_chang_tui_guang_002;
    @BindView(R2.id.tv_name)
    TextView tvName;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_name_1)
    TextView tvName1;
    @BindView(R2.id.tv_title_1)
    TextView tvTitle1;
    @BindView(R2.id.rl1_img1)
    ImageView rl1Img1;
    @BindView(R2.id.rl1_img2)
    ImageView rl1Img2;
    @BindView(R2.id.rl1_img3)
    ImageView rl1Img3;
    @BindView(R2.id.rl2_img1)
    ImageView rl2Img1;
    @BindView(R2.id.rl2_img2)
    ImageView rl2Img2;
    @BindView(R2.id.rl2_img3)
    ImageView rl2Img3;
    Unbinder unbinder;
    @BindView(R2.id.tv_ren_shu)
    TextView tvRenShu;
    @BindView(R2.id.tv_ren_shu_1)
    TextView tvRenShu1;
    Unbinder unbinder1;
    private int mOffset = 0;
    private int mScrollY = 0;
    private WeiPaiTuiGuangHomeAdapter mAdapter;
    private IndicatorDialog dialog;
    private RefreshLayout refreshLayout;

    @BindView(R2.id.convenientBanner)
    Banner mBanner;
    @BindView(R2.id.marquee_view)
    ViewFlipper mViewFlipper;

    private RecyclerView recyclerView;

    public static FragmentHome newInstance(String content) {

        Bundle args = new Bundle();
        args.putString("", content);
        FragmentHome fragment = new FragmentHome();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerFragmentHomeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .fragmentHomeModule(new FragmentHomeModule(this))
                .build()
                .inject(this);
    }


    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_home, null);


        final Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        EditText et_search = toolbar.findViewById(R.id.et_search);
        et_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.navigation(getActivity(), RouterHub.XIAO_XING_SEARCH_SearchActivity);
            }
        });
        toolbar.setNavigationIcon(R.mipmap.home_head_left_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTopDialog(v, 0.1f, IndicatorBuilder.GRAVITY_LEFT);
            }
        });

        //状态栏透明和间距处理
        StatusBarUtil.immersive(getActivity());
        StatusBarUtil.setPaddingSmart(getActivity(), toolbar);

//        final View parallax = view.findViewById(R.id.parallax);
        final View buttonBar = view.findViewById(R.id.buttonBarLayout);
        final NestedScrollView scrollView = (NestedScrollView) view.findViewById(R.id.scrollView);
        refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);

        refreshLayout.autoRefresh();

        refreshLayout.setOnMultiPurposeListener(new SimpleMultiPurposeListener() {
            @Override
            public void onHeaderMoving(RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
//                mOffset = offset / 2;
////                parallax.setTranslationY(mOffset - mScrollY);
//                toolbar.setAlpha(1 - Math.min(percent, 1));
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                getIndexData();
                refreshLayout.finishRefresh();
            }

            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(0);
            }
//            @Override
//            public void onHeaderPulling(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                mOffset = offset / 2;
//                parallax.setTranslationY(mOffset - mScrollY);
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//            }
//            @Override
//            public void onHeaderReleasing(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                mOffset = offset / 2;
//                parallax.setTranslationY(mOffset - mScrollY);
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//            }
        });
//        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
//            private int lastScrollY = 0;
//            private int h = DensityUtil.dp2px(170);
//            private int color = ContextCompat.getColor(getActivity(), R.color.colorPrimary) & 0x00ffffff;
//
//            @Override
//            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                if (lastScrollY < h) {
//                    scrollY = Math.min(h, scrollY);
//                    mScrollY = scrollY > h ? h : scrollY;
//                    buttonBar.setAlpha(1f * mScrollY / h);
//                    toolbar.setBackgroundColor(((255 * mScrollY / h) << 24) | color);
//                    parallax.setTranslationY(mOffset - mScrollY);
//                }
//                lastScrollY = scrollY;
//            }
//        });
//        buttonBar.setAlpha(0);
//        toolbar.setBackgroundColor(0);
//        initTuiGuangData(view);

        initWeiPaiRecycler(view);

        return view;
    }

    private void initWeiPaiRecycler(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mAdapter = new WeiPaiTuiGuangHomeAdapter(getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }


    private void initTuiGuangData(View view) {
        CountdownView mCvCountdownViewTest4 = (CountdownView) view.findViewById(R.id.cv_countdownView_zhuan_chang_tui_guang_001);
        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time4);

        CountdownView cv_countdownView_zhuan_chang_tui_guang_002 = (CountdownView) view.findViewById(R.id.cv_countdownView_zhuan_chang_tui_guang_002);
        cv_countdownView_zhuan_chang_tui_guang_002.start(time4);
    }

    private void initDrawer(Bundle savedInstanceState) {

    }


    private void showTopDialog(View v, float v1, int gravityCenter) {
        List<String> mLists = new ArrayList<>();
        List<Integer> mICons = new ArrayList<>();
        mLists.clear();
        mICons.clear();
        mLists.add("首页");
        mICons.add(R.drawable.home_icon);
        mLists.add("分类");
        mICons.add(R.drawable.cate_icon);
        mLists.add("会员");
        mICons.add(R.drawable.mem_icon);

        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        int height = dm.heightPixels;
        dialog = new IndicatorBuilder(getActivity())
                .width(300)
                .animator(R.style.dialog_exit)
                .height((int) (height * 0.5))
                .height(-1)
                .ArrowDirection(IndicatorBuilder.TOP)
                .bgColor(Color.WHITE)
                .gravity(gravityCenter)
                .dimEnabled(true)
                .ArrowRectage(v1)
                .radius(18)
                .layoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false))
                .adapter(new BaseDialogTipAdapter() {
                    @Override
                    public void onBindView(BaseViewHolder holder, int position) {
                        TextView tv = holder.getView(R.id.item_add);
                        ImageView img = holder.getView(R.id.img);
                        tv.setText(mLists.get(position));
                        img.setImageDrawable(getResources().getDrawable(mICons.get(position)));
//                        if (position == mLists.size() - 1) {
//                            holder.setVisibility(R.id.item_line, BaseViewHolder.GONE);
//                        } else {
//                            holder.setVisibility(R.id.item_line, BaseViewHolder.VISIBLE);
//
//                        }
                    }

                    @Override
                    public int getLayoutID(int position) {
                        return R.layout.item;
                    }

                    @Override
                    public boolean clickable() {
                        return true;
                    }

                    @Override
                    public void onItemClick(View v, int position) {
                        dialog.dismiss();
                        switch (position) {
                            case 0:
                                PaiMaiMainActivity.getInstance().setCurrentItem(0);
                                break;
                            case 1:
                                PaiMaiMainActivity.getInstance().setCurrentItem(1);
                                break;
                            case 2:
                                Utils.navigation(getActivity(), RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY);
                                break;
                        }
                    }

                    @Override
                    public int getItemCount() {
                        return mLists.size();
                    }
                }).create();

        dialog.setCanceledOnTouchOutside(true);
        dialog.show(v);

    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
//        getIndexData();
    }

    private void getIndexData() {
        mPresenter.getIndex();
    }

    @Override
    public void setData(@Nullable Object data) {
    }

    @Override
    public void getIndexDataSuccess(Index index) {


        setBannerData(index);

        setTouTiaoData(index);

        setWeiPaiData(index);


        setZhuanChang(index);

        List<Index.DataBean.StoreBean> storeBeanList = index.getData().getStore();
        if (storeBeanList == null)
            return;
        Glide.with(getActivity()).load(storeBeanList.get(0).getStreet_thumb()).into(rl1Img1);
        Glide.with(getActivity()).load(storeBeanList.get(0).getBrand_thumb()).into(rl1Img2);
        Glide.with(getActivity()).load(storeBeanList.get(0).getBrand_thumb()).into(rl1Img3);
        Glide.with(getActivity()).load(storeBeanList.get(1).getStreet_thumb()).into(rl2Img1);
        Glide.with(getActivity()).load(storeBeanList.get(1).getBrand_thumb()).into(rl2Img2);
        Glide.with(getActivity()).load(storeBeanList.get(1).getBrand_thumb()).into(rl2Img3);


    }

    private void setZhuanChang(Index index) {
        List<Index.DataBean.ZhuanchangBean> zhuanchangBeans = index.getData().getZhuanchang();
        if (zhuanchangBeans == null)
            return;
        Glide.with(getActivity()).load(zhuanchangBeans.get(0).getTouch_icon()).into(img1);
        Glide.with(getActivity()).load(zhuanchangBeans.get(0).getTouch_icon()).into(img2);
        Glide.with(getActivity()).load(zhuanchangBeans.get(0).getTouch_icon()).into(img3);
        tvName.setText(zhuanchangBeans.get(0).getCat_name());
        tvTitle.setText(zhuanchangBeans.get(0).getCat_desc());

        tvRenShu.setText(zhuanchangBeans.get(0).getOnlookers_num());
        long time1 = Long.parseLong(zhuanchangBeans.get(0).getEnd_time()) * 1000 - System.currentTimeMillis();


        Glide.with(getActivity()).load(zhuanchangBeans.get(1).getTouch_icon()).into(img4);
        Glide.with(getActivity()).load(zhuanchangBeans.get(1).getTouch_icon()).into(img5);
        Glide.with(getActivity()).load(zhuanchangBeans.get(1).getTouch_icon()).into(img6);
        tvName1.setText(zhuanchangBeans.get(1).getCat_name());
        tvTitle1.setText(zhuanchangBeans.get(1).getCat_desc());
        tvRenShu1.setText(zhuanchangBeans.get(1).getOnlookers_num());
        long time2 = Long.parseLong(zhuanchangBeans.get(1).getEnd_time()) * 1000 - System.currentTimeMillis();


        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        cv_countdownView_zhuan_chang_tui_guang_001.start(time1);
        cv_countdownView_zhuan_chang_tui_guang_002.start(time2);

//        CountdownView cv_countdownView_zhuan_chang_tui_guang_002 = (CountdownView) view.findViewById(R.id.cv_countdownView_zhuan_chang_tui_guang_002);
//        cv_countdownView_zhuan_chang_tui_guang_002.start(time4);
    }

    private void setWeiPaiData(Index index) {
        List<Index.DataBean.WeipaiBean> weipaiBeanList = index.getData().getWeipai();

        if (weipaiBeanList == null)
            return;

//        final List<Movie> movies = new Gson().fromJson(JSON_MOVIES, new TypeToken<ArrayList<Movie>>() {}.getType());
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < weipaiBeanList.size(); i++) {
            Movie movie = new Movie();

            movie.filmName = weipaiBeanList.get(i).getAct_name();
            movie.picaddr = weipaiBeanList.get(i).getGoods_img();
            movie.grade = weipaiBeanList.get(i).getEnd_time();
            movies.add(movie);
        }

        mAdapter.replaceData(movies);
    }

    private void setTouTiaoData(Index index) {
        List<Index.DataBean.ArticleBean> articleBeanList = index.getData().getArticle();
        if (articleBeanList == null)
            return;
        for (int i = 0; i < articleBeanList.size(); i++) {

            View viewItem = View.inflate(getActivity(), R.layout.noticelayout, null);

            TextView tv_title = viewItem.findViewById(R.id.tv_title);
            TextView tv_cat_name = viewItem.findViewById(R.id.tv_cat_name);
            LinearLayout ll_item = viewItem.findViewById(R.id.ll_item);

            tv_cat_name.setText(articleBeanList.get(i).getCat_name());
            tv_title.setText(articleBeanList.get(i).getTitle());

            int finalI = i;
            ll_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ARouter.getInstance().build(RouterHub.SALES_CLIENT_HEAD_LINES_ACTIVITY).withString("article_id", articleBeanList.get(finalI).getArticle_id()).navigation(getActivity());
                }
            });

            mViewFlipper.addView(viewItem);
        }
    }

    /**
     * @class describe 设置banner数据
     * @author 小星 QQ:753940262
     * @time 2018/7/10 0010 10:48
     */
    private void setBannerData(Index index) {

        List<Index.DataBean.BannerBean> bannerBeanList = index.getData().getBanner();
        List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>();
//        for (int i = 0; i < bannerBeanList.size(); i++) {
//            BannerItem bannerItem = new BannerItem(bannerBeanList.get(i).getGoods_name(), bannerBeanList.get(i).getGoods_img());
//            BANNER_ITEMS.add(bannerItem);
//        }
        BANNER_ITEMS.add(new BannerItem("最后的骑士", R.mipmap.banner_001));
        BANNER_ITEMS.add(new BannerItem("最后的骑士", R.mipmap.banner_002));

        mBanner.setImageLoader(new GlideImageLoader());
        mBanner.setImages(BANNER_ITEMS);
        mBanner.start();

        mBanner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
            }
        });
    }

    @Override
    public void showMessage(@NonNull String message) {

    }


    public static class Movie {
        public String actors;
        public String filmName;
        public String grade;
        public String info;
        public String picaddr;
        public String shortinfo;
    }


    @OnClick({
            R2.id.rl_tou_tiao, R2.id.img_zhuan_chang, R2.id.img_wei_pai,
            R2.id.img_cang_pin, R2.id.img_zhan_ting, R2.id.img_gu_sou,
            R2.id.rl_wei_pai_tui_guang, R2.id.rl_zhuan_chang_tui_guang, R2.id.rl_zhan_ting_tui_guang,
            R2.id.rl_zhan_ting_detail, R2.id.rl_zhuan_chang_tui_guang_detail, R2.id.rl_zhuan_chang_tui_guang_detail_1})
    public void onViewClicked(View view) {

        if (view.getId() == R.id.rl_tou_tiao) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_HEAD_LINES_ACTIVITY);
        } else if (view.getId() == R.id.img_zhuan_chang) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
        } else if (view.getId() == R.id.img_wei_pai) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_WEI_PAI_ACTIVITY);
        } else if (view.getId() == R.id.img_cang_pin) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY);
        } else if (view.getId() == R.id.img_zhan_ting) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHAN_TING_ACTIVITY);
        } else if (view.getId() == R.id.img_gu_sou) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_SEARCH_SearchActivity);
        } else if (view.getId() == R.id.rl_wei_pai_tui_guang) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_WEI_PAI_ACTIVITY);
        } else if (view.getId() == R.id.rl_zhuan_chang_tui_guang) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
        } else if (view.getId() == R.id.rl_zhan_ting_tui_guang) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHAN_TING_ACTIVITY);
        } else if (view.getId() == R.id.rl_zhan_ting_detail) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHAN_TING_DETAIL_ACTIVITY);
        } else if (view.getId() == R.id.rl_zhuan_chang_tui_guang_detail) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHAN_TING_GOODS_LIST_ACTIVITY);
        } else if (view.getId() == R.id.rl_zhuan_chang_tui_guang_detail_1) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_ZHAN_TING_GOODS_LIST_ACTIVITY);
        }
    }

}
