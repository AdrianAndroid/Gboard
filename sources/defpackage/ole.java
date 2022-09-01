package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ole  reason: default package */
/* loaded from: classes2.dex */
public abstract class ole implements Serializable, olx {
    public static final Object a = old.a;
    protected final Object b;
    public final String c;
    public final String d;
    private transient olx e;
    private final Class f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ole(Object obj, Class cls, String str, String str2) {
        this.b = obj;
        this.f = cls;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.olx
    public final String c() {
        return this.c;
    }

    public final olx d() {
        olx olxVar = this.e;
        if (olxVar == null) {
            h();
            this.e = this;
            return this;
        }
        return olxVar;
    }

    public final olz e() {
        Class cls = this.f;
        int i = olr.a;
        return new olg(cls);
    }

    @Override // defpackage.olx
    public final Object g() {
        throw null;
    }

    protected abstract void h();
}
