package me.jessyan.armscomponent.gold.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gold.mvp.contract.GoldHomeContract;
import me.jessyan.armscomponent.gold.mvp.model.entity.GoldListBean;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomeModule_ProvideGoldHomeAdapterFactory
    implements Factory<RecyclerView.Adapter> {
  private final Provider<GoldHomeContract.View> goldHomeViewProvider;

  private final Provider<List<GoldListBean>> listProvider;

  public GoldHomeModule_ProvideGoldHomeAdapterFactory(
      Provider<GoldHomeContract.View> goldHomeViewProvider,
      Provider<List<GoldListBean>> listProvider) {
    this.goldHomeViewProvider = goldHomeViewProvider;
    this.listProvider = listProvider;
  }

  @Override
  public RecyclerView.Adapter get() {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideGoldHomeAdapter(goldHomeViewProvider.get(), listProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GoldHomeModule_ProvideGoldHomeAdapterFactory create(
      Provider<GoldHomeContract.View> goldHomeViewProvider,
      Provider<List<GoldListBean>> listProvider) {
    return new GoldHomeModule_ProvideGoldHomeAdapterFactory(goldHomeViewProvider, listProvider);
  }

  public static RecyclerView.Adapter proxyProvideGoldHomeAdapter(
      GoldHomeContract.View GoldHomeView, List<GoldListBean> list) {
    return Preconditions.checkNotNull(
        GoldHomeModule.provideGoldHomeAdapter(GoldHomeView, list),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
