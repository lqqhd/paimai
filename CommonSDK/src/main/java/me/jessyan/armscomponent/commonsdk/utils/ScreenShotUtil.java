package me.jessyan.armscomponent.commonsdk.utils;

import android.Manifest;
import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 小星 QQ:753940262
 * @class describe view 截图工具类
 * @time ${DATA} 11:05
 */
public class ScreenShotUtil {

    public static final String FILE_NAME = "screenshotdemo.png";
    private static Activity mActivity;
    public static boolean boolean_save;
    public static boolean boolean_permission;
    public static int REQUEST_PERMISSIONS = 1;


    public static void screenShotCreate( View ll_linear) {

        Bitmap bitmap1 = loadBitmapFromView(ll_linear, ll_linear.getWidth(), ll_linear.getHeight());
        saveBitmap(bitmap1);

    }


    private static void saveBitmap(Bitmap bitmap) {

        File imagePath = new File(Environment.getExternalStorageDirectory(), FILE_NAME);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(imagePath,false);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
            fos.flush();
            fos.close();
            Toast.makeText(mActivity, imagePath.getAbsolutePath() + "", Toast.LENGTH_SHORT).show();
            boolean_save = true;

            Log.e("ImageSave", "Saveimage");
        } catch (FileNotFoundException e) {
            Log.e("GREC", e.getMessage(), e);
        } catch (IOException e) {
            Log.e("GREC", e.getMessage(), e);
        }
    }

    private static Bitmap loadBitmapFromView(View v, int width, int height) {
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.draw(c);

        return b;
    }


    /**
     * 删除已存储的文件
     */
    private static void deletefile(String fileName) {
        try {
            // 找到文件所在的路径并删除该文件
            File file = new File(Environment.getExternalStorageDirectory(), fileName);

            if (file.exists()) {
//                file.delete();
                updateMediaStore(mActivity, Environment.getExternalStorageDirectory() + "/" + fileName);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateMediaStore(Context context, final String path) {

        //版本号的判断  4.4为分水岭，发送广播更新媒体库

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            MediaScannerConnection.scanFile(context, new String[]{path}, null, new MediaScannerConnection.OnScanCompletedListener() {

                public void onScanCompleted(String path, Uri uri) {

                    Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);

                    mediaScanIntent.setData(uri);

                    mActivity.sendBroadcast(mediaScanIntent);

                }

            });

        } else {

            File file = new File(path);

            String relationDir = file.getParent();

            File file1 = new File(relationDir);

            context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED, Uri.fromFile(file1.getAbsoluteFile())));
        }

    }

    /**
     * 检查权限
     */
    public static void fn_permission(Activity activity) {
        mActivity = activity;

        if ((ContextCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) ||
                (ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)) {

            if ((ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_EXTERNAL_STORAGE))) {
            } else {
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        REQUEST_PERMISSIONS);

            }

            if ((ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE))) {
            } else {
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        REQUEST_PERMISSIONS);

            }
        } else {
            boolean_permission = true;
        }
    }

    /**
     * 权限操作回掉
     *
     * @param requestCode
     * @param grantResults
     */

    public static void onRequestPermissionsResult(int requestCode, int[] grantResults) {
        if (requestCode == REQUEST_PERMISSIONS) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                boolean_permission = true;

            } else {
                Toast.makeText(mActivity, "Please allow the permission", Toast.LENGTH_LONG).show();

            }
        }
    }
}
