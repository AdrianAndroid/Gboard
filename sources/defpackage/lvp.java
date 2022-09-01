package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: lvp  reason: default package */
/* loaded from: classes.dex */
public abstract class lvp extends lun {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public lvp(String str) {
        this.a = str;
    }

    @Override // defpackage.lun
    public String d() {
        return this.a;
    }

    @Override // defpackage.lun
    public void e(RuntimeException runtimeException, lum lumVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
