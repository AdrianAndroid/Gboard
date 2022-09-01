package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: fsq  reason: default package */
/* loaded from: classes.dex */
public final class fsq extends fra {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fsq(android.content.Context r11, android.os.Looper r12, defpackage.fpb r13, defpackage.fpw r14) {
        /*
            r10 = this;
            foa r0 = new foa
            r0.<init>(r11)
            gdv r1 = defpackage.gdv.b
            java.util.Map r2 = r0.e
            ijk r3 = defpackage.gdt.b
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1b
            java.util.Map r1 = r0.e
            ijk r2 = defpackage.gdt.b
            java.lang.Object r1 = r1.get(r2)
            gdv r1 = (defpackage.gdv) r1
        L1b:
            r8 = r1
            fqs r9 = new fqs
            r3 = 0
            java.util.Set r4 = r0.a
            java.util.Map r5 = r0.d
            java.lang.String r6 = r0.b
            java.lang.String r7 = r0.c
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r4 = 25
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsq.<init>(android.content.Context, android.os.Looper, fpb, fpw):void");
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return queryLocalInterface instanceof fsw ? (fsw) queryLocalInterface : new fsw(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
