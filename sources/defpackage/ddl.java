package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: ddl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ddl implements jdq {
    public final /* synthetic */ idn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ddl(idn idnVar, int i) {
        this.b = i;
        this.a = idnVar;
    }

    @Override // defpackage.jdq
    public final void a(SoftKeyView softKeyView) {
        if (this.b != 0) {
            idn idnVar = this.a;
            if (softKeyView.getVisibility() != 0) {
                return;
            }
            idnVar.a();
            softKeyView.a = null;
            return;
        }
        idn idnVar2 = this.a;
        if (softKeyView.getVisibility() != 0) {
            return;
        }
        idnVar2.a();
        softKeyView.a = null;
    }
}
