package com.google.android.libraries.inputmethod.webp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WebPJni {
    public static volatile boolean a = false;

    private WebPJni() {
    }

    public static Bitmap decodeFile(String str) {
        if (!new File(str).exists()) {
            throw new FileNotFoundException("Failed to open ".concat(String.valueOf(str)));
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = false;
        options.inScaled = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null) {
            throw new WebPDecodeException("BitmapFactory#decodeFile failed");
        }
        return decodeFile;
    }

    public static native void nativeEncodeForWhatsApp(byte[] bArr);
}
