package me.jessyan.armscomponent.gold.mvp.ui.activity;

import android.support.v7.widget.RecyclerView;
import com.jess.arms.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gold.mvp.presenter.GoldHomePresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomeActivity_MembersInjector implements MembersInjector<GoldHomeActivity> {
  private final Provider<GoldHomePresenter> mPresenterProvider;

  private final Provider<RecyclerView.LayoutManager> mLayoutManagerProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GoldHomeActivity_MembersInjector(
      Provider<GoldHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mPresenterProvider = mPresenterProvider;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<GoldHomeActivity> create(
      Provider<GoldHomePresenter> mPresenterProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GoldHomeActivity_MembersInjector(
        mPresenterProvider, mLayoutManagerProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(GoldHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    injectMLayoutManager(instance, mLayoutManagerProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMLayoutManager(
      GoldHomeActivity instance, RecyclerView.LayoutManager mLayoutManager) {
    instance.mLayoutManager = mLayoutManager;
  }

  public static void injectMAdapter(GoldHomeActivity instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
