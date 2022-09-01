package defpackage;

import android.util.Printer;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: jca  reason: default package */
/* loaded from: classes.dex */
public class jca implements ijh {
    public final dxs a;

    public jca(dxs dxsVar, byte[] bArr) {
        this.a = dxsVar;
    }

    public static Optional b() {
        return Optional.ofNullable((jca) ijl.b().a(jca.class)).map(eoe.l);
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("NgaPreferenceManager is loaded");
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
