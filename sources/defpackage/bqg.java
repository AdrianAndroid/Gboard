package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bqg  reason: default package */
/* loaded from: classes.dex */
public final class bqg extends dea {
    public static final Object a = new Object();
    private hln b;
    private int c = 0;

    public bqg(List list) {
        super(list);
    }

    public static boolean b(hln hlnVar) {
        if (hlnVar.e == hlm.EXPRESSION) {
            Object obj = hlnVar.j;
            return (obj instanceof cja) && ((cja) obj).h();
        }
        return false;
    }

    @Override // defpackage.dea
    public final hln a() {
        if (this.b == null) {
            this.b = super.next();
        }
        int i = this.c;
        hln hlnVar = this.b;
        int i2 = hlnVar.i;
        if (i >= i2) {
            this.b = null;
            this.c = i2 + 1;
            return hlnVar;
        }
        this.c = i + 1;
        hlk a2 = hln.a();
        a2.i = i;
        a2.j = a;
        return a2.a();
    }

    @Override // defpackage.dea, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null || super.hasNext();
    }

    @Override // defpackage.dea, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
