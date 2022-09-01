package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: haq  reason: default package */
/* loaded from: classes.dex */
public final class haq implements gwl {
    public static final haq a = new haq(1);
    private final /* synthetic */ int b;

    public haq(int i) {
        this.b = i;
    }

    @Override // defpackage.gwl
    public final /* synthetic */ Object a(InputStream inputStream) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return BitmapFactory.decodeStream(inputStream);
            }
            llk e = llp.e();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        e.h(readLine);
                    } else {
                        bufferedReader.close();
                        return e.g();
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
        } else {
            return har.c(inputStream);
        }
    }

    @Override // defpackage.gwl
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        int i = this.b;
        if (i == 0) {
            har.f(outputStream, (llp) obj);
        } else if (i == 1) {
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 0, outputStream);
        } else {
            har.e(outputStream, (llp) obj);
        }
    }
}
