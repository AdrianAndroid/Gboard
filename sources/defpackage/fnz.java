package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fnz  reason: default package */
/* loaded from: classes.dex */
public class fnz {
    public final Context b;
    public final String c;
    public final fnv d;
    public final Cfor e;
    public final Looper f;
    public final int g;
    public final fod h;
    public final fpj i;
    public final ijk j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fnz(android.content.Context r14, android.app.Activity r15, defpackage.ijk r16, defpackage.fnv r17, defpackage.fny r18, byte[] r19, byte[] r20, byte[] r21, byte[] r22) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r18
            r13.<init>()
            java.lang.String r3 = "Null context is not permitted."
            defpackage.fyb.aH(r14, r3)
            java.lang.String r3 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            defpackage.fyb.aH(r2, r3)
            android.content.Context r3 = r14.getApplicationContext()
            java.lang.String r4 = "The provided context did not have an application context."
            defpackage.fyb.aH(r3, r4)
            r0.b = r3
            boolean r3 = defpackage.fyb.u()
            r4 = 0
            if (r3 == 0) goto L39
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.String r5 = "getAttributionTag"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r3 = r3.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r3.invoke(r14, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L38
            r8 = r1
            goto L3a
        L38:
        L39:
            r8 = r4
        L3a:
            r0.c = r8
            r1 = r16
            r0.j = r1
            r3 = r17
            r0.d = r3
            android.os.Looper r4 = r2.b
            r0.f = r4
            for r4 = new for
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            r6 = r16
            r7 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.e = r4
            fpk r1 = new fpk
            r1.<init>(r13)
            r0.h = r1
            android.content.Context r1 = r0.b
            fpj r1 = defpackage.fpj.c(r1)
            r0.i = r1
            java.util.concurrent.atomic.AtomicInteger r3 = r1.h
            int r3 = r3.getAndIncrement()
            r0.g = r3
            fgy r2 = r2.c
            if (r15 == 0) goto L9a
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 != r3) goto L9a
            fpq r2 = defpackage.fpd.l(r15)
            java.lang.String r3 = "ConnectionlessLifecycleHelper"
            java.lang.Class<fpd> r5 = defpackage.fpd.class
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = r2.b(r3, r5)
            fpd r3 = (defpackage.fpd) r3
            if (r3 != 0) goto L92
            fpd r3 = new fpd
            r3.<init>(r2, r1)
        L92:
            qq r2 = r3.e
            r2.add(r4)
            r1.f(r3)
        L9a:
            android.os.Handler r1 = r1.m
            r2 = 7
            android.os.Message r2 = r1.obtainMessage(r2, r13)
            r1.sendMessage(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnz.<init>(android.content.Context, android.app.Activity, ijk, fnv, fny, byte[], byte[], byte[], byte[]):void");
    }

    private final gen a(int i, fqg fqgVar) {
        fxa fxaVar = new fxa();
        fpj fpjVar = this.i;
        fpjVar.i(fxaVar, fqgVar.d, this);
        foo fooVar = new foo(i, fqgVar, fxaVar, null);
        Handler handler = fpjVar.m;
        handler.sendMessage(handler.obtainMessage(4, new nwo(fooVar, fpjVar.i.get(), this)));
        return (gen) fxaVar.a;
    }

    public final fqr f() {
        Set emptySet;
        GoogleSignInAccount a;
        fqr fqrVar = new fqr();
        fnv fnvVar = this.d;
        Account account = null;
        if (!(fnvVar instanceof fnt) || (a = ((fnt) fnvVar).a()) == null) {
            fnv fnvVar2 = this.d;
            if (fnvVar2 instanceof fns) {
                account = ((fns) fnvVar2).a();
            }
        } else {
            String str = a.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        fqrVar.a = account;
        fnv fnvVar3 = this.d;
        if (fnvVar3 instanceof fnt) {
            GoogleSignInAccount a2 = ((fnt) fnvVar3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (fqrVar.b == null) {
            fqrVar.b = new qq();
        }
        fqrVar.b.addAll(emptySet);
        fqrVar.d = this.b.getClass().getName();
        fqrVar.c = this.b.getPackageName();
        return fqrVar;
    }

    public final gen g(fqg fqgVar) {
        return a(0, fqgVar);
    }

    public final gen h(fqg fqgVar) {
        return a(1, fqgVar);
    }

    public final void i(int i, fou fouVar) {
        boolean z = true;
        if (!fouVar.d && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        fouVar.d = z;
        fpj fpjVar = this.i;
        fom fomVar = new fom(i, fouVar);
        Handler handler = fpjVar.m;
        handler.sendMessage(handler.obtainMessage(4, new nwo(fomVar, fpjVar.i.get(), this)));
    }

    public final void j(ful fulVar) {
        fod fodVar = this.h;
        fud fudVar = new fud(fodVar, fulVar, ((fpk) fodVar).a.b, System.nanoTime());
        fodVar.a(fudVar);
        fyb.aI(fudVar);
    }

    public final void k(fqg fqgVar) {
        a(2, fqgVar);
    }

    public fnz(Context context, ijk ijkVar, fnv fnvVar, fny fnyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this(context, null, ijkVar, fnvVar, fnyVar, null, null, null, null);
    }

    public fnz(Context context) {
        this(context, fui.b, fnv.a, fny.a, null, null, null, null);
        gfs.b(context.getApplicationContext());
    }
}
