package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: PG */
/* renamed from: dlu  reason: default package */
/* loaded from: classes.dex */
public final class dlu implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public dlu(Context context, String str, String str2, int i) {
        this.d = i;
        this.c = context;
        this.b = str;
        this.a = str2;
    }

    public dlu(dlv dlvVar, byte[] bArr, String str, int i) {
        this.d = i;
        this.c = dlvVar;
        this.b = bArr;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.d == 0) {
            Context context = ((dlv) this.c).b;
            Object obj = this.b;
            String str = this.a;
            SecretKey b = dlt.b();
            if (b == null) {
                return null;
            }
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            byte[] bArr2 = (byte[]) obj;
            byte[] c = dlt.c(b, new IvParameterSpec(bArr), bArr2);
            if (c == null) {
                return null;
            }
            try {
                File createTempFile = File.createTempFile("inputaction-", ".bin", dlt.a(context, true));
                if (!jan.b.k(c, createTempFile)) {
                    ((ltd) ((ltd) dlt.a.c()).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "encryptAndWriteToTempFile", 91, "InputActionCollectorUtils.java")).w("Failed to write to temp file %s, delete it directly.", createTempFile);
                    jan.b.e(createTempFile);
                    return null;
                }
                byte[] d = dlt.d(bArr2);
                Bundle bundle = new Bundle();
                Uri a = FileProvider.a(context, String.valueOf(context.getPackageName()).concat(".inputactionprovider"), createTempFile);
                context.grantUriPermission(str, a, 3);
                createTempFile.getPath();
                bundle.putString("file_uri", a.toString());
                bundle.putInt("file_length", (int) createTempFile.length());
                bundle.putByteArray("secret_key", b.getEncoded());
                bundle.putByteArray("iv", bArr);
                bundle.putByteArray("plain_digest", d);
                return bundle;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) dlt.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "encryptAndWriteToTempFile", 'W', "InputActionCollectorUtils.java")).t("Failed to to create temp file");
                return null;
            }
        }
        Object obj2 = this.c;
        return ams.b((Context) obj2, (String) this.b, this.a);
    }
}
