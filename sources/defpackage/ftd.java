package defpackage;

import android.util.Log;
import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* renamed from: ftd  reason: default package */
/* loaded from: classes.dex */
public final class ftd {
    public static final fpp a = new fpp();

    public static final boolean a(File file, fsy fsyVar) {
        try {
            return fsyVar.a(file);
        } catch (GeneralSecurityException e) {
            String absolutePath = file.getAbsolutePath();
            Log.e("DG", "APK at " + absolutePath + " failed signature verification", e);
            return false;
        }
    }
}
