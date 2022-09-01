package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: dbr  reason: default package */
/* loaded from: classes.dex */
public final class dbr {
    public static final lug a = hin.a;
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/extension/KeyboardFactory");
    public final Context c;
    public final WeakReference d;
    public final int e;
    private final mko f;

    public dbr(Object obj, Context context, int i) {
        this.d = new WeakReference(obj);
        this.c = context;
        this.e = i;
        this.f = new dbs(context, i).b();
    }

    public final void a(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar;
        ibr ibrVar;
        if (htaVar != null && hszVar != null && iavVar != null) {
            dbrVar = this;
            ibrVar = new dbq(this, context, hszVar, iavVar, ibzVar, htaVar);
        } else {
            dbrVar = this;
            ibrVar = hpf.b;
        }
        kcu.U(dbrVar.f, new hzc(this, htaVar, ibzVar, context, ibrVar, str, jlsVar, 1, null), gyc.a);
    }
}
