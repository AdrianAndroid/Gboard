package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bye  reason: default package */
/* loaded from: classes.dex */
public final class bye extends byb {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/nextwordpredictor/NwpModelManager");
    private static volatile bye h;
    public final String b;

    public bye(String str, bze bzeVar, mkr mkrVar) {
        super("NwpModelManager", bzeVar, mkrVar);
        this.b = str;
    }

    public static bye a(Context context) {
        bye byeVar = h;
        if (byeVar == null) {
            synchronized (bye.class) {
                byeVar = h;
                if (byeVar == null) {
                    byeVar = new bye(context.getFilesDir().getAbsolutePath(), bzd.a(context), gxo.a(10));
                    h = byeVar;
                }
            }
        }
        return byeVar;
    }

    @Override // defpackage.byb
    protected final bzu c() {
        bzt a2 = bzu.a("next-word-predictor");
        a2.e = 300;
        a2.f = 300;
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byb
    public final hhl d() {
        return bxn.a;
    }

    @Override // defpackage.byb
    protected final hhl e() {
        return bxn.aF;
    }

    @Override // defpackage.byb
    protected final hhl f() {
        return bxn.aD;
    }

    @Override // defpackage.byb
    protected final hhl g() {
        return bxn.aE;
    }

    @Override // defpackage.byb
    public final jqk h() {
        return jqk.f;
    }

    @Override // defpackage.byb
    protected final String i() {
        return "tflite-nwp";
    }

    @Override // defpackage.byb
    public final String j() {
        return "next-word-predictor";
    }
}
