package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ban  reason: default package */
/* loaded from: classes.dex */
public final class ban implements avd {
    public static final auz a = auz.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final auz b = auz.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final axn c;

    @Deprecated
    public ban() {
        this.c = null;
    }

    public ban(axn axnVar) {
        this.c = axnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // defpackage.auo
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ava avaVar) {
        OutputStream fileOutputStream;
        boolean z = (Bitmap) ((axh) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) avaVar.b(b);
        if (compressFormat == null) {
            if (z.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        z.getWidth();
        z.getHeight();
        bge.b();
        int intValue = ((Integer) avaVar.b(a)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException unused) {
            }
            try {
                axn axnVar = this.c;
                outputStream = axnVar != null ? new avh(fileOutputStream, axnVar) : fileOutputStream;
                z.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                z = 1;
                outputStream.close();
            } catch (IOException unused2) {
                outputStream = fileOutputStream;
                z = 0;
                z = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                return z;
            } catch (Throwable th) {
                th = th;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    @Override // defpackage.avd
    public final int b() {
        return 2;
    }
}
