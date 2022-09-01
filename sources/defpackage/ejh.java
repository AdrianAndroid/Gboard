package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: ejh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ejh implements View.OnClickListener {
    public final /* synthetic */ eib a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cum c;
    private final /* synthetic */ int d;

    public /* synthetic */ ejh(ejg ejgVar, eib eibVar, boolean z, int i) {
        this.d = i;
        this.c = ejgVar;
        this.a = eibVar;
        this.b = z;
    }

    public /* synthetic */ ejh(eji ejiVar, eib eibVar, boolean z, int i) {
        this.d = i;
        this.c = ejiVar;
        this.a = eibVar;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d == 0) {
            cum cumVar = this.c;
            eib eibVar = this.a;
            boolean z = !this.b;
            eji ejiVar = (eji) cumVar;
            ejiVar.I(eibVar, z);
            ejiVar.s.a(eibVar, Boolean.valueOf(z));
            return;
        }
        cum cumVar2 = this.c;
        eib eibVar2 = this.a;
        boolean z2 = !this.b;
        ejg ejgVar = (ejg) cumVar2;
        ejgVar.I(eibVar2, z2);
        ejgVar.s.a(eibVar2, Boolean.valueOf(z2));
    }
}
