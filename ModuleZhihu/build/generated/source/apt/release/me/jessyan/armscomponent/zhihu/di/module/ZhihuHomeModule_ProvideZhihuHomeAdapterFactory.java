package me.jessyan.armscomponent.zhihu.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.contract.ZhihuHomeContract;
import me.jessyan.armscomponent.zhihu.mvp.model.entity.DailyListBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomeModule_ProvideZhihuHomeAdapterFactory
    implements Factory<RecyclerView.Adapter> {
  private final Provider<ZhihuHomeContract.View> zhihuHomeViewProvider;

  private final Provider<List<DailyListBean.StoriesBean>> listProvider;

  public ZhihuHomeModule_ProvideZhihuHomeAdapterFactory(
      Provider<ZhihuHomeContract.View> zhihuHomeViewProvider,
      Provider<List<DailyListBean.StoriesBean>> listProvider) {
    this.zhihuHomeViewProvider = zhihuHomeViewProvider;
    this.listProvider = listProvider;
  }

  @Override
  public RecyclerView.Adapter get() {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideZhihuHomeAdapter(zhihuHomeViewProvider.get(), listProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ZhihuHomeModule_ProvideZhihuHomeAdapterFactory create(
      Provider<ZhihuHomeContract.View> zhihuHomeViewProvider,
      Provider<List<DailyListBean.StoriesBean>> listProvider) {
    return new ZhihuHomeModule_ProvideZhihuHomeAdapterFactory(zhihuHomeViewProvider, listProvider);
  }

  public static RecyclerView.Adapter proxyProvideZhihuHomeAdapter(
      ZhihuHomeContract.View zhihuHomeView, List<DailyListBean.StoriesBean> list) {
    return Preconditions.checkNotNull(
        ZhihuHomeModule.provideZhihuHomeAdapter(zhihuHomeView, list),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
