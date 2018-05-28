package me.jessyan.armscomponent.gank.mvp.ui.activity;

import android.support.v7.widget.RecyclerView;
import com.jess.arms.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.mvp.presenter.GankHomePresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomeActivity_MembersInjector implements MembersInjector<GankHomeActivity> {
  private final Provider<GankHomePresenter> mPresenterProvider;

  private final Provider<RecyclerView.LayoutManager> mLayoutManagerProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GankHomeActivity_MembersInjector(
      Provider<GankHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mPresenterProvider = mPresenterProvider;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<GankHomeActivity> create(
      Provider<GankHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GankHomeActivity_MembersInjector(
        mPresenterProvider, mLayoutManagerProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(GankHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    injectMLayoutManager(instance, mLayoutManagerProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMLayoutManager(
      GankHomeActivity instance, RecyclerView.LayoutManager mLayoutManager) {
    instance.mLayoutManager = mLayoutManager;
  }

  public static void injectMAdapter(GankHomeActivity instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
