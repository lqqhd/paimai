package me.jessyan.armscomponent.gank.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomeModule_ProvideLayoutManagerFactory
    implements Factory<RecyclerView.LayoutManager> {
  private final Provider<GankHomeContract.View> viewProvider;

  public GankHomeModule_ProvideLayoutManagerFactory(Provider<GankHomeContract.View> viewProvider) {
    this.viewProvider = viewProvider;
  }

  @Override
  public RecyclerView.LayoutManager get() {
    return Preconditions.checkNotNull(
        GankHomeModule.provideLayoutManager(viewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GankHomeModule_ProvideLayoutManagerFactory create(
      Provider<GankHomeContract.View> viewProvider) {
    return new GankHomeModule_ProvideLayoutManagerFactory(viewProvider);
  }

  public static RecyclerView.LayoutManager proxyProvideLayoutManager(GankHomeContract.View view) {
    return Preconditions.checkNotNull(
        GankHomeModule.provideLayoutManager(view),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
