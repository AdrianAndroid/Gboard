package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lsl  reason: default package */
/* loaded from: classes.dex */
class lsl implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b = this;

    public lsl(Object obj) {
        this.a = obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }
}
