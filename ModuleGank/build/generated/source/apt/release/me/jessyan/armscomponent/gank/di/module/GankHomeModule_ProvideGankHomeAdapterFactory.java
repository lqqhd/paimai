package me.jessyan.armscomponent.gank.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomeModule_ProvideGankHomeAdapterFactory
    implements Factory<RecyclerView.Adapter> {
  private final Provider<List<GankItemBean>> listProvider;

  public GankHomeModule_ProvideGankHomeAdapterFactory(Provider<List<GankItemBean>> listProvider) {
    this.listProvider = listProvider;
  }

  @Override
  public RecyclerView.Adapter get() {
    return Preconditions.checkNotNull(
        GankHomeModule.provideGankHomeAdapter(listProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GankHomeModule_ProvideGankHomeAdapterFactory create(
      Provider<List<GankItemBean>> listProvider) {
    return new GankHomeModule_ProvideGankHomeAdapterFactory(listProvider);
  }

  public static RecyclerView.Adapter proxyProvideGankHomeAdapter(List<GankItemBean> list) {
    return Preconditions.checkNotNull(
        GankHomeModule.provideGankHomeAdapter(list),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
