package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerHeadlinesComponent;
import com.xiaoxing.salesclient.di.module.HeadlinesModule;
import com.xiaoxing.salesclient.mvp.contract.HeadlinesContract;
import com.xiaoxing.salesclient.mvp.model.entity.Article;
import com.xiaoxing.salesclient.mvp.presenter.HeadlinesPresenter;

import butterknife.BindView;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.WebviewUtil;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_HEAD_LINES_ACTIVITY)
public class HeadlinesActivity extends BaseActivity<HeadlinesPresenter> implements HeadlinesContract.View {
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_time)
    TextView tvTime;
    @BindView(R2.id.webview)
    WebView webview;

    @Autowired()
    String article_id;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerHeadlinesComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .headlinesModule(new HeadlinesModule(this))
                .build()
                .inject(this);

        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_headlines; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.sales_client_head_lines));

        getArticleData();

    }

    private void getArticleData() {
        mPresenter.getArticle(article_id);
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
    public void getArticleSuccess(Article article) {
        Article.DataBean dataBean = article.getData().get(0);
        tvTitle.setText(dataBean.getTitle());
        tvTime.setText(ArmsUtils.stampToDate(dataBean.getAdd_time()));


        WebviewUtil.loadData(this, webview, dataBean.getContent());
    }
}
