package me.jessyan.armscomponent.zhihu.mvp.ui.activity;

import android.support.v7.widget.RecyclerView;
import com.jess.arms.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.presenter.ZhihuHomePresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomeActivity_MembersInjector implements MembersInjector<ZhihuHomeActivity> {
  private final Provider<ZhihuHomePresenter> mPresenterProvider;

  private final Provider<RecyclerView.LayoutManager> mLayoutManagerProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public ZhihuHomeActivity_MembersInjector(
      Provider<ZhihuHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mPresenterProvider = mPresenterProvider;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<ZhihuHomeActivity> create(
      Provider<ZhihuHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new ZhihuHomeActivity_MembersInjector(
        mPresenterProvider, mLayoutManagerProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(ZhihuHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    injectMLayoutManager(instance, mLayoutManagerProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMLayoutManager(
      ZhihuHomeActivity instance, RecyclerView.LayoutManager mLayoutManager) {
    instance.mLayoutManager = mLayoutManager;
  }

  public static void injectMAdapter(ZhihuHomeActivity instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
