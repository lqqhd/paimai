package me.jessyan.armscomponent.zhihu.mvp.presenter;

import android.app.Application;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailPresenter_MembersInjector implements MembersInjector<DetailPresenter> {
  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<ImageLoader> mImageLoaderProvider;

  private final Provider<AppManager> mAppManagerProvider;

  public DetailPresenter_MembersInjector(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<Application> mApplicationProvider,
      Provider<ImageLoader> mImageLoaderProvider,
      Provider<AppManager> mAppManagerProvider) {
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mImageLoaderProvider = mImageLoaderProvider;
    this.mAppManagerProvider = mAppManagerProvider;
  }

  public static MembersInjector<DetailPresenter> create(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<Application> mApplicationProvider,
      Provider<ImageLoader> mImageLoaderProvider,
      Provider<AppManager> mAppManagerProvider) {
    return new DetailPresenter_MembersInjector(
        mErrorHandlerProvider, mApplicationProvider, mImageLoaderProvider, mAppManagerProvider);
  }

  @Override
  public void injectMembers(DetailPresenter instance) {
    injectMErrorHandler(instance, mErrorHandlerProvider.get());
    injectMApplication(instance, mApplicationProvider.get());
    injectMImageLoader(instance, mImageLoaderProvider.get());
    injectMAppManager(instance, mAppManagerProvider.get());
  }

  public static void injectMErrorHandler(DetailPresenter instance, RxErrorHandler mErrorHandler) {
    instance.mErrorHandler = mErrorHandler;
  }

  public static void injectMApplication(DetailPresenter instance, Application mApplication) {
    instance.mApplication = mApplication;
  }

  public static void injectMImageLoader(DetailPresenter instance, ImageLoader mImageLoader) {
    instance.mImageLoader = mImageLoader;
  }

  public static void injectMAppManager(DetailPresenter instance, AppManager mAppManager) {
    instance.mAppManager = mAppManager;
  }
}
