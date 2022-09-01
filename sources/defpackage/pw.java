package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: pw  reason: default package */
/* loaded from: classes2.dex */
public abstract class pw extends px implements Iterator {
    pu a;
    pu b;

    public pw(pu puVar, pu puVar2) {
        this.a = puVar2;
        this.b = puVar;
    }

    private final pu d() {
        pu puVar = this.b;
        pu puVar2 = this.a;
        if (puVar == puVar2 || puVar2 == null) {
            return null;
        }
        return b(puVar);
    }

    public abstract pu a(pu puVar);

    public abstract pu b(pu puVar);

    @Override // java.util.Iterator
    /* renamed from: c */
    public final Map.Entry next() {
        pu puVar = this.b;
        this.b = d();
        return puVar;
    }

    @Override // defpackage.px
    public final void eX(pu puVar) {
        if (this.a == puVar && puVar == this.b) {
            this.b = null;
            this.a = null;
        }
        pu puVar2 = this.a;
        if (puVar2 == puVar) {
            this.a = a(puVar2);
        }
        if (this.b == puVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
