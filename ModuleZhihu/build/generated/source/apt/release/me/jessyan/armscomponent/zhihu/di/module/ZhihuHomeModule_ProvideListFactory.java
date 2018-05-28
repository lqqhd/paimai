package me.jessyan.armscomponent.zhihu.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import me.jessyan.armscomponent.zhihu.mvp.model.entity.DailyListBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomeModule_ProvideListFactory
    implements Factory<List<DailyListBean.StoriesBean>> {
  private static final ZhihuHomeModule_ProvideListFactory INSTANCE =
      new ZhihuHomeModule_ProvideListFactory();

  @Override
  public List<DailyListBean.StoriesBean> get() {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ZhihuHomeModule_ProvideListFactory create() {
    return INSTANCE;
  }

  public static List<DailyListBean.StoriesBean> proxyProvideList() {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideList(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
