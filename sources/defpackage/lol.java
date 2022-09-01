package defpackage;

import j$.util.Objects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lol  reason: default package */
/* loaded from: classes.dex */
public final class lol extends ljl {
    private static final long serialVersionUID = 1;
    transient int c;
    public transient loh d;

    public lol() {
        super(lkf.z(16));
        this.c = 2;
        jez.W(2, "expectedValuesPerKey");
        this.c = 2;
        loh c = loh.c();
        this.d = c;
        H(c, c);
    }

    public static void G(loh lohVar) {
        H(lohVar.a(), lohVar.b());
    }

    public static void H(loh lohVar, loh lohVar2) {
        lohVar.h = lohVar2;
        lohVar2.g = lohVar;
    }

    public static void I(lok lokVar, lok lokVar2) {
        lokVar.f(lokVar2);
        lokVar2.e(lokVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        loh c = loh.c();
        this.d = c;
        H(c, c);
        this.c = 2;
        int readInt = objectInputStream.readInt();
        lkf z = lkf.z(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            z.put(readObject, g(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) Objects.requireNonNull((Collection) z.get(readObject2))).add(objectInputStream.readObject());
        }
        p(z);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(A().size());
        for (Object obj : A()) {
            objectOutputStream.writeObject(obj);
        }
        objectOutputStream.writeInt(((ljc) this).b);
        for (Map.Entry entry : x()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.ljl, defpackage.ljc
    public final /* bridge */ /* synthetic */ Collection a() {
        return new lkg(this.c);
    }

    @Override // defpackage.ljc
    public final Collection g(Object obj) {
        return new loj(this, obj, this.c);
    }

    @Override // defpackage.ljc, defpackage.ljh
    public final Iterator j() {
        return new log(this);
    }

    @Override // defpackage.ljc, defpackage.ljh
    public final Iterator k() {
        return lre.s(j());
    }

    @Override // defpackage.ljc, defpackage.lqr
    public final void o() {
        super.o();
        loh lohVar = this.d;
        H(lohVar, lohVar);
    }

    @Override // defpackage.ljl, defpackage.ljh, defpackage.lqr
    public final /* bridge */ /* synthetic */ Collection x() {
        return x();
    }
}
