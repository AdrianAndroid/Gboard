package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: pv  reason: default package */
/* loaded from: classes2.dex */
public final class pv extends px implements Iterator {
    final /* synthetic */ py a;
    private pu b;
    private boolean c = true;

    public pv(py pyVar) {
        this.a = pyVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final Map.Entry next() {
        pu puVar;
        if (this.c) {
            this.c = false;
            puVar = this.a.b;
        } else {
            pu puVar2 = this.b;
            puVar = puVar2 != null ? puVar2.c : null;
        }
        this.b = puVar;
        return this.b;
    }

    @Override // defpackage.px
    public final void eX(pu puVar) {
        pu puVar2 = this.b;
        if (puVar == puVar2) {
            pu puVar3 = puVar2.d;
            this.b = puVar3;
            this.c = puVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        pu puVar = this.b;
        return (puVar == null || puVar.c == null) ? false : true;
    }
}
