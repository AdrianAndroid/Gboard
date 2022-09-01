package defpackage;

import com.google.android.apps.inputmethod.libs.expression.expressionmoment.IExpressionMomentExtension;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: hfm  reason: default package */
/* loaded from: classes.dex */
public final class hfm implements ijj {
    final /* synthetic */ cmn a;
    private Class b;

    public hfm() {
    }

    public hfm(cmn cmnVar) {
        this.a = cmnVar;
    }

    public final void a(Class cls, Class cls2) {
        if (Objects.equals(cls, IExpressionMomentExtension.class)) {
            cmn cmnVar = this.a;
            if (cmnVar.c) {
                cmnVar.u(may.EXPRESSION_MOMENT_CLOSED);
                return;
            }
        }
        if (Objects.equals(cls2, IExpressionMomentExtension.class)) {
            this.a.l(may.EXPRESSION_MOMENT_OPENED);
        }
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        hfn hfnVar = (hfn) ijgVar;
        Class cls = this.b;
        Class cls2 = hfnVar.a;
        this.b = cls2;
        hfl hflVar = hfnVar.b;
        a(cls, cls2);
    }

    @Override // defpackage.ijj
    public final void fe(Class cls) {
        Class cls2 = this.b;
        this.b = null;
        a(cls2, null);
    }
}
