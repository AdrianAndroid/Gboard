package defpackage;

import android.util.Printer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcl  reason: default package */
/* loaded from: classes.dex */
public final class dcl implements gzv {
    final /* synthetic */ dcu a;

    public dcl(dcu dcuVar) {
        this.a = dcuVar;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        irs.b(this.a, printer);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DeviceLockedInfoDumper";
    }
}
