package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: lpm  reason: default package */
/* loaded from: classes.dex */
final class lpm extends loz {
    private static final long serialVersionUID = 3;

    public lpm(lpn lpnVar, lpn lpnVar2, lep lepVar, int i, ConcurrentMap concurrentMap) {
        super(lpnVar, lpnVar2, lepVar, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        lox loxVar = new lox();
        int i = loxVar.b;
        boolean z = false;
        jdg.H(i == -1, "initial capacity was already set to %s", i);
        jdg.v(readInt >= 0);
        loxVar.b = readInt;
        loxVar.f(this.a);
        lpn lpnVar = this.b;
        lpn lpnVar2 = loxVar.e;
        jdg.J(lpnVar2 == null, "Value strength was already set to %s", lpnVar2);
        jdg.u(lpnVar);
        loxVar.e = lpnVar;
        if (lpnVar != lpn.STRONG) {
            loxVar.a = true;
        }
        lep lepVar = this.c;
        lep lepVar2 = loxVar.f;
        jdg.J(lepVar2 == null, "key equivalence was already set to %s", lepVar2);
        jdg.u(lepVar);
        loxVar.f = lepVar;
        loxVar.a = true;
        int i2 = this.d;
        int i3 = loxVar.c;
        jdg.H(i3 == -1, "concurrency level was already set to %s", i3);
        if (i2 > 0) {
            z = true;
        }
        jdg.v(z);
        loxVar.c = i2;
        this.e = loxVar.e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            }
            this.e.put(readObject, objectInputStream.readObject());
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
