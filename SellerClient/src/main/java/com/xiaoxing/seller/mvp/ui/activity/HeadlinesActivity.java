package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerHeadlinesComponent;
import com.xiaoxing.seller.di.module.HeadlinesModule;
import com.xiaoxing.seller.mvp.contract.HeadlinesContract;
import com.xiaoxing.seller.mvp.presenter.HeadlinesPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.WebviewUtil;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_HEADLINES_ACTIVITY)
public class HeadlinesActivity extends BaseActivity<HeadlinesPresenter> implements HeadlinesContract.View {

    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_time)
    TextView tvTime;
    @BindView(R2.id.webview)
    WebView webview;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerHeadlinesComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .headlinesModule(new HeadlinesModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.seller_client_activity_headlines; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.seller_client_mine_headlines));

        WebviewUtil.loadData(this, webview, " 展品发布\n" +
                "底部导航条点击“发布”，选择“展品发布”,有两种交易模式的展品。\n" +
                "发布议价展品：\n" +
                "（1）开启报价模式，您可设置一个“最低报价”（即低于此价格的报价无需经过您的确认，立即拒绝）发布成功后不会有最低价格的文字显示，仅发布者知晓。所有展品显示“议价”，限单件出售\n" +
                "（2）修改条件：无待操作内容\n" +
                "（3）拒绝/同意：进入我的“卖家中心”点击“报价管理”查看并操作同意或者拒绝，一旦确认同意某笔报价，立即生成订单，其余报价全部默认拒绝。\n" +
                "\n" +
                "发布普通展品：\n" +
                "与报价不同的是，立即购买展品需要输入售价，市场价。选择库存。发布成功后，用户直接以您所设价格进行交易。");
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
