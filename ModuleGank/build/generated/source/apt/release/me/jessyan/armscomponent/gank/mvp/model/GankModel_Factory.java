package me.jessyan.armscomponent.gank.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankModel_Factory implements Factory<GankModel> {
  private final Provider<IRepositoryManager> repositoryManagerProvider;

  public GankModel_Factory(Provider<IRepositoryManager> repositoryManagerProvider) {
    this.repositoryManagerProvider = repositoryManagerProvider;
  }

  @Override
  public GankModel get() {
    return new GankModel(repositoryManagerProvider.get());
  }

  public static GankModel_Factory create(Provider<IRepositoryManager> repositoryManagerProvider) {
    return new GankModel_Factory(repositoryManagerProvider);
  }
}
