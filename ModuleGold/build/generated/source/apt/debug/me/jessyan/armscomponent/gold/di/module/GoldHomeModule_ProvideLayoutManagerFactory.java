package me.jessyan.armscomponent.gold.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gold.mvp.contract.GoldHomeContract;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomeModule_ProvideLayoutManagerFactory
    implements Factory<RecyclerView.LayoutManager> {
  private final Provider<GoldHomeContract.View> viewProvider;

  public GoldHomeModule_ProvideLayoutManagerFactory(Provider<GoldHomeContract.View> viewProvider) {
    this.viewProvider = viewProvider;
  }

  @Override
  public RecyclerView.LayoutManager get() {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideLayoutManager(viewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GoldHomeModule_ProvideLayoutManagerFactory create(
      Provider<GoldHomeContract.View> viewProvider) {
    return new GoldHomeModule_ProvideLayoutManagerFactory(viewProvider);
  }

  public static RecyclerView.LayoutManager proxyProvideLayoutManager(GoldHomeContract.View view) {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideLayoutManager(view),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
