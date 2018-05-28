package me.jessyan.armscomponent.zhihu.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuModel_Factory implements Factory<ZhihuModel> {
  private final Provider<IRepositoryManager> repositoryManagerProvider;

  public ZhihuModel_Factory(Provider<IRepositoryManager> repositoryManagerProvider) {
    this.repositoryManagerProvider = repositoryManagerProvider;
  }

  @Override
  public ZhihuModel get() {
    return new ZhihuModel(repositoryManagerProvider.get());
  }

  public static ZhihuModel_Factory create(Provider<IRepositoryManager> repositoryManagerProvider) {
    return new ZhihuModel_Factory(repositoryManagerProvider);
  }
}
