package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fra  reason: default package */
/* loaded from: classes.dex */
public abstract class fra extends fqq implements fnw {
    private static volatile Executor s;
    private final Set t;
    private final Account u;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fra(android.content.Context r17, android.os.Looper r18, int r19, defpackage.fqs r20, defpackage.fpb r21, defpackage.fpw r22) {
        /*
            r16 = this;
            r14 = r16
            r15 = r20
            frc r3 = defpackage.frc.a(r17)
            fmx r4 = defpackage.fmx.a
            defpackage.fyb.ax(r21)
            defpackage.fyb.ax(r22)
            opu r6 = new opu
            r0 = r21
            r6.<init>(r0)
            opu r7 = new opu
            r0 = r22
            r7.<init>(r0)
            java.lang.String r8 = r15.e
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r16
            r1 = r17
            r2 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            android.accounts.Account r0 = r15.a
            r14.u = r0
            java.util.Set r0 = r15.c
            java.util.Iterator r1 = r0.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4d
            goto L3a
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L55:
            r14.t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fra.<init>(android.content.Context, android.os.Looper, int, fqs, fpb, fpw):void");
    }

    @Override // defpackage.fqq
    public final fmv[] C() {
        return new fmv[0];
    }

    @Override // defpackage.fqq
    protected final void E() {
    }

    @Override // defpackage.fqq, defpackage.fnw
    public int a() {
        throw null;
    }

    @Override // defpackage.fnw
    public final Set j() {
        return o() ? this.t : Collections.emptySet();
    }

    @Override // defpackage.fqq
    public final Account u() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final Set x() {
        return this.t;
    }
}
