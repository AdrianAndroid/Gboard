package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: ljm  reason: default package */
/* loaded from: classes.dex */
public final class ljm extends lin {
    private static final long serialVersionUID = 0;
    transient int c = 3;

    private ljm() {
        super(lre.c());
        jez.W(3, "expectedValuesPerKey");
    }

    public static ljm F() {
        return new ljm();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        p(lkc.g());
        lvw.s(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        lvw.t(this, objectOutputStream);
    }

    @Override // defpackage.lin, defpackage.ljc
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
