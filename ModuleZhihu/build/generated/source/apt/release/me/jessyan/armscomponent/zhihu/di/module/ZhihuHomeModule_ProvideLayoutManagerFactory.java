package me.jessyan.armscomponent.zhihu.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.contract.ZhihuHomeContract;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomeModule_ProvideLayoutManagerFactory
    implements Factory<RecyclerView.LayoutManager> {
  private final Provider<ZhihuHomeContract.View> viewProvider;

  public ZhihuHomeModule_ProvideLayoutManagerFactory(
      Provider<ZhihuHomeContract.View> viewProvider) {
    this.viewProvider = viewProvider;
  }

  @Override
  public RecyclerView.LayoutManager get() {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideLayoutManager(viewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ZhihuHomeModule_ProvideLayoutManagerFactory create(
      Provider<ZhihuHomeContract.View> viewProvider) {
    return new ZhihuHomeModule_ProvideLayoutManagerFactory(viewProvider);
  }

  public static RecyclerView.LayoutManager proxyProvideLayoutManager(ZhihuHomeContract.View view) {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideLayoutManager(view),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
