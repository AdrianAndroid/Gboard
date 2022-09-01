package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: jni  reason: default package */
/* loaded from: classes.dex */
public final class jni implements jno {
    private final Context a;

    public jni(Context context) {
        jdg.u(context);
        this.a = context;
    }

    @Override // defpackage.jno
    public final File a(String str, String str2) {
        return File.createTempFile(str, str2, this.a.getCacheDir());
    }
}
