package edu.usf.cse.labrador.hackgt.ui.login;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import edu.usf.cse.labrador.hackgt.R;

public class MainActivity extends BaseActivity {
    private Bitmap myBitmap;
    private ImageView myImageView;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_main);
        myTextView = findViewById(R.id.textView);
        myImageView = findViewById(R.id.imageView);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case WRITE_STORAGE:
                    checkPermission(requestCode);
                    break;
                case SELECT_PHOTO:
                    Uri dataUri = data.getData();
                    String path = MyHelper.getPath(this, dataUri);
                    if (path == null) {
                        myBitmap = MyHelper.resizePhoto(photo, this, dataUri, myImageView);
                    } else {
                        myBitmap = MyHelper.resizePhoto(photo, path, myImageView);
                    }
                    if (myBitmap != null) {
                        myTextView.setText(null);
                        myImageView.setImageBitmap(myBitmap);
                    }
                    break;

            }
        }
    }*/
}