package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lle  reason: default package */
/* loaded from: classes.dex */
public abstract class lle extends llw implements Map, j$.util.Map {
    public static llc a() {
        return new llc();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract lle b();

    @Override // defpackage.llw
    public final /* bridge */ /* synthetic */ llg c() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    /* renamed from: e */
    public final lmz values() {
        return b().keySet();
    }

    @Override // defpackage.llw
    Object writeReplace() {
        return new lld(this);
    }
}
