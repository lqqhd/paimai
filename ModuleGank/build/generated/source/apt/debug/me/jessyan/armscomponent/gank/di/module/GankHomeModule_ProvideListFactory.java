package me.jessyan.armscomponent.gank.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomeModule_ProvideListFactory implements Factory<List<GankItemBean>> {
  private static final GankHomeModule_ProvideListFactory INSTANCE =
      new GankHomeModule_ProvideListFactory();

  @Override
  public List<GankItemBean> get() {
    return Preconditions.checkNotNull(
        GankHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GankHomeModule_ProvideListFactory create() {
    return INSTANCE;
  }

  public static List<GankItemBean> proxyProvideList() {
    return Preconditions.checkNotNull(
        GankHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
