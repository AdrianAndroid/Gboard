package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kqq  reason: default package */
/* loaded from: classes.dex */
public final class kqq implements mix {
    public List a;
    public final /* synthetic */ kqr b;

    public kqq(kqr kqrVar) {
        this.b = kqrVar;
    }

    @Override // defpackage.mix
    public final mko a() {
        lcq l = jco.l("Initialize ".concat(String.valueOf(this.b.a)), ldi.a);
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    kqr kqrVar = this.b;
                    this.a = kqrVar.e;
                    kqrVar.e = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            opu opuVar = new opu(this.b);
            for (miy miyVar : this.a) {
                try {
                    arrayList.add(miyVar.a(opuVar));
                } catch (Exception e) {
                    arrayList.add(kcu.J(e));
                }
            }
            mko a = kcu.Y(arrayList).a(new jiz(this, 15), mjl.a);
            l.a(a);
            l.close();
            return a;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
