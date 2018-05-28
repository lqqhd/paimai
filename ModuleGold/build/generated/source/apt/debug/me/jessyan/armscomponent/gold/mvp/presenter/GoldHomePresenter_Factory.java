package me.jessyan.armscomponent.gold.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gold.mvp.contract.GoldHomeContract;
import me.jessyan.armscomponent.gold.mvp.model.entity.GoldListBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomePresenter_Factory implements Factory<GoldHomePresenter> {
  private final Provider<GoldHomeContract.Model> modelProvider;

  private final Provider<GoldHomeContract.View> rootViewProvider;

  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<GoldListBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GoldHomePresenter_Factory(
      Provider<GoldHomeContract.Model> modelProvider,
      Provider<GoldHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GoldListBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.modelProvider = modelProvider;
    this.rootViewProvider = rootViewProvider;
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mAppManagerProvider = mAppManagerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mDatasProvider = mDatasProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  @Override
  public GoldHomePresenter get() {
    GoldHomePresenter instance = new GoldHomePresenter(modelProvider.get(), rootViewProvider.get());
    GoldHomePresenter_MembersInjector.injectMErrorHandler(instance, mErrorHandlerProvider.get());
    GoldHomePresenter_MembersInjector.injectMAppManager(instance, mAppManagerProvider.get());
    GoldHomePresenter_MembersInjector.injectMApplication(instance, mApplicationProvider.get());
    GoldHomePresenter_MembersInjector.injectMDatas(instance, mDatasProvider.get());
    GoldHomePresenter_MembersInjector.injectMAdapter(instance, mAdapterProvider.get());
    return instance;
  }

  public static GoldHomePresenter_Factory create(
      Provider<GoldHomeContract.Model> modelProvider,
      Provider<GoldHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GoldListBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GoldHomePresenter_Factory(
        modelProvider,
        rootViewProvider,
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  public static GoldHomePresenter newGoldHomePresenter(
      GoldHomeContract.Model model, GoldHomeContract.View rootView) {
    return new GoldHomePresenter(model, rootView);
  }
}
