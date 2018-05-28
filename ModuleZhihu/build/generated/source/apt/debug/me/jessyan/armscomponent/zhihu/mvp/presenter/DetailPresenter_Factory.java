package me.jessyan.armscomponent.zhihu.mvp.presenter;

import android.app.Application;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.contract.DetailContract;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailPresenter_Factory implements Factory<DetailPresenter> {
  private final Provider<DetailContract.Model> modelProvider;

  private final Provider<DetailContract.View> rootViewProvider;

  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<ImageLoader> mImageLoaderProvider;

  private final Provider<AppManager> mAppManagerProvider;

  public DetailPresenter_Factory(
      Provider<DetailContract.Model> modelProvider,
      Provider<DetailContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<Application> mApplicationProvider,
      Provider<ImageLoader> mImageLoaderProvider,
      Provider<AppManager> mAppManagerProvider) {
    this.modelProvider = modelProvider;
    this.rootViewProvider = rootViewProvider;
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mImageLoaderProvider = mImageLoaderProvider;
    this.mAppManagerProvider = mAppManagerProvider;
  }

  @Override
  public DetailPresenter get() {
    DetailPresenter instance = new DetailPresenter(modelProvider.get(), rootViewProvider.get());
    DetailPresenter_MembersInjector.injectMErrorHandler(instance, mErrorHandlerProvider.get());
    DetailPresenter_MembersInjector.injectMApplication(instance, mApplicationProvider.get());
    DetailPresenter_MembersInjector.injectMImageLoader(instance, mImageLoaderProvider.get());
    DetailPresenter_MembersInjector.injectMAppManager(instance, mAppManagerProvider.get());
    return instance;
  }

  public static DetailPresenter_Factory create(
      Provider<DetailContract.Model> modelProvider,
      Provider<DetailContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<Application> mApplicationProvider,
      Provider<ImageLoader> mImageLoaderProvider,
      Provider<AppManager> mAppManagerProvider) {
    return new DetailPresenter_Factory(
        modelProvider,
        rootViewProvider,
        mErrorHandlerProvider,
        mApplicationProvider,
        mImageLoaderProvider,
        mAppManagerProvider);
  }

  public static DetailPresenter newDetailPresenter(
      DetailContract.Model model, DetailContract.View rootView) {
    return new DetailPresenter(model, rootView);
  }
}
