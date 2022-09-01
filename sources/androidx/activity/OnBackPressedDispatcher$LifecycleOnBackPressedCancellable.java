package androidx.activity;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements aft, ou {
    final /* synthetic */ bek a;
    private final afq b;
    private final oy c;
    private ou d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(bek bekVar, afq afqVar, oy oyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bekVar;
        this.b = afqVar;
        this.c = oyVar;
        afqVar.b(this);
    }

    @Override // defpackage.ou
    public final void b() {
        this.b.d(this);
        this.c.b(this);
        ou ouVar = this.d;
        if (ouVar != null) {
            ouVar.b();
            this.d = null;
        }
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        if (afoVar == afo.ON_START) {
            bek bekVar = this.a;
            oy oyVar = this.c;
            ((ArrayDeque) bekVar.a).add(oyVar);
            oz ozVar = new oz(bekVar, oyVar, null, null, null);
            oyVar.a(ozVar);
            this.d = ozVar;
        } else if (afoVar != afo.ON_STOP) {
            if (afoVar != afo.ON_DESTROY) {
                return;
            }
            b();
        } else {
            ou ouVar = this.d;
            if (ouVar == null) {
                return;
            }
            ouVar.b();
        }
    }
}
