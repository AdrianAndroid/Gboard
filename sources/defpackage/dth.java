package defpackage;

import android.content.Context;
import j$.util.function.Supplier;

/* compiled from: PG */
/* renamed from: dth  reason: default package */
/* loaded from: classes.dex */
public final class dth implements jbz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/NgaInputHandlerFactory");
    private static final jby g = new dtg();
    public final dtj b;
    public dtm c;
    public dtq d;
    public jbz e;
    public hfy f;
    private final lgb h;
    private final dup i;
    private final dxe j;

    public dth(lgb lgbVar, dxe dxeVar, dup dupVar, dtj dtjVar, byte[] bArr) {
        this.h = lgbVar;
        this.j = dxeVar;
        this.i = dupVar;
        this.b = dtjVar;
    }

    @Override // defpackage.jbz
    public final jby a(final Context context, final iav iavVar, final jbw jbwVar, final lgb lgbVar) {
        dup dupVar = this.i;
        final jbz jbzVar = this.e;
        if (jbzVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaInputHandlerFactory", "create", 136, "NgaInputHandlerFactory.java")).t("missing fallback factory");
            return g;
        } else if (!this.j.b() || !dur.e(iavVar)) {
            this.d = null;
            this.c = null;
            return jbzVar.a(context, iavVar, jbwVar, lgbVar);
        } else {
            dxe dxeVar = this.j;
            lgb lgbVar2 = this.h;
            fbr fbrVar = new fbr(context);
            dtq dtqVar = new dtq(context, fbrVar, new fai(context, fbrVar), dxeVar, dupVar, lgbVar2, jbwVar, lgbVar, null);
            this.d = dtqVar;
            hfy hfyVar = this.f;
            if (hfyVar != null) {
                dtqVar.b(hfyVar);
            }
            dtm dtmVar = new dtm(this.b, this.d, new Supplier() { // from class: dtf
                @Override // j$.util.function.Supplier
                public final Object get() {
                    return jbz.this.a(context, iavVar, jbwVar, lgbVar);
                }
            });
            this.c = dtmVar;
            return dtmVar;
        }
    }
}
