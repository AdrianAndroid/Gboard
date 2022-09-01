package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: mns  reason: default package */
/* loaded from: classes2.dex */
final class mns extends mnu {
    private final moi a;
    private final fxa b;

    public mns(moi moiVar, fxa fxaVar, byte[] bArr) {
        this.a = moiVar;
        this.b = fxaVar;
    }

    @Override // defpackage.mnu
    public final void c(Status status, mnm mnmVar) {
        Bundle bundle;
        mmn mmnVar;
        fhr.q(status, mnmVar == null ? null : new mlu(mnmVar), this.b);
        if (mnmVar == null || (bundle = mnmVar.a().getBundle("scionData")) == null || bundle.keySet() == null || (mmnVar = (mmn) this.a.a()) == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            bundle.getBundle(str);
            mmnVar.a();
        }
    }
}
