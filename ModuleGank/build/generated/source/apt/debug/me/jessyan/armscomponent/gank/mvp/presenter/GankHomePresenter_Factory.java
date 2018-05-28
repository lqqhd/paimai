package me.jessyan.armscomponent.gank.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomePresenter_Factory implements Factory<GankHomePresenter> {
  private final Provider<GankHomeContract.Model> modelProvider;

  private final Provider<GankHomeContract.View> rootViewProvider;

  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<GankItemBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GankHomePresenter_Factory(
      Provider<GankHomeContract.Model> modelProvider,
      Provider<GankHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GankItemBean>> mDatasProvider,
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
  public GankHomePresenter get() {
    GankHomePresenter instance = new GankHomePresenter(modelProvider.get(), rootViewProvider.get());
    GankHomePresenter_MembersInjector.injectMErrorHandler(instance, mErrorHandlerProvider.get());
    GankHomePresenter_MembersInjector.injectMAppManager(instance, mAppManagerProvider.get());
    GankHomePresenter_MembersInjector.injectMApplication(instance, mApplicationProvider.get());
    GankHomePresenter_MembersInjector.injectMDatas(instance, mDatasProvider.get());
    GankHomePresenter_MembersInjector.injectMAdapter(instance, mAdapterProvider.get());
    return instance;
  }

  public static GankHomePresenter_Factory create(
      Provider<GankHomeContract.Model> modelProvider,
      Provider<GankHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GankItemBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GankHomePresenter_Factory(
        modelProvider,
        rootViewProvider,
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  public static GankHomePresenter newGankHomePresenter(
      GankHomeContract.Model model, GankHomeContract.View rootView) {
    return new GankHomePresenter(model, rootView);
  }
}
