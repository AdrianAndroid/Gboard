package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: llb  reason: default package */
/* loaded from: classes.dex */
public final class llb extends ljl {
    private static final long serialVersionUID = 0;
    transient int c;

    private llb() {
        super(lre.c());
        this.c = 2;
        jdg.v(true);
        this.c = 2;
    }

    public static llb G() {
        return new llb();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int readInt = objectInputStream.readInt();
        p(lre.c());
        lvw.s(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        lvw.t(this, objectOutputStream);
    }

    @Override // defpackage.ljl, defpackage.ljc
    public final /* bridge */ /* synthetic */ Collection a() {
        return new lke(this.c);
    }
}
