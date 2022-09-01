package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kef  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kef implements mix {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kef(cly clyVar, String str, int i, int i2) {
        this.d = i2;
        this.b = clyVar;
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ kef(keh kehVar, AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = kehVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.mix
    public final mko a() {
        if (this.d == 0) {
            Object obj = this.b;
            Object obj2 = this.c;
            int i = this.a;
            if (((AtomicInteger) obj2).getAndDecrement() <= 0) {
                return mkk.a;
            }
            keh kehVar = (keh) obj;
            return kehVar.f(i, (ked) kehVar.c.a());
        }
        Object obj3 = this.b;
        Object obj4 = this.c;
        int i2 = this.a;
        bze bzeVar = ((cly) obj3).d;
        jsu j = jsv.j();
        j.d(2);
        j.b = "zip";
        return bzeVar.e((String) obj4, i2, j.a());
    }
}
