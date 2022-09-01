package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jab  reason: default package */
/* loaded from: classes.dex */
public final class jab implements izz {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/guarder/UFCGuarder");
    public final Context b;
    private final Executor c;
    private final iye d = new jaa(this);

    public jab(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("User feature cache guarder:");
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/guarder/UFCGuarder", "onCreate", 55, "UFCGuarder.java")).t("onCreate");
        this.d.d(this.c);
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/guarder/UFCGuarder", "onDestroy", 61, "UFCGuarder.java")).t("onDestroy");
        this.d.e();
    }
}
