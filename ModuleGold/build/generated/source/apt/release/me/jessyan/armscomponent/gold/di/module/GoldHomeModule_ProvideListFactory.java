package me.jessyan.armscomponent.gold.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import me.jessyan.armscomponent.gold.mvp.model.entity.GoldListBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomeModule_ProvideListFactory implements Factory<List<GoldListBean>> {
  private static final GoldHomeModule_ProvideListFactory INSTANCE =
      new GoldHomeModule_ProvideListFactory();

  @Override
  public List<GoldListBean> get() {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GoldHomeModule_ProvideListFactory create() {
    return INSTANCE;
  }

  public static List<GoldListBean> proxyProvideList() {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
