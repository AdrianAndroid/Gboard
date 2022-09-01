package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lhj  reason: default package */
/* loaded from: classes.dex */
public final class lhj implements Serializable, lgk {
    private static final long serialVersionUID = 1;
    public final lig a;

    public lhj(lgo lgoVar) {
        this.a = new lig(lgoVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    Object writeReplace() {
        lig ligVar = this.a;
        return new lhk(ligVar.j, ligVar.k, ligVar.h, ligVar.i, ligVar.o, ligVar.n, ligVar.l, ligVar.m, ligVar.g, ligVar.q, ligVar.r);
    }
}
