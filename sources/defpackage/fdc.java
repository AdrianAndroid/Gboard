package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: fdc  reason: default package */
/* loaded from: classes.dex */
public final class fdc implements fcz {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingModule");
    public Context a = null;
    private final dsy c = new fda(this);
    private final iye d = new fdb(this);

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingModule", "onCreate", 44, "InputContextSharingModule.java")).t("onCreate()");
        this.a = context;
        this.c.d(gyc.b);
        this.d.d(gyc.b);
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingModule", "onDestroy", 52, "InputContextSharingModule.java")).t("onDestroy()");
        this.a = null;
        fdg.a().c();
        this.c.e();
        this.d.e();
    }
}
