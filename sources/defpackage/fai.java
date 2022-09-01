package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fai  reason: default package */
/* loaded from: classes.dex */
public final class fai {
    public static final lug a = lug.i("Mic-PermissionsChecker");
    public final fbr b;
    public final ijt c;
    public final idk d;

    public fai(Context context, fbr fbrVar) {
        ieh j = ieh.j();
        this.b = fbrVar;
        this.c = ijt.e(context);
        this.d = j;
    }

    public final void a() {
        this.d.e(fbm.MIC_PERMISSION_STATUS, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(iay iayVar) {
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/RecordAudioPermissionsChecker", "requestPermissions", 58, "RecordAudioPermissionsChecker.java")).t("Requesting AUDIO permission.");
        this.c.q(this.c.c(new fah(this, iayVar)), "android.permission.RECORD_AUDIO");
    }

    public final boolean c() {
        return this.b.o();
    }
}
