package me.jessyan.armscomponent.gold.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldModel_Factory implements Factory<GoldModel> {
  private final Provider<IRepositoryManager> repositoryManagerProvider;

  public GoldModel_Factory(Provider<IRepositoryManager> repositoryManagerProvider) {
    this.repositoryManagerProvider = repositoryManagerProvider;
  }

  @Override
  public GoldModel get() {
    return new GoldModel(repositoryManagerProvider.get());
  }

  public static GoldModel_Factory create(Provider<IRepositoryManager> repositoryManagerProvider) {
    return new GoldModel_Factory(repositoryManagerProvider);
  }
}
