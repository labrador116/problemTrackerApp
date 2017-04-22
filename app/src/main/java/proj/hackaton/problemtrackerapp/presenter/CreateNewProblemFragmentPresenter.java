package proj.hackaton.problemtrackerapp.presenter;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import proj.hackaton.problemtrackerapp.R;
import proj.hackaton.problemtrackerapp.model.instances.ProblemPhoto;
import proj.hackaton.problemtrackerapp.view.fragments.CreateNewProblemFragment;

import static proj.hackaton.problemtrackerapp.view.fragments.CreateNewProblemFragment.REQUEST_PHOTO;

/**
 * Created by sbt-markin-aa on 20.04.17.
 */

public class CreateNewProblemFragmentPresenter {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public File getPhotoFile(Context context){
        File[] path = context.getExternalMediaDirs();
        ProblemPhoto photo = new ProblemPhoto();
        File externalFileDir = new File(path[0],photo.getProblemPhotoName());

        return externalFileDir;
    }

    public void saveOnGalerySendBroadcast(Context context, Uri uri){
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        mediaScanIntent.setData(uri);
        context.sendBroadcast(mediaScanIntent);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Intent createProblemButtonHundler( Uri uri){
        final Intent captureImage = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);

        return captureImage;
    }
}
