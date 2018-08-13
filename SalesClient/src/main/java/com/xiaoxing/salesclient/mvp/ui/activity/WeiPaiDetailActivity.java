package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerWeiPaiDetailComponent;
import com.xiaoxing.salesclient.di.module.WeiPaiDetailModule;
import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;
import com.xiaoxing.salesclient.mvp.presenter.WeiPaiDetailPresenter;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentQiTaPaiPin;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentWeiPaiDetail;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.iwgang.countdownview.CountdownView;
import me.jessyan.armscomponent.commonres.utils.GlideUtil;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY)
public class WeiPaiDetailActivity extends BaseActivity<WeiPaiDetailPresenter> implements WeiPaiDetailContract.View {

    @BindView(R2.id.convenientBanner)
    Banner mBanner;

    public static List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>() {{
        add(new BannerItem("最后的骑士", R.mipmap.banner_001));
        add(new BannerItem("三生三世十里桃花", R.mipmap.banner_001));
        add(new BannerItem("豆福传", R.mipmap.banner_001));
    }};

    private final String[] mTitles = {"拍品详情", "帮助及保障", "其他拍品"};

    @Autowired
    String act_id;
    @Autowired
    String product_id;
    @BindView(R2.id.cv_countdownViewTest4)
    CountdownView cvCountdownViewTest4;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_dang_qian_jia)
    TextView tvDangQianJia;
    @BindView(R2.id.tv_wei_guan_chu_jia)
    TextView tvWeiGuanChuJia;
    @BindView(R2.id.tv_qi_pai_jia)
    TextView tvQiPaiJia;
    @BindView(R2.id.tv_bao_zheng_jin)
    TextView tvBaoZhengJin;
    @BindView(R2.id.tv_mai_jia_yong_jin)
    TextView tvMaiJiaYongJin;
    @BindView(R2.id.tv_yi_kou_jia)
    TextView tvYiKouJia;
    @BindView(R2.id.tv_jia_jia_fu_du)
    TextView tvJiaJiaFuDu;
    @BindView(R2.id.tv_shop_name)
    TextView tvShopName;
    @BindView(R2.id.tv_dian_pu_bao_zheng_jin_value)
    TextView tvDianPuBaoZhengJinValue;
    @BindView(R2.id.img_shop)
    ImageView img_shop;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerWeiPaiDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiPaiDetailModule(new WeiPaiDetailModule(this))
                .build()
                .inject(this);

        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_wei_pai_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "微拍推广详情");


//        Banner banner = findViewById(R.id.convenientBanner);
//
//        banner.setImageLoader(new GlideImageLoader());
//        banner.setImages(BANNER_ITEMS);
//        banner.start();
//
//        banner.setOnBannerClickListener(new OnBannerClickListener() {
//            @Override
//            public void OnBannerClick(int position) {
////                Utils.navigation(WeiPaiDetailActivity.this, RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
//            }
//        });


//        initCountdownView();

        mPresenter.getAuctionDetail(act_id, product_id);
    }

    private void initCountdownView() {
        CountdownView mCvCountdownViewTest4 = (CountdownView) findViewById(R.id.cv_countdownViewTest4);
        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time4);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @Override
    public void auctionDetailSuccess(AuctionDetail auctionDetail) {

        AuctionDetail.DataBean dataBean = auctionDetail.getData();
        if (dataBean == null)
            return;
        tvTitle.setText(dataBean.getGoods_name());
        setBannerData(dataBean);


        if (dataBean.getEnd_time() != null && Integer.parseInt(dataBean.getEnd_time()) > 0) {
            long time2 = Long.parseLong(dataBean.getEnd_time()) * 1000 - System.currentTimeMillis();
            cvCountdownViewTest4.start(time2);
        }

        tvTitle.setText(dataBean.getGoods_name());
        tvDangQianJia.setText("￥" + dataBean.getCurrent_price());

        tvWeiGuanChuJia.setText("围观" + dataBean.getOnlookers_num() + "次" + " 出价" + dataBean.getBid_user_count() + "次");

        tvQiPaiJia.setText("￥" + dataBean.getStart_price());
        tvYiKouJia.setText("￥" + dataBean.getEnd_price());
        tvBaoZhengJin.setText("￥" + dataBean.getDeposit());
        tvJiaJiaFuDu.setText("￥" + dataBean.getAmplitude());


        if (dataBean.getShopinfo() != null) {

//            Glide.with(this).load(dataBean.getShopinfo().getShop_logo()).into(img_shop);
            GlideUtil.displayImg(this, dataBean.getShopinfo().getShop_logo(), img_shop);
            tvShopName.setText(dataBean.getShopinfo().getShop_name());
        }

        tvDianPuBaoZhengJinValue.setText("￥" + dataBean.getDeposit());


        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(FragmentWeiPaiDetail.newInstance(dataBean.getDesc_mobile()));
        mFragments.add(FragmentWeiPaiDetail.newInstance(dataBean.getAct_promise()));

        if (dataBean.getOther_goods() != null) {
            mFragments.add(FragmentQiTaPaiPin.getInstance(dataBean.getOther_goods()));
        } else {
            mFragments.add(FragmentQiTaPaiPin.getInstance(null));
        }

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);

    }

    private void setBannerData(AuctionDetail.DataBean dataBean) {
        List<AuctionDetail.DataBean.PicturesBean> picturesBeanList = dataBean.getPictures();

        if (picturesBeanList != null) {
            List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>();

            for (int i = 0; i < picturesBeanList.size(); i++) {
                BANNER_ITEMS.add(new BannerItem("最后的骑士", picturesBeanList.get(i).getImg_url()));
            }

            mBanner.setImageLoader(new GlideImageLoader());
            mBanner.setImages(BANNER_ITEMS);
            mBanner.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_ju_bao, R2.id.btn_tui_da_hang, R2.id.btn_tui_hang_jia, R2.id.ll_zi_xun, R2.id.tv_chu_jia})
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_ju_bao) {
        } else if (i == R.id.btn_tui_da_hang) {
        } else if (i == R.id.btn_tui_hang_jia) {
        } else if (i == R.id.ll_zi_xun) {
        } else if (i == R.id.tv_chu_jia) {
        }
        ArmsUtils.snackbarText("功能正在开发中...");
    }
}
